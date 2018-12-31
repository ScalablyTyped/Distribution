package typings
package ibmDashMobilefirstLib.WLNs.TabBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.TabBar")
@js.native
object TabBarNsMembers extends js.Object {
  def RemoveAllItems(): scala.Unit = js.native
  def addItem(id: java.lang.String, callback: js.Function, title: java.lang.String, options: ItemOptions): ibmDashMobilefirstLib.WLNs.TabBarItem = js.native
  def init(): scala.Unit = js.native
  def isVisible(): scala.Boolean = js.native
  def setEnabled(isEnabled: scala.Boolean): scala.Unit = js.native
  /**
    * @deprecated
    */
  def setParentDivId(parentId: java.lang.String): scala.Unit = js.native
  def setSelectedItem(id: java.lang.String): scala.Unit = js.native
  def setVisible(isVisible: scala.Boolean): scala.Unit = js.native
}

