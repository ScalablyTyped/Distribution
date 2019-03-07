package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validators extends js.Object {
  var AutocompleteValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Autocomplete
  var DateValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Date
  var DropdownValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Autocomplete
  var NumericValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Numeric
  var TimeValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Time
  def getValidator(name: java.lang.String): handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base
  def registerValidator(
    name: java.lang.String,
    validatotr: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base
  ): scala.Unit
}

object Validators {
  @scala.inline
  def apply(
    AutocompleteValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Autocomplete,
    DateValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Date,
    DropdownValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Autocomplete,
    NumericValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Numeric,
    TimeValidator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Time,
    getValidator: js.Function1[java.lang.String, handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base],
    registerValidator: js.Function2[
      java.lang.String, 
      handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base, 
      scala.Unit
    ]
  ): Validators = {
    val __obj = js.Dynamic.literal(AutocompleteValidator = AutocompleteValidator, DateValidator = DateValidator, DropdownValidator = DropdownValidator, NumericValidator = NumericValidator, TimeValidator = TimeValidator, getValidator = getValidator, registerValidator = registerValidator)
  
    __obj.asInstanceOf[Validators]
  }
}

