package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialModalOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Modal")
@js.native
class Modal ()
  extends typings.materializeCss.M.Modal

/* static members */
@JSImport("materialize-css", "Modal")
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

