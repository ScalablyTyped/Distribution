package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.ModalOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Modal")
@js.native
class Modal ()
  extends typings.materializeDashCss.MNs.Modal

/* static members */
@JSImport("materialize-css", "Modal")
@js.native
object Modal extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Modal = js.native
  /**
    * Init Modals
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Modal] = js.native
  def init(els: MElements, options: Partial[ModalOptions]): js.Array[typings.materializeDashCss.MNs.Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: Element): typings.materializeDashCss.MNs.Modal = js.native
  def init(els: Element, options: Partial[ModalOptions]): typings.materializeDashCss.MNs.Modal = js.native
}

