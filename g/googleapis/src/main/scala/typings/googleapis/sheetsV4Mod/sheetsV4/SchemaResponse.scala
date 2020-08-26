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
    def setAddBanding(value: SchemaAddBandingResponse): Self = this.set("addBanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddBanding: Self = this.set("addBanding", js.undefined)
    @scala.inline
    def setAddChart(value: SchemaAddChartResponse): Self = this.set("addChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddChart: Self = this.set("addChart", js.undefined)
    @scala.inline
    def setAddDimensionGroup(value: SchemaAddDimensionGroupResponse): Self = this.set("addDimensionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddDimensionGroup: Self = this.set("addDimensionGroup", js.undefined)
    @scala.inline
    def setAddFilterView(value: SchemaAddFilterViewResponse): Self = this.set("addFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddFilterView: Self = this.set("addFilterView", js.undefined)
    @scala.inline
    def setAddNamedRange(value: SchemaAddNamedRangeResponse): Self = this.set("addNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddNamedRange: Self = this.set("addNamedRange", js.undefined)
    @scala.inline
    def setAddProtectedRange(value: SchemaAddProtectedRangeResponse): Self = this.set("addProtectedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddProtectedRange: Self = this.set("addProtectedRange", js.undefined)
    @scala.inline
    def setAddSheet(value: SchemaAddSheetResponse): Self = this.set("addSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSheet: Self = this.set("addSheet", js.undefined)
    @scala.inline
    def setCreateDeveloperMetadata(value: SchemaCreateDeveloperMetadataResponse): Self = this.set("createDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDeveloperMetadata: Self = this.set("createDeveloperMetadata", js.undefined)
    @scala.inline
    def setDeleteConditionalFormatRule(value: SchemaDeleteConditionalFormatRuleResponse): Self = this.set("deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteConditionalFormatRule: Self = this.set("deleteConditionalFormatRule", js.undefined)
    @scala.inline
    def setDeleteDeveloperMetadata(value: SchemaDeleteDeveloperMetadataResponse): Self = this.set("deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDeveloperMetadata: Self = this.set("deleteDeveloperMetadata", js.undefined)
    @scala.inline
    def setDeleteDimensionGroup(value: SchemaDeleteDimensionGroupResponse): Self = this.set("deleteDimensionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDimensionGroup: Self = this.set("deleteDimensionGroup", js.undefined)
    @scala.inline
    def setDuplicateFilterView(value: SchemaDuplicateFilterViewResponse): Self = this.set("duplicateFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateFilterView: Self = this.set("duplicateFilterView", js.undefined)
    @scala.inline
    def setDuplicateSheet(value: SchemaDuplicateSheetResponse): Self = this.set("duplicateSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateSheet: Self = this.set("duplicateSheet", js.undefined)
    @scala.inline
    def setFindReplace(value: SchemaFindReplaceResponse): Self = this.set("findReplace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindReplace: Self = this.set("findReplace", js.undefined)
    @scala.inline
    def setUpdateConditionalFormatRule(value: SchemaUpdateConditionalFormatRuleResponse): Self = this.set("updateConditionalFormatRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateConditionalFormatRule: Self = this.set("updateConditionalFormatRule", js.undefined)
    @scala.inline
    def setUpdateDeveloperMetadata(value: SchemaUpdateDeveloperMetadataResponse): Self = this.set("updateDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDeveloperMetadata: Self = this.set("updateDeveloperMetadata", js.undefined)
    @scala.inline
    def setUpdateEmbeddedObjectPosition(value: SchemaUpdateEmbeddedObjectPositionResponse): Self = this.set("updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateEmbeddedObjectPosition: Self = this.set("updateEmbeddedObjectPosition", js.undefined)
  }
  
}

