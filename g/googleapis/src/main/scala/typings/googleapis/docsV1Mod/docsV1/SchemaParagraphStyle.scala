package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParagraphStyle extends StObject {
  
  /**
    * The text alignment for this paragraph.
    */
  var alignment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to avoid widows and orphans for the paragraph. If unset, the value is inherited from the parent.
    */
  var avoidWidowAndOrphan: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The border between this paragraph and the next and previous paragraphs. If unset, the value is inherited from the parent. The between border is rendered when the adjacent paragraph has the same border and indent properties. Paragraph borders cannot be partially updated. When making changes to a paragraph border the new border must be specified in its entirety.
    */
  var borderBetween: js.UndefOr[SchemaParagraphBorder] = js.undefined
  
  /**
    * The border at the bottom of this paragraph. If unset, the value is inherited from the parent. The bottom border is rendered when the paragraph below has different border and indent properties. Paragraph borders cannot be partially updated. When making changes to a paragraph border the new border must be specified in its entirety.
    */
  var borderBottom: js.UndefOr[SchemaParagraphBorder] = js.undefined
  
  /**
    * The border to the left of this paragraph. If unset, the value is inherited from the parent. Paragraph borders cannot be partially updated. When making changes to a paragraph border the new border must be specified in its entirety.
    */
  var borderLeft: js.UndefOr[SchemaParagraphBorder] = js.undefined
  
  /**
    * The border to the right of this paragraph. If unset, the value is inherited from the parent. Paragraph borders cannot be partially updated. When making changes to a paragraph border the new border must be specified in its entirety.
    */
  var borderRight: js.UndefOr[SchemaParagraphBorder] = js.undefined
  
  /**
    * The border at the top of this paragraph. If unset, the value is inherited from the parent. The top border is rendered when the paragraph above has different border and indent properties. Paragraph borders cannot be partially updated. When making changes to a paragraph border the new border must be specified in its entirety.
    */
  var borderTop: js.UndefOr[SchemaParagraphBorder] = js.undefined
  
  /**
    * The text direction of this paragraph. If unset, the value defaults to LEFT_TO_RIGHT since paragraph direction is not inherited.
    */
  var direction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The heading ID of the paragraph. If empty, then this paragraph is not a heading. This property is read-only.
    */
  var headingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount of indentation for the paragraph on the side that corresponds to the end of the text, based on the current paragraph direction. If unset, the value is inherited from the parent.
    */
  var indentEnd: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The amount of indentation for the first line of the paragraph. If unset, the value is inherited from the parent.
    */
  var indentFirstLine: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The amount of indentation for the paragraph on the side that corresponds to the start of the text, based on the current paragraph direction. If unset, the value is inherited from the parent.
    */
  var indentStart: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * Whether all lines of the paragraph should be laid out on the same page or column if possible. If unset, the value is inherited from the parent.
    */
  var keepLinesTogether: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether at least a part of this paragraph should be laid out on the same page or column as the next paragraph if possible. If unset, the value is inherited from the parent.
    */
  var keepWithNext: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The amount of space between lines, as a percentage of normal, where normal is represented as 100.0. If unset, the value is inherited from the parent.
    */
  var lineSpacing: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The named style type of the paragraph. Since updating the named style type affects other properties within ParagraphStyle, the named style type is applied before the other properties are updated.
    */
  var namedStyleType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the current paragraph should always start at the beginning of a page. If unset, the value is inherited from the parent. Attempting to update page_break_before for paragraphs in unsupported regions, including Table, Header, Footer and Footnote, can result in an invalid document state which returns a 400 bad request error.
    */
  var pageBreakBefore: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The shading of the paragraph. If unset, the value is inherited from the parent.
    */
  var shading: js.UndefOr[SchemaShading] = js.undefined
  
  /**
    * The amount of extra space above the paragraph. If unset, the value is inherited from the parent.
    */
  var spaceAbove: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The amount of extra space below the paragraph. If unset, the value is inherited from the parent.
    */
  var spaceBelow: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The spacing mode for the paragraph.
    */
  var spacingMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of the tab stops for this paragraph. The list of tab stops is not inherited. This property is read-only.
    */
  var tabStops: js.UndefOr[js.Array[SchemaTabStop]] = js.undefined
}
object SchemaParagraphStyle {
  
