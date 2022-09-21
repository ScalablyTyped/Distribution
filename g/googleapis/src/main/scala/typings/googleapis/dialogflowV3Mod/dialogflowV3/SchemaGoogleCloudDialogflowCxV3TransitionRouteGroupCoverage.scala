package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverage extends StObject {
  
  /**
    * The percent of transition routes in all the transition route groups that are covered.
    */
  var coverageScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Transition route group coverages.
    */
  var coverages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverage {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverage](x: Self) {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreNull: Self = StObject.set(x, "coverageScore", null)
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setCoverages(value: js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage]): Self = StObject.set(x, "coverages", value.asInstanceOf[js.Any])
    
    inline def setCoveragesUndefined: Self = StObject.set(x, "coverages", js.undefined)
    
    inline def setCoveragesVarargs(value: SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage*): Self = StObject.set(x, "coverages", js.Array(value*))
  }
}
