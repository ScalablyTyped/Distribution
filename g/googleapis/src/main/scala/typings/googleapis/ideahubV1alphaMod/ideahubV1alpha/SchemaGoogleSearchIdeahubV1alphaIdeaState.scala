package typings.googleapis.ideahubV1alphaMod.ideahubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSearchIdeahubV1alphaIdeaState extends StObject {
  
  /**
    * Whether the idea is dismissed.
    */
  var dismissed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Unique identifier for the idea state. Format: platforms/{platform\}/properties/{property\}/ideaStates/{idea_state\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the idea is saved.
    */
  var saved: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleSearchIdeahubV1alphaIdeaState {
  
  inline def apply(): SchemaGoogleSearchIdeahubV1alphaIdeaState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSearchIdeahubV1alphaIdeaState]
  }
  
  extension [Self <: SchemaGoogleSearchIdeahubV1alphaIdeaState](x: Self) {
    
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
