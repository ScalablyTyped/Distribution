package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Materialbox")
@js.native
class Materialbox () extends Component[MaterialboxOptions] {
  /**
    * Caption if specified
    */
  var caption: java.lang.String = js.native
  /**
    * If the materialbox is no longer being animated
    */
  var doneAnimating: scala.Boolean = js.native
  /**
    * Original height of image
    */
  var originalHeight: scala.Double = js.native
  /**
    * Original width of image
    */
  var originalWidth: scala.Double = js.native
  /**
    * If the materialbox overlay is showing
    */
  var overlayActive: scala.Boolean = js.native
  /**
    * Close materialbox
    */
  def close(): scala.Unit = js.native
  /**
    * Open materialbox
    */
  def open(): scala.Unit = js.native
}

/* static members */
@JSGlobal("M.Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Materialbox] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.MaterialboxOptions]
  ): js.Array[materializeDashCssLib.MNs.Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Materialbox = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.MaterialboxOptions]): materializeDashCssLib.MNs.Materialbox = js.native
}

