package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Displayname extends js.Object {
  var avatar_url: js.UndefOr[String | Null] = js.undefined
  var display_name: js.UndefOr[String | Null] = js.undefined
  var user_id: String
}

object Displayname {
  @scala.inline
  def apply(
    user_id: String,
    avatar_url: js.UndefOr[Null | String] = js.undefined,
    display_name: js.UndefOr[Null | String] = js.undefined
  ): Displayname = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    if (!js.isUndefined(avatar_url)) __obj.updateDynamic("avatar_url")(avatar_url.asInstanceOf[js.Any])
    if (!js.isUndefined(display_name)) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayname]
  }
}

