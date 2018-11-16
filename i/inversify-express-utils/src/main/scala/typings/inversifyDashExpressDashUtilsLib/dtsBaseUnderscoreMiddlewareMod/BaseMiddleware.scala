package typings
package inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_middleware", "BaseMiddleware")
@js.native
abstract class BaseMiddleware () extends js.Object {
  val _container: js.Any = js.native
  val httpContext: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HttpContext = js.native
  /* protected */ def bind[T](serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[T]): inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.BindingToSyntax[T] = js.native
  def handler(
    req: expressLib.expressMod.eNs.Request,
    res: expressLib.expressMod.eNs.Response,
    next: expressLib.expressMod.eNs.NextFunction
  ): scala.Unit = js.native
}

