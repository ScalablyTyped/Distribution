package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellValue extends BaseCell {
  var error: String | Unit
  var precedents: js.Array[_]
  var state: String
  var value: js.Any
  def addPrecedent(cellReference: CellReference): Unit
  def clearPrecedents(): Unit
  def getError(): String | Unit
  def getPrecedents(): js.Array[_]
  def getValue(): js.Any
  def hasError(): Boolean
  def hasPrecedent(cellReference: CellReference): Boolean
  def hasPrecedents(): Boolean
  def isState(state: Double): Boolean
  def removePrecedent(cellReference: CellReference): Unit
  def setError(error: String): Unit
  def setState(state: Double): Unit
  def setValue(value: js.Any): Unit
}

object CellValue {
  @scala.inline
  def apply(
    addPrecedent: CellReference => Unit,
    clearPrecedents: () => Unit,
    columnAbsolute: Boolean,
    columnOffset: Double,
    error: String | Unit,
    getError: () => String | Unit,
    getPrecedents: () => js.Array[_],
    getValue: () => js.Any,
    hasError: () => Boolean,
    hasPrecedent: CellReference => Boolean,
    hasPrecedents: () => Boolean,
    isEqual: BaseCell => Boolean,
    isState: Double => Boolean,
    precedents: js.Array[_],
    removePrecedent: CellReference => Unit,
    rowAbsolute: Boolean,
    rowOffset: Double,
    setError: String => Unit,
    setState: Double => Unit,
    setValue: js.Any => Unit,
    state: String,
    toString: () => String,
    translateTo: (Double, Double) => Unit,
    value: js.Any
  ): CellValue = {
    val __obj = js.Dynamic.literal(addPrecedent = js.Any.fromFunction1(addPrecedent), clearPrecedents = js.Any.fromFunction0(clearPrecedents), columnAbsolute = columnAbsolute, columnOffset = columnOffset, error = error.asInstanceOf[js.Any], getError = js.Any.fromFunction0(getError), getPrecedents = js.Any.fromFunction0(getPrecedents), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), hasPrecedent = js.Any.fromFunction1(hasPrecedent), hasPrecedents = js.Any.fromFunction0(hasPrecedents), isEqual = js.Any.fromFunction1(isEqual), isState = js.Any.fromFunction1(isState), precedents = precedents, removePrecedent = js.Any.fromFunction1(removePrecedent), rowAbsolute = rowAbsolute, rowOffset = rowOffset, setError = js.Any.fromFunction1(setError), setState = js.Any.fromFunction1(setState), setValue = js.Any.fromFunction1(setValue), state = state, toString = js.Any.fromFunction0(toString), translateTo = js.Any.fromFunction2(translateTo), value = value)
  
    __obj.asInstanceOf[CellValue]
  }
}

