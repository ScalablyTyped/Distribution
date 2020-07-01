package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range along a single dimension on a sheet. All indexes are zero-based.
  * Indexes are half open: the start index is inclusive and the end index is
  * exclusive. Missing indexes indicate the range is unbounded on that side.
  */
@js.native
trait SchemaDimensionRange extends js.Object {
  /**
    * The dimension of the span.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The end (exclusive) of the span, or not set if unbounded.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The sheet this span is on.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * The start (inclusive) of the span, or not set if unbounded.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object SchemaDimensionRange {
  @scala.inline
  def apply(
    dimension: String = null,
    endIndex: js.UndefOr[Double] = js.undefined,
    sheetId: js.UndefOr[Double] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined
  ): SchemaDimensionRange = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDimensionRange]
  }
}

