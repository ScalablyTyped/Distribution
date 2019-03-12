package typings
package atMaterialDashUiCoreLib.tabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsActions extends js.Object {
  def updateIndicator(): scala.Unit
}

object TabsActions {
  @scala.inline
  def apply(updateIndicator: () => scala.Unit): TabsActions = {
    val __obj = js.Dynamic.literal(updateIndicator = js.Any.fromFunction0(updateIndicator))
  
    __obj.asInstanceOf[TabsActions]
  }
}

