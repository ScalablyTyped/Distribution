package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulletSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to the list_id.
    */
  var listIdSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to the nesting_level.
    */
  var nestingLevelSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A mask that indicates which of the fields in text style have been changed in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.undefined
}
object SchemaBulletSuggestionState {
  
  inline def apply(): SchemaBulletSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulletSuggestionState]
  }
  
  extension [Self <: SchemaBulletSuggestionState](x: Self) {
    
    inline def setListIdSuggested(value: Boolean): Self = StObject.set(x, "listIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setListIdSuggestedNull: Self = StObject.set(x, "listIdSuggested", null)
    
    inline def setListIdSuggestedUndefined: Self = StObject.set(x, "listIdSuggested", js.undefined)
    
    inline def setNestingLevelSuggested(value: Boolean): Self = StObject.set(x, "nestingLevelSuggested", value.asInstanceOf[js.Any])
    
    inline def setNestingLevelSuggestedNull: Self = StObject.set(x, "nestingLevelSuggested", null)
    
    inline def setNestingLevelSuggestedUndefined: Self = StObject.set(x, "nestingLevelSuggested", js.undefined)
    
    inline def setTextStyleSuggestionState(value: SchemaTextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
  }
}
