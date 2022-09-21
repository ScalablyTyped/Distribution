package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverage extends StObject {
  
  /**
    * The percent of transitions in the agent that are covered.
    */
  var coverageScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The list of Transitions present in the agent.
    */
  var transitions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverageTransition]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverage {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverage](x: Self) {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreNull: Self = StObject.set(x, "coverageScore", null)
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setTransitions(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverageTransition]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setTransitionsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverageTransition*): Self = StObject.set(x, "transitions", js.Array(value*))
  }
}
