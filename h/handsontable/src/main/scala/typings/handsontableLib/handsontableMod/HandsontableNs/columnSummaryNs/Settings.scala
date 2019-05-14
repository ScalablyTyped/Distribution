package typings
package handsontableLib.handsontableMod.HandsontableNs.columnSummaryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var customFunction: js.UndefOr[
    js.ThisFunction1[
      /* this */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ColumnSummary, 
      /* endpoint */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Endpoint, 
      scala.Double
    ]
  ] = js.undefined
  var destinationColumn: scala.Double
  var destinationRow: scala.Double
  var forceNumeric: js.UndefOr[scala.Boolean] = js.undefined
  var ranges: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var reversedRowCoords: js.UndefOr[scala.Boolean] = js.undefined
  var roundFloat: js.UndefOr[scala.Boolean] = js.undefined
  var sourceColumn: js.UndefOr[scala.Double] = js.undefined
  var suppressDataTypeErrors: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[
    handsontableLib.handsontableLibStrings.average | handsontableLib.handsontableLibStrings.count | handsontableLib.handsontableLibStrings.custom | handsontableLib.handsontableLibStrings.max | handsontableLib.handsontableLibStrings.min | handsontableLib.handsontableLibStrings.sum
  ] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    destinationColumn: scala.Double,
    destinationRow: scala.Double,
    customFunction: js.ThisFunction1[
      /* this */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ColumnSummary, 
      /* endpoint */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Endpoint, 
      scala.Double
    ] = null,
    forceNumeric: js.UndefOr[scala.Boolean] = js.undefined,
    ranges: js.Array[js.Array[scala.Double]] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reversedRowCoords: js.UndefOr[scala.Boolean] = js.undefined,
    roundFloat: js.UndefOr[scala.Boolean] = js.undefined,
    sourceColumn: scala.Int | scala.Double = null,
    suppressDataTypeErrors: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: handsontableLib.handsontableLibStrings.sum | handsontableLib.handsontableLibStrings.min | handsontableLib.handsontableLibStrings.max | handsontableLib.handsontableLibStrings.count | handsontableLib.handsontableLibStrings.average = null
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

