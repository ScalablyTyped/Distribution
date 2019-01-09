package typings
package inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_middleware", "BaseMiddleware")
@js.native
abstract class BaseMiddleware () extends js.Object {
  val httpContext: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HttpContext = js.native
  /* protected */ def bind[T](
    serviceIdentifier: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify inversifyInterfaces.ServiceIdentifier<T> */ js.Any
  ): js.Any = js.native
  def handler(
    req: expressLib.expressMod.eNs.Request,
    res: expressLib.expressMod.eNs.Response,
    next: expressLib.expressMod.eNs.NextFunction
  ): scala.Unit = js.native
}

