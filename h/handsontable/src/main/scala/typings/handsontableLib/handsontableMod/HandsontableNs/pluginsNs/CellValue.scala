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

