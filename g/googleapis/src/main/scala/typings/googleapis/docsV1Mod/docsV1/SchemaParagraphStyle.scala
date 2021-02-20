package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Styles that apply to a whole paragraph.  Inherited paragraph styles are
  * represented as unset fields in this message. A paragraph style&#39;s parent
  * depends on where the paragraph style is defined:    * The ParagraphStyle on
  * a Paragraph     inherits from the paragraph&#39;s corresponding named style
  * type.   * The ParagraphStyle on a named style     inherits from the normal
  * text named style.   * The ParagraphStyle of the normal text named style
  * inherits     from the default paragraph style in the Docs editor.   * The
  * ParagraphStyle on a Paragraph     element that is contained in a table may
  * inherit its paragraph style from     the table style.  If the paragraph
  * style does not inherit from a parent, unsetting fields will revert the
  * style to a value matching the defaults in the Docs editor.
  */
@js.native
trait SchemaParagraphStyle extends StObject {
  
  /**
    * The text alignment for this paragraph.
    */
  var alignment: js.UndefOr[String] = js.native
  
  /**
    * Whether to avoid widows and orphans for the paragraph. If unset, the
    * value is inherited from the parent.
    */
  var avoidWidowAndOrphan: js.UndefOr[Boolean] = js.native
  
  /**
    * The border between this paragraph and the next and previous paragraphs.
    * If unset, the value is inherited from the parent.  The between border is
    * rendered when the adjacent paragraph has the same border and indent
    * properties.  Paragraph borders cannot be partially updated. When making
    * changes to a paragraph border the new border must be specified in its
    * entirety.
    */
  var borderBetween: js.UndefOr[SchemaParagraphBorder] = js.native
  
  /**
    * The border at the bottom of this paragraph. If unset, the value is
    * inherited from the parent.  The bottom border is rendered when the
    * paragraph below has different border and indent properties.  Paragraph
    * borders cannot be partially updated. When making changes to a paragraph
    * border the new border must be specified in its entirety.
    */
  var borderBottom: js.UndefOr[SchemaParagraphBorder] = js.native
  
  /**
    * The border to the left of this paragraph. If unset, the value is
    * inherited from the parent.  Paragraph borders cannot be partially
    * updated. When making changes to a paragraph border the new border must be
    * specified in its entirety.
    */
  var borderLeft: js.UndefOr[SchemaParagraphBorder] = js.native
  
  /**
    * The border to the right of this paragraph. If unset, the value is
    * inherited from the parent.  Paragraph borders cannot be partially
    * updated. When making changes to a paragraph border the new border must be
    * specified in its entirety.
    */
  var borderRight: js.UndefOr[SchemaParagraphBorder] = js.native
  
  /**
    * The border at the top of this paragraph. If unset, the value is inherited
    * from the parent.  The top border is rendered when the paragraph above has
    * different border and indent properties.  Paragraph borders cannot be
    * partially updated. When making changes to a paragraph border the new
    * border must be specified in its entirety.
    */
  var borderTop: js.UndefOr[SchemaParagraphBorder] = js.native
  
  /**
    * The text direction of this paragraph. If unset, the value defaults to
    * LEFT_TO_RIGHT since paragraph direction is not inherited.
    */
  var direction: js.UndefOr[String] = js.native
  
  /**
    * The heading ID of the paragraph. If empty, then this paragraph is not a
    * heading. This property is read-only.
    */
  var headingId: js.UndefOr[String] = js.native
  
  /**
    * The amount of indentation for the paragraph on the side that corresponds
    * to the end of the text, based on the current paragraph direction. If
    * unset, the value is inherited from the parent.
    */
  var indentEnd: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The amount of indentation for the first line of the paragraph. If unset,
    * the value is inherited from the parent.
    */
  var indentFirstLine: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The amount of indentation for the paragraph on the side that corresponds
    * to the start of the text, based on the current paragraph direction. If
    * unset, the value is inherited from the parent.
    */
  var indentStart: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * Whether all lines of the paragraph should be laid out on the same page or
    * column if possible. If unset, the value is inherited from the parent.
    */
  var keepLinesTogether: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether at least a part of this paragraph should be laid out on the same
    * page or column as the next paragraph if possible. If unset, the value is
    * inherited from the parent.
    */
  var keepWithNext: js.UndefOr[Boolean] = js.native
  
