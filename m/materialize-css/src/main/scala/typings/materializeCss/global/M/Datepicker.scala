package typings.materializeCss.global.M

import typings.materializeCss.M.DatepickerOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialDatepickerOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Datepicker")
@js.native
class Datepicker ()
  extends typings.materializeCss.M.Datepicker {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: DatepickerOptions = js.native
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
@JSGlobal("M.Datepicker")
@js.native
object Datepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Datepicker = js.native
  /**
    * Init Datepickers
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Datepicker] = js.native
  def init(els: MElements, options: PartialDatepickerOptions): js.Array[typings.materializeCss.M.Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: Element): typings.materializeCss.M.Datepicker = js.native
  def init(els: Element, options: PartialDatepickerOptions): typings.materializeCss.M.Datepicker = js.native
}

