package typings.ionic.guardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthLogin extends js.Object {
  var redirect_url: String
}

object OAuthLogin {
  @scala.inline
  def apply(redirect_url: String): OAuthLogin = {
    val __obj = js.Dynamic.literal(redirect_url = redirect_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OAuthLogin]
  }
}

