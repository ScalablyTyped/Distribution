package typings.googleapis.docsV1Mod.docsV1

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
trait SchemaParagraphStyle extends js.Object {
  
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
  implicit class SchemaParagraphStyleOps[Self <: SchemaParagraphStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setAvoidWidowAndOrphan(value: Boolean): Self = this.set("avoidWidowAndOrphan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidWidowAndOrphan: Self = this.set("avoidWidowAndOrphan", js.undefined)
    
    @scala.inline
    def setBorderBetween(value: SchemaParagraphBorder): Self = this.set("borderBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBetween: Self = this.set("borderBetween", js.undefined)
    
    @scala.inline
    def setBorderBottom(value: SchemaParagraphBorder): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    
    @scala.inline
    def setBorderLeft(value: SchemaParagraphBorder): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    
    @scala.inline
    def setBorderRight(value: SchemaParagraphBorder): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
    
    @scala.inline
    def setBorderTop(value: SchemaParagraphBorder): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setHeadingId(value: String): Self = this.set("headingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadingId: Self = this.set("headingId", js.undefined)
    
    @scala.inline
    def setIndentEnd(value: SchemaDimension): Self = this.set("indentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentEnd: Self = this.set("indentEnd", js.undefined)
    
    @scala.inline
    def setIndentFirstLine(value: SchemaDimension): Self = this.set("indentFirstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentFirstLine: Self = this.set("indentFirstLine", js.undefined)
    
    @scala.inline
    def setIndentStart(value: SchemaDimension): Self = this.set("indentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentStart: Self = this.set("indentStart", js.undefined)
    
    @scala.inline
    def setKeepLinesTogether(value: Boolean): Self = this.set("keepLinesTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepLinesTogether: Self = this.set("keepLinesTogether", js.undefined)
    
    @scala.inline
    def setKeepWithNext(value: Boolean): Self = this.set("keepWithNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepWithNext: Self = this.set("keepWithNext", js.undefined)
    
    @scala.inline
    def setLineSpacing(value: Double): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSpacing: Self = this.set("lineSpacing", js.undefined)
    
    @scala.inline
    def setNamedStyleType(value: String): Self = this.set("namedStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedStyleType: Self = this.set("namedStyleType", js.undefined)
    
    @scala.inline
    def setShading(value: SchemaShading): Self = this.set("shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShading: Self = this.set("shading", js.undefined)
    
    @scala.inline
    def setSpaceAbove(value: SchemaDimension): Self = this.set("spaceAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceAbove: Self = this.set("spaceAbove", js.undefined)
    
    @scala.inline
    def setSpaceBelow(value: SchemaDimension): Self = this.set("spaceBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceBelow: Self = this.set("spaceBelow", js.undefined)
    
    @scala.inline
    def setSpacingMode(value: String): Self = this.set("spacingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacingMode: Self = this.set("spacingMode", js.undefined)
    
    @scala.inline
    def setTabStopsVarargs(value: SchemaTabStop*): Self = this.set("tabStops", js.Array(value :_*))
    
    @scala.inline
    def setTabStops(value: js.Array[SchemaTabStop]): Self = this.set("tabStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabStops: Self = this.set("tabStops", js.undefined)
  }
}
