package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.TooltipOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tooltip")
@js.native
class Tooltip ()
  extends typings.materializeDashCss.M.Tooltip

/* static members */
@JSImport("materialize-css", "Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.Tooltip] = js.native
  def init(els: MElements, options: Partial[TooltipOptions]): js.Array[typings.materializeDashCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): typings.materializeDashCss.M.Tooltip = js.native
  def init(els: Element, options: Partial[TooltipOptions]): typings.materializeDashCss.M.Tooltip = js.native
}

