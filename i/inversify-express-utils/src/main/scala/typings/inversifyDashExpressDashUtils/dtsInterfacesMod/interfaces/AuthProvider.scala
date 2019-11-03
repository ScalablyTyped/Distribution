package typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def getUser(req: Request[ParamsDictionary], res: Response, next: NextFunction): js.Promise[Principal]
}

object AuthProvider {
  @scala.inline
  def apply(getUser: (Request[ParamsDictionary], Response, NextFunction) => js.Promise[Principal]): AuthProvider = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
  
    __obj.asInstanceOf[AuthProvider]
  }
}

