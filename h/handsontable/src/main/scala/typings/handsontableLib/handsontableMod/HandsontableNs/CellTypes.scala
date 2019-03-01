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
}

object CellTypes {
  @scala.inline
  def apply(
    autocomplete: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Autocomplete,
    checkbox: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Checkbox,
    date: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Date,
    dropdown: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Dropdown,
    handsontable: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Handsontable,
    numeric: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Numeric,
    password: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Password,
    text: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Text,
    time: handsontableLib.handsontableMod.HandsontableNs.cellTypesNs.Time
  ): CellTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autocomplete")(autocomplete)
    __obj.updateDynamic("checkbox")(checkbox)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("dropdown")(dropdown)
    __obj.updateDynamic("handsontable")(handsontable)
    __obj.updateDynamic("numeric")(numeric)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[CellTypes]
  }
}

