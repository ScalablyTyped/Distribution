package typings.googleapis.ideahubV1betaMod.ideahubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSearchIdeahubV1betaTopicState extends StObject {
  
  /**
    * Whether the topic is dismissed.
    */
  var dismissed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Unique identifier for the topic state. Format: platforms/{platform\}/properties/{property\}/topicStates/{topic_state\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the topic is saved.
    */
  var saved: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleSearchIdeahubV1betaTopicState {
  
  inline def apply(): SchemaGoogleSearchIdeahubV1betaTopicState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSearchIdeahubV1betaTopicState]
  }
  
  extension [Self <: SchemaGoogleSearchIdeahubV1betaTopicState](x: Self) {
    
    inline def setDismissed(value: Boolean): Self = StObject.set(x, "dismissed", value.asInstanceOf[js.Any])
    
    inline def setDismissedNull: Self = StObject.set(x, "dismissed", null)
    
    inline def setDismissedUndefined: Self = StObject.set(x, "dismissed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSaved(value: Boolean): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
    
    inline def setSavedNull: Self = StObject.set(x, "saved", null)
    
    inline def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
  }
}
