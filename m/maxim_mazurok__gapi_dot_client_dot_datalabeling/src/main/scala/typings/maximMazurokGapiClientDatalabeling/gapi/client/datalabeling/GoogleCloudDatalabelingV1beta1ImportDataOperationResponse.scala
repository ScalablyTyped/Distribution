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
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImportDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImportDataOperationResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImportDataOperationResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ImportDataOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setImportCount(value: Double): Self = StObject.set(x, "importCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportCountUndefined: Self = StObject.set(x, "importCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
