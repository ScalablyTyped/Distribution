package typings.googleapis.ideahubV1betaMod.ideahubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSearchIdeahubV1betaIdeaActivity extends StObject {
  
  /**
    * The Idea IDs for this entry. If empty, topics should be set.
    */
  var ideas: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Unique identifier for the idea activity. The name is ignored when creating an idea activity. Format: platforms/{platform\}/properties/{property\}/ideaActivities/{idea_activity\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Topic IDs for this entry. If empty, ideas should be set.
    */
  var topics: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The type of activity performed.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The uri the activity relates to.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSearchIdeahubV1betaIdeaActivity {
  
  inline def apply(): SchemaGoogleSearchIdeahubV1betaIdeaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSearchIdeahubV1betaIdeaActivity]
  }
  
  extension [Self <: SchemaGoogleSearchIdeahubV1betaIdeaActivity](x: Self) {
    
    inline def setIdeas(value: js.Array[String]): Self = StObject.set(x, "ideas", value.asInstanceOf[js.Any])
    
    inline def setIdeasNull: Self = StObject.set(x, "ideas", null)
    
    inline def setIdeasUndefined: Self = StObject.set(x, "ideas", js.undefined)
    
    inline def setIdeasVarargs(value: String*): Self = StObject.set(x, "ideas", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsNull: Self = StObject.set(x, "topics", null)
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
