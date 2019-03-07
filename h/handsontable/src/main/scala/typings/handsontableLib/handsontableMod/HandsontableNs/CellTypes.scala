package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTypes extends js.Object {
  var autocomplete: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Autocomplete
  var checkbox: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Checkbox
  var date: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Date
  var dropdown: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Dropdown
  var handsontable: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Handsontable
  var numeric: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Numeric
  var password: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Password
  var text: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Text
  var time: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Time
  def getCellType(name: java.lang.String): CellTypeObject
  def registerCellType(name: java.lang.String, `type`: CellTypeObject): scala.Unit
}

object CellTypes {
  @scala.inline
  def apply(
    autocomplete: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Autocomplete,
    checkbox: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Checkbox,
    date: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Date,
    dropdown: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Dropdown,
    getCellType: js.Function1[java.lang.String, CellTypeObject],
    handsontable: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Handsontable,
    numeric: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Numeric,
    password: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Password,
    registerCellType: js.Function2[java.lang.String, CellTypeObject, scala.Unit],
    text: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Text,
    time: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Time
  ): CellTypes = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, checkbox = checkbox, date = date, dropdown = dropdown, getCellType = getCellType, handsontable = handsontable, numeric = numeric, password = password, registerCellType = registerCellType, text = text, time = time)
  
    __obj.asInstanceOf[CellTypes]
  }
}

