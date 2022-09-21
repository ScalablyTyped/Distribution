package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. FeedbackMessage resource parent, format: projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage] = js.undefined
}
object ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate {
  
  inline def apply(): ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
