package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base Size have been
  * changed in this suggestion. For any field set to true, the Size has a new
  * suggested value.
  */
trait SchemaSizeSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to height.
    */
  var heightSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean] = js.undefined
}
object SchemaSizeSuggestionState {
  
  inline def apply(): SchemaSizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSizeSuggestionState]
  }
  
  extension [Self <: SchemaSizeSuggestionState](x: Self) {
    
    inline def setHeightSuggested(value: Boolean): Self = StObject.set(x, "heightSuggested", value.asInstanceOf[js.Any])
    
    inline def setHeightSuggestedUndefined: Self = StObject.set(x, "heightSuggested", js.undefined)
    
    inline def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
    
    inline def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
  }
}
