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
    addPrecedent: CellReference => scala.Unit,
    clearPrecedents: () => scala.Unit,
    columnAbsolute: scala.Boolean,
    columnOffset: scala.Double,
    error: java.lang.String | scala.Unit,
    getError: () => java.lang.String | scala.Unit,
    getPrecedents: () => js.Array[_],
    getValue: () => js.Any,
    hasError: () => scala.Boolean,
    hasPrecedent: CellReference => scala.Boolean,
    hasPrecedents: () => scala.Boolean,
    isEqual: BaseCell => scala.Boolean,
    isState: scala.Double => scala.Boolean,
    precedents: js.Array[_],
    removePrecedent: CellReference => scala.Unit,
    rowAbsolute: scala.Boolean,
    rowOffset: scala.Double,
    setError: java.lang.String => scala.Unit,
    setState: scala.Double => scala.Unit,
    setValue: js.Any => scala.Unit,
    state: java.lang.String,
    toString: () => java.lang.String,
    translateTo: (scala.Double, scala.Double) => scala.Unit,
    value: js.Any
  ): CellValue = {
    val __obj = js.Dynamic.literal(addPrecedent = js.Any.fromFunction1(addPrecedent), clearPrecedents = js.Any.fromFunction0(clearPrecedents), columnAbsolute = columnAbsolute, columnOffset = columnOffset, error = error.asInstanceOf[js.Any], getError = js.Any.fromFunction0(getError), getPrecedents = js.Any.fromFunction0(getPrecedents), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), hasPrecedent = js.Any.fromFunction1(hasPrecedent), hasPrecedents = js.Any.fromFunction0(hasPrecedents), isEqual = js.Any.fromFunction1(isEqual), isState = js.Any.fromFunction1(isState), precedents = precedents, removePrecedent = js.Any.fromFunction1(removePrecedent), rowAbsolute = rowAbsolute, rowOffset = rowOffset, setError = js.Any.fromFunction1(setError), setState = js.Any.fromFunction1(setState), setValue = js.Any.fromFunction1(setValue), state = state, toString = js.Any.fromFunction0(toString), translateTo = js.Any.fromFunction2(translateTo), value = value)
  
    __obj.asInstanceOf[CellValue]
  }
}

