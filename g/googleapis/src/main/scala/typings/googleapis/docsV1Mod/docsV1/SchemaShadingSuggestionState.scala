package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShadingSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to the Shading.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaShadingSuggestionState {
  
  inline def apply(): SchemaShadingSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShadingSuggestionState]
  }
  
  extension [Self <: SchemaShadingSuggestionState](x: Self) {
    
    inline def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorSuggestedNull: Self = StObject.set(x, "backgroundColorSuggested", null)
    
    inline def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
  }
}
