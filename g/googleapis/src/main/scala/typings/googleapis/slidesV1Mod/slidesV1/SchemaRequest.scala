package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single kind of update to apply to a presentation.
  */
@js.native
trait SchemaRequest extends js.Object {
  /**
    * Creates an image.
    */
  var createImage: js.UndefOr[SchemaCreateImageRequest] = js.native
  /**
    * Creates a line.
    */
  var createLine: js.UndefOr[SchemaCreateLineRequest] = js.native
  /**
    * Creates bullets for paragraphs.
    */
  var createParagraphBullets: js.UndefOr[SchemaCreateParagraphBulletsRequest] = js.native
  /**
    * Creates a new shape.
    */
  var createShape: js.UndefOr[SchemaCreateShapeRequest] = js.native
  /**
    * Creates an embedded Google Sheets chart.
    */
  var createSheetsChart: js.UndefOr[SchemaCreateSheetsChartRequest] = js.native
  /**
    * Creates a new slide.
    */
  var createSlide: js.UndefOr[SchemaCreateSlideRequest] = js.native
  /**
    * Creates a new table.
    */
  var createTable: js.UndefOr[SchemaCreateTableRequest] = js.native
  /**
    * Creates a video.
    */
  var createVideo: js.UndefOr[SchemaCreateVideoRequest] = js.native
  /**
    * Deletes a page or page element from the presentation.
    */
  var deleteObject: js.UndefOr[SchemaDeleteObjectRequest] = js.native
  /**
    * Deletes bullets from paragraphs.
    */
  var deleteParagraphBullets: js.UndefOr[SchemaDeleteParagraphBulletsRequest] = js.native
  /**
    * Deletes a column from a table.
    */
  var deleteTableColumn: js.UndefOr[SchemaDeleteTableColumnRequest] = js.native
  /**
    * Deletes a row from a table.
    */
  var deleteTableRow: js.UndefOr[SchemaDeleteTableRowRequest] = js.native
  /**
    * Deletes text from a shape or a table cell.
    */
  var deleteText: js.UndefOr[SchemaDeleteTextRequest] = js.native
  /**
    * Duplicates a slide or page element.
    */
  var duplicateObject: js.UndefOr[SchemaDuplicateObjectRequest] = js.native
  /**
    * Groups objects, such as page elements.
    */
  var groupObjects: js.UndefOr[SchemaGroupObjectsRequest] = js.native
  /**
    * Inserts columns into a table.
    */
  var insertTableColumns: js.UndefOr[SchemaInsertTableColumnsRequest] = js.native
  /**
    * Inserts rows into a table.
    */
  var insertTableRows: js.UndefOr[SchemaInsertTableRowsRequest] = js.native
  /**
    * Inserts text into a shape or table cell.
    */
  var insertText: js.UndefOr[SchemaInsertTextRequest] = js.native
  /**
    * Merges cells in a Table.
    */
  var mergeTableCells: js.UndefOr[SchemaMergeTableCellsRequest] = js.native
  /**
    * Refreshes a Google Sheets chart.
    */
  var refreshSheetsChart: js.UndefOr[SchemaRefreshSheetsChartRequest] = js.native
  /**
    * Replaces all shapes matching some criteria with an image.
    */
  var replaceAllShapesWithImage: js.UndefOr[SchemaReplaceAllShapesWithImageRequest] = js.native
  /**
    * Replaces all shapes matching some criteria with a Google Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[SchemaReplaceAllShapesWithSheetsChartRequest] = js.native
  /**
    * Replaces all instances of specified text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextRequest] = js.native
  /**
    * Replaces an existing image with a new image.
    */
  var replaceImage: js.UndefOr[SchemaReplaceImageRequest] = js.native
  /**
    * Reroutes a line such that it&#39;s connected at the two closest
    * connection sites on the connected page elements.
    */
  var rerouteLine: js.UndefOr[SchemaRerouteLineRequest] = js.native
  /**
    * Ungroups objects, such as groups.
    */
  var ungroupObjects: js.UndefOr[SchemaUngroupObjectsRequest] = js.native
  /**
    * Unmerges cells in a Table.
    */
  var unmergeTableCells: js.UndefOr[SchemaUnmergeTableCellsRequest] = js.native
  /**
    * Updates the properties of an Image.
    */
  var updateImageProperties: js.UndefOr[SchemaUpdateImagePropertiesRequest] = js.native
  /**
    * Updates the category of a line.
    */
  var updateLineCategory: js.UndefOr[SchemaUpdateLineCategoryRequest] = js.native
  /**
    * Updates the properties of a Line.
    */
  var updateLineProperties: js.UndefOr[SchemaUpdateLinePropertiesRequest] = js.native
  /**
    * Updates the alt text title and/or description of a page element.
    */
  var updatePageElementAltText: js.UndefOr[SchemaUpdatePageElementAltTextRequest] = js.native
  /**
    * Updates the transform of a page element.
    */
  var updatePageElementTransform: js.UndefOr[SchemaUpdatePageElementTransformRequest] = js.native
  /**
    * Updates the Z-order of page elements.
    */
  var updatePageElementsZOrder: js.UndefOr[SchemaUpdatePageElementsZOrderRequest] = js.native
  /**
    * Updates the properties of a Page.
    */
  var updatePageProperties: js.UndefOr[SchemaUpdatePagePropertiesRequest] = js.native
  /**
    * Updates the styling of paragraphs within a Shape or Table.
    */
  var updateParagraphStyle: js.UndefOr[SchemaUpdateParagraphStyleRequest] = js.native
  /**
    * Updates the properties of a Shape.
    */
  var updateShapeProperties: js.UndefOr[SchemaUpdateShapePropertiesRequest] = js.native
  /**
    * Updates the position of a set of slides in the presentation.
    */
  var updateSlidesPosition: js.UndefOr[SchemaUpdateSlidesPositionRequest] = js.native
  /**
    * Updates the properties of the table borders in a Table.
    */
  var updateTableBorderProperties: js.UndefOr[SchemaUpdateTableBorderPropertiesRequest] = js.native
  /**
    * Updates the properties of a TableCell.
    */
  var updateTableCellProperties: js.UndefOr[SchemaUpdateTableCellPropertiesRequest] = js.native
  /**
    * Updates the properties of a Table column.
    */
  var updateTableColumnProperties: js.UndefOr[SchemaUpdateTableColumnPropertiesRequest] = js.native
  /**
    * Updates the properties of a Table row.
    */
  var updateTableRowProperties: js.UndefOr[SchemaUpdateTableRowPropertiesRequest] = js.native
  /**
    * Updates the styling of text within a Shape or Table.
    */
  var updateTextStyle: js.UndefOr[SchemaUpdateTextStyleRequest] = js.native
  /**
    * Updates the properties of a Video.
    */
  var updateVideoProperties: js.UndefOr[SchemaUpdateVideoPropertiesRequest] = js.native
}

