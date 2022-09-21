package typings.googleapis.ideahubV1betaMod.ideahubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSearchIdeahubV1betaIdea extends StObject {
  
  /**
    * Unique identifier for the idea. Format: ideas/{ideaId\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The idea’s text.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Topics that match the idea.
    */
  var topics: js.UndefOr[js.Array[SchemaGoogleSearchIdeahubV1betaTopic]] = js.undefined
}
object SchemaGoogleSearchIdeahubV1betaIdea {
  
  inline def apply(): SchemaGoogleSearchIdeahubV1betaIdea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSearchIdeahubV1betaIdea]
  }
  
  extension [Self <: SchemaGoogleSearchIdeahubV1betaIdea](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTopics(value: js.Array[SchemaGoogleSearchIdeahubV1betaTopic]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: SchemaGoogleSearchIdeahubV1betaTopic*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
