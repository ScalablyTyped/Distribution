package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage extends StObject {
  
  /**
    * The percent of transition routes in all the transition route groups that are covered.
    */
  var coverageScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Transition route group coverages.
    */
  var coverages: js.UndefOr[
    js.Array[SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage]
  ] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage](x: Self) {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreNull: Self = StObject.set(x, "coverageScore", null)
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setCoverages(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage]): Self = StObject.set(x, "coverages", value.asInstanceOf[js.Any])
    
    inline def setCoveragesUndefined: Self = StObject.set(x, "coverages", js.undefined)
    
    inline def setCoveragesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage*): Self = StObject.set(x, "coverages", js.Array(value*))
  }
}
