package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentBase<ToastOptions> * / any */ trait Toast extends StObject {
  
  /**
    * remove a specific toast
    */
  def dismiss(): Unit
  
  /**
    * Describes the current pan state of the Toast.
    */
  var panning: Boolean
  
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  var timeRemaining: Double
}
object Toast {
  
  inline def apply(dismiss: () => Unit, panning: Boolean, timeRemaining: Double): Toast = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), panning = panning.asInstanceOf[js.Any], timeRemaining = timeRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toast]
  }
  
  extension [Self <: Toast](x: Self) {
    
    inline def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
    
    inline def setPanning(value: Boolean): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    inline def setTimeRemaining(value: Double): Self = StObject.set(x, "timeRemaining", value.asInstanceOf[js.Any])
  }
}
