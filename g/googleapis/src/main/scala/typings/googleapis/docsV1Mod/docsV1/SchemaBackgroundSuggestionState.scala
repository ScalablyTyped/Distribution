package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base Background have been
  * changed in this suggestion. For any field set to true, the Backgound has a
  * new suggested value.
  */
@js.native
trait SchemaBackgroundSuggestionState extends StObject {
  
  /**
    * Indicates whether the current background color has been modified in this
    * suggestion.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
}
object SchemaBackgroundSuggestionState {
  
  @scala.inline
  def apply(): SchemaBackgroundSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackgroundSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaBackgroundSuggestionStateMutableBuilder[Self <: SchemaBackgroundSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
  }
}
