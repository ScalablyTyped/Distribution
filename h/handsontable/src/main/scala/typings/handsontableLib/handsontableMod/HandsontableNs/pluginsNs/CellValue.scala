package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellValue extends BaseCell {
  var error: java.lang.String | scala.Unit
  var precedents: js.Array[_]
  var state: java.lang.String
  var value: js.Any
  def addPrecedent(cellReference: CellReference): scala.Unit
  def clearPrecedents(): scala.Unit
  def getError(): java.lang.String | scala.Unit
  def getPrecedents(): js.Array[_]
  def getValue(): js.Any
  def hasError(): scala.Boolean
  def hasPrecedent(cellReference: CellReference): scala.Boolean
  def hasPrecedents(): scala.Boolean
  def isState(state: scala.Double): scala.Boolean
  def removePrecedent(cellReference: CellReference): scala.Unit
  def setError(error: java.lang.String): scala.Unit
  def setState(state: scala.Double): scala.Unit
  def setValue(value: js.Any): scala.Unit
}

object CellValue {
  @scala.inline
  def apply(
    addPrecedent: js.Function1[CellReference, scala.Unit],
    clearPrecedents: js.Function0[scala.Unit],
    columnAbsolute: scala.Boolean,
    columnOffset: scala.Double,
    error: java.lang.String | scala.Unit,
    getError: js.Function0[java.lang.String | scala.Unit],
    getPrecedents: js.Function0[js.Array[_]],
    getValue: js.Function0[js.Any],
    hasError: js.Function0[scala.Boolean],
    hasPrecedent: js.Function1[CellReference, scala.Boolean],
    hasPrecedents: js.Function0[scala.Boolean],
    isEqual: js.Function1[BaseCell, scala.Boolean],
    isState: js.Function1[scala.Double, scala.Boolean],
    precedents: js.Array[_],
    removePrecedent: js.Function1[CellReference, scala.Unit],
    rowAbsolute: scala.Boolean,
    rowOffset: scala.Double,
    setError: js.Function1[java.lang.String, scala.Unit],
    setState: js.Function1[scala.Double, scala.Unit],
    setValue: js.Function1[js.Any, scala.Unit],
    state: java.lang.String,
    toString: js.Function0[java.lang.String],
    translateTo: js.Function2[scala.Double, scala.Double, scala.Unit],
    value: js.Any
  ): CellValue = {
    val __obj = js.Dynamic.literal(addPrecedent = addPrecedent, clearPrecedents = clearPrecedents, columnAbsolute = columnAbsolute, columnOffset = columnOffset, error = error.asInstanceOf[js.Any], getError = getError, getPrecedents = getPrecedents, getValue = getValue, hasError = hasError, hasPrecedent = hasPrecedent, hasPrecedents = hasPrecedents, isEqual = isEqual, isState = isState, precedents = precedents, removePrecedent = removePrecedent, rowAbsolute = rowAbsolute, rowOffset = rowOffset, setError = setError, setState = setState, setValue = setValue, state = state, toString = toString, translateTo = translateTo, value = value)
  
    __obj.asInstanceOf[CellValue]
  }
}

