package typings.libp2pLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  inline def enable(namespaces: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(namespaces.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enabled(namespaces: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(namespaces.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def logger(name: String): Logger_ = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")(name.asInstanceOf[js.Any]).asInstanceOf[Logger_]
  
  @js.native
  trait Logger_ extends StObject {
    
    def apply(formatter: Any, args: Any*): Unit = js.native
    
    var enabled: Boolean = js.native
    
    def error(formatter: Any, args: Any*): Unit = js.native
    
    def trace(formatter: Any, args: Any*): Unit = js.native
  }
}
