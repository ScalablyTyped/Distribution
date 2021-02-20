package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.validators.Autocomplete
import typings.handsontable.mod.Handsontable.validators.Base
import typings.handsontable.mod.Handsontable.validators.Date
import typings.handsontable.mod.Handsontable.validators.Numeric
import typings.handsontable.mod.Handsontable.validators.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validators_ extends StObject {
  
  def AutocompleteValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  @JSName("AutocompleteValidator")
  var AutocompleteValidator_Original: Autocomplete = js.native
  
  def DateValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  @JSName("DateValidator")
  var DateValidator_Original: Date = js.native
  
  def DropdownValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  @JSName("DropdownValidator")
  var DropdownValidator_Original: Autocomplete = js.native
  
  def NumericValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  @JSName("NumericValidator")
  var NumericValidator_Original: Numeric = js.native
  
  def TimeValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  @JSName("TimeValidator")
  var TimeValidator_Original: Time = js.native
  
  def getValidator(name: String): Base = js.native
  
  def registerValidator(name: String, validatotr: Base): Unit = js.native
}
