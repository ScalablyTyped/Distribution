package typings.keycloakConnect.mod

import typings.keycloakConnect.anon.Roles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenContent extends js.Object {
  var exp: Double = js.native
  var realm_access: js.UndefOr[Roles] = js.native
  var resource_access: js.UndefOr[js.Any] = js.native
  var sub: String = js.native
}

object TokenContent {
  @scala.inline
  def apply(exp: Double, sub: String): TokenContent = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenContent]
  }
  @scala.inline
  implicit class TokenContentOps[Self <: TokenContent] (val x: Self) extends AnyVal {
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
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealm_access(value: Roles): Self = this.set("realm_access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealm_access: Self = this.set("realm_access", js.undefined)
    @scala.inline
    def setResource_access(value: js.Any): Self = this.set("resource_access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource_access: Self = this.set("resource_access", js.undefined)
  }
  
}

