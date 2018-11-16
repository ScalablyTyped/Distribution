package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.TreeListDataSource")
@js.native
class TreeListDataSource () extends DataSource {
  def add(model: TreeListModel): TreeListModel = js.native
  def cancelChanges(model: TreeListModel): scala.Unit = js.native
  def childNodes(model: TreeListModel): js.Array[TreeListModel] = js.native
  def indexOf(value: TreeListModel): scala.Double = js.native
  def insert(index: scala.Double, model: TreeListModel): TreeListModel = js.native
  def level(model: js.Any): scala.Double = js.native
  def level(model: TreeListModel): scala.Double = js.native
  def load(model: TreeListModel): kendoDashUiLib.JQueryPromise[_] = js.native
  def parentNode(model: TreeListModel): TreeListModel = js.native
  def remove(model: TreeListModel): scala.Unit = js.native
  def rootNodes(): js.Array[TreeListModel] = js.native
}

