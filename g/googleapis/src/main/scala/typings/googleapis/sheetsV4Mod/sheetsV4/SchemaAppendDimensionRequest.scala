package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Appends rows or columns to the end of a sheet.
  */
@js.native
trait SchemaAppendDimensionRequest extends js.Object {
  /**
    * Whether rows or columns should be appended.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The number of rows or columns to append.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The sheet to append rows or columns to.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaAppendDimensionRequest {
  @scala.inline
  def apply(
    dimension: String = null,
    length: js.UndefOr[Double] = js.undefined,
    sheetId: js.UndefOr[Double] = js.undefined
  ): SchemaAppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppendDimensionRequest]
  }
}

