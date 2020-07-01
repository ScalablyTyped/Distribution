package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialTooltipOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Tooltip")
@js.native
class Tooltip ()
  extends typings.materializeCss.M.Tooltip {
  /**
    * If tooltip is hovered.
    */
  /* CompleteClass */
  override var isHovered: Boolean = js.native
  /**
    * If tooltip is open.
    */
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * Hide tooltip.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Show tooltip.
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Tooltip] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialTooltipOptions
  ): js.Array[typings.materializeCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): typings.materializeCss.M.Tooltip = js.native
  def init(els: Element, options: PartialTooltipOptions): typings.materializeCss.M.Tooltip = js.native
}

