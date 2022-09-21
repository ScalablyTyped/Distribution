package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Action extends StObject {
  
  /**
    * Output only. The relative resource name of the asset, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/assets/{asset_id\}.
    */
  var asset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The category of issue associated with the action.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of data locations associated with this action. Cloud Storage locations are represented as URI paths(E.g. gs://bucket/table1/year=2020/month=Jan/). BigQuery locations refer to resource names(E.g. bigquery.googleapis.com/projects/project-id/datasets/dataset-id).
    */
  var dataLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The time that the issue was detected.
    */
  var detectTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details for issues related to applying security policy.
    */
  var failedSecurityPolicyApply: js.UndefOr[SchemaGoogleCloudDataplexV1ActionFailedSecurityPolicyApply] = js.undefined
  
  /**
    * Details for issues related to incompatible schemas detected within data.
    */
  var incompatibleDataSchema: js.UndefOr[SchemaGoogleCloudDataplexV1ActionIncompatibleDataSchema] = js.undefined
  
  /**
    * Details for issues related to invalid or unsupported data formats.
    */
  var invalidDataFormat: js.UndefOr[SchemaGoogleCloudDataplexV1ActionInvalidDataFormat] = js.undefined
  
  /**
    * Details for issues related to invalid data arrangement.
    */
  var invalidDataOrganization: js.UndefOr[SchemaGoogleCloudDataplexV1ActionInvalidDataOrganization] = js.undefined
  
  /**
    * Details for issues related to invalid or unsupported data partition structure.
    */
  var invalidDataPartition: js.UndefOr[SchemaGoogleCloudDataplexV1ActionInvalidDataPartition] = js.undefined
  
  /**
    * Detailed description of the issue requiring action.
    */
  var issue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The relative resource name of the lake, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}.
    */
  var lake: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details for issues related to absence of data within managed resources.
    */
  var missingData: js.UndefOr[SchemaGoogleCloudDataplexV1ActionMissingData] = js.undefined
  
  /**
    * Details for issues related to absence of a managed resource.
    */
  var missingResource: js.UndefOr[SchemaGoogleCloudDataplexV1ActionMissingResource] = js.undefined
  
  /**
    * Output only. The relative resource name of the action, of the form: projects/{project\}/locations/{location\}/lakes/{lake\}/actions/{action\} projects/{project\}/locations/{location\}/lakes/{lake\}/zones/{zone\}/actions/{action\} projects/{project\}/locations/{location\}/lakes/{lake\}/zones/{zone\}/assets/{asset\}/actions/{action\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details for issues related to lack of permissions to access data resources.
    */
  var unauthorizedResource: js.UndefOr[SchemaGoogleCloudDataplexV1ActionUnauthorizedResource] = js.undefined
  
  /**
    * Output only. The relative resource name of the zone, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Action {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Action]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Action](x: Self) {
    
    inline def setAsset(value: String): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetNull: Self = StObject.set(x, "asset", null)
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDataLocations(value: js.Array[String]): Self = StObject.set(x, "dataLocations", value.asInstanceOf[js.Any])
    
    inline def setDataLocationsNull: Self = StObject.set(x, "dataLocations", null)
    
    inline def setDataLocationsUndefined: Self = StObject.set(x, "dataLocations", js.undefined)
    
    inline def setDataLocationsVarargs(value: String*): Self = StObject.set(x, "dataLocations", js.Array(value*))
    
    inline def setDetectTime(value: String): Self = StObject.set(x, "detectTime", value.asInstanceOf[js.Any])
    
    inline def setDetectTimeNull: Self = StObject.set(x, "detectTime", null)
    
    inline def setDetectTimeUndefined: Self = StObject.set(x, "detectTime", js.undefined)
    
    inline def setFailedSecurityPolicyApply(value: SchemaGoogleCloudDataplexV1ActionFailedSecurityPolicyApply): Self = StObject.set(x, "failedSecurityPolicyApply", value.asInstanceOf[js.Any])
    
    inline def setFailedSecurityPolicyApplyUndefined: Self = StObject.set(x, "failedSecurityPolicyApply", js.undefined)
    
    inline def setIncompatibleDataSchema(value: SchemaGoogleCloudDataplexV1ActionIncompatibleDataSchema): Self = StObject.set(x, "incompatibleDataSchema", value.asInstanceOf[js.Any])
    
    inline def setIncompatibleDataSchemaUndefined: Self = StObject.set(x, "incompatibleDataSchema", js.undefined)
    
    inline def setInvalidDataFormat(value: SchemaGoogleCloudDataplexV1ActionInvalidDataFormat): Self = StObject.set(x, "invalidDataFormat", value.asInstanceOf[js.Any])
    
    inline def setInvalidDataFormatUndefined: Self = StObject.set(x, "invalidDataFormat", js.undefined)
    
    inline def setInvalidDataOrganization(value: SchemaGoogleCloudDataplexV1ActionInvalidDataOrganization): Self = StObject.set(x, "invalidDataOrganization", value.asInstanceOf[js.Any])
    
    inline def setInvalidDataOrganizationUndefined: Self = StObject.set(x, "invalidDataOrganization", js.undefined)
    
    inline def setInvalidDataPartition(value: SchemaGoogleCloudDataplexV1ActionInvalidDataPartition): Self = StObject.set(x, "invalidDataPartition", value.asInstanceOf[js.Any])
    
    inline def setInvalidDataPartitionUndefined: Self = StObject.set(x, "invalidDataPartition", js.undefined)
    
    inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueNull: Self = StObject.set(x, "issue", null)
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setLake(value: String): Self = StObject.set(x, "lake", value.asInstanceOf[js.Any])
    
    inline def setLakeNull: Self = StObject.set(x, "lake", null)
    
    inline def setLakeUndefined: Self = StObject.set(x, "lake", js.undefined)
    
    inline def setMissingData(value: SchemaGoogleCloudDataplexV1ActionMissingData): Self = StObject.set(x, "missingData", value.asInstanceOf[js.Any])
    
    inline def setMissingDataUndefined: Self = StObject.set(x, "missingData", js.undefined)
    
    inline def setMissingResource(value: SchemaGoogleCloudDataplexV1ActionMissingResource): Self = StObject.set(x, "missingResource", value.asInstanceOf[js.Any])
    
    inline def setMissingResourceUndefined: Self = StObject.set(x, "missingResource", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUnauthorizedResource(value: SchemaGoogleCloudDataplexV1ActionUnauthorizedResource): Self = StObject.set(x, "unauthorizedResource", value.asInstanceOf[js.Any])
    
    inline def setUnauthorizedResourceUndefined: Self = StObject.set(x, "unauthorizedResource", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
