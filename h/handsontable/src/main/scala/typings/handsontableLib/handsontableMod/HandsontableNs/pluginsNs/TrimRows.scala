package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TrimRows extends Base {
  var removedRows: js.Array[_]
  var rowsMapper: TrimRowsMapper
  var trimmedRows: js.Array[_]
  def isTrimmed(row: scala.Double): scala.Boolean
  def trimRow(row: scala.Double): scala.Unit
  def trimRows(rows: js.Array[scala.Double]): scala.Unit
  def untrimAll(): scala.Unit
  def untrimRow(row: scala.Double): scala.Unit
  def untrimRows(rows: js.Array[scala.Double]): scala.Unit
}

