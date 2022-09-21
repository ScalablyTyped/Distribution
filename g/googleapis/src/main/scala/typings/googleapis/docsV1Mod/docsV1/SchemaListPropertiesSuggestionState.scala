package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPropertiesSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields on the corresponding NestingLevel in nesting_levels have been changed in this suggestion. The nesting level suggestion states are returned in ascending order of the nesting level with the least nested returned first.
    */
  var nestingLevelsSuggestionStates: js.UndefOr[js.Array[SchemaNestingLevelSuggestionState]] = js.undefined
}
object SchemaListPropertiesSuggestionState {
  
  inline def apply(): SchemaListPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPropertiesSuggestionState]
  }
  
  extension [Self <: SchemaListPropertiesSuggestionState](x: Self) {
    
    inline def setNestingLevelsSuggestionStates(value: js.Array[SchemaNestingLevelSuggestionState]): Self = StObject.set(x, "nestingLevelsSuggestionStates", value.asInstanceOf[js.Any])
    
    inline def setNestingLevelsSuggestionStatesUndefined: Self = StObject.set(x, "nestingLevelsSuggestionStates", js.undefined)
    
    inline def setNestingLevelsSuggestionStatesVarargs(value: SchemaNestingLevelSuggestionState*): Self = StObject.set(x, "nestingLevelsSuggestionStates", js.Array(value*))
  }
}
