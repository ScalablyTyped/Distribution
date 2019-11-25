package typings.handsontable.handsontableMod.Handsontable.plugins

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
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any], forceNumeric = forceNumeric.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], reversedRowCoords = reversedRowCoords.asInstanceOf[js.Any], roundFloat = roundFloat.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], suppressDataTypeErrors = suppressDataTypeErrors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (customFunction != null) __obj.updateDynamic("customFunction")(customFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

