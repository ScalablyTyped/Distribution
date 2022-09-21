package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3TransitionCoverageTransition extends StObject {
  
  /**
    * Whether or not the transition is covered by at least one of the agent's test cases.
    */
  var covered: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Event handler.
    */
  var eventHandler: js.UndefOr[SchemaGoogleCloudDialogflowCxV3EventHandler] = js.undefined
  
  /**
    * The index of a transition in the transition list. Starting from 0.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The start node of a transition.
    */
  var source: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TransitionCoverageTransitionNode] = js.undefined
  
  /**
    * The end node of a transition.
    */
  var target: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TransitionCoverageTransitionNode] = js.undefined
  
  /**
    * Intent route or condition route.
    */
  var transitionRoute: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TransitionRoute] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3TransitionCoverageTransition {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3TransitionCoverageTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3TransitionCoverageTransition]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3TransitionCoverageTransition](x: Self) {
    
    inline def setCovered(value: Boolean): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
    
    inline def setCoveredNull: Self = StObject.set(x, "covered", null)
    
    inline def setCoveredUndefined: Self = StObject.set(x, "covered", js.undefined)
    
    inline def setEventHandler(value: SchemaGoogleCloudDialogflowCxV3EventHandler): Self = StObject.set(x, "eventHandler", value.asInstanceOf[js.Any])
    
    inline def setEventHandlerUndefined: Self = StObject.set(x, "eventHandler", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSource(value: SchemaGoogleCloudDialogflowCxV3TransitionCoverageTransitionNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: SchemaGoogleCloudDialogflowCxV3TransitionCoverageTransitionNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTransitionRoute(value: SchemaGoogleCloudDialogflowCxV3TransitionRoute): Self = StObject.set(x, "transitionRoute", value.asInstanceOf[js.Any])
    
    inline def setTransitionRouteUndefined: Self = StObject.set(x, "transitionRoute", js.undefined)
  }
}
