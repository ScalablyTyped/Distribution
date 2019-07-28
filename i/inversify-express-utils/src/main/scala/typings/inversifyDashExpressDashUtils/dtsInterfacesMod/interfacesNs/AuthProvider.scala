package typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def getUser(req: Request, res: Response, next: NextFunction): js.Promise[Principal]
}

object AuthProvider {
  @scala.inline
  def apply(getUser: (Request, Response, NextFunction) => js.Promise[Principal]): AuthProvider = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
  
    __obj.asInstanceOf[AuthProvider]
  }
}

