package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single response from an update.
  */
@js.native
trait SchemaResponse extends js.Object {
  /**
    * A reply from adding a banded range.
    */
  var addBanding: js.UndefOr[SchemaAddBandingResponse] = js.native
  /**
    * A reply from adding a chart.
    */
  var addChart: js.UndefOr[SchemaAddChartResponse] = js.native
  /**
    * A reply from adding a dimension group.
    */
  var addDimensionGroup: js.UndefOr[SchemaAddDimensionGroupResponse] = js.native
  /**
    * A reply from adding a filter view.
    */
  var addFilterView: js.UndefOr[SchemaAddFilterViewResponse] = js.native
  /**
    * A reply from adding a named range.
    */
  var addNamedRange: js.UndefOr[SchemaAddNamedRangeResponse] = js.native
  /**
    * A reply from adding a protected range.
    */
  var addProtectedRange: js.UndefOr[SchemaAddProtectedRangeResponse] = js.native
  /**
    * A reply from adding a sheet.
    */
  var addSheet: js.UndefOr[SchemaAddSheetResponse] = js.native
  /**
    * A reply from creating a developer metadata entry.
    */
  var createDeveloperMetadata: js.UndefOr[SchemaCreateDeveloperMetadataResponse] = js.native
  /**
    * A reply from deleting a conditional format rule.
    */
  var deleteConditionalFormatRule: js.UndefOr[SchemaDeleteConditionalFormatRuleResponse] = js.native
  /**
    * A reply from deleting a developer metadata entry.
    */
  var deleteDeveloperMetadata: js.UndefOr[SchemaDeleteDeveloperMetadataResponse] = js.native
  /**
    * A reply from deleting a dimension group.
    */
  var deleteDimensionGroup: js.UndefOr[SchemaDeleteDimensionGroupResponse] = js.native
  /**
    * A reply from duplicating a filter view.
    */
  var duplicateFilterView: js.UndefOr[SchemaDuplicateFilterViewResponse] = js.native
  /**
    * A reply from duplicating a sheet.
    */
  var duplicateSheet: js.UndefOr[SchemaDuplicateSheetResponse] = js.native
  /**
    * A reply from doing a find/replace.
    */
  var findReplace: js.UndefOr[SchemaFindReplaceResponse] = js.native
  /**
    * A reply from updating a conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[SchemaUpdateConditionalFormatRuleResponse] = js.native
  /**
    * A reply from updating a developer metadata entry.
    */
  var updateDeveloperMetadata: js.UndefOr[SchemaUpdateDeveloperMetadataResponse] = js.native
  /**
    * A reply from updating an embedded object&#39;s position.
    */
  var updateEmbeddedObjectPosition: js.UndefOr[SchemaUpdateEmbeddedObjectPositionResponse] = js.native
}

object SchemaResponse {
  @scala.inline
  def apply(
    addBanding: SchemaAddBandingResponse = null,
    addChart: SchemaAddChartResponse = null,
    addDimensionGroup: SchemaAddDimensionGroupResponse = null,
    addFilterView: SchemaAddFilterViewResponse = null,
    addNamedRange: SchemaAddNamedRangeResponse = null,
    addProtectedRange: SchemaAddProtectedRangeResponse = null,
    addSheet: SchemaAddSheetResponse = null,
    createDeveloperMetadata: SchemaCreateDeveloperMetadataResponse = null,
    deleteConditionalFormatRule: SchemaDeleteConditionalFormatRuleResponse = null,
    deleteDeveloperMetadata: SchemaDeleteDeveloperMetadataResponse = null,
    deleteDimensionGroup: SchemaDeleteDimensionGroupResponse = null,
    duplicateFilterView: SchemaDuplicateFilterViewResponse = null,
    duplicateSheet: SchemaDuplicateSheetResponse = null,
    findReplace: SchemaFindReplaceResponse = null,
    updateConditionalFormatRule: SchemaUpdateConditionalFormatRuleResponse = null,
    updateDeveloperMetadata: SchemaUpdateDeveloperMetadataResponse = null,
    updateEmbeddedObjectPosition: SchemaUpdateEmbeddedObjectPositionResponse = null
  ): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (addBanding != null) __obj.updateDynamic("addBanding")(addBanding.asInstanceOf[js.Any])
    if (addChart != null) __obj.updateDynamic("addChart")(addChart.asInstanceOf[js.Any])
    if (addDimensionGroup != null) __obj.updateDynamic("addDimensionGroup")(addDimensionGroup.asInstanceOf[js.Any])
    if (addFilterView != null) __obj.updateDynamic("addFilterView")(addFilterView.asInstanceOf[js.Any])
    if (addNamedRange != null) __obj.updateDynamic("addNamedRange")(addNamedRange.asInstanceOf[js.Any])
    if (addProtectedRange != null) __obj.updateDynamic("addProtectedRange")(addProtectedRange.asInstanceOf[js.Any])
    if (addSheet != null) __obj.updateDynamic("addSheet")(addSheet.asInstanceOf[js.Any])
    if (createDeveloperMetadata != null) __obj.updateDynamic("createDeveloperMetadata")(createDeveloperMetadata.asInstanceOf[js.Any])
    if (deleteConditionalFormatRule != null) __obj.updateDynamic("deleteConditionalFormatRule")(deleteConditionalFormatRule.asInstanceOf[js.Any])
    if (deleteDeveloperMetadata != null) __obj.updateDynamic("deleteDeveloperMetadata")(deleteDeveloperMetadata.asInstanceOf[js.Any])
    if (deleteDimensionGroup != null) __obj.updateDynamic("deleteDimensionGroup")(deleteDimensionGroup.asInstanceOf[js.Any])
    if (duplicateFilterView != null) __obj.updateDynamic("duplicateFilterView")(duplicateFilterView.asInstanceOf[js.Any])
    if (duplicateSheet != null) __obj.updateDynamic("duplicateSheet")(duplicateSheet.asInstanceOf[js.Any])
    if (findReplace != null) __obj.updateDynamic("findReplace")(findReplace.asInstanceOf[js.Any])
    if (updateConditionalFormatRule != null) __obj.updateDynamic("updateConditionalFormatRule")(updateConditionalFormatRule.asInstanceOf[js.Any])
    if (updateDeveloperMetadata != null) __obj.updateDynamic("updateDeveloperMetadata")(updateDeveloperMetadata.asInstanceOf[js.Any])
    if (updateEmbeddedObjectPosition != null) __obj.updateDynamic("updateEmbeddedObjectPosition")(updateEmbeddedObjectPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResponse]
  }
}

