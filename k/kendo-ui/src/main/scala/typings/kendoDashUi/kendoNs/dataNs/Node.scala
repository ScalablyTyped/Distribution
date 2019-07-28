package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Node")
@js.native
class Node () extends Model {
  var children: HierarchicalDataSource = js.native
  def append(model: js.Any): Unit = js.native
  def level(): Double = js.native
  def load(id: js.Any): Unit = js.native
  def loaded(): Boolean = js.native
  def loaded(value: Boolean): Unit = js.native
  def parentNode(): Node = js.native
}

