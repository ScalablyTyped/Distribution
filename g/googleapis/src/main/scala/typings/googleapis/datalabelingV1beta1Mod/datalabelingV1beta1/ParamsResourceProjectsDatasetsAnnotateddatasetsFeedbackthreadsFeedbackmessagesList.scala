package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A token identifying a page of results for the server to return. Typically obtained by ListFeedbackMessages.next_page_token of the previous [DataLabelingService.ListFeedbackMessages] call. Return first page if empty.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. FeedbackMessage resource parent. Format: "projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}"
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList {
  
  inline def apply(): ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
