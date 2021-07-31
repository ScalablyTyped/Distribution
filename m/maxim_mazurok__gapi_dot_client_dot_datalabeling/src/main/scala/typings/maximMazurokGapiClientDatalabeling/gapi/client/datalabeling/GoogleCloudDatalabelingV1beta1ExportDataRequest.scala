package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ExportDataRequest extends StObject {
  
  /**
    * Required. Annotated dataset resource name. DataItem in Dataset and their annotations in specified annotated dataset will be exported. It's in format of
    * projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/ {annotated_dataset_id}
    */
  var annotatedDataset: js.UndefOr[String] = js.undefined
  
  /** Optional. Filter is not supported at this moment. */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Required. Specify the output destination. */
  var outputConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1OutputConfig] = js.undefined
  
  /** Email of the user who started the export task and should be notified by email. If empty no notification will be sent. */
  var userEmailAddress: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ExportDataRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ExportDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ExportDataRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ExportDataRequestMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ExportDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotatedDataset(value: String): Self = StObject.set(x, "annotatedDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotatedDatasetUndefined: Self = StObject.set(x, "annotatedDataset", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: GoogleCloudDatalabelingV1beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    @scala.inline
    def setUserEmailAddress(value: String): Self = StObject.set(x, "userEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailAddressUndefined: Self = StObject.set(x, "userEmailAddress", js.undefined)
  }
}
