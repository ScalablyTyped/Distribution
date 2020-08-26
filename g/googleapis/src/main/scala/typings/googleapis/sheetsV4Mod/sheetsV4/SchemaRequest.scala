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
    def setAddBanding(value: SchemaAddBandingRequest): Self = this.set("addBanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddBanding: Self = this.set("addBanding", js.undefined)
    @scala.inline
    def setAddChart(value: SchemaAddChartRequest): Self = this.set("addChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddChart: Self = this.set("addChart", js.undefined)
    @scala.inline
    def setAddConditionalFormatRule(value: SchemaAddConditionalFormatRuleRequest): Self = this.set("addConditionalFormatRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddConditionalFormatRule: Self = this.set("addConditionalFormatRule", js.undefined)
    @scala.inline
    def setAddDimensionGroup(value: SchemaAddDimensionGroupRequest): Self = this.set("addDimensionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddDimensionGroup: Self = this.set("addDimensionGroup", js.undefined)
    @scala.inline
    def setAddFilterView(value: SchemaAddFilterViewRequest): Self = this.set("addFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddFilterView: Self = this.set("addFilterView", js.undefined)
    @scala.inline
    def setAddNamedRange(value: SchemaAddNamedRangeRequest): Self = this.set("addNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddNamedRange: Self = this.set("addNamedRange", js.undefined)
    @scala.inline
    def setAddProtectedRange(value: SchemaAddProtectedRangeRequest): Self = this.set("addProtectedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddProtectedRange: Self = this.set("addProtectedRange", js.undefined)
    @scala.inline
    def setAddSheet(value: SchemaAddSheetRequest): Self = this.set("addSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSheet: Self = this.set("addSheet", js.undefined)
    @scala.inline
    def setAppendCells(value: SchemaAppendCellsRequest): Self = this.set("appendCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendCells: Self = this.set("appendCells", js.undefined)
    @scala.inline
    def setAppendDimension(value: SchemaAppendDimensionRequest): Self = this.set("appendDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendDimension: Self = this.set("appendDimension", js.undefined)
    @scala.inline
    def setAutoFill(value: SchemaAutoFillRequest): Self = this.set("autoFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFill: Self = this.set("autoFill", js.undefined)
    @scala.inline
    def setAutoResizeDimensions(value: SchemaAutoResizeDimensionsRequest): Self = this.set("autoResizeDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResizeDimensions: Self = this.set("autoResizeDimensions", js.undefined)
    @scala.inline
    def setClearBasicFilter(value: SchemaClearBasicFilterRequest): Self = this.set("clearBasicFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearBasicFilter: Self = this.set("clearBasicFilter", js.undefined)
    @scala.inline
    def setCopyPaste(value: SchemaCopyPasteRequest): Self = this.set("copyPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyPaste: Self = this.set("copyPaste", js.undefined)
    @scala.inline
    def setCreateDeveloperMetadata(value: SchemaCreateDeveloperMetadataRequest): Self = this.set("createDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDeveloperMetadata: Self = this.set("createDeveloperMetadata", js.undefined)
    @scala.inline
    def setCutPaste(value: SchemaCutPasteRequest): Self = this.set("cutPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCutPaste: Self = this.set("cutPaste", js.undefined)
    @scala.inline
    def setDeleteBanding(value: SchemaDeleteBandingRequest): Self = this.set("deleteBanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteBanding: Self = this.set("deleteBanding", js.undefined)
    @scala.inline
    def setDeleteConditionalFormatRule(value: SchemaDeleteConditionalFormatRuleRequest): Self = this.set("deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteConditionalFormatRule: Self = this.set("deleteConditionalFormatRule", js.undefined)
    @scala.inline
    def setDeleteDeveloperMetadata(value: SchemaDeleteDeveloperMetadataRequest): Self = this.set("deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDeveloperMetadata: Self = this.set("deleteDeveloperMetadata", js.undefined)
    @scala.inline
    def setDeleteDimension(value: SchemaDeleteDimensionRequest): Self = this.set("deleteDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDimension: Self = this.set("deleteDimension", js.undefined)
    @scala.inline
    def setDeleteDimensionGroup(value: SchemaDeleteDimensionGroupRequest): Self = this.set("deleteDimensionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDimensionGroup: Self = this.set("deleteDimensionGroup", js.undefined)
    @scala.inline
    def setDeleteEmbeddedObject(value: SchemaDeleteEmbeddedObjectRequest): Self = this.set("deleteEmbeddedObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteEmbeddedObject: Self = this.set("deleteEmbeddedObject", js.undefined)
    @scala.inline
    def setDeleteFilterView(value: SchemaDeleteFilterViewRequest): Self = this.set("deleteFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteFilterView: Self = this.set("deleteFilterView", js.undefined)
    @scala.inline
    def setDeleteNamedRange(value: SchemaDeleteNamedRangeRequest): Self = this.set("deleteNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteNamedRange: Self = this.set("deleteNamedRange", js.undefined)
    @scala.inline
    def setDeleteProtectedRange(value: SchemaDeleteProtectedRangeRequest): Self = this.set("deleteProtectedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteProtectedRange: Self = this.set("deleteProtectedRange", js.undefined)
    @scala.inline
    def setDeleteRange(value: SchemaDeleteRangeRequest): Self = this.set("deleteRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteRange: Self = this.set("deleteRange", js.undefined)
    @scala.inline
    def setDeleteSheet(value: SchemaDeleteSheetRequest): Self = this.set("deleteSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteSheet: Self = this.set("deleteSheet", js.undefined)
    @scala.inline
    def setDuplicateFilterView(value: SchemaDuplicateFilterViewRequest): Self = this.set("duplicateFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateFilterView: Self = this.set("duplicateFilterView", js.undefined)
    @scala.inline
    def setDuplicateSheet(value: SchemaDuplicateSheetRequest): Self = this.set("duplicateSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateSheet: Self = this.set("duplicateSheet", js.undefined)
    @scala.inline
    def setFindReplace(value: SchemaFindReplaceRequest): Self = this.set("findReplace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindReplace: Self = this.set("findReplace", js.undefined)
    @scala.inline
    def setInsertDimension(value: SchemaInsertDimensionRequest): Self = this.set("insertDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertDimension: Self = this.set("insertDimension", js.undefined)
    @scala.inline
    def setInsertRange(value: SchemaInsertRangeRequest): Self = this.set("insertRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertRange: Self = this.set("insertRange", js.undefined)
    @scala.inline
    def setMergeCells(value: SchemaMergeCellsRequest): Self = this.set("mergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeCells: Self = this.set("mergeCells", js.undefined)
    @scala.inline
    def setMoveDimension(value: SchemaMoveDimensionRequest): Self = this.set("moveDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveDimension: Self = this.set("moveDimension", js.undefined)
    @scala.inline
    def setPasteData(value: SchemaPasteDataRequest): Self = this.set("pasteData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasteData: Self = this.set("pasteData", js.undefined)
    @scala.inline
    def setRandomizeRange(value: SchemaRandomizeRangeRequest): Self = this.set("randomizeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomizeRange: Self = this.set("randomizeRange", js.undefined)
    @scala.inline
    def setRepeatCell(value: SchemaRepeatCellRequest): Self = this.set("repeatCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatCell: Self = this.set("repeatCell", js.undefined)
    @scala.inline
    def setSetBasicFilter(value: SchemaSetBasicFilterRequest): Self = this.set("setBasicFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBasicFilter: Self = this.set("setBasicFilter", js.undefined)
    @scala.inline
    def setSetDataValidation(value: SchemaSetDataValidationRequest): Self = this.set("setDataValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetDataValidation: Self = this.set("setDataValidation", js.undefined)
    @scala.inline
    def setSortRange(value: SchemaSortRangeRequest): Self = this.set("sortRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortRange: Self = this.set("sortRange", js.undefined)
    @scala.inline
    def setTextToColumns(value: SchemaTextToColumnsRequest): Self = this.set("textToColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextToColumns: Self = this.set("textToColumns", js.undefined)
    @scala.inline
    def setUnmergeCells(value: SchemaUnmergeCellsRequest): Self = this.set("unmergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmergeCells: Self = this.set("unmergeCells", js.undefined)
    @scala.inline
    def setUpdateBanding(value: SchemaUpdateBandingRequest): Self = this.set("updateBanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateBanding: Self = this.set("updateBanding", js.undefined)
    @scala.inline
    def setUpdateBorders(value: SchemaUpdateBordersRequest): Self = this.set("updateBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateBorders: Self = this.set("updateBorders", js.undefined)
    @scala.inline
    def setUpdateCells(value: SchemaUpdateCellsRequest): Self = this.set("updateCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateCells: Self = this.set("updateCells", js.undefined)
    @scala.inline
    def setUpdateChartSpec(value: SchemaUpdateChartSpecRequest): Self = this.set("updateChartSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateChartSpec: Self = this.set("updateChartSpec", js.undefined)
    @scala.inline
    def setUpdateConditionalFormatRule(value: SchemaUpdateConditionalFormatRuleRequest): Self = this.set("updateConditionalFormatRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateConditionalFormatRule: Self = this.set("updateConditionalFormatRule", js.undefined)
    @scala.inline
    def setUpdateDeveloperMetadata(value: SchemaUpdateDeveloperMetadataRequest): Self = this.set("updateDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDeveloperMetadata: Self = this.set("updateDeveloperMetadata", js.undefined)
    @scala.inline
    def setUpdateDimensionGroup(value: SchemaUpdateDimensionGroupRequest): Self = this.set("updateDimensionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDimensionGroup: Self = this.set("updateDimensionGroup", js.undefined)
    @scala.inline
    def setUpdateDimensionProperties(value: SchemaUpdateDimensionPropertiesRequest): Self = this.set("updateDimensionProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDimensionProperties: Self = this.set("updateDimensionProperties", js.undefined)
    @scala.inline
    def setUpdateEmbeddedObjectPosition(value: SchemaUpdateEmbeddedObjectPositionRequest): Self = this.set("updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateEmbeddedObjectPosition: Self = this.set("updateEmbeddedObjectPosition", js.undefined)
    @scala.inline
    def setUpdateFilterView(value: SchemaUpdateFilterViewRequest): Self = this.set("updateFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateFilterView: Self = this.set("updateFilterView", js.undefined)
    @scala.inline
    def setUpdateNamedRange(value: SchemaUpdateNamedRangeRequest): Self = this.set("updateNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateNamedRange: Self = this.set("updateNamedRange", js.undefined)
    @scala.inline
    def setUpdateProtectedRange(value: SchemaUpdateProtectedRangeRequest): Self = this.set("updateProtectedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateProtectedRange: Self = this.set("updateProtectedRange", js.undefined)
    @scala.inline
    def setUpdateSheetProperties(value: SchemaUpdateSheetPropertiesRequest): Self = this.set("updateSheetProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSheetProperties: Self = this.set("updateSheetProperties", js.undefined)
    @scala.inline
    def setUpdateSpreadsheetProperties(value: SchemaUpdateSpreadsheetPropertiesRequest): Self = this.set("updateSpreadsheetProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSpreadsheetProperties: Self = this.set("updateSpreadsheetProperties", js.undefined)
  }
  
}

