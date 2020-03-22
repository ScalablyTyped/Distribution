package typings.materializeCss.M

import typings.materializeCss.MElements
import typings.materializeCss.PartialTapTargetOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.TapTarget")
@js.native
class TapTarget () extends Component[TapTargetOptions] {
  /**
    * If the tap target is open
    */
  var isOpen: Boolean = js.native
  /**
    * Close Tap Target
    */
  def close(): Unit = js.native
  /**
    * Open Tap Target
    */
  def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.TapTarget")
@js.native
object TapTarget extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): TapTarget = js.native
  /**
    * Init TapTargets
    */
  def init(els: MElements): js.Array[TapTarget] = js.native
  def init(els: MElements, options: PartialTapTargetOptions): js.Array[TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: Element): TapTarget = js.native
  def init(els: Element, options: PartialTapTargetOptions): TapTarget = js.native
}

