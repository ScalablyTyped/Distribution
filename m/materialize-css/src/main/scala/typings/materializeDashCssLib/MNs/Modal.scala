package typings
package materializeDashCssLib.MNs

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
  var id: java.lang.String = js.native
  /* CompleteClass */
  override var isOpen: scala.Boolean = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def open(): scala.Unit = js.native
}

@JSGlobal("M.Modal")
@js.native
object Modal extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Modal = js.native
  /**
    * Init Modals
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Modal] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.ModalOptions]
  ): js.Array[materializeDashCssLib.MNs.Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Modal = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.ModalOptions]): materializeDashCssLib.MNs.Modal = js.native
}

