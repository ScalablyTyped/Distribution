package typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreMiddlewareMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.BindingToSyntax
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.HttpContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_middleware", "BaseMiddleware")
@js.native
abstract class BaseMiddleware () extends js.Object {
  val httpContext: HttpContext = js.native
  /* protected */ def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
  def handler(req: Request, res: Response, next: NextFunction): Unit = js.native
}

