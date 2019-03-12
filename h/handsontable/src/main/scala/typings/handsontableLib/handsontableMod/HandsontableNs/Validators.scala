package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validators extends js.Object {
  @JSName("AutocompleteValidator")
  var AutocompleteValidator_Original: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Autocomplete = js.native
  @JSName("DateValidator")
  var DateValidator_Original: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Date = js.native
  @JSName("DropdownValidator")
  var DropdownValidator_Original: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Autocomplete = js.native
  @JSName("NumericValidator")
  var NumericValidator_Original: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Numeric = js.native
  @JSName("TimeValidator")
  var TimeValidator_Original: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Time = js.native
  def AutocompleteValidator(
    `this`: CellProperties,
    value: CellValue,
    callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def DateValidator(
    `this`: CellProperties,
    value: CellValue,
    callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def DropdownValidator(
    `this`: CellProperties,
    value: CellValue,
    callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def NumericValidator(
    `this`: CellProperties,
    value: CellValue,
    callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def TimeValidator(
    `this`: CellProperties,
    value: CellValue,
    callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def getValidator(name: java.lang.String): handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base = js.native
  def registerValidator(
    name: java.lang.String,
    validatotr: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base
  ): scala.Unit = js.native
}

