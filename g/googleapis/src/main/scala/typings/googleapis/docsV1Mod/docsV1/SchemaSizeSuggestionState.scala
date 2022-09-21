package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSizeSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to height.
    */
  var heightSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSizeSuggestionState {
  
  inline def apply(): SchemaSizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSizeSuggestionState]
  }
  
  extension [Self <: SchemaSizeSuggestionState](x: Self) {
    
    inline def setHeightSuggested(value: Boolean): Self = StObject.set(x, "heightSuggested", value.asInstanceOf[js.Any])
    
    inline def setHeightSuggestedNull: Self = StObject.set(x, "heightSuggested", null)
    
    inline def setHeightSuggestedUndefined: Self = StObject.set(x, "heightSuggested", js.undefined)
    
    inline def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
    
    inline def setWidthSuggestedNull: Self = StObject.set(x, "widthSuggested", null)
    
    inline def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
  }
}
