package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the feedback. Format: 'projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}/feedbackMessages/{feedback_message_id\}'.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet {
  
  inline def apply(): ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
