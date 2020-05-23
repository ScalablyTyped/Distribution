package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tabs extends Component[TabsOptions] {
  /**
    * The index of tab that is currently shown
    */
  var index: Double
  /**
    * Show tab content that corresponds to the tab with the id
    * @param tabId The id of the tab that you want to switch to
    */
  def select(tabId: String): Unit
  /**
    * Recalculate tab indicator position. This is useful when the indicator position is not correct
    */
  def updateTabIndicator(): Unit
}

object Tabs {
  @scala.inline
  def apply(
    destroy: () => Unit,
    el: Element,
    index: Double,
    options: TabsOptions,
    select: String => Unit,
    updateTabIndicator: () => Unit
  ): Tabs = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), updateTabIndicator = js.Any.fromFunction0(updateTabIndicator))
    __obj.asInstanceOf[Tabs]
  }
}