  inline def apply(): SchemaParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphStyle]
  }
  
  extension [Self <: SchemaParagraphStyle](x: Self) {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentNull: Self = StObject.set(x, "alignment", null)
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAvoidWidowAndOrphan(value: Boolean): Self = StObject.set(x, "avoidWidowAndOrphan", value.asInstanceOf[js.Any])
    
    inline def setAvoidWidowAndOrphanNull: Self = StObject.set(x, "avoidWidowAndOrphan", null)
    
    inline def setAvoidWidowAndOrphanUndefined: Self = StObject.set(x, "avoidWidowAndOrphan", js.undefined)
    
    inline def setBorderBetween(value: SchemaParagraphBorder): Self = StObject.set(x, "borderBetween", value.asInstanceOf[js.Any])
    
    inline def setBorderBetweenUndefined: Self = StObject.set(x, "borderBetween", js.undefined)
    
    inline def setBorderBottom(value: SchemaParagraphBorder): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderLeft(value: SchemaParagraphBorder): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    inline def setBorderRight(value: SchemaParagraphBorder): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderTop(value: SchemaParagraphBorder): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setHeadingId(value: String): Self = StObject.set(x, "headingId", value.asInstanceOf[js.Any])
    
    inline def setHeadingIdNull: Self = StObject.set(x, "headingId", null)
    
    inline def setHeadingIdUndefined: Self = StObject.set(x, "headingId", js.undefined)
    
    inline def setIndentEnd(value: SchemaDimension): Self = StObject.set(x, "indentEnd", value.asInstanceOf[js.Any])
    
    inline def setIndentEndUndefined: Self = StObject.set(x, "indentEnd", js.undefined)
    
    inline def setIndentFirstLine(value: SchemaDimension): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
    
    inline def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
    
    inline def setIndentStart(value: SchemaDimension): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
    
    inline def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
    
    inline def setKeepLinesTogether(value: Boolean): Self = StObject.set(x, "keepLinesTogether", value.asInstanceOf[js.Any])
    
    inline def setKeepLinesTogetherNull: Self = StObject.set(x, "keepLinesTogether", null)
    
    inline def setKeepLinesTogetherUndefined: Self = StObject.set(x, "keepLinesTogether", js.undefined)
    
    inline def setKeepWithNext(value: Boolean): Self = StObject.set(x, "keepWithNext", value.asInstanceOf[js.Any])
    
    inline def setKeepWithNextNull: Self = StObject.set(x, "keepWithNext", null)
    
    inline def setKeepWithNextUndefined: Self = StObject.set(x, "keepWithNext", js.undefined)
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingNull: Self = StObject.set(x, "lineSpacing", null)
    
    inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    inline def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
    
    inline def setNamedStyleTypeNull: Self = StObject.set(x, "namedStyleType", null)
    
    inline def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
    
    inline def setPageBreakBefore(value: Boolean): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
    
    inline def setPageBreakBeforeNull: Self = StObject.set(x, "pageBreakBefore", null)
    
    inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
    
    inline def setShading(value: SchemaShading): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    inline def setSpaceAbove(value: SchemaDimension): Self = StObject.set(x, "spaceAbove", value.asInstanceOf[js.Any])
    
    inline def setSpaceAboveUndefined: Self = StObject.set(x, "spaceAbove", js.undefined)
    
    inline def setSpaceBelow(value: SchemaDimension): Self = StObject.set(x, "spaceBelow", value.asInstanceOf[js.Any])
    
    inline def setSpaceBelowUndefined: Self = StObject.set(x, "spaceBelow", js.undefined)
    
    inline def setSpacingMode(value: String): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
    
    inline def setSpacingModeNull: Self = StObject.set(x, "spacingMode", null)
    
    inline def setSpacingModeUndefined: Self = StObject.set(x, "spacingMode", js.undefined)
    
    inline def setTabStops(value: js.Array[SchemaTabStop]): Self = StObject.set(x, "tabStops", value.asInstanceOf[js.Any])
    
    inline def setTabStopsUndefined: Self = StObject.set(x, "tabStops", js.undefined)
    
    inline def setTabStopsVarargs(value: SchemaTabStop*): Self = StObject.set(x, "tabStops", js.Array(value*))
  }
}
