package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Tooltip")
@js.native
class Tooltip ()
  extends Component[TooltipOptions]
     with Openable {
  /**
    * If tooltip is hovered.
    */
  var isHovered: scala.Boolean = js.native
  /* CompleteClass */
  override var isOpen: scala.Boolean = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def open(): scala.Unit = js.native
}

@JSGlobal("M.Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Tooltip] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.TooltipOptions]
  ): js.Array[materializeDashCssLib.MNs.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Tooltip = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.TooltipOptions]): materializeDashCssLib.MNs.Tooltip = js.native
}

