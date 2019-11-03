package typings.inversifyDashExpressDashUtils

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingToSyntax
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.HttpContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_middleware", JSImport.Namespace)
@js.native
object dtsBaseUnderscoreMiddlewareMod extends js.Object {
  @js.native
  abstract class BaseMiddleware () extends js.Object {
    val httpContext: HttpContext = js.native
    /* protected */ def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
    def handler(req: Request[ParamsDictionary], res: Response, next: NextFunction): Unit = js.native
  }
  
}

