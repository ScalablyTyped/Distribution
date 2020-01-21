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
  def apply(
    createImage: SchemaCreateImageResponse = null,
    createLine: SchemaCreateLineResponse = null,
    createShape: SchemaCreateShapeResponse = null,
    createSheetsChart: SchemaCreateSheetsChartResponse = null,
    createSlide: SchemaCreateSlideResponse = null,
    createTable: SchemaCreateTableResponse = null,
    createVideo: SchemaCreateVideoResponse = null,
    duplicateObject: SchemaDuplicateObjectResponse = null,
    groupObjects: SchemaGroupObjectsResponse = null,
    replaceAllShapesWithImage: SchemaReplaceAllShapesWithImageResponse = null,
    replaceAllShapesWithSheetsChart: SchemaReplaceAllShapesWithSheetsChartResponse = null,
    replaceAllText: SchemaReplaceAllTextResponse = null
  ): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (createImage != null) __obj.updateDynamic("createImage")(createImage.asInstanceOf[js.Any])
    if (createLine != null) __obj.updateDynamic("createLine")(createLine.asInstanceOf[js.Any])
    if (createShape != null) __obj.updateDynamic("createShape")(createShape.asInstanceOf[js.Any])
    if (createSheetsChart != null) __obj.updateDynamic("createSheetsChart")(createSheetsChart.asInstanceOf[js.Any])
    if (createSlide != null) __obj.updateDynamic("createSlide")(createSlide.asInstanceOf[js.Any])
    if (createTable != null) __obj.updateDynamic("createTable")(createTable.asInstanceOf[js.Any])
    if (createVideo != null) __obj.updateDynamic("createVideo")(createVideo.asInstanceOf[js.Any])
    if (duplicateObject != null) __obj.updateDynamic("duplicateObject")(duplicateObject.asInstanceOf[js.Any])
    if (groupObjects != null) __obj.updateDynamic("groupObjects")(groupObjects.asInstanceOf[js.Any])
    if (replaceAllShapesWithImage != null) __obj.updateDynamic("replaceAllShapesWithImage")(replaceAllShapesWithImage.asInstanceOf[js.Any])
    if (replaceAllShapesWithSheetsChart != null) __obj.updateDynamic("replaceAllShapesWithSheetsChart")(replaceAllShapesWithSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResponse]
  }
}

