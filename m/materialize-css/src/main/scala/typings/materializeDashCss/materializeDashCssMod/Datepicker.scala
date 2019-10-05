package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.DatepickerOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Datepicker")
@js.native
class Datepicker ()
  extends typings.materializeDashCss.M.Datepicker

/* static members */
@JSImport("materialize-css", "Datepicker")
@js.native
object Datepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.Datepicker = js.native
  /**
    * Init Datepickers
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.Datepicker] = js.native
  def init(els: MElements, options: Partial[DatepickerOptions]): js.Array[typings.materializeDashCss.M.Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: Element): typings.materializeDashCss.M.Datepicker = js.native
  def init(els: Element, options: Partial[DatepickerOptions]): typings.materializeDashCss.M.Datepicker = js.native
}

