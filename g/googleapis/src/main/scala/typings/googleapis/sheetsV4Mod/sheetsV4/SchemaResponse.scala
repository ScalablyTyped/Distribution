package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * A reply from adding a data source.
    */
  var addDataSource: js.UndefOr[SchemaAddDataSourceResponse] = js.undefined
  
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
    * A reply from adding a slicer.
    */
  var addSlicer: js.UndefOr[SchemaAddSlicerResponse] = js.undefined
  
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
    * A reply from removing rows containing duplicate values.
    */
  var deleteDuplicates: js.UndefOr[SchemaDeleteDuplicatesResponse] = js.undefined
  
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
    * A reply from refreshing data source objects.
    */
  var refreshDataSource: js.UndefOr[SchemaRefreshDataSourceResponse] = js.undefined
  
  /**
    * A reply from trimming whitespace.
    */
  var trimWhitespace: js.UndefOr[SchemaTrimWhitespaceResponse] = js.undefined
  
  /**
    * A reply from updating a conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[SchemaUpdateConditionalFormatRuleResponse] = js.undefined
  
  /**
    * A reply from updating a data source.
    */
  var updateDataSource: js.UndefOr[SchemaUpdateDataSourceResponse] = js.undefined
  
  /**
    * A reply from updating a developer metadata entry.
    */
  var updateDeveloperMetadata: js.UndefOr[SchemaUpdateDeveloperMetadataResponse] = js.undefined
  
  /**
    * A reply from updating an embedded object's position.
    */
  var updateEmbeddedObjectPosition: js.UndefOr[SchemaUpdateEmbeddedObjectPositionResponse] = js.undefined
}
object SchemaResponse {
  
  inline def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  
  extension [Self <: SchemaResponse](x: Self) {
    
    inline def setAddBanding(value: SchemaAddBandingResponse): Self = StObject.set(x, "addBanding", value.asInstanceOf[js.Any])
    
    inline def setAddBandingUndefined: Self = StObject.set(x, "addBanding", js.undefined)
    
    inline def setAddChart(value: SchemaAddChartResponse): Self = StObject.set(x, "addChart", value.asInstanceOf[js.Any])
    
    inline def setAddChartUndefined: Self = StObject.set(x, "addChart", js.undefined)
    
    inline def setAddDataSource(value: SchemaAddDataSourceResponse): Self = StObject.set(x, "addDataSource", value.asInstanceOf[js.Any])
    
    inline def setAddDataSourceUndefined: Self = StObject.set(x, "addDataSource", js.undefined)
    
    inline def setAddDimensionGroup(value: SchemaAddDimensionGroupResponse): Self = StObject.set(x, "addDimensionGroup", value.asInstanceOf[js.Any])
    
    inline def setAddDimensionGroupUndefined: Self = StObject.set(x, "addDimensionGroup", js.undefined)
    
    inline def setAddFilterView(value: SchemaAddFilterViewResponse): Self = StObject.set(x, "addFilterView", value.asInstanceOf[js.Any])
    
    inline def setAddFilterViewUndefined: Self = StObject.set(x, "addFilterView", js.undefined)
    
    inline def setAddNamedRange(value: SchemaAddNamedRangeResponse): Self = StObject.set(x, "addNamedRange", value.asInstanceOf[js.Any])
    
    inline def setAddNamedRangeUndefined: Self = StObject.set(x, "addNamedRange", js.undefined)
    
    inline def setAddProtectedRange(value: SchemaAddProtectedRangeResponse): Self = StObject.set(x, "addProtectedRange", value.asInstanceOf[js.Any])
    
    inline def setAddProtectedRangeUndefined: Self = StObject.set(x, "addProtectedRange", js.undefined)
    
    inline def setAddSheet(value: SchemaAddSheetResponse): Self = StObject.set(x, "addSheet", value.asInstanceOf[js.Any])
    
    inline def setAddSheetUndefined: Self = StObject.set(x, "addSheet", js.undefined)
    
    inline def setAddSlicer(value: SchemaAddSlicerResponse): Self = StObject.set(x, "addSlicer", value.asInstanceOf[js.Any])
    
