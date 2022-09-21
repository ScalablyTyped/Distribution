package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequest extends StObject {
  
  /**
    * Adds a new banded range
    */
  var addBanding: js.UndefOr[SchemaAddBandingRequest] = js.undefined
  
  /**
    * Adds a chart.
    */
  var addChart: js.UndefOr[SchemaAddChartRequest] = js.undefined
  
  /**
    * Adds a new conditional format rule.
    */
  var addConditionalFormatRule: js.UndefOr[SchemaAddConditionalFormatRuleRequest] = js.undefined
  
  /**
    * Adds a data source.
    */
  var addDataSource: js.UndefOr[SchemaAddDataSourceRequest] = js.undefined
  
  /**
    * Creates a group over the specified range.
    */
  var addDimensionGroup: js.UndefOr[SchemaAddDimensionGroupRequest] = js.undefined
  
  /**
    * Adds a filter view.
    */
  var addFilterView: js.UndefOr[SchemaAddFilterViewRequest] = js.undefined
  
  /**
    * Adds a named range.
    */
  var addNamedRange: js.UndefOr[SchemaAddNamedRangeRequest] = js.undefined
  
  /**
    * Adds a protected range.
    */
  var addProtectedRange: js.UndefOr[SchemaAddProtectedRangeRequest] = js.undefined
  
  /**
    * Adds a sheet.
    */
  var addSheet: js.UndefOr[SchemaAddSheetRequest] = js.undefined
  
  /**
    * Adds a slicer.
    */
  var addSlicer: js.UndefOr[SchemaAddSlicerRequest] = js.undefined
  
  /**
    * Appends cells after the last row with data in a sheet.
    */
  var appendCells: js.UndefOr[SchemaAppendCellsRequest] = js.undefined
  
  /**
    * Appends dimensions to the end of a sheet.
    */
  var appendDimension: js.UndefOr[SchemaAppendDimensionRequest] = js.undefined
  
  /**
    * Automatically fills in more data based on existing data.
    */
  var autoFill: js.UndefOr[SchemaAutoFillRequest] = js.undefined
  
  /**
    * Automatically resizes one or more dimensions based on the contents of the cells in that dimension.
    */
  var autoResizeDimensions: js.UndefOr[SchemaAutoResizeDimensionsRequest] = js.undefined
  
  /**
    * Clears the basic filter on a sheet.
    */
  var clearBasicFilter: js.UndefOr[SchemaClearBasicFilterRequest] = js.undefined
  
  /**
    * Copies data from one area and pastes it to another.
    */
  var copyPaste: js.UndefOr[SchemaCopyPasteRequest] = js.undefined
  
  /**
    * Creates new developer metadata
    */
  var createDeveloperMetadata: js.UndefOr[SchemaCreateDeveloperMetadataRequest] = js.undefined
  
  /**
    * Cuts data from one area and pastes it to another.
    */
  var cutPaste: js.UndefOr[SchemaCutPasteRequest] = js.undefined
  
  /**
    * Removes a banded range
    */
  var deleteBanding: js.UndefOr[SchemaDeleteBandingRequest] = js.undefined
  
  /**
    * Deletes an existing conditional format rule.
    */
  var deleteConditionalFormatRule: js.UndefOr[SchemaDeleteConditionalFormatRuleRequest] = js.undefined
  
  /**
    * Deletes a data source.
    */
  var deleteDataSource: js.UndefOr[SchemaDeleteDataSourceRequest] = js.undefined
  
  /**
    * Deletes developer metadata
    */
  var deleteDeveloperMetadata: js.UndefOr[SchemaDeleteDeveloperMetadataRequest] = js.undefined
  
  /**
    * Deletes rows or columns in a sheet.
    */
  var deleteDimension: js.UndefOr[SchemaDeleteDimensionRequest] = js.undefined
  
  /**
    * Deletes a group over the specified range.
    */
  var deleteDimensionGroup: js.UndefOr[SchemaDeleteDimensionGroupRequest] = js.undefined
  
  /**
    * Removes rows containing duplicate values in specified columns of a cell range.
    */
  var deleteDuplicates: js.UndefOr[SchemaDeleteDuplicatesRequest] = js.undefined
  
  /**
    * Deletes an embedded object (e.g, chart, image) in a sheet.
    */
  var deleteEmbeddedObject: js.UndefOr[SchemaDeleteEmbeddedObjectRequest] = js.undefined
  
  /**
    * Deletes a filter view from a sheet.
    */
  var deleteFilterView: js.UndefOr[SchemaDeleteFilterViewRequest] = js.undefined
  
  /**
    * Deletes a named range.
    */
  var deleteNamedRange: js.UndefOr[SchemaDeleteNamedRangeRequest] = js.undefined
  
  /**
    * Deletes a protected range.
    */
  var deleteProtectedRange: js.UndefOr[SchemaDeleteProtectedRangeRequest] = js.undefined
  
  /**
    * Deletes a range of cells from a sheet, shifting the remaining cells.
    */
  var deleteRange: js.UndefOr[SchemaDeleteRangeRequest] = js.undefined
  
  /**
    * Deletes a sheet.
    */
  var deleteSheet: js.UndefOr[SchemaDeleteSheetRequest] = js.undefined
  
  /**
    * Duplicates a filter view.
    */
  var duplicateFilterView: js.UndefOr[SchemaDuplicateFilterViewRequest] = js.undefined
  
  /**
    * Duplicates a sheet.
    */
  var duplicateSheet: js.UndefOr[SchemaDuplicateSheetRequest] = js.undefined
  
  /**
    * Finds and replaces occurrences of some text with other text.
    */
  var findReplace: js.UndefOr[SchemaFindReplaceRequest] = js.undefined
  
  /**
    * Inserts new rows or columns in a sheet.
    */
  var insertDimension: js.UndefOr[SchemaInsertDimensionRequest] = js.undefined
  
  /**
    * Inserts new cells in a sheet, shifting the existing cells.
    */
  var insertRange: js.UndefOr[SchemaInsertRangeRequest] = js.undefined
  
  /**
    * Merges cells together.
    */
  var mergeCells: js.UndefOr[SchemaMergeCellsRequest] = js.undefined
  
  /**
    * Moves rows or columns to another location in a sheet.
    */
  var moveDimension: js.UndefOr[SchemaMoveDimensionRequest] = js.undefined
  
  /**
    * Pastes data (HTML or delimited) into a sheet.
    */
  var pasteData: js.UndefOr[SchemaPasteDataRequest] = js.undefined
  
  /**
    * Randomizes the order of the rows in a range.
    */
  var randomizeRange: js.UndefOr[SchemaRandomizeRangeRequest] = js.undefined
  
  /**
    * Refreshs one or multiple data sources and associated dbobjects.
    */
  var refreshDataSource: js.UndefOr[SchemaRefreshDataSourceRequest] = js.undefined
  
  /**
    * Repeats a single cell across a range.
    */
  var repeatCell: js.UndefOr[SchemaRepeatCellRequest] = js.undefined
  
  /**
    * Sets the basic filter on a sheet.
    */
  var setBasicFilter: js.UndefOr[SchemaSetBasicFilterRequest] = js.undefined
  
  /**
    * Sets data validation for one or more cells.
    */
  var setDataValidation: js.UndefOr[SchemaSetDataValidationRequest] = js.undefined
  
  /**
    * Sorts data in a range.
    */
  var sortRange: js.UndefOr[SchemaSortRangeRequest] = js.undefined
  
  /**
    * Converts a column of text into many columns of text.
    */
  var textToColumns: js.UndefOr[SchemaTextToColumnsRequest] = js.undefined
  
  /**
    * Trims cells of whitespace (such as spaces, tabs, or new lines).
    */
  var trimWhitespace: js.UndefOr[SchemaTrimWhitespaceRequest] = js.undefined
  
  /**
    * Unmerges merged cells.
    */
  var unmergeCells: js.UndefOr[SchemaUnmergeCellsRequest] = js.undefined
  
  /**
    * Updates a banded range
    */
  var updateBanding: js.UndefOr[SchemaUpdateBandingRequest] = js.undefined
  
  /**
    * Updates the borders in a range of cells.
    */
  var updateBorders: js.UndefOr[SchemaUpdateBordersRequest] = js.undefined
  
  /**
    * Updates many cells at once.
    */
  var updateCells: js.UndefOr[SchemaUpdateCellsRequest] = js.undefined
  
  /**
    * Updates a chart's specifications.
    */
  var updateChartSpec: js.UndefOr[SchemaUpdateChartSpecRequest] = js.undefined
  
  /**
    * Updates an existing conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[SchemaUpdateConditionalFormatRuleRequest] = js.undefined
  
  /**
    * Updates a data source.
    */
  var updateDataSource: js.UndefOr[SchemaUpdateDataSourceRequest] = js.undefined
  
  /**
    * Updates an existing developer metadata entry
    */
  var updateDeveloperMetadata: js.UndefOr[SchemaUpdateDeveloperMetadataRequest] = js.undefined
  
  /**
    * Updates the state of the specified group.
    */
  var updateDimensionGroup: js.UndefOr[SchemaUpdateDimensionGroupRequest] = js.undefined
  
  /**
    * Updates dimensions' properties.
    */
  var updateDimensionProperties: js.UndefOr[SchemaUpdateDimensionPropertiesRequest] = js.undefined
  
  /**
    * Updates an embedded object's border.
    */
  var updateEmbeddedObjectBorder: js.UndefOr[SchemaUpdateEmbeddedObjectBorderRequest] = js.undefined
  
  /**
    * Updates an embedded object's (e.g. chart, image) position.
    */
  var updateEmbeddedObjectPosition: js.UndefOr[SchemaUpdateEmbeddedObjectPositionRequest] = js.undefined
  
  /**
    * Updates the properties of a filter view.
    */
  var updateFilterView: js.UndefOr[SchemaUpdateFilterViewRequest] = js.undefined
  
  /**
    * Updates a named range.
    */
  var updateNamedRange: js.UndefOr[SchemaUpdateNamedRangeRequest] = js.undefined
  
  /**
    * Updates a protected range.
    */
  var updateProtectedRange: js.UndefOr[SchemaUpdateProtectedRangeRequest] = js.undefined
  
  /**
    * Updates a sheet's properties.
    */
  var updateSheetProperties: js.UndefOr[SchemaUpdateSheetPropertiesRequest] = js.undefined
  
  /**
    * Updates a slicer's specifications.
    */
  var updateSlicerSpec: js.UndefOr[SchemaUpdateSlicerSpecRequest] = js.undefined
  
  /**
    * Updates the spreadsheet's properties.
    */
  var updateSpreadsheetProperties: js.UndefOr[SchemaUpdateSpreadsheetPropertiesRequest] = js.undefined
}
object SchemaRequest {
  
