package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayname extends js.Object {
  var avatar_url: js.UndefOr[String | Null] = js.undefined
  var display_name: js.UndefOr[String | Null] = js.undefined
  var user_id: String
}

object AnonDisplayname {
  @scala.inline
  def apply(user_id: String, avatar_url: String = null, display_name: String = null): AnonDisplayname = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    if (avatar_url != null) __obj.updateDynamic("avatar_url")(avatar_url.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayname]
  }
}

