package typings.iopipeIopipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): FunctionWrapper = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FunctionWrapper]
  inline def apply(config: LibraryConfig): FunctionWrapper = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[FunctionWrapper]
  
  @JSImport("@iopipe/iopipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def label(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object mark {
    
    @JSImport("@iopipe/iopipe", "mark")
    @js.native
    val ^ : js.Any = js.native
    
    inline def end(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("end")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def start(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def metric(label: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("metric")(label.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type FunctionWrapper = js.Function1[/* handler */ js.Any, js.Any]
  
  trait LibraryConfig extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var networkTimeout: js.UndefOr[Double] = js.undefined
    
    var timeoutWindow: js.UndefOr[Double] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object LibraryConfig {
    
    inline def apply(): LibraryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LibraryConfig]
    }
    
    extension [Self <: LibraryConfig](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setNetworkTimeout(value: Double): Self = StObject.set(x, "networkTimeout", value.asInstanceOf[js.Any])
      
      inline def setNetworkTimeoutUndefined: Self = StObject.set(x, "networkTimeout", js.undefined)
      
      inline def setTimeoutWindow(value: Double): Self = StObject.set(x, "timeoutWindow", value.asInstanceOf[js.Any])
      
      inline def setTimeoutWindowUndefined: Self = StObject.set(x, "timeoutWindow", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
