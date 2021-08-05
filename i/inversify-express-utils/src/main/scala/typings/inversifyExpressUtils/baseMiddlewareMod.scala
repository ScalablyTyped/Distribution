package typings.inversifyExpressUtils

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.inversify.interfacesMod.interfaces.BindingToSyntax
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversifyExpressUtils.interfacesMod.interfaces.HttpContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMiddlewareMod {
  
  @JSImport("inversify-express-utils/dts/base_middleware", "BaseMiddleware")
  @js.native
  abstract class BaseMiddleware () extends StObject {
    
    /* protected */ def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
    
    def handler(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], next: NextFunction): Unit = js.native
    
    /* protected */ val httpContext: HttpContext = js.native
  }
}
