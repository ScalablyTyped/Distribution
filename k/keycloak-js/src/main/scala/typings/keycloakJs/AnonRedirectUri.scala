package typings.keycloakJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRedirectUri extends js.Object {
  var redirectUri: String
}

object AnonRedirectUri {
  @scala.inline
  def apply(redirectUri: String): AnonRedirectUri = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRedirectUri]
  }
}

