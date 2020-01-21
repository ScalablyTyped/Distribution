package typings.inversifyExpressUtils

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.inversify.interfacesMod.interfaces.BindingToSyntax
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversifyExpressUtils.interfacesMod.interfaces.HttpContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_middleware", JSImport.Namespace)
@js.native
object baseMiddlewareMod extends js.Object {
  @js.native
  abstract class BaseMiddleware () extends js.Object {
    val httpContext: HttpContext = js.native
    /* protected */ def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
    def handler(req: Request_[ParamsDictionary], res: Response_, next: NextFunction): Unit = js.native
  }
  
}

