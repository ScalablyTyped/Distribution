package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialModalOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Modal")
@js.native
class Modal ()
  extends typings.materializeCss.M.Modal {
  /**
    * ID of the modal element
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * If the modal is open.
    */
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * Close modal
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Open modal
    */
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
  def getInstance(elem: Element): typings.materializeCss.M.Modal = js.native
  /**
    * Init Modals
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Modal] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialModalOptions
  ): js.Array[typings.materializeCss.M.Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: Element): typings.materializeCss.M.Modal = js.native
  def init(els: Element, options: PartialModalOptions): typings.materializeCss.M.Modal = js.native
}

