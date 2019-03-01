package typings
package ionicLib.guardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthLogin extends js.Object {
  var redirect_url: java.lang.String
}

object OAuthLogin {
  @scala.inline
  def apply(redirect_url: java.lang.String): OAuthLogin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redirect_url")(redirect_url)
    __obj.asInstanceOf[OAuthLogin]
  }
}

