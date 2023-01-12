package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedAssistantFeedbackContextFeedbackChip extends StObject {
  
  /** What type of chip to display */
  var feedbackChipType: js.UndefOr[String] = js.undefined
  
  /** Whether the chip has been selected */
  var state: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedAssistantFeedbackContextFeedbackChip {
  
  inline def apply(): AppsDynamiteSharedAssistantFeedbackContextFeedbackChip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedAssistantFeedbackContextFeedbackChip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedAssistantFeedbackContextFeedbackChip] (val x: Self) extends AnyVal {
    
    inline def setFeedbackChipType(value: String): Self = StObject.set(x, "feedbackChipType", value.asInstanceOf[js.Any])
    
    inline def setFeedbackChipTypeUndefined: Self = StObject.set(x, "feedbackChipType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
