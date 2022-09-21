package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode extends StObject {
  
  /** Indicates a transition to a Flow. Only some fields such as name and displayname will be set. */
  var flow: js.UndefOr[GoogleCloudDialogflowCxV3Flow] = js.undefined
  
  /** Indicates a transition to a Page. Only some fields such as name and displayname will be set. */
  var page: js.UndefOr[GoogleCloudDialogflowCxV3Page] = js.undefined
}
object GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode {
  
  inline def apply(): GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode](x: Self) {
    
    inline def setFlow(value: GoogleCloudDialogflowCxV3Flow): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setPage(value: GoogleCloudDialogflowCxV3Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