object SchemaRequest {
  @scala.inline
  def apply(
    createImage: SchemaCreateImageRequest = null,
    createLine: SchemaCreateLineRequest = null,
    createParagraphBullets: SchemaCreateParagraphBulletsRequest = null,
    createShape: SchemaCreateShapeRequest = null,
    createSheetsChart: SchemaCreateSheetsChartRequest = null,
    createSlide: SchemaCreateSlideRequest = null,
    createTable: SchemaCreateTableRequest = null,
    createVideo: SchemaCreateVideoRequest = null,
    deleteObject: SchemaDeleteObjectRequest = null,
    deleteParagraphBullets: SchemaDeleteParagraphBulletsRequest = null,
    deleteTableColumn: SchemaDeleteTableColumnRequest = null,
    deleteTableRow: SchemaDeleteTableRowRequest = null,
    deleteText: SchemaDeleteTextRequest = null,
    duplicateObject: SchemaDuplicateObjectRequest = null,
    groupObjects: SchemaGroupObjectsRequest = null,
    insertTableColumns: SchemaInsertTableColumnsRequest = null,
    insertTableRows: SchemaInsertTableRowsRequest = null,
    insertText: SchemaInsertTextRequest = null,
    mergeTableCells: SchemaMergeTableCellsRequest = null,
    refreshSheetsChart: SchemaRefreshSheetsChartRequest = null,
    replaceAllShapesWithImage: SchemaReplaceAllShapesWithImageRequest = null,
    replaceAllShapesWithSheetsChart: SchemaReplaceAllShapesWithSheetsChartRequest = null,
    replaceAllText: SchemaReplaceAllTextRequest = null,
    replaceImage: SchemaReplaceImageRequest = null,
    rerouteLine: SchemaRerouteLineRequest = null,
    ungroupObjects: SchemaUngroupObjectsRequest = null,
    unmergeTableCells: SchemaUnmergeTableCellsRequest = null,
    updateImageProperties: SchemaUpdateImagePropertiesRequest = null,
    updateLineCategory: SchemaUpdateLineCategoryRequest = null,
    updateLineProperties: SchemaUpdateLinePropertiesRequest = null,
    updatePageElementAltText: SchemaUpdatePageElementAltTextRequest = null,
    updatePageElementTransform: SchemaUpdatePageElementTransformRequest = null,
    updatePageElementsZOrder: SchemaUpdatePageElementsZOrderRequest = null,
    updatePageProperties: SchemaUpdatePagePropertiesRequest = null,
    updateParagraphStyle: SchemaUpdateParagraphStyleRequest = null,
    updateShapeProperties: SchemaUpdateShapePropertiesRequest = null,
    updateSlidesPosition: SchemaUpdateSlidesPositionRequest = null,
    updateTableBorderProperties: SchemaUpdateTableBorderPropertiesRequest = null,
    updateTableCellProperties: SchemaUpdateTableCellPropertiesRequest = null,
    updateTableColumnProperties: SchemaUpdateTableColumnPropertiesRequest = null,
    updateTableRowProperties: SchemaUpdateTableRowPropertiesRequest = null,
    updateTextStyle: SchemaUpdateTextStyleRequest = null,
    updateVideoProperties: SchemaUpdateVideoPropertiesRequest = null
  ): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    if (createImage != null) __obj.updateDynamic("createImage")(createImage.asInstanceOf[js.Any])
    if (createLine != null) __obj.updateDynamic("createLine")(createLine.asInstanceOf[js.Any])
    if (createParagraphBullets != null) __obj.updateDynamic("createParagraphBullets")(createParagraphBullets.asInstanceOf[js.Any])
    if (createShape != null) __obj.updateDynamic("createShape")(createShape.asInstanceOf[js.Any])
    if (createSheetsChart != null) __obj.updateDynamic("createSheetsChart")(createSheetsChart.asInstanceOf[js.Any])
    if (createSlide != null) __obj.updateDynamic("createSlide")(createSlide.asInstanceOf[js.Any])
    if (createTable != null) __obj.updateDynamic("createTable")(createTable.asInstanceOf[js.Any])
    if (createVideo != null) __obj.updateDynamic("createVideo")(createVideo.asInstanceOf[js.Any])
    if (deleteObject != null) __obj.updateDynamic("deleteObject")(deleteObject.asInstanceOf[js.Any])
    if (deleteParagraphBullets != null) __obj.updateDynamic("deleteParagraphBullets")(deleteParagraphBullets.asInstanceOf[js.Any])
    if (deleteTableColumn != null) __obj.updateDynamic("deleteTableColumn")(deleteTableColumn.asInstanceOf[js.Any])
    if (deleteTableRow != null) __obj.updateDynamic("deleteTableRow")(deleteTableRow.asInstanceOf[js.Any])
    if (deleteText != null) __obj.updateDynamic("deleteText")(deleteText.asInstanceOf[js.Any])
    if (duplicateObject != null) __obj.updateDynamic("duplicateObject")(duplicateObject.asInstanceOf[js.Any])
    if (groupObjects != null) __obj.updateDynamic("groupObjects")(groupObjects.asInstanceOf[js.Any])
    if (insertTableColumns != null) __obj.updateDynamic("insertTableColumns")(insertTableColumns.asInstanceOf[js.Any])
    if (insertTableRows != null) __obj.updateDynamic("insertTableRows")(insertTableRows.asInstanceOf[js.Any])
    if (insertText != null) __obj.updateDynamic("insertText")(insertText.asInstanceOf[js.Any])
    if (mergeTableCells != null) __obj.updateDynamic("mergeTableCells")(mergeTableCells.asInstanceOf[js.Any])
    if (refreshSheetsChart != null) __obj.updateDynamic("refreshSheetsChart")(refreshSheetsChart.asInstanceOf[js.Any])
    if (replaceAllShapesWithImage != null) __obj.updateDynamic("replaceAllShapesWithImage")(replaceAllShapesWithImage.asInstanceOf[js.Any])
    if (replaceAllShapesWithSheetsChart != null) __obj.updateDynamic("replaceAllShapesWithSheetsChart")(replaceAllShapesWithSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    if (replaceImage != null) __obj.updateDynamic("replaceImage")(replaceImage.asInstanceOf[js.Any])
    if (rerouteLine != null) __obj.updateDynamic("rerouteLine")(rerouteLine.asInstanceOf[js.Any])
    if (ungroupObjects != null) __obj.updateDynamic("ungroupObjects")(ungroupObjects.asInstanceOf[js.Any])
    if (unmergeTableCells != null) __obj.updateDynamic("unmergeTableCells")(unmergeTableCells.asInstanceOf[js.Any])
    if (updateImageProperties != null) __obj.updateDynamic("updateImageProperties")(updateImageProperties.asInstanceOf[js.Any])
    if (updateLineCategory != null) __obj.updateDynamic("updateLineCategory")(updateLineCategory.asInstanceOf[js.Any])
    if (updateLineProperties != null) __obj.updateDynamic("updateLineProperties")(updateLineProperties.asInstanceOf[js.Any])
    if (updatePageElementAltText != null) __obj.updateDynamic("updatePageElementAltText")(updatePageElementAltText.asInstanceOf[js.Any])
    if (updatePageElementTransform != null) __obj.updateDynamic("updatePageElementTransform")(updatePageElementTransform.asInstanceOf[js.Any])
    if (updatePageElementsZOrder != null) __obj.updateDynamic("updatePageElementsZOrder")(updatePageElementsZOrder.asInstanceOf[js.Any])
    if (updatePageProperties != null) __obj.updateDynamic("updatePageProperties")(updatePageProperties.asInstanceOf[js.Any])
    if (updateParagraphStyle != null) __obj.updateDynamic("updateParagraphStyle")(updateParagraphStyle.asInstanceOf[js.Any])
    if (updateShapeProperties != null) __obj.updateDynamic("updateShapeProperties")(updateShapeProperties.asInstanceOf[js.Any])
    if (updateSlidesPosition != null) __obj.updateDynamic("updateSlidesPosition")(updateSlidesPosition.asInstanceOf[js.Any])
    if (updateTableBorderProperties != null) __obj.updateDynamic("updateTableBorderProperties")(updateTableBorderProperties.asInstanceOf[js.Any])
    if (updateTableCellProperties != null) __obj.updateDynamic("updateTableCellProperties")(updateTableCellProperties.asInstanceOf[js.Any])
    if (updateTableColumnProperties != null) __obj.updateDynamic("updateTableColumnProperties")(updateTableColumnProperties.asInstanceOf[js.Any])
    if (updateTableRowProperties != null) __obj.updateDynamic("updateTableRowProperties")(updateTableRowProperties.asInstanceOf[js.Any])
    if (updateTextStyle != null) __obj.updateDynamic("updateTextStyle")(updateTextStyle.asInstanceOf[js.Any])
    if (updateVideoProperties != null) __obj.updateDynamic("updateVideoProperties")(updateVideoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRequest]
  }
}

