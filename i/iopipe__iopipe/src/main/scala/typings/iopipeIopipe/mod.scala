package typings.iopipeIopipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): FunctionWrapper = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FunctionWrapper]
  @scala.inline
  def apply(config: LibraryConfig): FunctionWrapper = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[FunctionWrapper]
  
  @JSImport("@iopipe/iopipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def label(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object mark {
    
    @JSImport("@iopipe/iopipe", "mark")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def end(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("end")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def start(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @scala.inline
  def metric(label: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("metric")(label.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type FunctionWrapper = js.Function1[/* handler */ js.Any, js.Any]
  
  trait LibraryConfig extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var networkTimeout: js.UndefOr[Double] = js.undefined
    
    var timeoutWindow: js.UndefOr[Double] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object LibraryConfig {
    
    @scala.inline
    def apply(): LibraryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LibraryConfig]
    }
    
    @scala.inline
    implicit class LibraryConfigMutableBuilder[Self <: LibraryConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setNetworkTimeout(value: Double): Self = StObject.set(x, "networkTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkTimeoutUndefined: Self = StObject.set(x, "networkTimeout", js.undefined)
      
      @scala.inline
      def setTimeoutWindow(value: Double): Self = StObject.set(x, "timeoutWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutWindowUndefined: Self = StObject.set(x, "timeoutWindow", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
