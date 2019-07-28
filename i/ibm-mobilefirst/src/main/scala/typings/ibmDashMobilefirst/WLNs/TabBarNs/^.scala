package typings.ibmDashMobilefirst.WLNs.TabBarNs

import typings.ibmDashMobilefirst.WLNs.TabBarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.TabBar")
@js.native
object ^ extends js.Object {
  def RemoveAllItems(): Unit = js.native
  def addItem(id: String, callback: js.Function, title: String, options: ItemOptions): TabBarItem = js.native
  def init(): Unit = js.native
  def isVisible(): Boolean = js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  /**
    * @deprecated
    */
  def setParentDivId(parentId: String): Unit = js.native
  def setSelectedItem(id: String): Unit = js.native
  def setVisible(isVisible: Boolean): Unit = js.native
}

