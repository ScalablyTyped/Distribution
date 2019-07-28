package typings.kendoDashUi.kendoNs.dataNs

import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.TreeListDataSource")
@js.native
class TreeListDataSource () extends DataSource {
  def add(model: TreeListModel): TreeListModel = js.native
  def cancelChanges(model: TreeListModel): Unit = js.native
  def childNodes(model: TreeListModel): js.Array[TreeListModel] = js.native
  def indexOf(value: TreeListModel): Double = js.native
  def insert(index: Double, model: TreeListModel): TreeListModel = js.native
  def level(model: js.Any): Double = js.native
  def level(model: TreeListModel): Double = js.native
  def load(model: TreeListModel): JQueryPromise[_] = js.native
  def parentNode(model: TreeListModel): TreeListModel = js.native
  def remove(model: TreeListModel): Unit = js.native
  def rootNodes(): js.Array[TreeListModel] = js.native
}

