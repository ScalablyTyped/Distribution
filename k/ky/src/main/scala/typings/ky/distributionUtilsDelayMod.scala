package typings.ky

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionUtilsDelayMod {
  
  @JSImport("ky/distribution/utils/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ms: Double, param1: DelayOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ms.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait DelayOptions extends StObject {
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
  }
  object DelayOptions {
    
    inline def apply(): DelayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelayOptions]
    }
    
    extension [Self <: DelayOptions](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
