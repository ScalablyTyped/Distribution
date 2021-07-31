package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single kind of update to apply to a spreadsheet.
  */
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
    * Automatically resizes one or more dimensions based on the contents of the
    * cells in that dimension.
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
    * Updates a chart&#39;s specifications.
    */
  var updateChartSpec: js.UndefOr[SchemaUpdateChartSpecRequest] = js.undefined
  
  /**
    * Updates an existing conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[SchemaUpdateConditionalFormatRuleRequest] = js.undefined
  
  /**
    * Updates an existing developer metadata entry
    */
  var updateDeveloperMetadata: js.UndefOr[SchemaUpdateDeveloperMetadataRequest] = js.undefined
  
  /**
    * Updates the state of the specified group.
    */
  var updateDimensionGroup: js.UndefOr[SchemaUpdateDimensionGroupRequest] = js.undefined
  
  /**
    * Updates dimensions&#39; properties.
    */
  var updateDimensionProperties: js.UndefOr[SchemaUpdateDimensionPropertiesRequest] = js.undefined
  
  /**
    * Updates an embedded object&#39;s (e.g. chart, image) position.
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
    * Updates a sheet&#39;s properties.
    */
  var updateSheetProperties: js.UndefOr[SchemaUpdateSheetPropertiesRequest] = js.undefined
  
  /**
    * Updates the spreadsheet&#39;s properties.
    */
  var updateSpreadsheetProperties: js.UndefOr[SchemaUpdateSpreadsheetPropertiesRequest] = js.undefined
}
object SchemaRequest {
  