    inline def setAddSlicerUndefined: Self = StObject.set(x, "addSlicer", js.undefined)
    
    inline def setCreateDeveloperMetadata(value: SchemaCreateDeveloperMetadataResponse): Self = StObject.set(x, "createDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setCreateDeveloperMetadataUndefined: Self = StObject.set(x, "createDeveloperMetadata", js.undefined)
    
    inline def setDeleteConditionalFormatRule(value: SchemaDeleteConditionalFormatRuleResponse): Self = StObject.set(x, "deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    
    inline def setDeleteConditionalFormatRuleUndefined: Self = StObject.set(x, "deleteConditionalFormatRule", js.undefined)
    
    inline def setDeleteDeveloperMetadata(value: SchemaDeleteDeveloperMetadataResponse): Self = StObject.set(x, "deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeleteDeveloperMetadataUndefined: Self = StObject.set(x, "deleteDeveloperMetadata", js.undefined)
    
    inline def setDeleteDimensionGroup(value: SchemaDeleteDimensionGroupResponse): Self = StObject.set(x, "deleteDimensionGroup", value.asInstanceOf[js.Any])
    
    inline def setDeleteDimensionGroupUndefined: Self = StObject.set(x, "deleteDimensionGroup", js.undefined)
    
    inline def setDeleteDuplicates(value: SchemaDeleteDuplicatesResponse): Self = StObject.set(x, "deleteDuplicates", value.asInstanceOf[js.Any])
    
    inline def setDeleteDuplicatesUndefined: Self = StObject.set(x, "deleteDuplicates", js.undefined)
    
    inline def setDuplicateFilterView(value: SchemaDuplicateFilterViewResponse): Self = StObject.set(x, "duplicateFilterView", value.asInstanceOf[js.Any])
    
    inline def setDuplicateFilterViewUndefined: Self = StObject.set(x, "duplicateFilterView", js.undefined)
    
    inline def setDuplicateSheet(value: SchemaDuplicateSheetResponse): Self = StObject.set(x, "duplicateSheet", value.asInstanceOf[js.Any])
    
    inline def setDuplicateSheetUndefined: Self = StObject.set(x, "duplicateSheet", js.undefined)
    
    inline def setFindReplace(value: SchemaFindReplaceResponse): Self = StObject.set(x, "findReplace", value.asInstanceOf[js.Any])
    
    inline def setFindReplaceUndefined: Self = StObject.set(x, "findReplace", js.undefined)
    
    inline def setRefreshDataSource(value: SchemaRefreshDataSourceResponse): Self = StObject.set(x, "refreshDataSource", value.asInstanceOf[js.Any])
    
    inline def setRefreshDataSourceUndefined: Self = StObject.set(x, "refreshDataSource", js.undefined)
    
    inline def setTrimWhitespace(value: SchemaTrimWhitespaceResponse): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
    
    inline def setTrimWhitespaceUndefined: Self = StObject.set(x, "trimWhitespace", js.undefined)
    
    inline def setUpdateConditionalFormatRule(value: SchemaUpdateConditionalFormatRuleResponse): Self = StObject.set(x, "updateConditionalFormatRule", value.asInstanceOf[js.Any])
    
    inline def setUpdateConditionalFormatRuleUndefined: Self = StObject.set(x, "updateConditionalFormatRule", js.undefined)
    
    inline def setUpdateDataSource(value: SchemaUpdateDataSourceResponse): Self = StObject.set(x, "updateDataSource", value.asInstanceOf[js.Any])
    
    inline def setUpdateDataSourceUndefined: Self = StObject.set(x, "updateDataSource", js.undefined)
    
    inline def setUpdateDeveloperMetadata(value: SchemaUpdateDeveloperMetadataResponse): Self = StObject.set(x, "updateDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setUpdateDeveloperMetadataUndefined: Self = StObject.set(x, "updateDeveloperMetadata", js.undefined)
    
    inline def setUpdateEmbeddedObjectPosition(value: SchemaUpdateEmbeddedObjectPositionResponse): Self = StObject.set(x, "updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    
    inline def setUpdateEmbeddedObjectPositionUndefined: Self = StObject.set(x, "updateEmbeddedObjectPosition", js.undefined)
  }
}
