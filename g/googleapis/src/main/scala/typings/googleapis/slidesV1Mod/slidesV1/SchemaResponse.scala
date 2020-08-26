package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single response from an update.
  */
@js.native
trait SchemaResponse extends js.Object {
  /**
    * The result of creating an image.
    */
  var createImage: js.UndefOr[SchemaCreateImageResponse] = js.native
  /**
    * The result of creating a line.
    */
  var createLine: js.UndefOr[SchemaCreateLineResponse] = js.native
  /**
    * The result of creating a shape.
    */
  var createShape: js.UndefOr[SchemaCreateShapeResponse] = js.native
  /**
    * The result of creating a Google Sheets chart.
    */
  var createSheetsChart: js.UndefOr[SchemaCreateSheetsChartResponse] = js.native
  /**
    * The result of creating a slide.
    */
  var createSlide: js.UndefOr[SchemaCreateSlideResponse] = js.native
  /**
    * The result of creating a table.
    */
  var createTable: js.UndefOr[SchemaCreateTableResponse] = js.native
  /**
    * The result of creating a video.
    */
  var createVideo: js.UndefOr[SchemaCreateVideoResponse] = js.native
  /**
    * The result of duplicating an object.
    */
  var duplicateObject: js.UndefOr[SchemaDuplicateObjectResponse] = js.native
  /**
    * The result of grouping objects.
    */
  var groupObjects: js.UndefOr[SchemaGroupObjectsResponse] = js.native
  /**
    * The result of replacing all shapes matching some criteria with an image.
    */
  var replaceAllShapesWithImage: js.UndefOr[SchemaReplaceAllShapesWithImageResponse] = js.native
  /**
    * The result of replacing all shapes matching some criteria with a Google
    * Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[SchemaReplaceAllShapesWithSheetsChartResponse] = js.native
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
    def setCreateImage(value: SchemaCreateImageResponse): Self = this.set("createImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateImage: Self = this.set("createImage", js.undefined)
    @scala.inline
    def setCreateLine(value: SchemaCreateLineResponse): Self = this.set("createLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateLine: Self = this.set("createLine", js.undefined)
    @scala.inline
    def setCreateShape(value: SchemaCreateShapeResponse): Self = this.set("createShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateShape: Self = this.set("createShape", js.undefined)
    @scala.inline
    def setCreateSheetsChart(value: SchemaCreateSheetsChartResponse): Self = this.set("createSheetsChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateSheetsChart: Self = this.set("createSheetsChart", js.undefined)
    @scala.inline
    def setCreateSlide(value: SchemaCreateSlideResponse): Self = this.set("createSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateSlide: Self = this.set("createSlide", js.undefined)
    @scala.inline
    def setCreateTable(value: SchemaCreateTableResponse): Self = this.set("createTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTable: Self = this.set("createTable", js.undefined)
    @scala.inline
    def setCreateVideo(value: SchemaCreateVideoResponse): Self = this.set("createVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateVideo: Self = this.set("createVideo", js.undefined)
    @scala.inline
    def setDuplicateObject(value: SchemaDuplicateObjectResponse): Self = this.set("duplicateObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateObject: Self = this.set("duplicateObject", js.undefined)
    @scala.inline
    def setGroupObjects(value: SchemaGroupObjectsResponse): Self = this.set("groupObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupObjects: Self = this.set("groupObjects", js.undefined)
    @scala.inline
    def setReplaceAllShapesWithImage(value: SchemaReplaceAllShapesWithImageResponse): Self = this.set("replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceAllShapesWithImage: Self = this.set("replaceAllShapesWithImage", js.undefined)
    @scala.inline
    def setReplaceAllShapesWithSheetsChart(value: SchemaReplaceAllShapesWithSheetsChartResponse): Self = this.set("replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceAllShapesWithSheetsChart: Self = this.set("replaceAllShapesWithSheetsChart", js.undefined)
    @scala.inline
    def setReplaceAllText(value: SchemaReplaceAllTextResponse): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
  }
  
}

