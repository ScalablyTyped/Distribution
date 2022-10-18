package typings.httpProxyMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRouterMod {
  
  @JSImport("http-proxy-middleware/dist/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTarget(req: Any, config: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(req.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
