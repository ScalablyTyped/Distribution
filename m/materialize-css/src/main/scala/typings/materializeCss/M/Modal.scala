package typings.materializeCss.M

import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Modal")
@js.native
class Modal ()
  extends Component[ModalOptions]
     with Openable {
  /**
    * ID of the modal element
    */
  var id: String = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.Modal")
@js.native
object Modal extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Modal = js.native
  /**
    * Init Modals
    */
  def init(els: MElements): js.Array[Modal] = js.native
  def init(els: MElements, options: Partial[ModalOptions]): js.Array[Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: Element): Modal = js.native
  def init(els: Element, options: Partial[ModalOptions]): Modal = js.native
}

