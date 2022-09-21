package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1DialogflowInteractionData extends StObject {
  
  /**
    * The confidence of the match ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Dialogflow intent resource path. Format: projects/{project\}/agent/{agent\}/intents/{intent\}
    */
  var dialogflowIntentId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1DialogflowInteractionData {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1DialogflowInteractionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1DialogflowInteractionData]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1DialogflowInteractionData](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setDialogflowIntentId(value: String): Self = StObject.set(x, "dialogflowIntentId", value.asInstanceOf[js.Any])
    
    inline def setDialogflowIntentIdNull: Self = StObject.set(x, "dialogflowIntentId", null)
    
    inline def setDialogflowIntentIdUndefined: Self = StObject.set(x, "dialogflowIntentId", js.undefined)
  }
}
