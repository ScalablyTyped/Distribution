package typings.httpProxyMiddleware

import typings.httpProxyMiddleware.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHandlersMod {
  
  @JSImport("http-proxy-middleware/dist/_handlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHandlers(options: Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandlers")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def init(proxy: typings.httpProxy.mod.^, option: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(proxy.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
