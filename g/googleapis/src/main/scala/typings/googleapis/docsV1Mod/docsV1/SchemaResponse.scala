package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single response from an update.
  */
@js.native
trait SchemaResponse extends js.Object {
  /**
    * The result of creating a named range.
    */
  var createNamedRange: js.UndefOr[SchemaCreateNamedRangeResponse] = js.native
  /**
    * The result of inserting an inline image.
    */
  var insertInlineImage: js.UndefOr[SchemaInsertInlineImageResponse] = js.native
  /**
    * The result of inserting an inline Google Sheets chart.
    */
  var insertInlineSheetsChart: js.UndefOr[SchemaInsertInlineSheetsChartResponse] = js.native
  /**
    * The result of replacing text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextResponse] = js.native
}

object SchemaResponse {
  @scala.inline
  def apply(
    createNamedRange: SchemaCreateNamedRangeResponse = null,
    insertInlineImage: SchemaInsertInlineImageResponse = null,
    insertInlineSheetsChart: SchemaInsertInlineSheetsChartResponse = null,
    replaceAllText: SchemaReplaceAllTextResponse = null
  ): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (createNamedRange != null) __obj.updateDynamic("createNamedRange")(createNamedRange.asInstanceOf[js.Any])
    if (insertInlineImage != null) __obj.updateDynamic("insertInlineImage")(insertInlineImage.asInstanceOf[js.Any])
    if (insertInlineSheetsChart != null) __obj.updateDynamic("insertInlineSheetsChart")(insertInlineSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResponse]
  }
}

