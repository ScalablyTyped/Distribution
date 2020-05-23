package typings.materializeCss.global.M

import typings.materializeCss.M.TooltipOptions
import typings.materializeCss.MElements
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
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * If tooltip is hovered.
    */
  /* CompleteClass */
  override var isHovered: Boolean = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: TooltipOptions = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
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
  def init(els: MElements): js.Array[typings.materializeCss.M.Tooltip] = js.native
  def init(els: MElements, options: PartialTooltipOptions): js.Array[typings.materializeCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): typings.materializeCss.M.Tooltip = js.native
  def init(els: Element, options: PartialTooltipOptions): typings.materializeCss.M.Tooltip = js.native
}

