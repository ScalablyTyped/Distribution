package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author extends js.Object {
  var attribution: scala.Double
  var pinned_role: js.UndefOr[js.Any] = js.undefined
  var user: User
}

object Author {
  @scala.inline
  def apply(attribution: scala.Double, user: User, pinned_role: js.Any = null): Author = {
    val __obj = js.Dynamic.literal(attribution = attribution, user = user)
    if (pinned_role != null) __obj.updateDynamic("pinned_role")(pinned_role)
    __obj.asInstanceOf[Author]
  }
}

