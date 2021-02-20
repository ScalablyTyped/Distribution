package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentBase<ToastOptions> * / any */ @js.native
trait Toast extends StObject {
  
  /**
    * remove a specific toast
    */
  def dismiss(): Unit = js.native
  
  /**
    * Describes the current pan state of the Toast.
    */
  var panning: Boolean = js.native
  
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  var timeRemaining: Double = js.native
}
object Toast {
  
  @scala.inline
  def apply(dismiss: () => Unit, panning: Boolean, timeRemaining: Double): Toast = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), panning = panning.asInstanceOf[js.Any], timeRemaining = timeRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toast]
  }
  
  @scala.inline
  implicit class ToastMutableBuilder[Self <: Toast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPanning(value: Boolean): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRemaining(value: Double): Self = StObject.set(x, "timeRemaining", value.asInstanceOf[js.Any])
  }
}
