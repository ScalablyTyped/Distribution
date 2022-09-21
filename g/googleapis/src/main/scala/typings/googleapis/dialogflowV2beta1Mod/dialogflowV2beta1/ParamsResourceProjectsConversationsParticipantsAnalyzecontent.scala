package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationsParticipantsAnalyzecontent
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the participant this text comes from. Format: `projects//locations//conversations//participants/`.
    */
  var participant: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1AnalyzeContentRequest] = js.undefined
}
object ParamsResourceProjectsConversationsParticipantsAnalyzecontent {
  
  inline def apply(): ParamsResourceProjectsConversationsParticipantsAnalyzecontent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationsParticipantsAnalyzecontent]
  }
  
  extension [Self <: ParamsResourceProjectsConversationsParticipantsAnalyzecontent](x: Self) {
    
    inline def setParticipant(value: String): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1AnalyzeContentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
