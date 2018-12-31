package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.TapTarget")
@js.native
class TapTarget () extends Component[TapTargetOptions] {
  /**
    * If the tap target is open
    */
  var isOpen: scala.Boolean = js.native
  /**
    * Close Tap Target
    */
  def close(): scala.Unit = js.native
  /**
    * Open Tap Target
    */
  def open(): scala.Unit = js.native
}

@JSGlobal("M.TapTarget")
@js.native
object TapTarget extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.TapTarget = js.native
  /**
    * Init TapTargets
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.TapTarget] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.TapTargetOptions]
  ): js.Array[materializeDashCssLib.MNs.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.TapTarget = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.TapTargetOptions]): materializeDashCssLib.MNs.TapTarget = js.native
}

