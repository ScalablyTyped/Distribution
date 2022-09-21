package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the FeedbackMessage that is going to be deleted. Format: 'projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}/feedbackMessages/{feedback_message_id\}'.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete {
  
  inline def apply(): ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
