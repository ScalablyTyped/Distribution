package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends BaseProfile {
  var module_name: profile
}

object Profile {
  @scala.inline
  def apply(module_name: profile, user_id: String | Double, username: String): Profile = {
    val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

