package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single kind of update to apply to a spreadsheet.
  */
@js.native
trait SchemaRequest extends js.Object {
  /**
    * Adds a new banded range
    */
  var addBanding: js.UndefOr[SchemaAddBandingRequest] = js.native
  /**
    * Adds a chart.
    */
  var addChart: js.UndefOr[SchemaAddChartRequest] = js.native
  /**
    * Adds a new conditional format rule.
    */
  var addConditionalFormatRule: js.UndefOr[SchemaAddConditionalFormatRuleRequest] = js.native
  /**
    * Creates a group over the specified range.
    */
  var addDimensionGroup: js.UndefOr[SchemaAddDimensionGroupRequest] = js.native
  /**
    * Adds a filter view.
    */
  var addFilterView: js.UndefOr[SchemaAddFilterViewRequest] = js.native
  /**
    * Adds a named range.
    */
  var addNamedRange: js.UndefOr[SchemaAddNamedRangeRequest] = js.native
  /**
    * Adds a protected range.
    */
  var addProtectedRange: js.UndefOr[SchemaAddProtectedRangeRequest] = js.native
  /**
    * Adds a sheet.
    */
  var addSheet: js.UndefOr[SchemaAddSheetRequest] = js.native
  /**
    * Appends cells after the last row with data in a sheet.
    */
  var appendCells: js.UndefOr[SchemaAppendCellsRequest] = js.native
  /**
    * Appends dimensions to the end of a sheet.
    */
  var appendDimension: js.UndefOr[SchemaAppendDimensionRequest] = js.native
  /**
    * Automatically fills in more data based on existing data.
    */
  var autoFill: js.UndefOr[SchemaAutoFillRequest] = js.native
  /**
    * Automatically resizes one or more dimensions based on the contents of the
    * cells in that dimension.
    */
  var autoResizeDimensions: js.UndefOr[SchemaAutoResizeDimensionsRequest] = js.native
  /**
    * Clears the basic filter on a sheet.
    */
  var clearBasicFilter: js.UndefOr[SchemaClearBasicFilterRequest] = js.native
  /**
    * Copies data from one area and pastes it to another.
    */
  var copyPaste: js.UndefOr[SchemaCopyPasteRequest] = js.native
  /**
    * Creates new developer metadata
    */
  var createDeveloperMetadata: js.UndefOr[SchemaCreateDeveloperMetadataRequest] = js.native
  /**
    * Cuts data from one area and pastes it to another.
    */
  var cutPaste: js.UndefOr[SchemaCutPasteRequest] = js.native
  /**
    * Removes a banded range
    */
  var deleteBanding: js.UndefOr[SchemaDeleteBandingRequest] = js.native
  /**
    * Deletes an existing conditional format rule.
    */
  var deleteConditionalFormatRule: js.UndefOr[SchemaDeleteConditionalFormatRuleRequest] = js.native
  /**
    * Deletes developer metadata
    */
  var deleteDeveloperMetadata: js.UndefOr[SchemaDeleteDeveloperMetadataRequest] = js.native
  /**
    * Deletes rows or columns in a sheet.
    */
  var deleteDimension: js.UndefOr[SchemaDeleteDimensionRequest] = js.native
  /**
    * Deletes a group over the specified range.
    */
  var deleteDimensionGroup: js.UndefOr[SchemaDeleteDimensionGroupRequest] = js.native
  /**
    * Deletes an embedded object (e.g, chart, image) in a sheet.
    */
  var deleteEmbeddedObject: js.UndefOr[SchemaDeleteEmbeddedObjectRequest] = js.native
  /**
    * Deletes a filter view from a sheet.
    */
  var deleteFilterView: js.UndefOr[SchemaDeleteFilterViewRequest] = js.native
  /**
    * Deletes a named range.
    */
  var deleteNamedRange: js.UndefOr[SchemaDeleteNamedRangeRequest] = js.native
  /**
    * Deletes a protected range.
    */
  var deleteProtectedRange: js.UndefOr[SchemaDeleteProtectedRangeRequest] = js.native
  /**
    * Deletes a range of cells from a sheet, shifting the remaining cells.
    */
  var deleteRange: js.UndefOr[SchemaDeleteRangeRequest] = js.native
  /**
    * Deletes a sheet.
    */
  var deleteSheet: js.UndefOr[SchemaDeleteSheetRequest] = js.native
  /**
    * Duplicates a filter view.
    */
  var duplicateFilterView: js.UndefOr[SchemaDuplicateFilterViewRequest] = js.native
  /**
    * Duplicates a sheet.
    */
  var duplicateSheet: js.UndefOr[SchemaDuplicateSheetRequest] = js.native
  /**
    * Finds and replaces occurrences of some text with other text.
    */
  var findReplace: js.UndefOr[SchemaFindReplaceRequest] = js.native
  /**
    * Inserts new rows or columns in a sheet.
    */
  var insertDimension: js.UndefOr[SchemaInsertDimensionRequest] = js.native
  /**
    * Inserts new cells in a sheet, shifting the existing cells.
    */
  var insertRange: js.UndefOr[SchemaInsertRangeRequest] = js.native
  /**
    * Merges cells together.
    */
  var mergeCells: js.UndefOr[SchemaMergeCellsRequest] = js.native
  /**
    * Moves rows or columns to another location in a sheet.
    */
  var moveDimension: js.UndefOr[SchemaMoveDimensionRequest] = js.native
  /**
    * Pastes data (HTML or delimited) into a sheet.
    */
  var pasteData: js.UndefOr[SchemaPasteDataRequest] = js.native
  /**
    * Randomizes the order of the rows in a range.
    */
  var randomizeRange: js.UndefOr[SchemaRandomizeRangeRequest] = js.native
  /**
    * Repeats a single cell across a range.
    */
  var repeatCell: js.UndefOr[SchemaRepeatCellRequest] = js.native
  /**
    * Sets the basic filter on a sheet.
    */
  var setBasicFilter: js.UndefOr[SchemaSetBasicFilterRequest] = js.native
  /**
    * Sets data validation for one or more cells.
    */
  var setDataValidation: js.UndefOr[SchemaSetDataValidationRequest] = js.native
  /**
    * Sorts data in a range.
    */
  var sortRange: js.UndefOr[SchemaSortRangeRequest] = js.native
  /**
    * Converts a column of text into many columns of text.
    */
  var textToColumns: js.UndefOr[SchemaTextToColumnsRequest] = js.native
  /**
    * Unmerges merged cells.
    */
  var unmergeCells: js.UndefOr[SchemaUnmergeCellsRequest] = js.native
  /**
    * Updates a banded range
    */
  var updateBanding: js.UndefOr[SchemaUpdateBandingRequest] = js.native
  /**
    * Updates the borders in a range of cells.
    */
  var updateBorders: js.UndefOr[SchemaUpdateBordersRequest] = js.native
  /**
    * Updates many cells at once.
    */
  var updateCells: js.UndefOr[SchemaUpdateCellsRequest] = js.native
  /**
    * Updates a chart&#39;s specifications.
    */
  var updateChartSpec: js.UndefOr[SchemaUpdateChartSpecRequest] = js.native
  /**
    * Updates an existing conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[SchemaUpdateConditionalFormatRuleRequest] = js.native
  /**
    * Updates an existing developer metadata entry
    */
  var updateDeveloperMetadata: js.UndefOr[SchemaUpdateDeveloperMetadataRequest] = js.native
  /**
    * Updates the state of the specified group.
    */
  var updateDimensionGroup: js.UndefOr[SchemaUpdateDimensionGroupRequest] = js.native
  /**
    * Updates dimensions&#39; properties.
    */
  var updateDimensionProperties: js.UndefOr[SchemaUpdateDimensionPropertiesRequest] = js.native
  /**
    * Updates an embedded object&#39;s (e.g. chart, image) position.
    */
  var updateEmbeddedObjectPosition: js.UndefOr[SchemaUpdateEmbeddedObjectPositionRequest] = js.native
  /**
    * Updates the properties of a filter view.
    */
  var updateFilterView: js.UndefOr[SchemaUpdateFilterViewRequest] = js.native
  /**
    * Updates a named range.
    */
  var updateNamedRange: js.UndefOr[SchemaUpdateNamedRangeRequest] = js.native
  /**
    * Updates a protected range.
    */
  var updateProtectedRange: js.UndefOr[SchemaUpdateProtectedRangeRequest] = js.native
  /**
    * Updates a sheet&#39;s properties.
    */
  var updateSheetProperties: js.UndefOr[SchemaUpdateSheetPropertiesRequest] = js.native
  /**
    * Updates the spreadsheet&#39;s properties.
    */
  var updateSpreadsheetProperties: js.UndefOr[SchemaUpdateSpreadsheetPropertiesRequest] = js.native
}

