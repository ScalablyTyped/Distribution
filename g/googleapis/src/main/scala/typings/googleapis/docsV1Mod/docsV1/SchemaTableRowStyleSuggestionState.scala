package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base TableRowStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaTableRowStyleSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to min_row_height.
    */
  var minRowHeightSuggested: js.UndefOr[Boolean] = js.native
}
object SchemaTableRowStyleSuggestionState {
  
  @scala.inline
  def apply(): SchemaTableRowStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRowStyleSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaTableRowStyleSuggestionStateMutableBuilder[Self <: SchemaTableRowStyleSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinRowHeightSuggested(value: Boolean): Self = StObject.set(x, "minRowHeightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowHeightSuggestedUndefined: Self = StObject.set(x, "minRowHeightSuggested", js.undefined)
  }
}
