package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TransitionCoverage extends StObject {
  
  /** The percent of transitions in the agent that are covered. */
  var coverageScore: js.UndefOr[Double] = js.undefined
  
  /** The list of Transitions present in the agent. */
  var transitions: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3TransitionCoverageTransition]] = js.undefined
}
object GoogleCloudDialogflowCxV3TransitionCoverage {
  
  inline def apply(): GoogleCloudDialogflowCxV3TransitionCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TransitionCoverage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3TransitionCoverage] (val x: Self) extends AnyVal {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setTransitions(value: js.Array[GoogleCloudDialogflowCxV3TransitionCoverageTransition]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setTransitionsVarargs(value: GoogleCloudDialogflowCxV3TransitionCoverageTransition*): Self = StObject.set(x, "transitions", js.Array(value*))
  }
}
