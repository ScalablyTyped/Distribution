package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1AnswerFeedback extends StObject {
  
  /**
    * Indicates whether an answer or item was clicked by the human agent.
    */
  var clicked: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The correctness level of an answer.
    */
  var correctnessLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether an answer or item was displayed to the human agent in the agent desktop UI.
    */
  var displayed: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1AnswerFeedback {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1AnswerFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1AnswerFeedback]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1AnswerFeedback](x: Self) {
    
    inline def setClicked(value: Boolean): Self = StObject.set(x, "clicked", value.asInstanceOf[js.Any])
    
    inline def setClickedNull: Self = StObject.set(x, "clicked", null)
    
    inline def setClickedUndefined: Self = StObject.set(x, "clicked", js.undefined)
    
    inline def setCorrectnessLevel(value: String): Self = StObject.set(x, "correctnessLevel", value.asInstanceOf[js.Any])
    
    inline def setCorrectnessLevelNull: Self = StObject.set(x, "correctnessLevel", null)
    
    inline def setCorrectnessLevelUndefined: Self = StObject.set(x, "correctnessLevel", js.undefined)
    
    inline def setDisplayed(value: Boolean): Self = StObject.set(x, "displayed", value.asInstanceOf[js.Any])
    
    inline def setDisplayedNull: Self = StObject.set(x, "displayed", null)
    
    inline def setDisplayedUndefined: Self = StObject.set(x, "displayed", js.undefined)
  }
}
