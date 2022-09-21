package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1IntentCoverage extends StObject {
  
  /**
    * The percent of intents in the agent that are covered.
    */
  var coverageScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The list of Intents present in the agent
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1IntentCoverageIntent]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1IntentCoverage {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1IntentCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1IntentCoverage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1IntentCoverage](x: Self) {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreNull: Self = StObject.set(x, "coverageScore", null)
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setIntents(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1IntentCoverageIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1IntentCoverageIntent*): Self = StObject.set(x, "intents", js.Array(value*))
  }
}
