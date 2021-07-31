package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1CreateDatasetRequest extends StObject {
  
  /** Required. The dataset to be created. */
  var dataset: js.UndefOr[GoogleCloudDatalabelingV1beta1Dataset] = js.undefined
}
object GoogleCloudDatalabelingV1beta1CreateDatasetRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1CreateDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CreateDatasetRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1CreateDatasetRequestMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1CreateDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: GoogleCloudDatalabelingV1beta1Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
  }
}
