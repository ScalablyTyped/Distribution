package typings.materializeCss.mod

import typings.materializeCss.M.TimepickerOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialTimepickerOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Timepicker")
@js.native
class Timepicker ()
  extends typings.materializeCss.M.Timepicker {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: TimepickerOptions = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "Timepicker")
@js.native
object Timepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Timepicker = js.native
  /**
    * Init Timepickers
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Timepicker] = js.native
  def init(els: MElements, options: PartialTimepickerOptions): js.Array[typings.materializeCss.M.Timepicker] = js.native
  /**
    * Init Timepicker
    */
  def init(els: Element): typings.materializeCss.M.Timepicker = js.native
  def init(els: Element, options: PartialTimepickerOptions): typings.materializeCss.M.Timepicker = js.native
}

