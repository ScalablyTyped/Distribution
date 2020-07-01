package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentBase<ToastOptions> * / any */ trait Toast extends js.Object {
  /**
    * Describes the current pan state of the Toast.
    */
  var panning: Boolean
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  var timeRemaining: Double
  /**
    * remove a specific toast
    */
  def dismiss(): Unit
}

object Toast {
  @scala.inline
  def apply(dismiss: () => Unit, panning: Boolean, timeRemaining: Double): Toast = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), panning = panning.asInstanceOf[js.Any], timeRemaining = timeRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toast]
  }
}

