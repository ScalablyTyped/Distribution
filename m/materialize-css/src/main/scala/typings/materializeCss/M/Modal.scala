package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ModalOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ trait Modal extends js.Object {
  /**
    * ID of the modal element
    */
  var id: String
  /**
    * If the modal is open.
    */
  var isOpen: Boolean
  /**
    * Close modal
    */
  def close(): Unit
  /**
    * Open modal
    */
  def open(): Unit
}

object Modal {
  @scala.inline
  def apply(close: () => Unit, id: String, isOpen: Boolean, open: () => Unit): Modal = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Modal]
  }
}

