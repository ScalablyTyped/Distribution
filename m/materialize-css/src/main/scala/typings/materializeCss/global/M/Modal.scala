package typings.materializeCss.global.M

import typings.materializeCss.M.ModalOptions
import typings.materializeCss.MElements
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
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * ID of the modal element
    */
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: ModalOptions = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
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
  def init(els: MElements): js.Array[typings.materializeCss.M.Modal] = js.native
  def init(els: MElements, options: PartialModalOptions): js.Array[typings.materializeCss.M.Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: Element): typings.materializeCss.M.Modal = js.native
  def init(els: Element, options: PartialModalOptions): typings.materializeCss.M.Modal = js.native
}

