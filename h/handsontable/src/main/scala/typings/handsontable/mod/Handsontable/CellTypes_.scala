package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.cellTypes.Autocomplete
import typings.handsontable.mod.Handsontable.cellTypes.Checkbox
import typings.handsontable.mod.Handsontable.cellTypes.Date
import typings.handsontable.mod.Handsontable.cellTypes.Dropdown
import typings.handsontable.mod.Handsontable.cellTypes.Numeric
import typings.handsontable.mod.Handsontable.cellTypes.Password
import typings.handsontable.mod.Handsontable.cellTypes.Text
import typings.handsontable.mod.Handsontable.cellTypes.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellTypes_ extends StObject {
  
  var autocomplete: Autocomplete = js.native
  
  var checkbox: Checkbox = js.native
  
  var date: Date = js.native
  
  var dropdown: Dropdown = js.native
  
  def getCellType(name: String): CellTypeObject = js.native
  
  var handsontable: typings.handsontable.mod.Handsontable.cellTypes.Handsontable = js.native
  
  var numeric: Numeric = js.native
  
  var password: Password = js.native
  
  def registerCellType(name: String, `type`: CellTypeObject): Unit = js.native
  
  var text: Text = js.native
  
  var time: Time = js.native
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
  implicit class CellTypes_MutableBuilder[Self <: CellTypes_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocomplete(value: Autocomplete): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckbox(value: Checkbox): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: Dropdown): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCellType(value: String => CellTypeObject): Self = StObject.set(x, "getCellType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandsontable(value: typings.handsontable.mod.Handsontable.cellTypes.Handsontable): Self = StObject.set(x, "handsontable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeric(value: Numeric): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterCellType(value: (String, CellTypeObject) => Unit): Self = StObject.set(x, "registerCellType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Time): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
