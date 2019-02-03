package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Timepicker")
@js.native
class Timepicker () extends Component[TimepickerOptions] {
  /**
    * If the picker is open.
    */
  var isOpen: scala.Boolean = js.native
  /**
    * The selected time.
    */
  var time: java.lang.String = js.native
  /**
    * Close timepicker
    */
  def close(): scala.Unit = js.native
  /**
    * Open timepicker
    */
  def open(): scala.Unit = js.native
  /**
    * Show hours or minutes view on timepicker
    * @param view The name of the view you want to switch to, 'hours' or 'minutes'.
    */
  @JSName("showView")
  def showView_hours(view: materializeDashCssLib.materializeDashCssLibStrings.hours): scala.Unit = js.native
  @JSName("showView")
  def showView_minutes(view: materializeDashCssLib.materializeDashCssLibStrings.minutes): scala.Unit = js.native
}

/* static members */
@JSGlobal("M.Timepicker")
@js.native
object Timepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Timepicker = js.native
  /**
    * Init Timepickers
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Timepicker] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.TimepickerOptions]
  ): js.Array[materializeDashCssLib.MNs.Timepicker] = js.native
  /**
    * Init Timepicker
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Timepicker = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.TimepickerOptions]): materializeDashCssLib.MNs.Timepicker = js.native
}

