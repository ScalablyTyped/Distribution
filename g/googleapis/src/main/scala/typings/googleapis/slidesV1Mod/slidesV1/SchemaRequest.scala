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
  def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  @scala.inline
  implicit class SchemaRequestOps[Self <: SchemaRequest] (val x: Self) extends AnyVal {
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
    def setCreateImage(value: SchemaCreateImageRequest): Self = this.set("createImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateImage: Self = this.set("createImage", js.undefined)
    @scala.inline
    def setCreateLine(value: SchemaCreateLineRequest): Self = this.set("createLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateLine: Self = this.set("createLine", js.undefined)
    @scala.inline
    def setCreateParagraphBullets(value: SchemaCreateParagraphBulletsRequest): Self = this.set("createParagraphBullets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateParagraphBullets: Self = this.set("createParagraphBullets", js.undefined)
    @scala.inline
    def setCreateShape(value: SchemaCreateShapeRequest): Self = this.set("createShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateShape: Self = this.set("createShape", js.undefined)
    @scala.inline
    def setCreateSheetsChart(value: SchemaCreateSheetsChartRequest): Self = this.set("createSheetsChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateSheetsChart: Self = this.set("createSheetsChart", js.undefined)
    @scala.inline
    def setCreateSlide(value: SchemaCreateSlideRequest): Self = this.set("createSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateSlide: Self = this.set("createSlide", js.undefined)
    @scala.inline
    def setCreateTable(value: SchemaCreateTableRequest): Self = this.set("createTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTable: Self = this.set("createTable", js.undefined)
    @scala.inline
    def setCreateVideo(value: SchemaCreateVideoRequest): Self = this.set("createVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateVideo: Self = this.set("createVideo", js.undefined)
    @scala.inline
    def setDeleteObject(value: SchemaDeleteObjectRequest): Self = this.set("deleteObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteObject: Self = this.set("deleteObject", js.undefined)
    @scala.inline
    def setDeleteParagraphBullets(value: SchemaDeleteParagraphBulletsRequest): Self = this.set("deleteParagraphBullets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteParagraphBullets: Self = this.set("deleteParagraphBullets", js.undefined)
    @scala.inline
    def setDeleteTableColumn(value: SchemaDeleteTableColumnRequest): Self = this.set("deleteTableColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteTableColumn: Self = this.set("deleteTableColumn", js.undefined)
    @scala.inline
    def setDeleteTableRow(value: SchemaDeleteTableRowRequest): Self = this.set("deleteTableRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteTableRow: Self = this.set("deleteTableRow", js.undefined)
    @scala.inline
    def setDeleteText(value: SchemaDeleteTextRequest): Self = this.set("deleteText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteText: Self = this.set("deleteText", js.undefined)
    @scala.inline
    def setDuplicateObject(value: SchemaDuplicateObjectRequest): Self = this.set("duplicateObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateObject: Self = this.set("duplicateObject", js.undefined)
    @scala.inline
    def setGroupObjects(value: SchemaGroupObjectsRequest): Self = this.set("groupObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupObjects: Self = this.set("groupObjects", js.undefined)
    @scala.inline
    def setInsertTableColumns(value: SchemaInsertTableColumnsRequest): Self = this.set("insertTableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTableColumns: Self = this.set("insertTableColumns", js.undefined)
    @scala.inline
    def setInsertTableRows(value: SchemaInsertTableRowsRequest): Self = this.set("insertTableRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTableRows: Self = this.set("insertTableRows", js.undefined)
    @scala.inline
    def setInsertText(value: SchemaInsertTextRequest): Self = this.set("insertText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    @scala.inline
    def setMergeTableCells(value: SchemaMergeTableCellsRequest): Self = this.set("mergeTableCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeTableCells: Self = this.set("mergeTableCells", js.undefined)
    @scala.inline
    def setRefreshSheetsChart(value: SchemaRefreshSheetsChartRequest): Self = this.set("refreshSheetsChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshSheetsChart: Self = this.set("refreshSheetsChart", js.undefined)
    @scala.inline
    def setReplaceAllShapesWithImage(value: SchemaReplaceAllShapesWithImageRequest): Self = this.set("replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceAllShapesWithImage: Self = this.set("replaceAllShapesWithImage", js.undefined)
    @scala.inline
    def setReplaceAllShapesWithSheetsChart(value: SchemaReplaceAllShapesWithSheetsChartRequest): Self = this.set("replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceAllShapesWithSheetsChart: Self = this.set("replaceAllShapesWithSheetsChart", js.undefined)
    @scala.inline
    def setReplaceAllText(value: SchemaReplaceAllTextRequest): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
    @scala.inline
    def setReplaceImage(value: SchemaReplaceImageRequest): Self = this.set("replaceImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceImage: Self = this.set("replaceImage", js.undefined)
    @scala.inline
    def setRerouteLine(value: SchemaRerouteLineRequest): Self = this.set("rerouteLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRerouteLine: Self = this.set("rerouteLine", js.undefined)
    @scala.inline
    def setUngroupObjects(value: SchemaUngroupObjectsRequest): Self = this.set("ungroupObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUngroupObjects: Self = this.set("ungroupObjects", js.undefined)
    @scala.inline
    def setUnmergeTableCells(value: SchemaUnmergeTableCellsRequest): Self = this.set("unmergeTableCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmergeTableCells: Self = this.set("unmergeTableCells", js.undefined)
    @scala.inline
    def setUpdateImageProperties(value: SchemaUpdateImagePropertiesRequest): Self = this.set("updateImageProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateImageProperties: Self = this.set("updateImageProperties", js.undefined)
    @scala.inline
    def setUpdateLineCategory(value: SchemaUpdateLineCategoryRequest): Self = this.set("updateLineCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateLineCategory: Self = this.set("updateLineCategory", js.undefined)
    @scala.inline
    def setUpdateLineProperties(value: SchemaUpdateLinePropertiesRequest): Self = this.set("updateLineProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateLineProperties: Self = this.set("updateLineProperties", js.undefined)
    @scala.inline
    def setUpdatePageElementAltText(value: SchemaUpdatePageElementAltTextRequest): Self = this.set("updatePageElementAltText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatePageElementAltText: Self = this.set("updatePageElementAltText", js.undefined)
    @scala.inline
    def setUpdatePageElementTransform(value: SchemaUpdatePageElementTransformRequest): Self = this.set("updatePageElementTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatePageElementTransform: Self = this.set("updatePageElementTransform", js.undefined)
    @scala.inline
    def setUpdatePageElementsZOrder(value: SchemaUpdatePageElementsZOrderRequest): Self = this.set("updatePageElementsZOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatePageElementsZOrder: Self = this.set("updatePageElementsZOrder", js.undefined)
    @scala.inline
    def setUpdatePageProperties(value: SchemaUpdatePagePropertiesRequest): Self = this.set("updatePageProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatePageProperties: Self = this.set("updatePageProperties", js.undefined)
    @scala.inline
    def setUpdateParagraphStyle(value: SchemaUpdateParagraphStyleRequest): Self = this.set("updateParagraphStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateParagraphStyle: Self = this.set("updateParagraphStyle", js.undefined)
    @scala.inline
    def setUpdateShapeProperties(value: SchemaUpdateShapePropertiesRequest): Self = this.set("updateShapeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateShapeProperties: Self = this.set("updateShapeProperties", js.undefined)
    @scala.inline
    def setUpdateSlidesPosition(value: SchemaUpdateSlidesPositionRequest): Self = this.set("updateSlidesPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSlidesPosition: Self = this.set("updateSlidesPosition", js.undefined)
    @scala.inline
    def setUpdateTableBorderProperties(value: SchemaUpdateTableBorderPropertiesRequest): Self = this.set("updateTableBorderProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTableBorderProperties: Self = this.set("updateTableBorderProperties", js.undefined)
    @scala.inline
    def setUpdateTableCellProperties(value: SchemaUpdateTableCellPropertiesRequest): Self = this.set("updateTableCellProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTableCellProperties: Self = this.set("updateTableCellProperties", js.undefined)
    @scala.inline
    def setUpdateTableColumnProperties(value: SchemaUpdateTableColumnPropertiesRequest): Self = this.set("updateTableColumnProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTableColumnProperties: Self = this.set("updateTableColumnProperties", js.undefined)
    @scala.inline
    def setUpdateTableRowProperties(value: SchemaUpdateTableRowPropertiesRequest): Self = this.set("updateTableRowProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTableRowProperties: Self = this.set("updateTableRowProperties", js.undefined)
    @scala.inline
    def setUpdateTextStyle(value: SchemaUpdateTextStyleRequest): Self = this.set("updateTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTextStyle: Self = this.set("updateTextStyle", js.undefined)
    @scala.inline
    def setUpdateVideoProperties(value: SchemaUpdateVideoPropertiesRequest): Self = this.set("updateVideoProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateVideoProperties: Self = this.set("updateVideoProperties", js.undefined)
  }
  
}

