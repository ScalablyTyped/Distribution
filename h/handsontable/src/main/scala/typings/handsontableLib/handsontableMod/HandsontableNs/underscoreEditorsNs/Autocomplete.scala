package typings
package handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete extends Handsontable {
  def allowKeyEventPropagation(): scala.Boolean = js.native
  def allowKeyEventPropagation(keyCode: scala.Double): scala.Boolean = js.native
  def flipDropdown(): scala.Unit = js.native
  def flipDropdown(dropdownHeight: scala.Double): scala.Unit = js.native
  def flipDropdownIfNeeded(): scala.Unit = js.native
  def getDropdownHeight(): scala.Double = js.native
  def highlightBestMatchingChoice(): scala.Unit = js.native
  def highlightBestMatchingChoice(index: scala.Double): scala.Unit = js.native
  def limitDropdownIfNeeded(): scala.Unit = js.native
  def limitDropdownIfNeeded(spaceAvailable: scala.Double): scala.Unit = js.native
  def limitDropdownIfNeeded(spaceAvailable: scala.Double, dropdownHeight: scala.Double): scala.Unit = js.native
  def queryChoices(): scala.Unit = js.native
  def queryChoices(query: java.lang.String): scala.Unit = js.native
  def setDropdownHeight(): scala.Unit = js.native
  def setDropdownHeight(height: scala.Double): scala.Unit = js.native
  def sortByRelevance(): js.Array[_] = js.native
  def sortByRelevance(value: handsontableLib.handsontableMod.HandsontableNs.CellValue): js.Array[_] = js.native
  def sortByRelevance(
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue,
    choices: js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]
  ): js.Array[_] = js.native
  def sortByRelevance(
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue,
    choices: js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue],
    caseSensitive: scala.Boolean
  ): js.Array[_] = js.native
  def unflipDropdown(): scala.Unit = js.native
  def updateChoicesList(): scala.Unit = js.native
  def updateChoicesList(choices: js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]): scala.Unit = js.native
  def updateDropdownHeight(): scala.Unit = js.native
}

