package typings.materializeDashCss.MNs

import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
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
  var isHovered: Boolean = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
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
  def getInstance(elem: Element): Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: MElements): js.Array[Tooltip] = js.native
  def init(els: MElements, options: Partial[TooltipOptions]): js.Array[Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): Tooltip = js.native
  def init(els: Element, options: Partial[TooltipOptions]): Tooltip = js.native
}

