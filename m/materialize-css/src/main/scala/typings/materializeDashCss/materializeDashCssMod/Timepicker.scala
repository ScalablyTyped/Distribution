package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.TimepickerOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Timepicker")
@js.native
class Timepicker ()
  extends typings.materializeDashCss.MNs.Timepicker

/* static members */
@JSImport("materialize-css", "Timepicker")
@js.native
object Timepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Timepicker = js.native
  /**
    * Init Timepickers
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Timepicker] = js.native
  def init(els: MElements, options: Partial[TimepickerOptions]): js.Array[typings.materializeDashCss.MNs.Timepicker] = js.native
  /**
    * Init Timepicker
    */
  def init(els: Element): typings.materializeDashCss.MNs.Timepicker = js.native
  def init(els: Element, options: Partial[TimepickerOptions]): typings.materializeDashCss.MNs.Timepicker = js.native
}

