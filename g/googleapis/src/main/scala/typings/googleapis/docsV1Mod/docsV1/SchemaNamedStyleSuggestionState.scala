package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggestion state of a NamedStyle message.
  */
@js.native
trait SchemaNamedStyleSuggestionState extends StObject {
  
  /**
    * The named style type that this suggestion state corresponds to.  This
    * field is provided as a convenience for matching the
    * NamedStyleSuggestionState with its corresponding NamedStyle.
    */
  var namedStyleType: js.UndefOr[String] = js.native
  
  /**
    * A mask that indicates which of the fields in paragraph style have been
    * changed in this suggestion.
    */
  var paragraphStyleSuggestionState: js.UndefOr[SchemaParagraphStyleSuggestionState] = js.native
  
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}
object SchemaNamedStyleSuggestionState {
  
  @scala.inline
  def apply(): SchemaNamedStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedStyleSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaNamedStyleSuggestionStateMutableBuilder[Self <: SchemaNamedStyleSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
    
    @scala.inline
    def setParagraphStyleSuggestionState(value: SchemaParagraphStyleSuggestionState): Self = StObject.set(x, "paragraphStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStyleSuggestionStateUndefined: Self = StObject.set(x, "paragraphStyleSuggestionState", js.undefined)
    
    @scala.inline
    def setTextStyleSuggestionState(value: SchemaTextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
  }
}
