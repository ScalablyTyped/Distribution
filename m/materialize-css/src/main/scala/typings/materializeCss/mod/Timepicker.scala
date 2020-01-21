package typings.materializeCss.mod

import typings.materializeCss.M.TimepickerOptions
import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Timepicker")
@js.native
class Timepicker ()
  extends typings.materializeCss.M.Timepicker

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
  def init(els: MElements, options: Partial[TimepickerOptions]): js.Array[typings.materializeCss.M.Timepicker] = js.native
  /**
    * Init Timepicker
    */
  def init(els: Element): typings.materializeCss.M.Timepicker = js.native
  def init(els: Element, options: Partial[TimepickerOptions]): typings.materializeCss.M.Timepicker = js.native
}

