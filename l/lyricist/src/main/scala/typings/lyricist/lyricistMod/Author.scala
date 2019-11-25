package typings.lyricist.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author extends js.Object {
  var attribution: Double
  var pinned_role: js.UndefOr[js.Any] = js.undefined
  var user: User
}

object Author {
  @scala.inline
  def apply(attribution: Double, user: User, pinned_role: js.Any = null): Author = {
    val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (pinned_role != null) __obj.updateDynamic("pinned_role")(pinned_role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
}

