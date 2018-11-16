package typings
package materializeDashCssLib.materializeDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tooltip")
@js.native
class Tooltip ()
  extends materializeDashCssLib.MNs.Tooltip

@JSImport("materialize-css", "Tooltip")
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
  /**
           * Init Tooltips
           */
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.TooltipOptions]
  ): js.Array[materializeDashCssLib.MNs.Tooltip] = js.native
  /**
           * Init Tooltip
           */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Tooltip = js.native
  /**
           * Init Tooltip
           */
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.TooltipOptions]): materializeDashCssLib.MNs.Tooltip = js.native
}

