package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1BigQueryExport extends StObject {
  
  /**
    * Output only. The time at which the big query export was created. This field is set by the server and will be ignored if provided on export on creation.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The dataset to write findings' updates to. Its format is "projects/[project_id]/datasets/[bigquery_dataset_id]". BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of the export (max of 1024 characters).
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Expression that defines the filter to apply across create/update events of findings. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the corresponding resource. The supported operators are: * `=` for all value types. * `\>`, `<`, `\>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Email address of the user who last edited the big query export. This field is set by the server and will be ignored if provided on export creation or update.
    */
  var mostRecentEditor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The relative resource name of this export. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name. Example format: "organizations/{organization_id\}/bigQueryExports/{export_id\}" Example format: "folders/{folder_id\}/bigQueryExports/{export_id\}" Example format: "projects/{project_id\}/bigQueryExports/{export_id\}" This field is provided in responses, and is ignored when provided in create requests.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The service account that needs permission to create table, upload data to the big query dataset.
    */
  var principal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The most recent time at which the big export was updated. This field is set by the server and will be ignored if provided on export creation or update.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1BigQueryExport {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1BigQueryExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1BigQueryExport](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMostRecentEditor(value: String): Self = StObject.set(x, "mostRecentEditor", value.asInstanceOf[js.Any])
    
    inline def setMostRecentEditorNull: Self = StObject.set(x, "mostRecentEditor", null)
    
    inline def setMostRecentEditorUndefined: Self = StObject.set(x, "mostRecentEditor", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalNull: Self = StObject.set(x, "principal", null)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
