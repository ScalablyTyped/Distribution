package typings
package handsontableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationColumn extends js.Object {
  var destinationColumn: scala.Double
  var destinationRow: scala.Double
  var forceNumeric: js.UndefOr[scala.Boolean] = js.undefined
  var ranges: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var reversedRowCoords: js.UndefOr[scala.Boolean] = js.undefined
  var roundFloat: js.UndefOr[scala.Boolean] = js.undefined
  var sourceColumn: js.UndefOr[scala.Double] = js.undefined
  var suppressDataTypeErrors: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DestinationColumn {
  @scala.inline
  def apply(
    destinationColumn: scala.Double,
    destinationRow: scala.Double,
    forceNumeric: js.UndefOr[scala.Boolean] = js.undefined,
    ranges: js.Array[js.Array[scala.Double]] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reversedRowCoords: js.UndefOr[scala.Boolean] = js.undefined,
    roundFloat: js.UndefOr[scala.Boolean] = js.undefined,
    sourceColumn: scala.Int | scala.Double = null,
    suppressDataTypeErrors: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DestinationColumn = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn, destinationRow = destinationRow)
    if (!js.isUndefined(forceNumeric)) __obj.updateDynamic("forceNumeric")(forceNumeric)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(reversedRowCoords)) __obj.updateDynamic("reversedRowCoords")(reversedRowCoords)
    if (!js.isUndefined(roundFloat)) __obj.updateDynamic("roundFloat")(roundFloat)
    if (sourceColumn != null) __obj.updateDynamic("sourceColumn")(sourceColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressDataTypeErrors)) __obj.updateDynamic("suppressDataTypeErrors")(suppressDataTypeErrors)
    __obj.asInstanceOf[Anon_DestinationColumn]
  }
}

