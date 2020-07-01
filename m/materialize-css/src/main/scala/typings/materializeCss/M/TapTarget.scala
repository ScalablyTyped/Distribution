package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TapTargetOptions> * / any */ trait TapTarget extends js.Object {
  /**
    * If the tap target is open
    */
  var isOpen: Boolean
  /**
    * Close Tap Target
    */
  def close(): Unit
  /**
    * Open Tap Target
    */
  def open(): Unit
}

object TapTarget {
  @scala.inline
  def apply(close: () => Unit, isOpen: Boolean, open: () => Unit): TapTarget = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[TapTarget]
  }
}

