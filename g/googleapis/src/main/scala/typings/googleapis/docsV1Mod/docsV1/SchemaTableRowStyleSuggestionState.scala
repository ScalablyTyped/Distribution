package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableRowStyleSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to min_row_height.
    */
  var minRowHeightSuggested: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTableRowStyleSuggestionState {
  
  inline def apply(): SchemaTableRowStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRowStyleSuggestionState]
  }
  
  extension [Self <: SchemaTableRowStyleSuggestionState](x: Self) {
    
    inline def setMinRowHeightSuggested(value: Boolean): Self = StObject.set(x, "minRowHeightSuggested", value.asInstanceOf[js.Any])
    
    inline def setMinRowHeightSuggestedNull: Self = StObject.set(x, "minRowHeightSuggested", null)
    
    inline def setMinRowHeightSuggestedUndefined: Self = StObject.set(x, "minRowHeightSuggested", js.undefined)
  }
}
