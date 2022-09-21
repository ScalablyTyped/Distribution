package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3IntentCoverage extends StObject {
  
  /**
    * The percent of intents in the agent that are covered.
    */
  var coverageScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The list of Intents present in the agent
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3IntentCoverageIntent]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3IntentCoverage {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3IntentCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3IntentCoverage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3IntentCoverage](x: Self) {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreNull: Self = StObject.set(x, "coverageScore", null)
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setIntents(value: js.Array[SchemaGoogleCloudDialogflowCxV3IntentCoverageIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: SchemaGoogleCloudDialogflowCxV3IntentCoverageIntent*): Self = StObject.set(x, "intents", js.Array(value*))
  }
}
