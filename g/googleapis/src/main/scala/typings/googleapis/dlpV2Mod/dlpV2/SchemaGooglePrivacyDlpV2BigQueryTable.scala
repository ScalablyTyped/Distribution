package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message defining the location of a BigQuery table. A table is uniquely
  * identified  by its project_id, dataset_id, and table_name. Within a query a
  * table is often referenced with a string in the format of:
  * `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;` or
  * `&lt;project_id&gt;.&lt;dataset_id&gt;.&lt;table_id&gt;`.
  */
trait SchemaGooglePrivacyDlpV2BigQueryTable extends StObject {
  
  /**
    * Dataset ID of the table.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * The Google Cloud Platform project ID of the project containing the table.
    * If omitted, project ID is inferred from the API call.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the table.
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2BigQueryTable {
  
  inline def apply(): SchemaGooglePrivacyDlpV2BigQueryTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryTable]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2BigQueryTable](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
