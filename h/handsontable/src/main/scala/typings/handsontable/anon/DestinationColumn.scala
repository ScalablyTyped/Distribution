package typings.handsontable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationColumn extends js.Object {
  var destinationColumn: Double
  var destinationRow: Double
  var forceNumeric: js.UndefOr[Boolean] = js.undefined
  var ranges: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var reversedRowCoords: js.UndefOr[Boolean] = js.undefined
  var roundFloat: js.UndefOr[Boolean] = js.undefined
  var sourceColumn: js.UndefOr[Double] = js.undefined
  var suppressDataTypeErrors: js.UndefOr[Boolean] = js.undefined
}

object DestinationColumn {
  @scala.inline
  def apply(
    destinationColumn: Double,
    destinationRow: Double,
    forceNumeric: js.UndefOr[Boolean] = js.undefined,
    ranges: js.Array[js.Array[Double]] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reversedRowCoords: js.UndefOr[Boolean] = js.undefined,
    roundFloat: js.UndefOr[Boolean] = js.undefined,
    sourceColumn: js.UndefOr[Double] = js.undefined,
    suppressDataTypeErrors: js.UndefOr[Boolean] = js.undefined
  ): DestinationColumn = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any])
    if (!js.isUndefined(forceNumeric)) __obj.updateDynamic("forceNumeric")(forceNumeric.get.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversedRowCoords)) __obj.updateDynamic("reversedRowCoords")(reversedRowCoords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(roundFloat)) __obj.updateDynamic("roundFloat")(roundFloat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceColumn)) __obj.updateDynamic("sourceColumn")(sourceColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressDataTypeErrors)) __obj.updateDynamic("suppressDataTypeErrors")(suppressDataTypeErrors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationColumn]
  }
}

