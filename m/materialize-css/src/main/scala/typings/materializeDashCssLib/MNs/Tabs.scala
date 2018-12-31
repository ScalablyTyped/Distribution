package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Tabs")
@js.native
class Tabs () extends Component[TabsOptions] {
  /**
    * The index of tab that is currently shown
    */
  var index: scala.Double = js.native
  /**
    * Show tab content that corresponds to the tab with the id
    * @param tabId The id of the tab that you want to switch to
    */
  def select(tabId: java.lang.String): scala.Unit = js.native
  /**
    * Recalculate tab indicator position. This is useful when the indicator position is not correct
    */
  def updateTabIndicator(): scala.Unit = js.native
}

@JSGlobal("M.Tabs")
@js.native
object Tabs extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Tabs = js.native
  /**
    * Init Tabses
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Tabs] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.TabsOptions]
  ): js.Array[materializeDashCssLib.MNs.Tabs] = js.native
  /**
    * Init Tabs
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Tabs = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.TabsOptions]): materializeDashCssLib.MNs.Tabs = js.native
}

