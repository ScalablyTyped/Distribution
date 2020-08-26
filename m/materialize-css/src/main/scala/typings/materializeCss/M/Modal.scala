package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ModalOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ @js.native
trait Modal extends js.Object {
  /**
    * ID of the modal element
    */
  var id: String = js.native
  /**
    * If the modal is open.
    */
  var isOpen: Boolean = js.native
  /**
    * Close modal
    */
  def close(): Unit = js.native
  /**
    * Open modal
    */
  def open(): Unit = js.native
}

object Modal {
  @scala.inline
  def apply(close: () => Unit, id: String, isOpen: Boolean, open: () => Unit): Modal = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Modal]
  }
  @scala.inline
  implicit class ModalOps[Self <: Modal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
  }
  
}