  inline def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  extension [Self <: SchemaRequest](x: Self) {
    
    inline def setAddBanding(value: SchemaAddBandingRequest): Self = StObject.set(x, "addBanding", value.asInstanceOf[js.Any])
    
    inline def setAddBandingUndefined: Self = StObject.set(x, "addBanding", js.undefined)
    
    inline def setAddChart(value: SchemaAddChartRequest): Self = StObject.set(x, "addChart", value.asInstanceOf[js.Any])
    
    inline def setAddChartUndefined: Self = StObject.set(x, "addChart", js.undefined)
    
    inline def setAddConditionalFormatRule(value: SchemaAddConditionalFormatRuleRequest): Self = StObject.set(x, "addConditionalFormatRule", value.asInstanceOf[js.Any])
    
    inline def setAddConditionalFormatRuleUndefined: Self = StObject.set(x, "addConditionalFormatRule", js.undefined)
    
    inline def setAddDataSource(value: SchemaAddDataSourceRequest): Self = StObject.set(x, "addDataSource", value.asInstanceOf[js.Any])
    
    inline def setAddDataSourceUndefined: Self = StObject.set(x, "addDataSource", js.undefined)
    
    inline def setAddDimensionGroup(value: SchemaAddDimensionGroupRequest): Self = StObject.set(x, "addDimensionGroup", value.asInstanceOf[js.Any])
    
    inline def setAddDimensionGroupUndefined: Self = StObject.set(x, "addDimensionGroup", js.undefined)
    
    inline def setAddFilterView(value: SchemaAddFilterViewRequest): Self = StObject.set(x, "addFilterView", value.asInstanceOf[js.Any])
    
    inline def setAddFilterViewUndefined: Self = StObject.set(x, "addFilterView", js.undefined)
    
    inline def setAddNamedRange(value: SchemaAddNamedRangeRequest): Self = StObject.set(x, "addNamedRange", value.asInstanceOf[js.Any])
    
    inline def setAddNamedRangeUndefined: Self = StObject.set(x, "addNamedRange", js.undefined)
    
    inline def setAddProtectedRange(value: SchemaAddProtectedRangeRequest): Self = StObject.set(x, "addProtectedRange", value.asInstanceOf[js.Any])
    
    inline def setAddProtectedRangeUndefined: Self = StObject.set(x, "addProtectedRange", js.undefined)
    
    inline def setAddSheet(value: SchemaAddSheetRequest): Self = StObject.set(x, "addSheet", value.asInstanceOf[js.Any])
    
    inline def setAddSheetUndefined: Self = StObject.set(x, "addSheet", js.undefined)
    
    inline def setAddSlicer(value: SchemaAddSlicerRequest): Self = StObject.set(x, "addSlicer", value.asInstanceOf[js.Any])
    
    inline def setAddSlicerUndefined: Self = StObject.set(x, "addSlicer", js.undefined)
    
    inline def setAppendCells(value: SchemaAppendCellsRequest): Self = StObject.set(x, "appendCells", value.asInstanceOf[js.Any])
    
    inline def setAppendCellsUndefined: Self = StObject.set(x, "appendCells", js.undefined)
    
    inline def setAppendDimension(value: SchemaAppendDimensionRequest): Self = StObject.set(x, "appendDimension", value.asInstanceOf[js.Any])
    
    inline def setAppendDimensionUndefined: Self = StObject.set(x, "appendDimension", js.undefined)
    
    inline def setAutoFill(value: SchemaAutoFillRequest): Self = StObject.set(x, "autoFill", value.asInstanceOf[js.Any])
    
    inline def setAutoFillUndefined: Self = StObject.set(x, "autoFill", js.undefined)
    
    inline def setAutoResizeDimensions(value: SchemaAutoResizeDimensionsRequest): Self = StObject.set(x, "autoResizeDimensions", value.asInstanceOf[js.Any])
    
    inline def setAutoResizeDimensionsUndefined: Self = StObject.set(x, "autoResizeDimensions", js.undefined)
    
    inline def setClearBasicFilter(value: SchemaClearBasicFilterRequest): Self = StObject.set(x, "clearBasicFilter", value.asInstanceOf[js.Any])
    
    inline def setClearBasicFilterUndefined: Self = StObject.set(x, "clearBasicFilter", js.undefined)
    
    inline def setCopyPaste(value: SchemaCopyPasteRequest): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
    
    inline def setCopyPasteUndefined: Self = StObject.set(x, "copyPaste", js.undefined)
    
    inline def setCreateDeveloperMetadata(value: SchemaCreateDeveloperMetadataRequest): Self = StObject.set(x, "createDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setCreateDeveloperMetadataUndefined: Self = StObject.set(x, "createDeveloperMetadata", js.undefined)
    
    inline def setCutPaste(value: SchemaCutPasteRequest): Self = StObject.set(x, "cutPaste", value.asInstanceOf[js.Any])
    
    inline def setCutPasteUndefined: Self = StObject.set(x, "cutPaste", js.undefined)
    
    inline def setDeleteBanding(value: SchemaDeleteBandingRequest): Self = StObject.set(x, "deleteBanding", value.asInstanceOf[js.Any])
    
    inline def setDeleteBandingUndefined: Self = StObject.set(x, "deleteBanding", js.undefined)
    
    inline def setDeleteConditionalFormatRule(value: SchemaDeleteConditionalFormatRuleRequest): Self = StObject.set(x, "deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    
    inline def setDeleteConditionalFormatRuleUndefined: Self = StObject.set(x, "deleteConditionalFormatRule", js.undefined)
    
    inline def setDeleteDataSource(value: SchemaDeleteDataSourceRequest): Self = StObject.set(x, "deleteDataSource", value.asInstanceOf[js.Any])
    
    inline def setDeleteDataSourceUndefined: Self = StObject.set(x, "deleteDataSource", js.undefined)
    
    inline def setDeleteDeveloperMetadata(value: SchemaDeleteDeveloperMetadataRequest): Self = StObject.set(x, "deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeleteDeveloperMetadataUndefined: Self = StObject.set(x, "deleteDeveloperMetadata", js.undefined)
    
    inline def setDeleteDimension(value: SchemaDeleteDimensionRequest): Self = StObject.set(x, "deleteDimension", value.asInstanceOf[js.Any])
    
    inline def setDeleteDimensionGroup(value: SchemaDeleteDimensionGroupRequest): Self = StObject.set(x, "deleteDimensionGroup", value.asInstanceOf[js.Any])
    
    inline def setDeleteDimensionGroupUndefined: Self = StObject.set(x, "deleteDimensionGroup", js.undefined)
    
    inline def setDeleteDimensionUndefined: Self = StObject.set(x, "deleteDimension", js.undefined)
    
    inline def setDeleteDuplicates(value: SchemaDeleteDuplicatesRequest): Self = StObject.set(x, "deleteDuplicates", value.asInstanceOf[js.Any])
    
    inline def setDeleteDuplicatesUndefined: Self = StObject.set(x, "deleteDuplicates", js.undefined)
    
    inline def setDeleteEmbeddedObject(value: SchemaDeleteEmbeddedObjectRequest): Self = StObject.set(x, "deleteEmbeddedObject", value.asInstanceOf[js.Any])
    
    inline def setDeleteEmbeddedObjectUndefined: Self = StObject.set(x, "deleteEmbeddedObject", js.undefined)
    
    inline def setDeleteFilterView(value: SchemaDeleteFilterViewRequest): Self = StObject.set(x, "deleteFilterView", value.asInstanceOf[js.Any])
    
    inline def setDeleteFilterViewUndefined: Self = StObject.set(x, "deleteFilterView", js.undefined)
    
    inline def setDeleteNamedRange(value: SchemaDeleteNamedRangeRequest): Self = StObject.set(x, "deleteNamedRange", value.asInstanceOf[js.Any])
    
    inline def setDeleteNamedRangeUndefined: Self = StObject.set(x, "deleteNamedRange", js.undefined)
    
    inline def setDeleteProtectedRange(value: SchemaDeleteProtectedRangeRequest): Self = StObject.set(x, "deleteProtectedRange", value.asInstanceOf[js.Any])
    
    inline def setDeleteProtectedRangeUndefined: Self = StObject.set(x, "deleteProtectedRange", js.undefined)
    
    inline def setDeleteRange(value: SchemaDeleteRangeRequest): Self = StObject.set(x, "deleteRange", value.asInstanceOf[js.Any])
    
    inline def setDeleteRangeUndefined: Self = StObject.set(x, "deleteRange", js.undefined)
    
    inline def setDeleteSheet(value: SchemaDeleteSheetRequest): Self = StObject.set(x, "deleteSheet", value.asInstanceOf[js.Any])
    
    inline def setDeleteSheetUndefined: Self = StObject.set(x, "deleteSheet", js.undefined)
    
    inline def setDuplicateFilterView(value: SchemaDuplicateFilterViewRequest): Self = StObject.set(x, "duplicateFilterView", value.asInstanceOf[js.Any])
    
    inline def setDuplicateFilterViewUndefined: Self = StObject.set(x, "duplicateFilterView", js.undefined)
    
    inline def setDuplicateSheet(value: SchemaDuplicateSheetRequest): Self = StObject.set(x, "duplicateSheet", value.asInstanceOf[js.Any])
    
    inline def setDuplicateSheetUndefined: Self = StObject.set(x, "duplicateSheet", js.undefined)
    
    inline def setFindReplace(value: SchemaFindReplaceRequest): Self = StObject.set(x, "findReplace", value.asInstanceOf[js.Any])
    
    inline def setFindReplaceUndefined: Self = StObject.set(x, "findReplace", js.undefined)
    
    inline def setInsertDimension(value: SchemaInsertDimensionRequest): Self = StObject.set(x, "insertDimension", value.asInstanceOf[js.Any])
    
    inline def setInsertDimensionUndefined: Self = StObject.set(x, "insertDimension", js.undefined)
    
    inline def setInsertRange(value: SchemaInsertRangeRequest): Self = StObject.set(x, "insertRange", value.asInstanceOf[js.Any])
    
    inline def setInsertRangeUndefined: Self = StObject.set(x, "insertRange", js.undefined)
    
    inline def setMergeCells(value: SchemaMergeCellsRequest): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
    
    inline def setMergeCellsUndefined: Self = StObject.set(x, "mergeCells", js.undefined)
    
    inline def setMoveDimension(value: SchemaMoveDimensionRequest): Self = StObject.set(x, "moveDimension", value.asInstanceOf[js.Any])
    
    inline def setMoveDimensionUndefined: Self = StObject.set(x, "moveDimension", js.undefined)
    
    inline def setPasteData(value: SchemaPasteDataRequest): Self = StObject.set(x, "pasteData", value.asInstanceOf[js.Any])
    
    inline def setPasteDataUndefined: Self = StObject.set(x, "pasteData", js.undefined)
    
    inline def setRandomizeRange(value: SchemaRandomizeRangeRequest): Self = StObject.set(x, "randomizeRange", value.asInstanceOf[js.Any])
    
    inline def setRandomizeRangeUndefined: Self = StObject.set(x, "randomizeRange", js.undefined)
    
    inline def setRefreshDataSource(value: SchemaRefreshDataSourceRequest): Self = StObject.set(x, "refreshDataSource", value.asInstanceOf[js.Any])
    
    inline def setRefreshDataSourceUndefined: Self = StObject.set(x, "refreshDataSource", js.undefined)
    
    inline def setRepeatCell(value: SchemaRepeatCellRequest): Self = StObject.set(x, "repeatCell", value.asInstanceOf[js.Any])
    
    inline def setRepeatCellUndefined: Self = StObject.set(x, "repeatCell", js.undefined)
    
    inline def setSetBasicFilter(value: SchemaSetBasicFilterRequest): Self = StObject.set(x, "setBasicFilter", value.asInstanceOf[js.Any])
    
    inline def setSetBasicFilterUndefined: Self = StObject.set(x, "setBasicFilter", js.undefined)
    
    inline def setSetDataValidation(value: SchemaSetDataValidationRequest): Self = StObject.set(x, "setDataValidation", value.asInstanceOf[js.Any])
    
    inline def setSetDataValidationUndefined: Self = StObject.set(x, "setDataValidation", js.undefined)
    
    inline def setSortRange(value: SchemaSortRangeRequest): Self = StObject.set(x, "sortRange", value.asInstanceOf[js.Any])
    
    inline def setSortRangeUndefined: Self = StObject.set(x, "sortRange", js.undefined)
    
    inline def setTextToColumns(value: SchemaTextToColumnsRequest): Self = StObject.set(x, "textToColumns", value.asInstanceOf[js.Any])
    
    inline def setTextToColumnsUndefined: Self = StObject.set(x, "textToColumns", js.undefined)
    
    inline def setTrimWhitespace(value: SchemaTrimWhitespaceRequest): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
    
    inline def setTrimWhitespaceUndefined: Self = StObject.set(x, "trimWhitespace", js.undefined)
    
    inline def setUnmergeCells(value: SchemaUnmergeCellsRequest): Self = StObject.set(x, "unmergeCells", value.asInstanceOf[js.Any])
    
    inline def setUnmergeCellsUndefined: Self = StObject.set(x, "unmergeCells", js.undefined)
    
    inline def setUpdateBanding(value: SchemaUpdateBandingRequest): Self = StObject.set(x, "updateBanding", value.asInstanceOf[js.Any])
    
    inline def setUpdateBandingUndefined: Self = StObject.set(x, "updateBanding", js.undefined)
    
    inline def setUpdateBorders(value: SchemaUpdateBordersRequest): Self = StObject.set(x, "updateBorders", value.asInstanceOf[js.Any])
    
    inline def setUpdateBordersUndefined: Self = StObject.set(x, "updateBorders", js.undefined)
    
    inline def setUpdateCells(value: SchemaUpdateCellsRequest): Self = StObject.set(x, "updateCells", value.asInstanceOf[js.Any])
    
    inline def setUpdateCellsUndefined: Self = StObject.set(x, "updateCells", js.undefined)
    
    inline def setUpdateChartSpec(value: SchemaUpdateChartSpecRequest): Self = StObject.set(x, "updateChartSpec", value.asInstanceOf[js.Any])
    
    inline def setUpdateChartSpecUndefined: Self = StObject.set(x, "updateChartSpec", js.undefined)
    
    inline def setUpdateConditionalFormatRule(value: SchemaUpdateConditionalFormatRuleRequest): Self = StObject.set(x, "updateConditionalFormatRule", value.asInstanceOf[js.Any])
    
    inline def setUpdateConditionalFormatRuleUndefined: Self = StObject.set(x, "updateConditionalFormatRule", js.undefined)
    
    inline def setUpdateDataSource(value: SchemaUpdateDataSourceRequest): Self = StObject.set(x, "updateDataSource", value.asInstanceOf[js.Any])
    
    inline def setUpdateDataSourceUndefined: Self = StObject.set(x, "updateDataSource", js.undefined)
    
    inline def setUpdateDeveloperMetadata(value: SchemaUpdateDeveloperMetadataRequest): Self = StObject.set(x, "updateDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setUpdateDeveloperMetadataUndefined: Self = StObject.set(x, "updateDeveloperMetadata", js.undefined)
    
    inline def setUpdateDimensionGroup(value: SchemaUpdateDimensionGroupRequest): Self = StObject.set(x, "updateDimensionGroup", value.asInstanceOf[js.Any])
    
    inline def setUpdateDimensionGroupUndefined: Self = StObject.set(x, "updateDimensionGroup", js.undefined)
    
    inline def setUpdateDimensionProperties(value: SchemaUpdateDimensionPropertiesRequest): Self = StObject.set(x, "updateDimensionProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateDimensionPropertiesUndefined: Self = StObject.set(x, "updateDimensionProperties", js.undefined)
    
    inline def setUpdateEmbeddedObjectBorder(value: SchemaUpdateEmbeddedObjectBorderRequest): Self = StObject.set(x, "updateEmbeddedObjectBorder", value.asInstanceOf[js.Any])
    
    inline def setUpdateEmbeddedObjectBorderUndefined: Self = StObject.set(x, "updateEmbeddedObjectBorder", js.undefined)
    
    inline def setUpdateEmbeddedObjectPosition(value: SchemaUpdateEmbeddedObjectPositionRequest): Self = StObject.set(x, "updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    
    inline def setUpdateEmbeddedObjectPositionUndefined: Self = StObject.set(x, "updateEmbeddedObjectPosition", js.undefined)
    
    inline def setUpdateFilterView(value: SchemaUpdateFilterViewRequest): Self = StObject.set(x, "updateFilterView", value.asInstanceOf[js.Any])
    
    inline def setUpdateFilterViewUndefined: Self = StObject.set(x, "updateFilterView", js.undefined)
    
    inline def setUpdateNamedRange(value: SchemaUpdateNamedRangeRequest): Self = StObject.set(x, "updateNamedRange", value.asInstanceOf[js.Any])
    
    inline def setUpdateNamedRangeUndefined: Self = StObject.set(x, "updateNamedRange", js.undefined)
    
    inline def setUpdateProtectedRange(value: SchemaUpdateProtectedRangeRequest): Self = StObject.set(x, "updateProtectedRange", value.asInstanceOf[js.Any])
    
    inline def setUpdateProtectedRangeUndefined: Self = StObject.set(x, "updateProtectedRange", js.undefined)
    
    inline def setUpdateSheetProperties(value: SchemaUpdateSheetPropertiesRequest): Self = StObject.set(x, "updateSheetProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateSheetPropertiesUndefined: Self = StObject.set(x, "updateSheetProperties", js.undefined)
    
    inline def setUpdateSlicerSpec(value: SchemaUpdateSlicerSpecRequest): Self = StObject.set(x, "updateSlicerSpec", value.asInstanceOf[js.Any])
    
    inline def setUpdateSlicerSpecUndefined: Self = StObject.set(x, "updateSlicerSpec", js.undefined)
    
    inline def setUpdateSpreadsheetProperties(value: SchemaUpdateSpreadsheetPropertiesRequest): Self = StObject.set(x, "updateSpreadsheetProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateSpreadsheetPropertiesUndefined: Self = StObject.set(x, "updateSpreadsheetProperties", js.undefined)
  }
}
