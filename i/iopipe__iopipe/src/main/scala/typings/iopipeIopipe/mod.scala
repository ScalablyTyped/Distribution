package typings.iopipeIopipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@iopipe/iopipe", JSImport.Namespace)
  @js.native
  def apply(): FunctionWrapper = js.native
  @JSImport("@iopipe/iopipe", JSImport.Namespace)
  @js.native
  def apply(config: LibraryConfig): FunctionWrapper = js.native
  
  @JSImport("@iopipe/iopipe", "label")
  @js.native
  def label(label: String): Unit = js.native
  
  object mark {
    
    @JSImport("@iopipe/iopipe", "mark.end")
    @js.native
    def end(label: String): Unit = js.native
    
    @JSImport("@iopipe/iopipe", "mark.start")
    @js.native
    def start(label: String): Unit = js.native
  }
  
  @JSImport("@iopipe/iopipe", "metric")
  @js.native
  def metric(label: String, value: Double): Unit = js.native
  
  type FunctionWrapper = js.Function1[/* handler */ js.Any, js.Any]
  
  @js.native
  trait LibraryConfig extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var networkTimeout: js.UndefOr[Double] = js.native
    
    var timeoutWindow: js.UndefOr[Double] = js.native
    
    var token: js.UndefOr[String] = js.native
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
