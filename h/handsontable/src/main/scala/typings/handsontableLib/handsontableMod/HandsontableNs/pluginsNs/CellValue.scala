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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPrecedent")(addPrecedent)
    __obj.updateDynamic("clearPrecedents")(clearPrecedents)
    __obj.updateDynamic("columnAbsolute")(columnAbsolute)
    __obj.updateDynamic("columnOffset")(columnOffset)
    __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.updateDynamic("getError")(getError)
    __obj.updateDynamic("getPrecedents")(getPrecedents)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("hasError")(hasError)
    __obj.updateDynamic("hasPrecedent")(hasPrecedent)
    __obj.updateDynamic("hasPrecedents")(hasPrecedents)
    __obj.updateDynamic("isEqual")(isEqual)
    __obj.updateDynamic("isState")(isState)
    __obj.updateDynamic("precedents")(precedents)
    __obj.updateDynamic("removePrecedent")(removePrecedent)
    __obj.updateDynamic("rowAbsolute")(rowAbsolute)
    __obj.updateDynamic("rowOffset")(rowOffset)
    __obj.updateDynamic("setError")(setError)
    __obj.updateDynamic("setState")(setState)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("translateTo")(translateTo)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CellValue]
  }
}

