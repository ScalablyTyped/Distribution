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
  def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  @scala.inline
  implicit class SchemaResponseOps[Self <: SchemaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateNamedRange(value: SchemaCreateNamedRangeResponse): Self = this.set("createNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateNamedRange: Self = this.set("createNamedRange", js.undefined)
    @scala.inline
    def setInsertInlineImage(value: SchemaInsertInlineImageResponse): Self = this.set("insertInlineImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertInlineImage: Self = this.set("insertInlineImage", js.undefined)
    @scala.inline
    def setInsertInlineSheetsChart(value: SchemaInsertInlineSheetsChartResponse): Self = this.set("insertInlineSheetsChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertInlineSheetsChart: Self = this.set("insertInlineSheetsChart", js.undefined)
    @scala.inline
    def setReplaceAllText(value: SchemaReplaceAllTextResponse): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
  }
  
}

