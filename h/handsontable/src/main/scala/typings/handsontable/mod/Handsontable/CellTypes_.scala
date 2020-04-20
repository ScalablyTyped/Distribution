package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.cellTypes.Autocomplete
import typings.handsontable.mod.Handsontable.cellTypes.Checkbox
import typings.handsontable.mod.Handsontable.cellTypes.Date
import typings.handsontable.mod.Handsontable.cellTypes.Dropdown
import typings.handsontable.mod.Handsontable.cellTypes.Numeric
import typings.handsontable.mod.Handsontable.cellTypes.Password
import typings.handsontable.mod.Handsontable.cellTypes.Text
import typings.handsontable.mod.Handsontable.cellTypes.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTypes_ extends js.Object {
  var autocomplete: Autocomplete
  var checkbox: Checkbox
  var date: Date
  var dropdown: Dropdown
  var handsontable: typings.handsontable.mod.Handsontable.cellTypes.Handsontable
  var numeric: Numeric
  var password: Password
  var text: Text
  var time: Time
  def getCellType(name: String): CellTypeObject
  def registerCellType(name: String, `type`: CellTypeObject): Unit
}

object CellTypes_ {
  @scala.inline
  def apply(
    autocomplete: Autocomplete,
    checkbox: Checkbox,
    date: Date,
    dropdown: Dropdown,
    getCellType: String => CellTypeObject,
    handsontable: typings.handsontable.mod.Handsontable.cellTypes.Handsontable,
    numeric: Numeric,
    password: Password,
    registerCellType: (String, CellTypeObject) => Unit,
    text: Text,
    time: Time
  ): CellTypes_ = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], getCellType = js.Any.fromFunction1(getCellType), handsontable = handsontable.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], registerCellType = js.Any.fromFunction2(registerCellType), text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellTypes_]
  }
}

