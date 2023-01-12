package typings.materialUiCore

import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollTriggerUseScrollTriggerMod {
  
  @JSImport("@material-ui/core/useScrollTrigger/useScrollTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  inline def default(options: UseScrollTriggerOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait UseScrollTriggerOptions extends StObject {
    
    var disableHysteresis: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[Node | Window] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object UseScrollTriggerOptions {
    
    inline def apply(): UseScrollTriggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseScrollTriggerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseScrollTriggerOptions] (val x: Self) extends AnyVal {
      
      inline def setDisableHysteresis(value: Boolean): Self = StObject.set(x, "disableHysteresis", value.asInstanceOf[js.Any])
      
      inline def setDisableHysteresisUndefined: Self = StObject.set(x, "disableHysteresis", js.undefined)
      
      inline def setTarget(value: Node | Window): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
