package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base NestingLevel have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaNestingLevelSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to bullet_alignment.
    */
  var bulletAlignmentSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to glyph_format.
    */
  var glyphFormatSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to glyph_symbol.
    */
  var glyphSymbolSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to glyph_type.
    */
  var glyphTypeSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to indent_first_line.
    */
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to indent_start.
    */
  var indentStartSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to start_number.
    */
  var startNumberSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}
object SchemaNestingLevelSuggestionState {
  
  @scala.inline
  def apply(): SchemaNestingLevelSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNestingLevelSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaNestingLevelSuggestionStateMutableBuilder[Self <: SchemaNestingLevelSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulletAlignmentSuggested(value: Boolean): Self = StObject.set(x, "bulletAlignmentSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletAlignmentSuggestedUndefined: Self = StObject.set(x, "bulletAlignmentSuggested", js.undefined)
    
    @scala.inline
    def setGlyphFormatSuggested(value: Boolean): Self = StObject.set(x, "glyphFormatSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphFormatSuggestedUndefined: Self = StObject.set(x, "glyphFormatSuggested", js.undefined)
    
    @scala.inline
    def setGlyphSymbolSuggested(value: Boolean): Self = StObject.set(x, "glyphSymbolSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphSymbolSuggestedUndefined: Self = StObject.set(x, "glyphSymbolSuggested", js.undefined)
    
    @scala.inline
    def setGlyphTypeSuggested(value: Boolean): Self = StObject.set(x, "glyphTypeSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphTypeSuggestedUndefined: Self = StObject.set(x, "glyphTypeSuggested", js.undefined)
    
    @scala.inline
    def setIndentFirstLineSuggested(value: Boolean): Self = StObject.set(x, "indentFirstLineSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentFirstLineSuggestedUndefined: Self = StObject.set(x, "indentFirstLineSuggested", js.undefined)
    
    @scala.inline
    def setIndentStartSuggested(value: Boolean): Self = StObject.set(x, "indentStartSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentStartSuggestedUndefined: Self = StObject.set(x, "indentStartSuggested", js.undefined)
    
    @scala.inline
    def setStartNumberSuggested(value: Boolean): Self = StObject.set(x, "startNumberSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNumberSuggestedUndefined: Self = StObject.set(x, "startNumberSuggested", js.undefined)
    
    @scala.inline
    def setTextStyleSuggestionState(value: SchemaTextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
  }
}
