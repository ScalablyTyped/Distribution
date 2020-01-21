package typings.materializeCss.M

import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Tabs")
@js.native
class Tabs () extends Component[TabsOptions] {
  /**
    * The index of tab that is currently shown
    */
  var index: Double = js.native
  /**
    * Show tab content that corresponds to the tab with the id
    * @param tabId The id of the tab that you want to switch to
    */
  def select(tabId: String): Unit = js.native
  /**
    * Recalculate tab indicator position. This is useful when the indicator position is not correct
    */
  def updateTabIndicator(): Unit = js.native
}

/* static members */
@JSGlobal("M.Tabs")
@js.native
object Tabs extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Tabs = js.native
  /**
    * Init Tabses
    */
  def init(els: MElements): js.Array[Tabs] = js.native
  def init(els: MElements, options: Partial[TabsOptions]): js.Array[Tabs] = js.native
  /**
    * Init Tabs
    */
  def init(els: Element): Tabs = js.native
  def init(els: Element, options: Partial[TabsOptions]): Tabs = js.native
}

