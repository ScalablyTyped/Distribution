package typings.handsontable.handsontableMod.HandsontableNs

import typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Autocomplete
import typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Checkbox
import typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Date
import typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Dropdown
import typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Numeric
import typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Password
import typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Text
import typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTypes extends js.Object {
  var autocomplete: Autocomplete
  var checkbox: Checkbox
  var date: Date
  var dropdown: Dropdown
  var handsontable: typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Handsontable
  var numeric: Numeric
  var password: Password
  var text: Text
  var time: Time
  def getCellType(name: String): CellTypeObject
  def registerCellType(name: String, `type`: CellTypeObject): Unit
}

object CellTypes {
  @scala.inline
  def apply(
    autocomplete: Autocomplete,
    checkbox: Checkbox,
    date: Date,
    dropdown: Dropdown,
    getCellType: String => CellTypeObject,
    handsontable: typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs.Handsontable,
    numeric: Numeric,
    password: Password,
    registerCellType: (String, CellTypeObject) => Unit,
    text: Text,
    time: Time
  ): CellTypes = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, checkbox = checkbox, date = date, dropdown = dropdown, getCellType = js.Any.fromFunction1(getCellType), handsontable = handsontable, numeric = numeric, password = password, registerCellType = js.Any.fromFunction2(registerCellType), text = text, time = time)
  
    __obj.asInstanceOf[CellTypes]
  }
}

