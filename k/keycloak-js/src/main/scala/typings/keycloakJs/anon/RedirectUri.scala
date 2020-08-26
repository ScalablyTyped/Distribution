package typings.keycloakJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectUri extends js.Object {
  var redirectUri: String = js.native
}

object RedirectUri {
  @scala.inline
  def apply(redirectUri: String): RedirectUri = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectUri]
  }
  @scala.inline
  implicit class RedirectUriOps[Self <: RedirectUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
  }
  
}