  @scala.inline
  def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  @scala.inline
  implicit class SchemaRequestMutableBuilder[Self <: SchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBanding(value: SchemaAddBandingRequest): Self = StObject.set(x, "addBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddBandingUndefined: Self = StObject.set(x, "addBanding", js.undefined)
    
    @scala.inline
    def setAddChart(value: SchemaAddChartRequest): Self = StObject.set(x, "addChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddChartUndefined: Self = StObject.set(x, "addChart", js.undefined)
    
    @scala.inline
    def setAddConditionalFormatRule(value: SchemaAddConditionalFormatRuleRequest): Self = StObject.set(x, "addConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddConditionalFormatRuleUndefined: Self = StObject.set(x, "addConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setAddDimensionGroup(value: SchemaAddDimensionGroupRequest): Self = StObject.set(x, "addDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDimensionGroupUndefined: Self = StObject.set(x, "addDimensionGroup", js.undefined)
    
    @scala.inline
    def setAddFilterView(value: SchemaAddFilterViewRequest): Self = StObject.set(x, "addFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddFilterViewUndefined: Self = StObject.set(x, "addFilterView", js.undefined)
    
    @scala.inline
    def setAddNamedRange(value: SchemaAddNamedRangeRequest): Self = StObject.set(x, "addNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddNamedRangeUndefined: Self = StObject.set(x, "addNamedRange", js.undefined)
    
    @scala.inline
    def setAddProtectedRange(value: SchemaAddProtectedRangeRequest): Self = StObject.set(x, "addProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddProtectedRangeUndefined: Self = StObject.set(x, "addProtectedRange", js.undefined)
    
    @scala.inline
    def setAddSheet(value: SchemaAddSheetRequest): Self = StObject.set(x, "addSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSheetUndefined: Self = StObject.set(x, "addSheet", js.undefined)
    
    @scala.inline
    def setAppendCells(value: SchemaAppendCellsRequest): Self = StObject.set(x, "appendCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendCellsUndefined: Self = StObject.set(x, "appendCells", js.undefined)
    
    @scala.inline
    def setAppendDimension(value: SchemaAppendDimensionRequest): Self = StObject.set(x, "appendDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendDimensionUndefined: Self = StObject.set(x, "appendDimension", js.undefined)
    
    @scala.inline
    def setAutoFill(value: SchemaAutoFillRequest): Self = StObject.set(x, "autoFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFillUndefined: Self = StObject.set(x, "autoFill", js.undefined)
    
    @scala.inline
    def setAutoResizeDimensions(value: SchemaAutoResizeDimensionsRequest): Self = StObject.set(x, "autoResizeDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResizeDimensionsUndefined: Self = StObject.set(x, "autoResizeDimensions", js.undefined)
    
    @scala.inline
    def setClearBasicFilter(value: SchemaClearBasicFilterRequest): Self = StObject.set(x, "clearBasicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearBasicFilterUndefined: Self = StObject.set(x, "clearBasicFilter", js.undefined)
    
    @scala.inline
    def setCopyPaste(value: SchemaCopyPasteRequest): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyPasteUndefined: Self = StObject.set(x, "copyPaste", js.undefined)
    
    @scala.inline
    def setCreateDeveloperMetadata(value: SchemaCreateDeveloperMetadataRequest): Self = StObject.set(x, "createDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDeveloperMetadataUndefined: Self = StObject.set(x, "createDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setCutPaste(value: SchemaCutPasteRequest): Self = StObject.set(x, "cutPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutPasteUndefined: Self = StObject.set(x, "cutPaste", js.undefined)
    
    @scala.inline
    def setDeleteBanding(value: SchemaDeleteBandingRequest): Self = StObject.set(x, "deleteBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteBandingUndefined: Self = StObject.set(x, "deleteBanding", js.undefined)
    
    @scala.inline
    def setDeleteConditionalFormatRule(value: SchemaDeleteConditionalFormatRuleRequest): Self = StObject.set(x, "deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteConditionalFormatRuleUndefined: Self = StObject.set(x, "deleteConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setDeleteDeveloperMetadata(value: SchemaDeleteDeveloperMetadataRequest): Self = StObject.set(x, "deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDeveloperMetadataUndefined: Self = StObject.set(x, "deleteDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteDimension(value: SchemaDeleteDimensionRequest): Self = StObject.set(x, "deleteDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDimensionGroup(value: SchemaDeleteDimensionGroupRequest): Self = StObject.set(x, "deleteDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDimensionGroupUndefined: Self = StObject.set(x, "deleteDimensionGroup", js.undefined)
    
    @scala.inline
    def setDeleteDimensionUndefined: Self = StObject.set(x, "deleteDimension", js.undefined)
    
    @scala.inline
    def setDeleteEmbeddedObject(value: SchemaDeleteEmbeddedObjectRequest): Self = StObject.set(x, "deleteEmbeddedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteEmbeddedObjectUndefined: Self = StObject.set(x, "deleteEmbeddedObject", js.undefined)
    
    @scala.inline
    def setDeleteFilterView(value: SchemaDeleteFilterViewRequest): Self = StObject.set(x, "deleteFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteFilterViewUndefined: Self = StObject.set(x, "deleteFilterView", js.undefined)
    
    @scala.inline
    def setDeleteNamedRange(value: SchemaDeleteNamedRangeRequest): Self = StObject.set(x, "deleteNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteNamedRangeUndefined: Self = StObject.set(x, "deleteNamedRange", js.undefined)
    
    @scala.inline
    def setDeleteProtectedRange(value: SchemaDeleteProtectedRangeRequest): Self = StObject.set(x, "deleteProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteProtectedRangeUndefined: Self = StObject.set(x, "deleteProtectedRange", js.undefined)
    
    @scala.inline
    def setDeleteRange(value: SchemaDeleteRangeRequest): Self = StObject.set(x, "deleteRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRangeUndefined: Self = StObject.set(x, "deleteRange", js.undefined)
    
    @scala.inline
    def setDeleteSheet(value: SchemaDeleteSheetRequest): Self = StObject.set(x, "deleteSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSheetUndefined: Self = StObject.set(x, "deleteSheet", js.undefined)
    
    @scala.inline
    def setDuplicateFilterView(value: SchemaDuplicateFilterViewRequest): Self = StObject.set(x, "duplicateFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateFilterViewUndefined: Self = StObject.set(x, "duplicateFilterView", js.undefined)
    
    @scala.inline
    def setDuplicateSheet(value: SchemaDuplicateSheetRequest): Self = StObject.set(x, "duplicateSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateSheetUndefined: Self = StObject.set(x, "duplicateSheet", js.undefined)
    
    @scala.inline
    def setFindReplace(value: SchemaFindReplaceRequest): Self = StObject.set(x, "findReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindReplaceUndefined: Self = StObject.set(x, "findReplace", js.undefined)
    
    @scala.inline
    def setInsertDimension(value: SchemaInsertDimensionRequest): Self = StObject.set(x, "insertDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertDimensionUndefined: Self = StObject.set(x, "insertDimension", js.undefined)
    
    @scala.inline
    def setInsertRange(value: SchemaInsertRangeRequest): Self = StObject.set(x, "insertRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertRangeUndefined: Self = StObject.set(x, "insertRange", js.undefined)
    
    @scala.inline
    def setMergeCells(value: SchemaMergeCellsRequest): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeCellsUndefined: Self = StObject.set(x, "mergeCells", js.undefined)
    
    @scala.inline
    def setMoveDimension(value: SchemaMoveDimensionRequest): Self = StObject.set(x, "moveDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveDimensionUndefined: Self = StObject.set(x, "moveDimension", js.undefined)
    
    @scala.inline
    def setPasteData(value: SchemaPasteDataRequest): Self = StObject.set(x, "pasteData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteDataUndefined: Self = StObject.set(x, "pasteData", js.undefined)
    
    @scala.inline
    def setRandomizeRange(value: SchemaRandomizeRangeRequest): Self = StObject.set(x, "randomizeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomizeRangeUndefined: Self = StObject.set(x, "randomizeRange", js.undefined)
    
    @scala.inline
    def setRepeatCell(value: SchemaRepeatCellRequest): Self = StObject.set(x, "repeatCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatCellUndefined: Self = StObject.set(x, "repeatCell", js.undefined)
    
    @scala.inline
    def setSetBasicFilter(value: SchemaSetBasicFilterRequest): Self = StObject.set(x, "setBasicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBasicFilterUndefined: Self = StObject.set(x, "setBasicFilter", js.undefined)
    
    @scala.inline
    def setSetDataValidation(value: SchemaSetDataValidationRequest): Self = StObject.set(x, "setDataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDataValidationUndefined: Self = StObject.set(x, "setDataValidation", js.undefined)
    
    @scala.inline
    def setSortRange(value: SchemaSortRangeRequest): Self = StObject.set(x, "sortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortRangeUndefined: Self = StObject.set(x, "sortRange", js.undefined)
    
    @scala.inline
    def setTextToColumns(value: SchemaTextToColumnsRequest): Self = StObject.set(x, "textToColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextToColumnsUndefined: Self = StObject.set(x, "textToColumns", js.undefined)
    
    @scala.inline
    def setUnmergeCells(value: SchemaUnmergeCellsRequest): Self = StObject.set(x, "unmergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmergeCellsUndefined: Self = StObject.set(x, "unmergeCells", js.undefined)
    
    @scala.inline
    def setUpdateBanding(value: SchemaUpdateBandingRequest): Self = StObject.set(x, "updateBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateBandingUndefined: Self = StObject.set(x, "updateBanding", js.undefined)
    
    @scala.inline
    def setUpdateBorders(value: SchemaUpdateBordersRequest): Self = StObject.set(x, "updateBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateBordersUndefined: Self = StObject.set(x, "updateBorders", js.undefined)
    
    @scala.inline
    def setUpdateCells(value: SchemaUpdateCellsRequest): Self = StObject.set(x, "updateCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCellsUndefined: Self = StObject.set(x, "updateCells", js.undefined)
    
    @scala.inline
    def setUpdateChartSpec(value: SchemaUpdateChartSpecRequest): Self = StObject.set(x, "updateChartSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateChartSpecUndefined: Self = StObject.set(x, "updateChartSpec", js.undefined)
    
    @scala.inline
    def setUpdateConditionalFormatRule(value: SchemaUpdateConditionalFormatRuleRequest): Self = StObject.set(x, "updateConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateConditionalFormatRuleUndefined: Self = StObject.set(x, "updateConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setUpdateDeveloperMetadata(value: SchemaUpdateDeveloperMetadataRequest): Self = StObject.set(x, "updateDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDeveloperMetadataUndefined: Self = StObject.set(x, "updateDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setUpdateDimensionGroup(value: SchemaUpdateDimensionGroupRequest): Self = StObject.set(x, "updateDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDimensionGroupUndefined: Self = StObject.set(x, "updateDimensionGroup", js.undefined)
    
    @scala.inline
    def setUpdateDimensionProperties(value: SchemaUpdateDimensionPropertiesRequest): Self = StObject.set(x, "updateDimensionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDimensionPropertiesUndefined: Self = StObject.set(x, "updateDimensionProperties", js.undefined)
    
    @scala.inline
    def setUpdateEmbeddedObjectPosition(value: SchemaUpdateEmbeddedObjectPositionRequest): Self = StObject.set(x, "updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEmbeddedObjectPositionUndefined: Self = StObject.set(x, "updateEmbeddedObjectPosition", js.undefined)
    
    @scala.inline
    def setUpdateFilterView(value: SchemaUpdateFilterViewRequest): Self = StObject.set(x, "updateFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFilterViewUndefined: Self = StObject.set(x, "updateFilterView", js.undefined)
    
    @scala.inline
    def setUpdateNamedRange(value: SchemaUpdateNamedRangeRequest): Self = StObject.set(x, "updateNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateNamedRangeUndefined: Self = StObject.set(x, "updateNamedRange", js.undefined)
    
    @scala.inline
    def setUpdateProtectedRange(value: SchemaUpdateProtectedRangeRequest): Self = StObject.set(x, "updateProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateProtectedRangeUndefined: Self = StObject.set(x, "updateProtectedRange", js.undefined)
    
    @scala.inline
    def setUpdateSheetProperties(value: SchemaUpdateSheetPropertiesRequest): Self = StObject.set(x, "updateSheetProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSheetPropertiesUndefined: Self = StObject.set(x, "updateSheetProperties", js.undefined)
    
    @scala.inline
    def setUpdateSpreadsheetProperties(value: SchemaUpdateSpreadsheetPropertiesRequest): Self = StObject.set(x, "updateSpreadsheetProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSpreadsheetPropertiesUndefined: Self = StObject.set(x, "updateSpreadsheetProperties", js.undefined)
  }
}
