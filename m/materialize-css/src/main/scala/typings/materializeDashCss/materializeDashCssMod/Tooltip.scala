package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.TooltipOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tooltip")
@js.native
class Tooltip ()
  extends typings.materializeDashCss.MNs.Tooltip

/* static members */
@JSImport("materialize-css", "Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Tooltip] = js.native
  def init(els: MElements, options: Partial[TooltipOptions]): js.Array[typings.materializeDashCss.MNs.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): typings.materializeDashCss.MNs.Tooltip = js.native
  def init(els: Element, options: Partial[TooltipOptions]): typings.materializeDashCss.MNs.Tooltip = js.native
}

