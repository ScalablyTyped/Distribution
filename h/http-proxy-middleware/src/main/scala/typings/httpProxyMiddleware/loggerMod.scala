package typings.httpProxyMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("http-proxy-middleware/dist/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArrow(originalPath: Any, newPath: Any, originalTarget: Any, newTarget: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrow")(originalPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], originalTarget.asInstanceOf[js.Any], newTarget.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
}
