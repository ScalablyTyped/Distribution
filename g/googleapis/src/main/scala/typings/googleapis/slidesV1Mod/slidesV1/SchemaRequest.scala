package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequest extends StObject {
  
  /**
    * Creates an image.
    */
  var createImage: js.UndefOr[SchemaCreateImageRequest] = js.undefined
  
  /**
    * Creates a line.
    */
  var createLine: js.UndefOr[SchemaCreateLineRequest] = js.undefined
  
  /**
    * Creates bullets for paragraphs.
    */
  var createParagraphBullets: js.UndefOr[SchemaCreateParagraphBulletsRequest] = js.undefined
  
  /**
    * Creates a new shape.
    */
  var createShape: js.UndefOr[SchemaCreateShapeRequest] = js.undefined
  
  /**
    * Creates an embedded Google Sheets chart.
    */
  var createSheetsChart: js.UndefOr[SchemaCreateSheetsChartRequest] = js.undefined
  
  /**
    * Creates a new slide.
    */
  var createSlide: js.UndefOr[SchemaCreateSlideRequest] = js.undefined
  
  /**
    * Creates a new table.
    */
  var createTable: js.UndefOr[SchemaCreateTableRequest] = js.undefined
  
  /**
    * Creates a video.
    */
  var createVideo: js.UndefOr[SchemaCreateVideoRequest] = js.undefined
  
  /**
    * Deletes a page or page element from the presentation.
    */
  var deleteObject: js.UndefOr[SchemaDeleteObjectRequest] = js.undefined
  
  /**
    * Deletes bullets from paragraphs.
    */
  var deleteParagraphBullets: js.UndefOr[SchemaDeleteParagraphBulletsRequest] = js.undefined
  
  /**
    * Deletes a column from a table.
    */
  var deleteTableColumn: js.UndefOr[SchemaDeleteTableColumnRequest] = js.undefined
  
  /**
    * Deletes a row from a table.
    */
  var deleteTableRow: js.UndefOr[SchemaDeleteTableRowRequest] = js.undefined
  
  /**
    * Deletes text from a shape or a table cell.
    */
  var deleteText: js.UndefOr[SchemaDeleteTextRequest] = js.undefined
  
  /**
    * Duplicates a slide or page element.
    */
  var duplicateObject: js.UndefOr[SchemaDuplicateObjectRequest] = js.undefined
  
  /**
    * Groups objects, such as page elements.
    */
  var groupObjects: js.UndefOr[SchemaGroupObjectsRequest] = js.undefined
  
  /**
    * Inserts columns into a table.
    */
  var insertTableColumns: js.UndefOr[SchemaInsertTableColumnsRequest] = js.undefined
  
  /**
    * Inserts rows into a table.
    */
  var insertTableRows: js.UndefOr[SchemaInsertTableRowsRequest] = js.undefined
  
  /**
    * Inserts text into a shape or table cell.
    */
  var insertText: js.UndefOr[SchemaInsertTextRequest] = js.undefined
  
  /**
    * Merges cells in a Table.
    */
  var mergeTableCells: js.UndefOr[SchemaMergeTableCellsRequest] = js.undefined
  
  /**
    * Refreshes a Google Sheets chart.
    */
  var refreshSheetsChart: js.UndefOr[SchemaRefreshSheetsChartRequest] = js.undefined
  
  /**
    * Replaces all shapes matching some criteria with an image.
    */
  var replaceAllShapesWithImage: js.UndefOr[SchemaReplaceAllShapesWithImageRequest] = js.undefined
  
  /**
    * Replaces all shapes matching some criteria with a Google Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[SchemaReplaceAllShapesWithSheetsChartRequest] = js.undefined
  
  /**
    * Replaces all instances of specified text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextRequest] = js.undefined
  
  /**
    * Replaces an existing image with a new image.
    */
  var replaceImage: js.UndefOr[SchemaReplaceImageRequest] = js.undefined
  
  /**
    * Reroutes a line such that it's connected at the two closest connection sites on the connected page elements.
    */
  var rerouteLine: js.UndefOr[SchemaRerouteLineRequest] = js.undefined
  
  /**
    * Ungroups objects, such as groups.
    */
  var ungroupObjects: js.UndefOr[SchemaUngroupObjectsRequest] = js.undefined
  
  /**
    * Unmerges cells in a Table.
    */
  var unmergeTableCells: js.UndefOr[SchemaUnmergeTableCellsRequest] = js.undefined
  
  /**
    * Updates the properties of an Image.
    */
  var updateImageProperties: js.UndefOr[SchemaUpdateImagePropertiesRequest] = js.undefined
  
  /**
    * Updates the category of a line.
    */
  var updateLineCategory: js.UndefOr[SchemaUpdateLineCategoryRequest] = js.undefined
  
  /**
    * Updates the properties of a Line.
    */
  var updateLineProperties: js.UndefOr[SchemaUpdateLinePropertiesRequest] = js.undefined
  
  /**
    * Updates the alt text title and/or description of a page element.
    */
  var updatePageElementAltText: js.UndefOr[SchemaUpdatePageElementAltTextRequest] = js.undefined
  
  /**
    * Updates the transform of a page element.
    */
  var updatePageElementTransform: js.UndefOr[SchemaUpdatePageElementTransformRequest] = js.undefined
  
  /**
    * Updates the Z-order of page elements.
    */
  var updatePageElementsZOrder: js.UndefOr[SchemaUpdatePageElementsZOrderRequest] = js.undefined
  
  /**
    * Updates the properties of a Page.
    */
  var updatePageProperties: js.UndefOr[SchemaUpdatePagePropertiesRequest] = js.undefined
  
  /**
    * Updates the styling of paragraphs within a Shape or Table.
    */
  var updateParagraphStyle: js.UndefOr[SchemaUpdateParagraphStyleRequest] = js.undefined
  
  /**
    * Updates the properties of a Shape.
    */
  var updateShapeProperties: js.UndefOr[SchemaUpdateShapePropertiesRequest] = js.undefined
  
  /**
    * Updates the properties of a Slide
    */
  var updateSlideProperties: js.UndefOr[SchemaUpdateSlidePropertiesRequest] = js.undefined
  
  /**
    * Updates the position of a set of slides in the presentation.
    */
  var updateSlidesPosition: js.UndefOr[SchemaUpdateSlidesPositionRequest] = js.undefined
  
  /**
    * Updates the properties of the table borders in a Table.
    */
  var updateTableBorderProperties: js.UndefOr[SchemaUpdateTableBorderPropertiesRequest] = js.undefined
  
  /**
    * Updates the properties of a TableCell.
    */
  var updateTableCellProperties: js.UndefOr[SchemaUpdateTableCellPropertiesRequest] = js.undefined
  
  /**
    * Updates the properties of a Table column.
    */
  var updateTableColumnProperties: js.UndefOr[SchemaUpdateTableColumnPropertiesRequest] = js.undefined
  
  /**
    * Updates the properties of a Table row.
    */
  var updateTableRowProperties: js.UndefOr[SchemaUpdateTableRowPropertiesRequest] = js.undefined
  
  /**
    * Updates the styling of text within a Shape or Table.
    */
  var updateTextStyle: js.UndefOr[SchemaUpdateTextStyleRequest] = js.undefined
  
  /**
    * Updates the properties of a Video.
    */
  var updateVideoProperties: js.UndefOr[SchemaUpdateVideoPropertiesRequest] = js.undefined
}
object SchemaRequest {
  
