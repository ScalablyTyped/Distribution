package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    alignment: String = null,
    avoidWidowAndOrphan: js.UndefOr[Boolean] = js.undefined,
    borderBetween: SchemaParagraphBorder = null,
    borderBottom: SchemaParagraphBorder = null,
    borderLeft: SchemaParagraphBorder = null,
    borderRight: SchemaParagraphBorder = null,
    borderTop: SchemaParagraphBorder = null,
    direction: String = null,
    headingId: String = null,
    indentEnd: SchemaDimension = null,
    indentFirstLine: SchemaDimension = null,
    indentStart: SchemaDimension = null,
    keepLinesTogether: js.UndefOr[Boolean] = js.undefined,
    keepWithNext: js.UndefOr[Boolean] = js.undefined,
    lineSpacing: js.UndefOr[Double] = js.undefined,
    namedStyleType: String = null,
    shading: SchemaShading = null,
    spaceAbove: SchemaDimension = null,
    spaceBelow: SchemaDimension = null,
    spacingMode: String = null,
    tabStops: js.Array[SchemaTabStop] = null
  ): SchemaParagraphStyle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidWidowAndOrphan)) __obj.updateDynamic("avoidWidowAndOrphan")(avoidWidowAndOrphan.get.asInstanceOf[js.Any])
    if (borderBetween != null) __obj.updateDynamic("borderBetween")(borderBetween.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (headingId != null) __obj.updateDynamic("headingId")(headingId.asInstanceOf[js.Any])
    if (indentEnd != null) __obj.updateDynamic("indentEnd")(indentEnd.asInstanceOf[js.Any])
    if (indentFirstLine != null) __obj.updateDynamic("indentFirstLine")(indentFirstLine.asInstanceOf[js.Any])
    if (indentStart != null) __obj.updateDynamic("indentStart")(indentStart.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLinesTogether)) __obj.updateDynamic("keepLinesTogether")(keepLinesTogether.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepWithNext)) __obj.updateDynamic("keepWithNext")(keepWithNext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineSpacing)) __obj.updateDynamic("lineSpacing")(lineSpacing.get.asInstanceOf[js.Any])
    if (namedStyleType != null) __obj.updateDynamic("namedStyleType")(namedStyleType.asInstanceOf[js.Any])
    if (shading != null) __obj.updateDynamic("shading")(shading.asInstanceOf[js.Any])
    if (spaceAbove != null) __obj.updateDynamic("spaceAbove")(spaceAbove.asInstanceOf[js.Any])
    if (spaceBelow != null) __obj.updateDynamic("spaceBelow")(spaceBelow.asInstanceOf[js.Any])
    if (spacingMode != null) __obj.updateDynamic("spacingMode")(spacingMode.asInstanceOf[js.Any])
    if (tabStops != null) __obj.updateDynamic("tabStops")(tabStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParagraphStyle]
  }
}