  /**
    * The amount of space between lines, as a percentage of normal, where
    * normal is represented as 100.0. If unset, the value is inherited from the
    * parent.
    */
  var lineSpacing: js.UndefOr[Double] = js.native
  
  /**
    * The named style type of the paragraph.  Since updating the named style
    * type affects other properties within ParagraphStyle, the named style type
    * is applied before the other properties are updated.
    */
  var namedStyleType: js.UndefOr[String] = js.native
  
  /**
    * The shading of the paragraph. If unset, the value is inherited from the
    * parent.
    */
  var shading: js.UndefOr[SchemaShading] = js.native
  
  /**
    * The amount of extra space above the paragraph. If unset, the value is
    * inherited from the parent.
    */
  var spaceAbove: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The amount of extra space below the paragraph. If unset, the value is
    * inherited from the parent.
    */
  var spaceBelow: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The spacing mode for the paragraph.
    */
  var spacingMode: js.UndefOr[String] = js.native
  
  /**
    * A list of the tab stops for this paragraph. The list of tab stops is not
    * inherited. This property is read-only.
    */
  var tabStops: js.UndefOr[js.Array[SchemaTabStop]] = js.native
}
object SchemaParagraphStyle {
  
  @scala.inline
  def apply(): SchemaParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphStyle]
  }
  
  @scala.inline
  implicit class SchemaParagraphStyleMutableBuilder[Self <: SchemaParagraphStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setAvoidWidowAndOrphan(value: Boolean): Self = StObject.set(x, "avoidWidowAndOrphan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidWidowAndOrphanUndefined: Self = StObject.set(x, "avoidWidowAndOrphan", js.undefined)
    
    @scala.inline
    def setBorderBetween(value: SchemaParagraphBorder): Self = StObject.set(x, "borderBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBetweenUndefined: Self = StObject.set(x, "borderBetween", js.undefined)
    
    @scala.inline
    def setBorderBottom(value: SchemaParagraphBorder): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    @scala.inline
    def setBorderLeft(value: SchemaParagraphBorder): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    @scala.inline
    def setBorderRight(value: SchemaParagraphBorder): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    @scala.inline
    def setBorderTop(value: SchemaParagraphBorder): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHeadingId(value: String): Self = StObject.set(x, "headingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingIdUndefined: Self = StObject.set(x, "headingId", js.undefined)
    
    @scala.inline
    def setIndentEnd(value: SchemaDimension): Self = StObject.set(x, "indentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentEndUndefined: Self = StObject.set(x, "indentEnd", js.undefined)
    
    @scala.inline
    def setIndentFirstLine(value: SchemaDimension): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
    
    @scala.inline
    def setIndentStart(value: SchemaDimension): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
    
    @scala.inline
    def setKeepLinesTogether(value: Boolean): Self = StObject.set(x, "keepLinesTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepLinesTogetherUndefined: Self = StObject.set(x, "keepLinesTogether", js.undefined)
    
    @scala.inline
    def setKeepWithNext(value: Boolean): Self = StObject.set(x, "keepWithNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepWithNextUndefined: Self = StObject.set(x, "keepWithNext", js.undefined)
    
    @scala.inline
    def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    @scala.inline
    def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
    
    @scala.inline
    def setShading(value: SchemaShading): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    @scala.inline
    def setSpaceAbove(value: SchemaDimension): Self = StObject.set(x, "spaceAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAboveUndefined: Self = StObject.set(x, "spaceAbove", js.undefined)
    
    @scala.inline
    def setSpaceBelow(value: SchemaDimension): Self = StObject.set(x, "spaceBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBelowUndefined: Self = StObject.set(x, "spaceBelow", js.undefined)
    
    @scala.inline
    def setSpacingMode(value: String): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingModeUndefined: Self = StObject.set(x, "spacingMode", js.undefined)
    
    @scala.inline
    def setTabStops(value: js.Array[SchemaTabStop]): Self = StObject.set(x, "tabStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabStopsUndefined: Self = StObject.set(x, "tabStops", js.undefined)
    
    @scala.inline
    def setTabStopsVarargs(value: SchemaTabStop*): Self = StObject.set(x, "tabStops", js.Array(value :_*))
  }
}
