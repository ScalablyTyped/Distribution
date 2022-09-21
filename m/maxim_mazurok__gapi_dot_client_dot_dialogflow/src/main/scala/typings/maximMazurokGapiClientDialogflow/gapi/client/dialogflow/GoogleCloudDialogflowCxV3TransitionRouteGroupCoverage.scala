package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TransitionRouteGroupCoverage extends StObject {
  
  /** The percent of transition routes in all the transition route groups that are covered. */
  var coverageScore: js.UndefOr[Double] = js.undefined
  
  /** Transition route group coverages. */
  var coverages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage]] = js.undefined
}
object GoogleCloudDialogflowCxV3TransitionRouteGroupCoverage {
  
  inline def apply(): GoogleCloudDialogflowCxV3TransitionRouteGroupCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TransitionRouteGroupCoverage]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TransitionRouteGroupCoverage](x: Self) {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setCoverages(value: js.Array[GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage]): Self = StObject.set(x, "coverages", value.asInstanceOf[js.Any])
    
    inline def setCoveragesUndefined: Self = StObject.set(x, "coverages", js.undefined)
    
    inline def setCoveragesVarargs(value: GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage*): Self = StObject.set(x, "coverages", js.Array(value*))
  }
}
