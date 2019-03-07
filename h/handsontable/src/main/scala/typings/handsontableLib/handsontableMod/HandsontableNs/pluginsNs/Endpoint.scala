package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  var customFunction: (js.ThisFunction1[/* this */ ColumnSummary, /* endpoint */ this.type, scala.Double]) | scala.Null
  var destinationColumn: scala.Double
  var destinationRow: scala.Double
  var forceNumeric: scala.Boolean
  var ranges: js.Array[js.Array[scala.Double]]
  var readOnly: scala.Boolean
  var result: scala.Double
  var reversedRowCoords: scala.Boolean
  var roundFloat: scala.Boolean
  var sourceColumn: scala.Double
  var suppressDataTypeErrors: scala.Boolean
  var `type`: handsontableLib.handsontableLibStrings.sum | handsontableLib.handsontableLibStrings.min | handsontableLib.handsontableLibStrings.max | handsontableLib.handsontableLibStrings.count | handsontableLib.handsontableLibStrings.average | handsontableLib.handsontableLibStrings.custom
}

object Endpoint {
  @scala.inline
  def apply(
    destinationColumn: scala.Double,
    destinationRow: scala.Double,
    forceNumeric: scala.Boolean,
    ranges: js.Array[js.Array[scala.Double]],
    readOnly: scala.Boolean,
    result: scala.Double,
    reversedRowCoords: scala.Boolean,
    roundFloat: scala.Boolean,
    sourceColumn: scala.Double,
    suppressDataTypeErrors: scala.Boolean,
    `type`: handsontableLib.handsontableLibStrings.sum | handsontableLib.handsontableLibStrings.min | handsontableLib.handsontableLibStrings.max | handsontableLib.handsontableLibStrings.count | handsontableLib.handsontableLibStrings.average | handsontableLib.handsontableLibStrings.custom,
    customFunction: js.ThisFunction1[/* this */ ColumnSummary, Endpoint, scala.Double] = null
  ): Endpoint = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn, destinationRow = destinationRow, forceNumeric = forceNumeric, ranges = ranges, readOnly = readOnly, result = result, reversedRowCoords = reversedRowCoords, roundFloat = roundFloat, sourceColumn = sourceColumn, suppressDataTypeErrors = suppressDataTypeErrors)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (customFunction != null) __obj.updateDynamic("customFunction")(customFunction)
    __obj.asInstanceOf[Endpoint]
  }
}

