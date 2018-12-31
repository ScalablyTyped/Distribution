package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleSelectUI extends BaseUI {
  var clearAllUI: BaseUI
  var items: js.Array[_]
  var itemsBox: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var searchInput: InputUI
  var selectAllUI: BaseUI
  def getItems(): scala.Unit
  def isSelectedAllValues(): scala.Boolean
  def setItems(items: js.Array[_]): scala.Unit
}

