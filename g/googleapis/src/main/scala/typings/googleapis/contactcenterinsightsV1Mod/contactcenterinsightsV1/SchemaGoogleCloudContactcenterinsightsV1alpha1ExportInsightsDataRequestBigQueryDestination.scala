package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1alpha1ExportInsightsDataRequestBigQueryDestination extends StObject {
  
  /**
    * Required. The name of the BigQuery dataset that the snapshot result should be exported to. If this dataset does not exist, the export call returns an INVALID_ARGUMENT error.
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A project ID or number. If specified, then export will attempt to write data to this project instead of the resource project. Otherwise, the resource project will be used.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The BigQuery table name to which the insights data should be written. If this table does not exist, the export call returns an INVALID_ARGUMENT error.
    */
  var table: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1alpha1ExportInsightsDataRequestBigQueryDestination {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1alpha1ExportInsightsDataRequestBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1alpha1ExportInsightsDataRequestBigQueryDestination]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1alpha1ExportInsightsDataRequestBigQueryDestination](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
