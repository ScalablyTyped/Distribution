package typings.ltijs.providerMod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnConnectOptions extends js.Object {
  var invalidToken: js.UndefOr[
    js.Function2[
      /* request */ Request_[ParamsDictionary, _, _, Query], 
      /* response */ Response_[_], 
      Response_[_]
    ]
  ] = js.native
  var sessionTimeout: js.UndefOr[
    js.Function2[
      /* request */ Request_[ParamsDictionary, _, _, Query], 
      /* response */ Response_[_], 
      Response_[_]
    ]
  ] = js.native
}

object OnConnectOptions {
  @scala.inline
  def apply(): OnConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnConnectOptions]
  }
  @scala.inline
  implicit class OnConnectOptionsOps[Self <: OnConnectOptions] (val x: Self) extends AnyVal {
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
    def setInvalidToken(
      value: (/* request */ Request_[ParamsDictionary, _, _, Query], /* response */ Response_[_]) => Response_[_]
    ): Self = this.set("invalidToken", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInvalidToken: Self = this.set("invalidToken", js.undefined)
    @scala.inline
    def setSessionTimeout(
      value: (/* request */ Request_[ParamsDictionary, _, _, Query], /* response */ Response_[_]) => Response_[_]
    ): Self = this.set("sessionTimeout", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
  }
  
}

