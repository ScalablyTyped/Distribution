package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuggestionClusterProto extends StObject {
  
  /**
    * Category in which these types of suggestions should appear. Always set.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A sequence of suggestions. All of the suggestions within a cluster must have the same SuggestionPriority and belong to the same SuggestionCategory. Suggestions with the same screenshot URL should be adjacent.
    */
  var suggestions: js.UndefOr[js.Array[SchemaSuggestionProto]] = js.undefined
}
object SchemaSuggestionClusterProto {
  
  inline def apply(): SchemaSuggestionClusterProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestionClusterProto]
  }
  
  extension [Self <: SchemaSuggestionClusterProto](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setSuggestions(value: js.Array[SchemaSuggestionProto]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: SchemaSuggestionProto*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
