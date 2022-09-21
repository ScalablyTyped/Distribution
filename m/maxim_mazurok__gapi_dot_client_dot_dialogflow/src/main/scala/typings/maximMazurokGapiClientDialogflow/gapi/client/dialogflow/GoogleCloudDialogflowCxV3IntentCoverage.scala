package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3IntentCoverage extends StObject {
  
  /** The percent of intents in the agent that are covered. */
  var coverageScore: js.UndefOr[Double] = js.undefined
  
  /** The list of Intents present in the agent */
  var intents: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3IntentCoverageIntent]] = js.undefined
}
object GoogleCloudDialogflowCxV3IntentCoverage {
  
  inline def apply(): GoogleCloudDialogflowCxV3IntentCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3IntentCoverage]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3IntentCoverage](x: Self) {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setIntents(value: js.Array[GoogleCloudDialogflowCxV3IntentCoverageIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: GoogleCloudDialogflowCxV3IntentCoverageIntent*): Self = StObject.set(x, "intents", js.Array(value*))
  }
}
