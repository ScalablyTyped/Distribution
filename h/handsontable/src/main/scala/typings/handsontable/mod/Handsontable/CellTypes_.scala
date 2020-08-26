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

@js.native
trait CellTypes_ extends js.Object {
  var autocomplete: Autocomplete = js.native
  var checkbox: Checkbox = js.native
  var date: Date = js.native
  var dropdown: Dropdown = js.native
  var handsontable: typings.handsontable.mod.Handsontable.cellTypes.Handsontable = js.native
  var numeric: Numeric = js.native
  var password: Password = js.native
  var text: Text = js.native
  var time: Time = js.native
  def getCellType(name: String): CellTypeObject = js.native
  def registerCellType(name: String, `type`: CellTypeObject): Unit = js.native
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
  @scala.inline
  implicit class CellTypes_Ops[Self <: CellTypes_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutocomplete(value: Autocomplete): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckbox(value: Checkbox): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropdown(value: Dropdown): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCellType(value: String => CellTypeObject): Self = this.set("getCellType", js.Any.fromFunction1(value))
    @scala.inline
    def setHandsontable(value: typings.handsontable.mod.Handsontable.cellTypes.Handsontable): Self = this.set("handsontable", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumeric(value: Numeric): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: Password): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisterCellType(value: (String, CellTypeObject) => Unit): Self = this.set("registerCellType", js.Any.fromFunction2(value))
    @scala.inline
    def setText(value: Text): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Time): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

