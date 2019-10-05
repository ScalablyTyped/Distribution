package typings.handsontable.handsontableMod.Handsontable.columnSummary

import typings.handsontable.handsontableMod.Handsontable.plugins.ColumnSummary
import typings.handsontable.handsontableMod.Handsontable.plugins.Endpoint
import typings.handsontable.handsontableStrings.average
import typings.handsontable.handsontableStrings.count
import typings.handsontable.handsontableStrings.custom
import typings.handsontable.handsontableStrings.max
import typings.handsontable.handsontableStrings.min
import typings.handsontable.handsontableStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var customFunction: js.UndefOr[js.ThisFunction1[/* this */ ColumnSummary, /* endpoint */ Endpoint, Double]] = js.undefined
  var destinationColumn: Double
  var destinationRow: Double
  var forceNumeric: js.UndefOr[Boolean] = js.undefined
  var ranges: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var reversedRowCoords: js.UndefOr[Boolean] = js.undefined
  var roundFloat: js.UndefOr[Boolean] = js.undefined
  var sourceColumn: js.UndefOr[Double] = js.undefined
  var suppressDataTypeErrors: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[average | count | custom | max | min | sum] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    destinationColumn: Double,
    destinationRow: Double,
    customFunction: js.ThisFunction1[/* this */ ColumnSummary, /* endpoint */ Endpoint, Double] = null,
    forceNumeric: js.UndefOr[Boolean] = js.undefined,
    ranges: js.Array[js.Array[Double]] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reversedRowCoords: js.UndefOr[Boolean] = js.undefined,
    roundFloat: js.UndefOr[Boolean] = js.undefined,
    sourceColumn: Int | Double = null,
    suppressDataTypeErrors: js.UndefOr[Boolean] = js.undefined,
    `type`: sum | min | max | count | average = null
  ): Settings = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn, destinationRow = destinationRow)
    if (customFunction != null) __obj.updateDynamic("customFunction")(customFunction)
    if (!js.isUndefined(forceNumeric)) __obj.updateDynamic("forceNumeric")(forceNumeric)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(reversedRowCoords)) __obj.updateDynamic("reversedRowCoords")(reversedRowCoords)
    if (!js.isUndefined(roundFloat)) __obj.updateDynamic("roundFloat")(roundFloat)
    if (sourceColumn != null) __obj.updateDynamic("sourceColumn")(sourceColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressDataTypeErrors)) __obj.updateDynamic("suppressDataTypeErrors")(suppressDataTypeErrors)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

