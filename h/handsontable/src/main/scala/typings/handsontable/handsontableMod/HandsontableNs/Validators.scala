package typings.handsontable.handsontableMod.HandsontableNs

import typings.handsontable.handsontableMod.HandsontableNs.validatorsNs.Autocomplete
import typings.handsontable.handsontableMod.HandsontableNs.validatorsNs.Base
import typings.handsontable.handsontableMod.HandsontableNs.validatorsNs.Date
import typings.handsontable.handsontableMod.HandsontableNs.validatorsNs.Numeric
import typings.handsontable.handsontableMod.HandsontableNs.validatorsNs.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validators extends js.Object {
  @JSName("AutocompleteValidator")
  var AutocompleteValidator_Original: Autocomplete = js.native
  @JSName("DateValidator")
  var DateValidator_Original: Date = js.native
  @JSName("DropdownValidator")
  var DropdownValidator_Original: Autocomplete = js.native
  @JSName("NumericValidator")
  var NumericValidator_Original: Numeric = js.native
  @JSName("TimeValidator")
  var TimeValidator_Original: Time = js.native
  def AutocompleteValidator(`this`: CellProperties, value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  def DateValidator(`this`: CellProperties, value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  def DropdownValidator(`this`: CellProperties, value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  def NumericValidator(`this`: CellProperties, value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  def TimeValidator(`this`: CellProperties, value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  def getValidator(name: String): Base = js.native
  def registerValidator(name: String, validatotr: Base): Unit = js.native
}

