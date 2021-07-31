package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single response from an update.
  */
trait SchemaResponse extends StObject {
  
  /**
    * A reply from adding a banded range.
    */
  var addBanding: js.UndefOr[SchemaAddBandingResponse] = js.undefined
  
  /**
    * A reply from adding a chart.
    */
  var addChart: js.UndefOr[SchemaAddChartResponse] = js.undefined
  
  /**
    * A reply from adding a dimension group.
    */
  var addDimensionGroup: js.UndefOr[SchemaAddDimensionGroupResponse] = js.undefined
  
  /**
    * A reply from adding a filter view.
    */
  var addFilterView: js.UndefOr[SchemaAddFilterViewResponse] = js.undefined
  
  /**
    * A reply from adding a named range.
    */
  var addNamedRange: js.UndefOr[SchemaAddNamedRangeResponse] = js.undefined
  
  /**
    * A reply from adding a protected range.
    */
  var addProtectedRange: js.UndefOr[SchemaAddProtectedRangeResponse] = js.undefined
  
  /**
    * A reply from adding a sheet.
    */
  var addSheet: js.UndefOr[SchemaAddSheetResponse] = js.undefined
  
  /**
    * A reply from creating a developer metadata entry.
    */
  var createDeveloperMetadata: js.UndefOr[SchemaCreateDeveloperMetadataResponse] = js.undefined
  
  /**
    * A reply from deleting a conditional format rule.
    */
  var deleteConditionalFormatRule: js.UndefOr[SchemaDeleteConditionalFormatRuleResponse] = js.undefined
  
  /**
    * A reply from deleting a developer metadata entry.
    */
  var deleteDeveloperMetadata: js.UndefOr[SchemaDeleteDeveloperMetadataResponse] = js.undefined
  
  /**
    * A reply from deleting a dimension group.
    */
  var deleteDimensionGroup: js.UndefOr[SchemaDeleteDimensionGroupResponse] = js.undefined
  
  /**
    * A reply from duplicating a filter view.
    */
  var duplicateFilterView: js.UndefOr[SchemaDuplicateFilterViewResponse] = js.undefined
  
  /**
    * A reply from duplicating a sheet.
    */
  var duplicateSheet: js.UndefOr[SchemaDuplicateSheetResponse] = js.undefined
  
  /**
    * A reply from doing a find/replace.
    */
  var findReplace: js.UndefOr[SchemaFindReplaceResponse] = js.undefined
  
  /**
    * A reply from updating a conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[SchemaUpdateConditionalFormatRuleResponse] = js.undefined
  
  /**
    * A reply from updating a developer metadata entry.
    */
  var updateDeveloperMetadata: js.UndefOr[SchemaUpdateDeveloperMetadataResponse] = js.undefined
  
  /**
    * A reply from updating an embedded object&#39;s position.
    */
  var updateEmbeddedObjectPosition: js.UndefOr[SchemaUpdateEmbeddedObjectPositionResponse] = js.undefined
}
object SchemaResponse {
  
  @scala.inline
  def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  
  @scala.inline
  implicit class SchemaResponseMutableBuilder[Self <: SchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBanding(value: SchemaAddBandingResponse): Self = StObject.set(x, "addBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddBandingUndefined: Self = StObject.set(x, "addBanding", js.undefined)
    
    @scala.inline
    def setAddChart(value: SchemaAddChartResponse): Self = StObject.set(x, "addChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddChartUndefined: Self = StObject.set(x, "addChart", js.undefined)
    
    @scala.inline
    def setAddDimensionGroup(value: SchemaAddDimensionGroupResponse): Self = StObject.set(x, "addDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDimensionGroupUndefined: Self = StObject.set(x, "addDimensionGroup", js.undefined)
    
    @scala.inline
    def setAddFilterView(value: SchemaAddFilterViewResponse): Self = StObject.set(x, "addFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddFilterViewUndefined: Self = StObject.set(x, "addFilterView", js.undefined)
    
    @scala.inline
    def setAddNamedRange(value: SchemaAddNamedRangeResponse): Self = StObject.set(x, "addNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddNamedRangeUndefined: Self = StObject.set(x, "addNamedRange", js.undefined)
    
    @scala.inline
    def setAddProtectedRange(value: SchemaAddProtectedRangeResponse): Self = StObject.set(x, "addProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddProtectedRangeUndefined: Self = StObject.set(x, "addProtectedRange", js.undefined)
    
    @scala.inline
    def setAddSheet(value: SchemaAddSheetResponse): Self = StObject.set(x, "addSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSheetUndefined: Self = StObject.set(x, "addSheet", js.undefined)
    
    @scala.inline
    def setCreateDeveloperMetadata(value: SchemaCreateDeveloperMetadataResponse): Self = StObject.set(x, "createDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDeveloperMetadataUndefined: Self = StObject.set(x, "createDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteConditionalFormatRule(value: SchemaDeleteConditionalFormatRuleResponse): Self = StObject.set(x, "deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteConditionalFormatRuleUndefined: Self = StObject.set(x, "deleteConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setDeleteDeveloperMetadata(value: SchemaDeleteDeveloperMetadataResponse): Self = StObject.set(x, "deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDeveloperMetadataUndefined: Self = StObject.set(x, "deleteDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteDimensionGroup(value: SchemaDeleteDimensionGroupResponse): Self = StObject.set(x, "deleteDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDimensionGroupUndefined: Self = StObject.set(x, "deleteDimensionGroup", js.undefined)
    
    @scala.inline
    def setDuplicateFilterView(value: SchemaDuplicateFilterViewResponse): Self = StObject.set(x, "duplicateFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateFilterViewUndefined: Self = StObject.set(x, "duplicateFilterView", js.undefined)
    
    @scala.inline
    def setDuplicateSheet(value: SchemaDuplicateSheetResponse): Self = StObject.set(x, "duplicateSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateSheetUndefined: Self = StObject.set(x, "duplicateSheet", js.undefined)
    
    @scala.inline
    def setFindReplace(value: SchemaFindReplaceResponse): Self = StObject.set(x, "findReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindReplaceUndefined: Self = StObject.set(x, "findReplace", js.undefined)
    
    @scala.inline
    def setUpdateConditionalFormatRule(value: SchemaUpdateConditionalFormatRuleResponse): Self = StObject.set(x, "updateConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateConditionalFormatRuleUndefined: Self = StObject.set(x, "updateConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setUpdateDeveloperMetadata(value: SchemaUpdateDeveloperMetadataResponse): Self = StObject.set(x, "updateDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDeveloperMetadataUndefined: Self = StObject.set(x, "updateDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setUpdateEmbeddedObjectPosition(value: SchemaUpdateEmbeddedObjectPositionResponse): Self = StObject.set(x, "updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEmbeddedObjectPositionUndefined: Self = StObject.set(x, "updateEmbeddedObjectPosition", js.undefined)
  }
}
