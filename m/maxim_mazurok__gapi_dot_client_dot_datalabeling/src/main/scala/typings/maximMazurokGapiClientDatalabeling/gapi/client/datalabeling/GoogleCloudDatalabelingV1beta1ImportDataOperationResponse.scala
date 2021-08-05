package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ImportDataOperationResponse extends StObject {
  
  /** Ouptut only. The name of imported dataset. */
  var dataset: js.UndefOr[String] = js.undefined
  
  /** Output only. Number of examples imported successfully. */
  var importCount: js.UndefOr[Double] = js.undefined
  
  /** Output only. Total number of examples requested to import */
  var totalCount: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ImportDataOperationResponse {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ImportDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImportDataOperationResponse]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ImportDataOperationResponse](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setImportCount(value: Double): Self = StObject.set(x, "importCount", value.asInstanceOf[js.Any])
    
    inline def setImportCountUndefined: Self = StObject.set(x, "importCount", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
