package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutput extends StObject {
  
  /** The Page on which the utterance was spoken. Only name and displayName will be set. */
  var currentPage: js.UndefOr[GoogleCloudDialogflowCxV3beta1Page] = js.undefined
  
  /** Required. Input only. The diagnostic info output for the turn. Required to calculate the testing coverage. */
  var diagnosticInfo: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Output only. If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any. */
  var differences: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1TestRunDifference]] = js.undefined
  
  /** The session parameters available to the bot at this point. */
  var sessionParameters: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Response error from the agent in the test result. If set, other output is empty. */
  var status: js.UndefOr[GoogleRpcStatus] = js.undefined
  
  /** The text responses from the agent for the turn. */
  var textResponses: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessageText]] = js.undefined
  
  /** The Intent that triggered the response. Only name and displayName will be set. */
  var triggeredIntent: js.UndefOr[GoogleCloudDialogflowCxV3beta1Intent] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutput {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutput] (val x: Self) extends AnyVal {
    
    inline def setCurrentPage(value: GoogleCloudDialogflowCxV3beta1Page): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setDiagnosticInfo(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
    inline def setDifferences(value: js.Array[GoogleCloudDialogflowCxV3beta1TestRunDifference]): Self = StObject.set(x, "differences", value.asInstanceOf[js.Any])
    
    inline def setDifferencesUndefined: Self = StObject.set(x, "differences", js.undefined)
    
    inline def setDifferencesVarargs(value: GoogleCloudDialogflowCxV3beta1TestRunDifference*): Self = StObject.set(x, "differences", js.Array(value*))
    
    inline def setSessionParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "sessionParameters", value.asInstanceOf[js.Any])
    
    inline def setSessionParametersUndefined: Self = StObject.set(x, "sessionParameters", js.undefined)
    
    inline def setStatus(value: GoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTextResponses(value: js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessageText]): Self = StObject.set(x, "textResponses", value.asInstanceOf[js.Any])
    
    inline def setTextResponsesUndefined: Self = StObject.set(x, "textResponses", js.undefined)
    
    inline def setTextResponsesVarargs(value: GoogleCloudDialogflowCxV3beta1ResponseMessageText*): Self = StObject.set(x, "textResponses", js.Array(value*))
    
    inline def setTriggeredIntent(value: GoogleCloudDialogflowCxV3beta1Intent): Self = StObject.set(x, "triggeredIntent", value.asInstanceOf[js.Any])
    
    inline def setTriggeredIntentUndefined: Self = StObject.set(x, "triggeredIntent", js.undefined)
  }
}
