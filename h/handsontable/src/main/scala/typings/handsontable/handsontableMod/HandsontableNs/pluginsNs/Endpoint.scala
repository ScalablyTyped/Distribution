package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import typings.handsontable.handsontableStrings.average
import typings.handsontable.handsontableStrings.count
import typings.handsontable.handsontableStrings.custom
import typings.handsontable.handsontableStrings.max
import typings.handsontable.handsontableStrings.min
import typings.handsontable.handsontableStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  var customFunction: (js.ThisFunction1[/* this */ ColumnSummary, /* endpoint */ this.type, Double]) | Null
  var destinationColumn: Double
  var destinationRow: Double
  var forceNumeric: Boolean
  var ranges: js.Array[js.Array[Double]]
  var readOnly: Boolean
  var result: Double
  var reversedRowCoords: Boolean
  var roundFloat: Boolean
  var sourceColumn: Double
  var suppressDataTypeErrors: Boolean
  var `type`: sum | min | max | count | average | custom
}

object Endpoint {
  @scala.inline
  def apply(
    destinationColumn: Double,
    destinationRow: Double,
    forceNumeric: Boolean,
    ranges: js.Array[js.Array[Double]],
    readOnly: Boolean,
    result: Double,
    reversedRowCoords: Boolean,
    roundFloat: Boolean,
    sourceColumn: Double,
    suppressDataTypeErrors: Boolean,
    `type`: sum | min | max | count | average | custom,
    customFunction: js.ThisFunction1[/* this */ ColumnSummary, Endpoint, Double] = null
  ): Endpoint = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn, destinationRow = destinationRow, forceNumeric = forceNumeric, ranges = ranges, readOnly = readOnly, result = result, reversedRowCoords = reversedRowCoords, roundFloat = roundFloat, sourceColumn = sourceColumn, suppressDataTypeErrors = suppressDataTypeErrors)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (customFunction != null) __obj.updateDynamic("customFunction")(customFunction)
    __obj.asInstanceOf[Endpoint]
  }
}

