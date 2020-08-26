package typings.keycloakConnect.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grant extends js.Object {
  var __raw: String = js.native
  var access_token: Token = js.native
  var expires_in: Double = js.native
  var id_token: Token = js.native
  var refresh_token: Token = js.native
  var token_type: String = js.native
  def isExpired(): Boolean = js.native
  def store(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Unit = js.native
  def update(grant: Grant): Unit = js.native
}

object Grant {
  @scala.inline
  def apply(
    __raw: String,
    access_token: Token,
    expires_in: Double,
    id_token: Token,
    isExpired: () => Boolean,
    refresh_token: Token,
    store: (Request_[ParamsDictionary, _, _, Query], Response_[_]) => Unit,
    token_type: String,
    update: Grant => Unit
  ): Grant = {
    val __obj = js.Dynamic.literal(__raw = __raw.asInstanceOf[js.Any], access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], isExpired = js.Any.fromFunction0(isExpired), refresh_token = refresh_token.asInstanceOf[js.Any], store = js.Any.fromFunction2(store), token_type = token_type.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Grant]
  }
  @scala.inline
  implicit class GrantOps[Self <: Grant] (val x: Self) extends AnyVal {
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
    def set__raw(value: String): Self = this.set("__raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccess_token(value: Token): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires_in(value: Double): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    @scala.inline
    def setId_token(value: Token): Self = this.set("id_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExpired(value: () => Boolean): Self = this.set("isExpired", js.Any.fromFunction0(value))
    @scala.inline
    def setRefresh_token(value: Token): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: (Request_[ParamsDictionary, _, _, Query], Response_[_]) => Unit): Self = this.set("store", js.Any.fromFunction2(value))
    @scala.inline
    def setToken_type(value: String): Self = this.set("token_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: Grant => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

