package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base Shading have been
  * changed in this suggested change. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaShadingSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to the Shading.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
}
object SchemaShadingSuggestionState {
  
  @scala.inline
  def apply(): SchemaShadingSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShadingSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaShadingSuggestionStateMutableBuilder[Self <: SchemaShadingSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
  }
}
