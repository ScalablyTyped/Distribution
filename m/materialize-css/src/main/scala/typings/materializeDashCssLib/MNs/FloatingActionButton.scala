package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.FloatingActionButton")
@js.native
class FloatingActionButton ()
  extends Component[FloatingActionButtonOptions]
     with Openable {
  /* CompleteClass */
  override var isOpen: scala.Boolean = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def open(): scala.Unit = js.native
}

/* static members */
@JSGlobal("M.FloatingActionButton")
@js.native
object FloatingActionButton extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.FloatingActionButton = js.native
  /**
    * Init FloatingActionButtons
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.FloatingActionButton] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.FloatingActionButtonOptions]
  ): js.Array[materializeDashCssLib.MNs.FloatingActionButton] = js.native
  /**
    * Init FloatingActionButton
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.FloatingActionButton = js.native
  def init(
    els: stdLib.Element,
    options: stdLib.Partial[materializeDashCssLib.MNs.FloatingActionButtonOptions]
  ): materializeDashCssLib.MNs.FloatingActionButton = js.native
}

