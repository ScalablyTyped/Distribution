package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import typings.handsontable.handsontableMod.underscoreHandsontableNs.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsFactory extends js.Object {
  var defaultOrderPattern: js.Array[_] | Unit = js.native
  var hot: Core = js.native
  var predefinedItems: js.Object = js.native
  def getItems(): js.Array[_] = js.native
  def getItems(pattern: js.Array[_]): js.Array[_] = js.native
  def getItems(pattern: js.Object): js.Array[_] = js.native
  def getItems(pattern: Boolean): js.Array[_] = js.native
  def setPredefinedItems(predefinedItems: js.Array[_]): Unit = js.native
}

