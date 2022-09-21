package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextStyleSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to background_color.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to baseline_offset.
    */
  var baselineOffsetSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to bold.
    */
  var boldSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to font_size.
    */
  var fontSizeSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to foreground_color.
    */
  var foregroundColorSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to italic.
    */
  var italicSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to link.
    */
  var linkSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to small_caps.
    */
  var smallCapsSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to strikethrough.
    */
  var strikethroughSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to underline.
    */
  var underlineSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to weighted_font_family.
    */
  var weightedFontFamilySuggested: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTextStyleSuggestionState {
  
  inline def apply(): SchemaTextStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextStyleSuggestionState]
  }
  
  extension [Self <: SchemaTextStyleSuggestionState](x: Self) {
    
    inline def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorSuggestedNull: Self = StObject.set(x, "backgroundColorSuggested", null)
    
    inline def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
    
    inline def setBaselineOffsetSuggested(value: Boolean): Self = StObject.set(x, "baselineOffsetSuggested", value.asInstanceOf[js.Any])
    
    inline def setBaselineOffsetSuggestedNull: Self = StObject.set(x, "baselineOffsetSuggested", null)
    
    inline def setBaselineOffsetSuggestedUndefined: Self = StObject.set(x, "baselineOffsetSuggested", js.undefined)
    
    inline def setBoldSuggested(value: Boolean): Self = StObject.set(x, "boldSuggested", value.asInstanceOf[js.Any])
    
    inline def setBoldSuggestedNull: Self = StObject.set(x, "boldSuggested", null)
    
    inline def setBoldSuggestedUndefined: Self = StObject.set(x, "boldSuggested", js.undefined)
    
    inline def setFontSizeSuggested(value: Boolean): Self = StObject.set(x, "fontSizeSuggested", value.asInstanceOf[js.Any])
    
    inline def setFontSizeSuggestedNull: Self = StObject.set(x, "fontSizeSuggested", null)
    
    inline def setFontSizeSuggestedUndefined: Self = StObject.set(x, "fontSizeSuggested", js.undefined)
    
    inline def setForegroundColorSuggested(value: Boolean): Self = StObject.set(x, "foregroundColorSuggested", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorSuggestedNull: Self = StObject.set(x, "foregroundColorSuggested", null)
    
    inline def setForegroundColorSuggestedUndefined: Self = StObject.set(x, "foregroundColorSuggested", js.undefined)
    
    inline def setItalicSuggested(value: Boolean): Self = StObject.set(x, "italicSuggested", value.asInstanceOf[js.Any])
    
    inline def setItalicSuggestedNull: Self = StObject.set(x, "italicSuggested", null)
    
    inline def setItalicSuggestedUndefined: Self = StObject.set(x, "italicSuggested", js.undefined)
    
    inline def setLinkSuggested(value: Boolean): Self = StObject.set(x, "linkSuggested", value.asInstanceOf[js.Any])
    
    inline def setLinkSuggestedNull: Self = StObject.set(x, "linkSuggested", null)
    
    inline def setLinkSuggestedUndefined: Self = StObject.set(x, "linkSuggested", js.undefined)
    
    inline def setSmallCapsSuggested(value: Boolean): Self = StObject.set(x, "smallCapsSuggested", value.asInstanceOf[js.Any])
    
    inline def setSmallCapsSuggestedNull: Self = StObject.set(x, "smallCapsSuggested", null)
    
    inline def setSmallCapsSuggestedUndefined: Self = StObject.set(x, "smallCapsSuggested", js.undefined)
    
    inline def setStrikethroughSuggested(value: Boolean): Self = StObject.set(x, "strikethroughSuggested", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughSuggestedNull: Self = StObject.set(x, "strikethroughSuggested", null)
    
    inline def setStrikethroughSuggestedUndefined: Self = StObject.set(x, "strikethroughSuggested", js.undefined)
    
    inline def setUnderlineSuggested(value: Boolean): Self = StObject.set(x, "underlineSuggested", value.asInstanceOf[js.Any])
    
    inline def setUnderlineSuggestedNull: Self = StObject.set(x, "underlineSuggested", null)
    
    inline def setUnderlineSuggestedUndefined: Self = StObject.set(x, "underlineSuggested", js.undefined)
    
    inline def setWeightedFontFamilySuggested(value: Boolean): Self = StObject.set(x, "weightedFontFamilySuggested", value.asInstanceOf[js.Any])
    
    inline def setWeightedFontFamilySuggestedNull: Self = StObject.set(x, "weightedFontFamilySuggested", null)
    
    inline def setWeightedFontFamilySuggestedUndefined: Self = StObject.set(x, "weightedFontFamilySuggested", js.undefined)
  }
}
