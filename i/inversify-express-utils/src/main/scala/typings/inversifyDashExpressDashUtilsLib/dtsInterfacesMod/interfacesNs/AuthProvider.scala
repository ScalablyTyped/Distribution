package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def getUser(
    req: expressLib.expressMod.Request,
    res: expressLib.expressMod.Response,
    next: expressLib.expressMod.NextFunction
  ): js.Promise[Principal]
}

object AuthProvider {
  @scala.inline
  def apply(
    getUser: (expressLib.expressMod.Request, expressLib.expressMod.Response, expressLib.expressMod.NextFunction) => js.Promise[Principal]
  ): AuthProvider = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
  
    __obj.asInstanceOf[AuthProvider]
  }
}

