package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Collapsible")
@js.native
class Collapsible () extends Component[CollapsibleOptions] {
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  def close(n: scala.Double): scala.Unit = js.native
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  def open(n: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("M.Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Collapsible] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.CollapsibleOptions]
  ): js.Array[materializeDashCssLib.MNs.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Collapsible = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.CollapsibleOptions]): materializeDashCssLib.MNs.Collapsible = js.native
}