  inline def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  extension [Self <: SchemaRequest](x: Self) {
    
    inline def setCreateImage(value: SchemaCreateImageRequest): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
    
    inline def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
    
    inline def setCreateLine(value: SchemaCreateLineRequest): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
    
    inline def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
    
    inline def setCreateParagraphBullets(value: SchemaCreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
    
    inline def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
    
    inline def setCreateShape(value: SchemaCreateShapeRequest): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
    
    inline def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
    
    inline def setCreateSheetsChart(value: SchemaCreateSheetsChartRequest): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
    
    inline def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
    
    inline def setCreateSlide(value: SchemaCreateSlideRequest): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
    
    inline def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
    
    inline def setCreateTable(value: SchemaCreateTableRequest): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
    
    inline def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
    
    inline def setCreateVideo(value: SchemaCreateVideoRequest): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
    
    inline def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
    
    inline def setDeleteObject(value: SchemaDeleteObjectRequest): Self = StObject.set(x, "deleteObject", value.asInstanceOf[js.Any])
    
    inline def setDeleteObjectUndefined: Self = StObject.set(x, "deleteObject", js.undefined)
    
    inline def setDeleteParagraphBullets(value: SchemaDeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    inline def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
    
    inline def setDeleteTableColumn(value: SchemaDeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
    
    inline def setDeleteTableRow(value: SchemaDeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
    
    inline def setDeleteText(value: SchemaDeleteTextRequest): Self = StObject.set(x, "deleteText", value.asInstanceOf[js.Any])
    
    inline def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
    
    inline def setDuplicateObject(value: SchemaDuplicateObjectRequest): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
    
    inline def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
    
    inline def setGroupObjects(value: SchemaGroupObjectsRequest): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
    
    inline def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
    
    inline def setInsertTableColumns(value: SchemaInsertTableColumnsRequest): Self = StObject.set(x, "insertTableColumns", value.asInstanceOf[js.Any])
    
    inline def setInsertTableColumnsUndefined: Self = StObject.set(x, "insertTableColumns", js.undefined)
    
    inline def setInsertTableRows(value: SchemaInsertTableRowsRequest): Self = StObject.set(x, "insertTableRows", value.asInstanceOf[js.Any])
    
    inline def setInsertTableRowsUndefined: Self = StObject.set(x, "insertTableRows", js.undefined)
    
    inline def setInsertText(value: SchemaInsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    inline def setMergeTableCells(value: SchemaMergeTableCellsRequest): Self = StObject.set(x, "mergeTableCells", value.asInstanceOf[js.Any])
    
    inline def setMergeTableCellsUndefined: Self = StObject.set(x, "mergeTableCells", js.undefined)
    
    inline def setRefreshSheetsChart(value: SchemaRefreshSheetsChartRequest): Self = StObject.set(x, "refreshSheetsChart", value.asInstanceOf[js.Any])
    
    inline def setRefreshSheetsChartUndefined: Self = StObject.set(x, "refreshSheetsChart", js.undefined)
    
    inline def setReplaceAllShapesWithImage(value: SchemaReplaceAllShapesWithImageRequest): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
    
    inline def setReplaceAllShapesWithSheetsChart(value: SchemaReplaceAllShapesWithSheetsChartRequest): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
    
    inline def setReplaceAllText(value: SchemaReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
    
    inline def setReplaceImage(value: SchemaReplaceImageRequest): Self = StObject.set(x, "replaceImage", value.asInstanceOf[js.Any])
    
    inline def setReplaceImageUndefined: Self = StObject.set(x, "replaceImage", js.undefined)
    
    inline def setRerouteLine(value: SchemaRerouteLineRequest): Self = StObject.set(x, "rerouteLine", value.asInstanceOf[js.Any])
    
    inline def setRerouteLineUndefined: Self = StObject.set(x, "rerouteLine", js.undefined)
    
    inline def setUngroupObjects(value: SchemaUngroupObjectsRequest): Self = StObject.set(x, "ungroupObjects", value.asInstanceOf[js.Any])
    
    inline def setUngroupObjectsUndefined: Self = StObject.set(x, "ungroupObjects", js.undefined)
    
    inline def setUnmergeTableCells(value: SchemaUnmergeTableCellsRequest): Self = StObject.set(x, "unmergeTableCells", value.asInstanceOf[js.Any])
    
    inline def setUnmergeTableCellsUndefined: Self = StObject.set(x, "unmergeTableCells", js.undefined)
    
    inline def setUpdateImageProperties(value: SchemaUpdateImagePropertiesRequest): Self = StObject.set(x, "updateImageProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateImagePropertiesUndefined: Self = StObject.set(x, "updateImageProperties", js.undefined)
    
    inline def setUpdateLineCategory(value: SchemaUpdateLineCategoryRequest): Self = StObject.set(x, "updateLineCategory", value.asInstanceOf[js.Any])
    
    inline def setUpdateLineCategoryUndefined: Self = StObject.set(x, "updateLineCategory", js.undefined)
    
    inline def setUpdateLineProperties(value: SchemaUpdateLinePropertiesRequest): Self = StObject.set(x, "updateLineProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateLinePropertiesUndefined: Self = StObject.set(x, "updateLineProperties", js.undefined)
    
    inline def setUpdatePageElementAltText(value: SchemaUpdatePageElementAltTextRequest): Self = StObject.set(x, "updatePageElementAltText", value.asInstanceOf[js.Any])
    
    inline def setUpdatePageElementAltTextUndefined: Self = StObject.set(x, "updatePageElementAltText", js.undefined)
    
    inline def setUpdatePageElementTransform(value: SchemaUpdatePageElementTransformRequest): Self = StObject.set(x, "updatePageElementTransform", value.asInstanceOf[js.Any])
    
    inline def setUpdatePageElementTransformUndefined: Self = StObject.set(x, "updatePageElementTransform", js.undefined)
    
    inline def setUpdatePageElementsZOrder(value: SchemaUpdatePageElementsZOrderRequest): Self = StObject.set(x, "updatePageElementsZOrder", value.asInstanceOf[js.Any])
    
    inline def setUpdatePageElementsZOrderUndefined: Self = StObject.set(x, "updatePageElementsZOrder", js.undefined)
    
    inline def setUpdatePageProperties(value: SchemaUpdatePagePropertiesRequest): Self = StObject.set(x, "updatePageProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdatePagePropertiesUndefined: Self = StObject.set(x, "updatePageProperties", js.undefined)
    
    inline def setUpdateParagraphStyle(value: SchemaUpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
    
    inline def setUpdateShapeProperties(value: SchemaUpdateShapePropertiesRequest): Self = StObject.set(x, "updateShapeProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateShapePropertiesUndefined: Self = StObject.set(x, "updateShapeProperties", js.undefined)
    
    inline def setUpdateSlideProperties(value: SchemaUpdateSlidePropertiesRequest): Self = StObject.set(x, "updateSlideProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateSlidePropertiesUndefined: Self = StObject.set(x, "updateSlideProperties", js.undefined)
    
    inline def setUpdateSlidesPosition(value: SchemaUpdateSlidesPositionRequest): Self = StObject.set(x, "updateSlidesPosition", value.asInstanceOf[js.Any])
    
    inline def setUpdateSlidesPositionUndefined: Self = StObject.set(x, "updateSlidesPosition", js.undefined)
    
    inline def setUpdateTableBorderProperties(value: SchemaUpdateTableBorderPropertiesRequest): Self = StObject.set(x, "updateTableBorderProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableBorderPropertiesUndefined: Self = StObject.set(x, "updateTableBorderProperties", js.undefined)
    
    inline def setUpdateTableCellProperties(value: SchemaUpdateTableCellPropertiesRequest): Self = StObject.set(x, "updateTableCellProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableCellPropertiesUndefined: Self = StObject.set(x, "updateTableCellProperties", js.undefined)
    
    inline def setUpdateTableColumnProperties(value: SchemaUpdateTableColumnPropertiesRequest): Self = StObject.set(x, "updateTableColumnProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableColumnPropertiesUndefined: Self = StObject.set(x, "updateTableColumnProperties", js.undefined)
    
    inline def setUpdateTableRowProperties(value: SchemaUpdateTableRowPropertiesRequest): Self = StObject.set(x, "updateTableRowProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableRowPropertiesUndefined: Self = StObject.set(x, "updateTableRowProperties", js.undefined)
    
    inline def setUpdateTextStyle(value: SchemaUpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
    
    inline def setUpdateVideoProperties(value: SchemaUpdateVideoPropertiesRequest): Self = StObject.set(x, "updateVideoProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateVideoPropertiesUndefined: Self = StObject.set(x, "updateVideoProperties", js.undefined)
  }
}
