package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base ParagraphStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
trait SchemaParagraphStyleSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to alignment.
    */
  var alignmentSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to avoid_widow_and_orphan.
    */
  var avoidWidowAndOrphanSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to border_between.
    */
  var borderBetweenSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to border_bottom.
    */
  var borderBottomSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to border_left.
    */
  var borderLeftSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to border_right.
    */
  var borderRightSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to border_top.
    */
  var borderTopSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to direction.
    */
  var directionSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to heading_id.
    */
  var headingIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to indent_end.
    */
  var indentEndSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to indent_first_line.
    */
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to indent_start.
    */
  var indentStartSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to keep_lines_together.
    */
  var keepLinesTogetherSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to keep_with_next.
    */
  var keepWithNextSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to line_spacing.
    */
  var lineSpacingSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to named_style_type.
    */
  var namedStyleTypeSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A mask that indicates which of the fields in shading have been changed in
    * this suggestion.
    */
  var shadingSuggestionState: js.UndefOr[SchemaShadingSuggestionState] = js.undefined
  
  /**
    * Indicates if there was a suggested change to space_above.
    */
  var spaceAboveSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to space_below.
    */
  var spaceBelowSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to spacing_mode.
    */
  var spacingModeSuggested: js.UndefOr[Boolean] = js.undefined
}
object SchemaParagraphStyleSuggestionState {
  
  inline def apply(): SchemaParagraphStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphStyleSuggestionState]
  }
  
  extension [Self <: SchemaParagraphStyleSuggestionState](x: Self) {
    
    inline def setAlignmentSuggested(value: Boolean): Self = StObject.set(x, "alignmentSuggested", value.asInstanceOf[js.Any])
    
    inline def setAlignmentSuggestedUndefined: Self = StObject.set(x, "alignmentSuggested", js.undefined)
    
    inline def setAvoidWidowAndOrphanSuggested(value: Boolean): Self = StObject.set(x, "avoidWidowAndOrphanSuggested", value.asInstanceOf[js.Any])
    
    inline def setAvoidWidowAndOrphanSuggestedUndefined: Self = StObject.set(x, "avoidWidowAndOrphanSuggested", js.undefined)
    
    inline def setBorderBetweenSuggested(value: Boolean): Self = StObject.set(x, "borderBetweenSuggested", value.asInstanceOf[js.Any])
    
    inline def setBorderBetweenSuggestedUndefined: Self = StObject.set(x, "borderBetweenSuggested", js.undefined)
    
    inline def setBorderBottomSuggested(value: Boolean): Self = StObject.set(x, "borderBottomSuggested", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomSuggestedUndefined: Self = StObject.set(x, "borderBottomSuggested", js.undefined)
    
    inline def setBorderLeftSuggested(value: Boolean): Self = StObject.set(x, "borderLeftSuggested", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftSuggestedUndefined: Self = StObject.set(x, "borderLeftSuggested", js.undefined)
    
    inline def setBorderRightSuggested(value: Boolean): Self = StObject.set(x, "borderRightSuggested", value.asInstanceOf[js.Any])
    
    inline def setBorderRightSuggestedUndefined: Self = StObject.set(x, "borderRightSuggested", js.undefined)
    
    inline def setBorderTopSuggested(value: Boolean): Self = StObject.set(x, "borderTopSuggested", value.asInstanceOf[js.Any])
    
    inline def setBorderTopSuggestedUndefined: Self = StObject.set(x, "borderTopSuggested", js.undefined)
    
    inline def setDirectionSuggested(value: Boolean): Self = StObject.set(x, "directionSuggested", value.asInstanceOf[js.Any])
    
    inline def setDirectionSuggestedUndefined: Self = StObject.set(x, "directionSuggested", js.undefined)
    
    inline def setHeadingIdSuggested(value: Boolean): Self = StObject.set(x, "headingIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setHeadingIdSuggestedUndefined: Self = StObject.set(x, "headingIdSuggested", js.undefined)
    
    inline def setIndentEndSuggested(value: Boolean): Self = StObject.set(x, "indentEndSuggested", value.asInstanceOf[js.Any])
    
    inline def setIndentEndSuggestedUndefined: Self = StObject.set(x, "indentEndSuggested", js.undefined)
    
    inline def setIndentFirstLineSuggested(value: Boolean): Self = StObject.set(x, "indentFirstLineSuggested", value.asInstanceOf[js.Any])
    
    inline def setIndentFirstLineSuggestedUndefined: Self = StObject.set(x, "indentFirstLineSuggested", js.undefined)
    
    inline def setIndentStartSuggested(value: Boolean): Self = StObject.set(x, "indentStartSuggested", value.asInstanceOf[js.Any])
    
    inline def setIndentStartSuggestedUndefined: Self = StObject.set(x, "indentStartSuggested", js.undefined)
    
    inline def setKeepLinesTogetherSuggested(value: Boolean): Self = StObject.set(x, "keepLinesTogetherSuggested", value.asInstanceOf[js.Any])
    
    inline def setKeepLinesTogetherSuggestedUndefined: Self = StObject.set(x, "keepLinesTogetherSuggested", js.undefined)
    
    inline def setKeepWithNextSuggested(value: Boolean): Self = StObject.set(x, "keepWithNextSuggested", value.asInstanceOf[js.Any])
    
    inline def setKeepWithNextSuggestedUndefined: Self = StObject.set(x, "keepWithNextSuggested", js.undefined)
    
    inline def setLineSpacingSuggested(value: Boolean): Self = StObject.set(x, "lineSpacingSuggested", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingSuggestedUndefined: Self = StObject.set(x, "lineSpacingSuggested", js.undefined)
    
    inline def setNamedStyleTypeSuggested(value: Boolean): Self = StObject.set(x, "namedStyleTypeSuggested", value.asInstanceOf[js.Any])
    
    inline def setNamedStyleTypeSuggestedUndefined: Self = StObject.set(x, "namedStyleTypeSuggested", js.undefined)
    
    inline def setShadingSuggestionState(value: SchemaShadingSuggestionState): Self = StObject.set(x, "shadingSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setShadingSuggestionStateUndefined: Self = StObject.set(x, "shadingSuggestionState", js.undefined)
    
    inline def setSpaceAboveSuggested(value: Boolean): Self = StObject.set(x, "spaceAboveSuggested", value.asInstanceOf[js.Any])
    
    inline def setSpaceAboveSuggestedUndefined: Self = StObject.set(x, "spaceAboveSuggested", js.undefined)
    
    inline def setSpaceBelowSuggested(value: Boolean): Self = StObject.set(x, "spaceBelowSuggested", value.asInstanceOf[js.Any])
    
    inline def setSpaceBelowSuggestedUndefined: Self = StObject.set(x, "spaceBelowSuggested", js.undefined)
    
    inline def setSpacingModeSuggested(value: Boolean): Self = StObject.set(x, "spacingModeSuggested", value.asInstanceOf[js.Any])
    
    inline def setSpacingModeSuggestedUndefined: Self = StObject.set(x, "spacingModeSuggested", js.undefined)
  }
}
