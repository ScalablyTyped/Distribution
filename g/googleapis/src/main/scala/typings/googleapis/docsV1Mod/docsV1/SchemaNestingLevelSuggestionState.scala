package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNestingLevelSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to bullet_alignment.
    */
  var bulletAlignmentSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to glyph_format.
    */
  var glyphFormatSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to glyph_symbol.
    */
  var glyphSymbolSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to glyph_type.
    */
  var glyphTypeSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to indent_first_line.
    */
  var indentFirstLineSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to indent_start.
    */
  var indentStartSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to start_number.
    */
  var startNumberSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A mask that indicates which of the fields in text style have been changed in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.undefined
}
object SchemaNestingLevelSuggestionState {
  
  inline def apply(): SchemaNestingLevelSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNestingLevelSuggestionState]
  }
  
  extension [Self <: SchemaNestingLevelSuggestionState](x: Self) {
    
    inline def setBulletAlignmentSuggested(value: Boolean): Self = StObject.set(x, "bulletAlignmentSuggested", value.asInstanceOf[js.Any])
    
    inline def setBulletAlignmentSuggestedNull: Self = StObject.set(x, "bulletAlignmentSuggested", null)
    
    inline def setBulletAlignmentSuggestedUndefined: Self = StObject.set(x, "bulletAlignmentSuggested", js.undefined)
    
    inline def setGlyphFormatSuggested(value: Boolean): Self = StObject.set(x, "glyphFormatSuggested", value.asInstanceOf[js.Any])
    
    inline def setGlyphFormatSuggestedNull: Self = StObject.set(x, "glyphFormatSuggested", null)
    
    inline def setGlyphFormatSuggestedUndefined: Self = StObject.set(x, "glyphFormatSuggested", js.undefined)
    
    inline def setGlyphSymbolSuggested(value: Boolean): Self = StObject.set(x, "glyphSymbolSuggested", value.asInstanceOf[js.Any])
    
    inline def setGlyphSymbolSuggestedNull: Self = StObject.set(x, "glyphSymbolSuggested", null)
    
    inline def setGlyphSymbolSuggestedUndefined: Self = StObject.set(x, "glyphSymbolSuggested", js.undefined)
    
    inline def setGlyphTypeSuggested(value: Boolean): Self = StObject.set(x, "glyphTypeSuggested", value.asInstanceOf[js.Any])
    
    inline def setGlyphTypeSuggestedNull: Self = StObject.set(x, "glyphTypeSuggested", null)
    
    inline def setGlyphTypeSuggestedUndefined: Self = StObject.set(x, "glyphTypeSuggested", js.undefined)
    
    inline def setIndentFirstLineSuggested(value: Boolean): Self = StObject.set(x, "indentFirstLineSuggested", value.asInstanceOf[js.Any])
    
    inline def setIndentFirstLineSuggestedNull: Self = StObject.set(x, "indentFirstLineSuggested", null)
    
    inline def setIndentFirstLineSuggestedUndefined: Self = StObject.set(x, "indentFirstLineSuggested", js.undefined)
    
    inline def setIndentStartSuggested(value: Boolean): Self = StObject.set(x, "indentStartSuggested", value.asInstanceOf[js.Any])
    
    inline def setIndentStartSuggestedNull: Self = StObject.set(x, "indentStartSuggested", null)
    
    inline def setIndentStartSuggestedUndefined: Self = StObject.set(x, "indentStartSuggested", js.undefined)
    
    inline def setStartNumberSuggested(value: Boolean): Self = StObject.set(x, "startNumberSuggested", value.asInstanceOf[js.Any])
    
    inline def setStartNumberSuggestedNull: Self = StObject.set(x, "startNumberSuggested", null)
    
    inline def setStartNumberSuggestedUndefined: Self = StObject.set(x, "startNumberSuggested", js.undefined)
    
    inline def setTextStyleSuggestionState(value: SchemaTextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
  }
}
