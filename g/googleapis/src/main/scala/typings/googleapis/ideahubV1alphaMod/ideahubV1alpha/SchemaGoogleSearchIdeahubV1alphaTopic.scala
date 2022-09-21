package typings.googleapis.ideahubV1alphaMod.ideahubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSearchIdeahubV1alphaTopic extends StObject {
  
  /**
    * String displayed to the creator indicating the name of the Topic.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mID of the topic.
    */
  var mid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for the topic. Format: topics/{topic\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSearchIdeahubV1alphaTopic {
  
  inline def apply(): SchemaGoogleSearchIdeahubV1alphaTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSearchIdeahubV1alphaTopic]
  }
  
  extension [Self <: SchemaGoogleSearchIdeahubV1alphaTopic](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    inline def setMidNull: Self = StObject.set(x, "mid", null)
    
    inline def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
