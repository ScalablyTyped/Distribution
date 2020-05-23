package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatarurl extends js.Object {
  var avatar_url: js.UndefOr[String] = js.undefined
  var displayname: js.UndefOr[String] = js.undefined
}

object Avatarurl {
  @scala.inline
  def apply(avatar_url: String = null, displayname: String = null): Avatarurl = {
    val __obj = js.Dynamic.literal()
    if (avatar_url != null) __obj.updateDynamic("avatar_url")(avatar_url.asInstanceOf[js.Any])
    if (displayname != null) __obj.updateDynamic("displayname")(displayname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatarurl]
  }
}

