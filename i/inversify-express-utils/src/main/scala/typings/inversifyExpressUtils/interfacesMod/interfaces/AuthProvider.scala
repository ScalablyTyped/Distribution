package typings.inversifyExpressUtils.interfacesMod.interfaces

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthProvider extends js.Object {
  def getUser(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): js.Promise[Principal] = js.native
}

object AuthProvider {
  @scala.inline
  def apply(
    getUser: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => js.Promise[Principal]
  ): AuthProvider = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
    __obj.asInstanceOf[AuthProvider]
  }
  @scala.inline
  implicit class AuthProviderOps[Self <: AuthProvider] (val x: Self) extends AnyVal {
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
    def setGetUser(
      value: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => js.Promise[Principal]
    ): Self = this.set("getUser", js.Any.fromFunction3(value))
  }
  
}

