package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverageTransitionNode extends StObject {
  
  /**
    * Indicates a transition to a Flow. Only some fields such as name and displayname will be set.
    */
  var flow: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.undefined
  
  /**
    * Indicates a transition to a Page. Only some fields such as name and displayname will be set.
    */
  var page: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1Page] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverageTransitionNode {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverageTransitionNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverageTransitionNode]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverageTransitionNode](x: Self) {
    
    inline def setFlow(value: SchemaGoogleCloudDialogflowCxV3beta1Flow): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setPage(value: SchemaGoogleCloudDialogflowCxV3beta1Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
