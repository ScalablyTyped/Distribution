package typings.keycloakJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectUri extends js.Object {
  var redirectUri: String
}

object RedirectUri {
  @scala.inline
  def apply(redirectUri: String): RedirectUri = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectUri]
  }
}

