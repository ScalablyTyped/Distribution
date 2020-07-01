package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<FloatingActionButtonOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ trait FloatingActionButton extends js.Object {
  /**
    * Describes open/close state of FAB.
    */
  var isOpen: Boolean
  /**
    * Close FAB
    */
  def close(): Unit
  /**
    * Open FAB
    */
  def open(): Unit
}

object FloatingActionButton {
  @scala.inline
  def apply(close: () => Unit, isOpen: Boolean, open: () => Unit): FloatingActionButton = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[FloatingActionButton]
  }
}

