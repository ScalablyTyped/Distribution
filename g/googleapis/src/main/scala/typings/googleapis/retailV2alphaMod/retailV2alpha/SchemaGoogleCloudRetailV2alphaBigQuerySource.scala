package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaBigQuerySource extends StObject {
  
  /**
    * The schema to use when parsing the data from the source. Supported values for product imports: * `product` (default): One JSON Product per line. Each product must have a valid Product.id. * `product_merchant_center`: See [Importing catalog data from Merchant Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mc). Supported values for user events imports: * `user_event` (default): One JSON UserEvent per line. * `user_event_ga360`: The schema is available here: https://support.google.com/analytics/answer/3437719. * `user_event_ga4`: The schema is available here: https://support.google.com/analytics/answer/7029846. Supported values for auto-completion imports: * `suggestions` (default): One JSON completion suggestion per line. * `denylist`: One JSON deny suggestion per line. * `allowlist`: One JSON allow suggestion per line.
    */
  var dataSchema: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The BigQuery data set to copy the data from with a length limit of 1,024 characters.
    */
  var datasetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Intermediate Cloud Storage directory used for the import with a length limit of 2,000 characters. Can be specified if one wants to have the BigQuery export to a specific Cloud Storage directory.
    */
  var gcsStagingDir: js.UndefOr[String | Null] = js.undefined
  
  /**
    * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format. Only supported in ImportProductsRequest.
    */
  var partitionDate: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * The project ID (can be project # or ID) that the BigQuery source is in with a length limit of 128 characters. If not specified, inherits the project ID from the parent request.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The BigQuery table to copy the data from with a length limit of 1,024 characters.
    */
  var tableId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaBigQuerySource {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaBigQuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaBigQuerySource]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaBigQuerySource](x: Self) {
    
    inline def setDataSchema(value: String): Self = StObject.set(x, "dataSchema", value.asInstanceOf[js.Any])
    
    inline def setDataSchemaNull: Self = StObject.set(x, "dataSchema", null)
    
    inline def setDataSchemaUndefined: Self = StObject.set(x, "dataSchema", js.undefined)
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdNull: Self = StObject.set(x, "datasetId", null)
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setGcsStagingDir(value: String): Self = StObject.set(x, "gcsStagingDir", value.asInstanceOf[js.Any])
    
    inline def setGcsStagingDirNull: Self = StObject.set(x, "gcsStagingDir", null)
    
    inline def setGcsStagingDirUndefined: Self = StObject.set(x, "gcsStagingDir", js.undefined)
    
    inline def setPartitionDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "partitionDate", value.asInstanceOf[js.Any])
    
    inline def setPartitionDateUndefined: Self = StObject.set(x, "partitionDate", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdNull: Self = StObject.set(x, "tableId", null)
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
