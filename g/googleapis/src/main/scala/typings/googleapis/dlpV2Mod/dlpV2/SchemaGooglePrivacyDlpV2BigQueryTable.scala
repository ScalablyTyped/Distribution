package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message defining the location of a BigQuery table. A table is uniquely
  * identified  by its project_id, dataset_id, and table_name. Within a query a
  * table is often referenced with a string in the format of:
  * `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;` or
  * `&lt;project_id&gt;.&lt;dataset_id&gt;.&lt;table_id&gt;`.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BigQueryTable extends StObject {
  
  /**
    * Dataset ID of the table.
    */
  var datasetId: js.UndefOr[String] = js.native
  
  /**
    * The Google Cloud Platform project ID of the project containing the table.
    * If omitted, project ID is inferred from the API call.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Name of the table.
    */
  var tableId: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2BigQueryTable {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2BigQueryTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryTable]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BigQueryTableMutableBuilder[Self <: SchemaGooglePrivacyDlpV2BigQueryTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
