package typings.hapiAuthJwt2.mod

import typings.hapiAuthJwt2.anon.Credentials
import typings.hapiHapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterOptions extends js.Object {
  /**
    * function which is run once the Token has been decoded (instead of a validate) with signature async function(decoded, request) where:
    */
  var verify: js.UndefOr[
    js.Function2[/* decoded */ js.Any, /* request */ Request, js.Promise[Credentials]]
  ] = js.native
}

object RegisterOptions {
  @scala.inline
  def apply(): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOptions]
  }
  @scala.inline
  implicit class RegisterOptionsOps[Self <: RegisterOptions] (val x: Self) extends AnyVal {
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
    def setVerify(value: (/* decoded */ js.Any, /* request */ Request) => js.Promise[Credentials]): Self = this.set("verify", js.Any.fromFunction2(value))
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
  }
  
}