object SchemaRequest {
  @scala.inline
  def apply(
    addBanding: SchemaAddBandingRequest = null,
    addChart: SchemaAddChartRequest = null,
    addConditionalFormatRule: SchemaAddConditionalFormatRuleRequest = null,
    addDimensionGroup: SchemaAddDimensionGroupRequest = null,
    addFilterView: SchemaAddFilterViewRequest = null,
    addNamedRange: SchemaAddNamedRangeRequest = null,
    addProtectedRange: SchemaAddProtectedRangeRequest = null,
    addSheet: SchemaAddSheetRequest = null,
    appendCells: SchemaAppendCellsRequest = null,
    appendDimension: SchemaAppendDimensionRequest = null,
    autoFill: SchemaAutoFillRequest = null,
    autoResizeDimensions: SchemaAutoResizeDimensionsRequest = null,
    clearBasicFilter: SchemaClearBasicFilterRequest = null,
    copyPaste: SchemaCopyPasteRequest = null,
    createDeveloperMetadata: SchemaCreateDeveloperMetadataRequest = null,
    cutPaste: SchemaCutPasteRequest = null,
    deleteBanding: SchemaDeleteBandingRequest = null,
    deleteConditionalFormatRule: SchemaDeleteConditionalFormatRuleRequest = null,
    deleteDeveloperMetadata: SchemaDeleteDeveloperMetadataRequest = null,
    deleteDimension: SchemaDeleteDimensionRequest = null,
    deleteDimensionGroup: SchemaDeleteDimensionGroupRequest = null,
    deleteEmbeddedObject: SchemaDeleteEmbeddedObjectRequest = null,
    deleteFilterView: SchemaDeleteFilterViewRequest = null,
    deleteNamedRange: SchemaDeleteNamedRangeRequest = null,
    deleteProtectedRange: SchemaDeleteProtectedRangeRequest = null,
    deleteRange: SchemaDeleteRangeRequest = null,
    deleteSheet: SchemaDeleteSheetRequest = null,
    duplicateFilterView: SchemaDuplicateFilterViewRequest = null,
    duplicateSheet: SchemaDuplicateSheetRequest = null,
    findReplace: SchemaFindReplaceRequest = null,
    insertDimension: SchemaInsertDimensionRequest = null,
    insertRange: SchemaInsertRangeRequest = null,
    mergeCells: SchemaMergeCellsRequest = null,
    moveDimension: SchemaMoveDimensionRequest = null,
    pasteData: SchemaPasteDataRequest = null,
    randomizeRange: SchemaRandomizeRangeRequest = null,
    repeatCell: SchemaRepeatCellRequest = null,
    setBasicFilter: SchemaSetBasicFilterRequest = null,
    setDataValidation: SchemaSetDataValidationRequest = null,
    sortRange: SchemaSortRangeRequest = null,
    textToColumns: SchemaTextToColumnsRequest = null,
    unmergeCells: SchemaUnmergeCellsRequest = null,
    updateBanding: SchemaUpdateBandingRequest = null,
    updateBorders: SchemaUpdateBordersRequest = null,
    updateCells: SchemaUpdateCellsRequest = null,
    updateChartSpec: SchemaUpdateChartSpecRequest = null,
    updateConditionalFormatRule: SchemaUpdateConditionalFormatRuleRequest = null,
    updateDeveloperMetadata: SchemaUpdateDeveloperMetadataRequest = null,
    updateDimensionGroup: SchemaUpdateDimensionGroupRequest = null,
    updateDimensionProperties: SchemaUpdateDimensionPropertiesRequest = null,
    updateEmbeddedObjectPosition: SchemaUpdateEmbeddedObjectPositionRequest = null,
    updateFilterView: SchemaUpdateFilterViewRequest = null,
    updateNamedRange: SchemaUpdateNamedRangeRequest = null,
    updateProtectedRange: SchemaUpdateProtectedRangeRequest = null,
    updateSheetProperties: SchemaUpdateSheetPropertiesRequest = null,
    updateSpreadsheetProperties: SchemaUpdateSpreadsheetPropertiesRequest = null
  ): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    if (addBanding != null) __obj.updateDynamic("addBanding")(addBanding.asInstanceOf[js.Any])
    if (addChart != null) __obj.updateDynamic("addChart")(addChart.asInstanceOf[js.Any])
    if (addConditionalFormatRule != null) __obj.updateDynamic("addConditionalFormatRule")(addConditionalFormatRule.asInstanceOf[js.Any])
    if (addDimensionGroup != null) __obj.updateDynamic("addDimensionGroup")(addDimensionGroup.asInstanceOf[js.Any])
    if (addFilterView != null) __obj.updateDynamic("addFilterView")(addFilterView.asInstanceOf[js.Any])
    if (addNamedRange != null) __obj.updateDynamic("addNamedRange")(addNamedRange.asInstanceOf[js.Any])
    if (addProtectedRange != null) __obj.updateDynamic("addProtectedRange")(addProtectedRange.asInstanceOf[js.Any])
    if (addSheet != null) __obj.updateDynamic("addSheet")(addSheet.asInstanceOf[js.Any])
    if (appendCells != null) __obj.updateDynamic("appendCells")(appendCells.asInstanceOf[js.Any])
    if (appendDimension != null) __obj.updateDynamic("appendDimension")(appendDimension.asInstanceOf[js.Any])
    if (autoFill != null) __obj.updateDynamic("autoFill")(autoFill.asInstanceOf[js.Any])
    if (autoResizeDimensions != null) __obj.updateDynamic("autoResizeDimensions")(autoResizeDimensions.asInstanceOf[js.Any])
    if (clearBasicFilter != null) __obj.updateDynamic("clearBasicFilter")(clearBasicFilter.asInstanceOf[js.Any])
    if (copyPaste != null) __obj.updateDynamic("copyPaste")(copyPaste.asInstanceOf[js.Any])
    if (createDeveloperMetadata != null) __obj.updateDynamic("createDeveloperMetadata")(createDeveloperMetadata.asInstanceOf[js.Any])
    if (cutPaste != null) __obj.updateDynamic("cutPaste")(cutPaste.asInstanceOf[js.Any])
    if (deleteBanding != null) __obj.updateDynamic("deleteBanding")(deleteBanding.asInstanceOf[js.Any])
    if (deleteConditionalFormatRule != null) __obj.updateDynamic("deleteConditionalFormatRule")(deleteConditionalFormatRule.asInstanceOf[js.Any])
    if (deleteDeveloperMetadata != null) __obj.updateDynamic("deleteDeveloperMetadata")(deleteDeveloperMetadata.asInstanceOf[js.Any])
    if (deleteDimension != null) __obj.updateDynamic("deleteDimension")(deleteDimension.asInstanceOf[js.Any])
    if (deleteDimensionGroup != null) __obj.updateDynamic("deleteDimensionGroup")(deleteDimensionGroup.asInstanceOf[js.Any])
    if (deleteEmbeddedObject != null) __obj.updateDynamic("deleteEmbeddedObject")(deleteEmbeddedObject.asInstanceOf[js.Any])
    if (deleteFilterView != null) __obj.updateDynamic("deleteFilterView")(deleteFilterView.asInstanceOf[js.Any])
    if (deleteNamedRange != null) __obj.updateDynamic("deleteNamedRange")(deleteNamedRange.asInstanceOf[js.Any])
    if (deleteProtectedRange != null) __obj.updateDynamic("deleteProtectedRange")(deleteProtectedRange.asInstanceOf[js.Any])
    if (deleteRange != null) __obj.updateDynamic("deleteRange")(deleteRange.asInstanceOf[js.Any])
    if (deleteSheet != null) __obj.updateDynamic("deleteSheet")(deleteSheet.asInstanceOf[js.Any])
    if (duplicateFilterView != null) __obj.updateDynamic("duplicateFilterView")(duplicateFilterView.asInstanceOf[js.Any])
    if (duplicateSheet != null) __obj.updateDynamic("duplicateSheet")(duplicateSheet.asInstanceOf[js.Any])
    if (findReplace != null) __obj.updateDynamic("findReplace")(findReplace.asInstanceOf[js.Any])
    if (insertDimension != null) __obj.updateDynamic("insertDimension")(insertDimension.asInstanceOf[js.Any])
    if (insertRange != null) __obj.updateDynamic("insertRange")(insertRange.asInstanceOf[js.Any])
    if (mergeCells != null) __obj.updateDynamic("mergeCells")(mergeCells.asInstanceOf[js.Any])
    if (moveDimension != null) __obj.updateDynamic("moveDimension")(moveDimension.asInstanceOf[js.Any])
    if (pasteData != null) __obj.updateDynamic("pasteData")(pasteData.asInstanceOf[js.Any])
    if (randomizeRange != null) __obj.updateDynamic("randomizeRange")(randomizeRange.asInstanceOf[js.Any])
    if (repeatCell != null) __obj.updateDynamic("repeatCell")(repeatCell.asInstanceOf[js.Any])
    if (setBasicFilter != null) __obj.updateDynamic("setBasicFilter")(setBasicFilter.asInstanceOf[js.Any])
    if (setDataValidation != null) __obj.updateDynamic("setDataValidation")(setDataValidation.asInstanceOf[js.Any])
    if (sortRange != null) __obj.updateDynamic("sortRange")(sortRange.asInstanceOf[js.Any])
    if (textToColumns != null) __obj.updateDynamic("textToColumns")(textToColumns.asInstanceOf[js.Any])
    if (unmergeCells != null) __obj.updateDynamic("unmergeCells")(unmergeCells.asInstanceOf[js.Any])
    if (updateBanding != null) __obj.updateDynamic("updateBanding")(updateBanding.asInstanceOf[js.Any])
    if (updateBorders != null) __obj.updateDynamic("updateBorders")(updateBorders.asInstanceOf[js.Any])
    if (updateCells != null) __obj.updateDynamic("updateCells")(updateCells.asInstanceOf[js.Any])
    if (updateChartSpec != null) __obj.updateDynamic("updateChartSpec")(updateChartSpec.asInstanceOf[js.Any])
    if (updateConditionalFormatRule != null) __obj.updateDynamic("updateConditionalFormatRule")(updateConditionalFormatRule.asInstanceOf[js.Any])
    if (updateDeveloperMetadata != null) __obj.updateDynamic("updateDeveloperMetadata")(updateDeveloperMetadata.asInstanceOf[js.Any])
    if (updateDimensionGroup != null) __obj.updateDynamic("updateDimensionGroup")(updateDimensionGroup.asInstanceOf[js.Any])
    if (updateDimensionProperties != null) __obj.updateDynamic("updateDimensionProperties")(updateDimensionProperties.asInstanceOf[js.Any])
    if (updateEmbeddedObjectPosition != null) __obj.updateDynamic("updateEmbeddedObjectPosition")(updateEmbeddedObjectPosition.asInstanceOf[js.Any])
    if (updateFilterView != null) __obj.updateDynamic("updateFilterView")(updateFilterView.asInstanceOf[js.Any])
    if (updateNamedRange != null) __obj.updateDynamic("updateNamedRange")(updateNamedRange.asInstanceOf[js.Any])
    if (updateProtectedRange != null) __obj.updateDynamic("updateProtectedRange")(updateProtectedRange.asInstanceOf[js.Any])
    if (updateSheetProperties != null) __obj.updateDynamic("updateSheetProperties")(updateSheetProperties.asInstanceOf[js.Any])
    if (updateSpreadsheetProperties != null) __obj.updateDynamic("updateSpreadsheetProperties")(updateSpreadsheetProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRequest]
  }
}

