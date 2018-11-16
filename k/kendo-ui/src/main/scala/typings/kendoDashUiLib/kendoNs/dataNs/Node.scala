package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Node")
@js.native
class Node () extends Model {
  var children: HierarchicalDataSource = js.native
  def append(model: js.Any): scala.Unit = js.native
  def level(): scala.Double = js.native
  def load(id: js.Any): scala.Unit = js.native
  def loaded(): scala.Boolean = js.native
  def loaded(value: scala.Boolean): scala.Unit = js.native
  def parentNode(): Node = js.native
}

