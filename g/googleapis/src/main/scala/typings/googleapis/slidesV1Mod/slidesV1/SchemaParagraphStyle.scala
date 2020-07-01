package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Styles that apply to a whole paragraph.  If this text is contained in a
  * shape with a parent placeholder, then these paragraph styles may be
  * inherited from the parent. Which paragraph styles are inherited depend on
  * the nesting level of lists:  * A paragraph not in a list will inherit its
  * paragraph style from the   paragraph at the 0 nesting level of the list
  * inside the parent placeholder. * A paragraph in a list will inherit its
  * paragraph style from the paragraph   at its corresponding nesting level of
  * the list inside the parent   placeholder.  Inherited paragraph styles are
  * represented as unset fields in this message.
  */
@js.native
trait SchemaParagraphStyle extends js.Object {
  /**
    * The text alignment for this paragraph.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * The text direction of this paragraph. If unset, the value defaults to
    * LEFT_TO_RIGHT since text direction is not inherited.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * The amount indentation for the paragraph on the side that corresponds to
    * the end of the text, based on the current text direction. If unset, the
    * value is inherited from the parent.
    */
  var indentEnd: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount of indentation for the start of the first line of the
    * paragraph. If unset, the value is inherited from the parent.
    */
  var indentFirstLine: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount indentation for the paragraph on the side that corresponds to
    * the start of the text, based on the current text direction. If unset, the
    * value is inherited from the parent.
    */
  var indentStart: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount of space between lines, as a percentage of normal, where
    * normal is represented as 100.0. If unset, the value is inherited from the
    * parent.
    */
  var lineSpacing: js.UndefOr[Double] = js.native
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
}

object SchemaParagraphStyle {
  @scala.inline
  def apply(
    alignment: String = null,
    direction: String = null,
    indentEnd: SchemaDimension = null,
    indentFirstLine: SchemaDimension = null,
    indentStart: SchemaDimension = null,
    lineSpacing: js.UndefOr[Double] = js.undefined,
    spaceAbove: SchemaDimension = null,
    spaceBelow: SchemaDimension = null,
    spacingMode: String = null
  ): SchemaParagraphStyle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (indentEnd != null) __obj.updateDynamic("indentEnd")(indentEnd.asInstanceOf[js.Any])
    if (indentFirstLine != null) __obj.updateDynamic("indentFirstLine")(indentFirstLine.asInstanceOf[js.Any])
    if (indentStart != null) __obj.updateDynamic("indentStart")(indentStart.asInstanceOf[js.Any])
    if (!js.isUndefined(lineSpacing)) __obj.updateDynamic("lineSpacing")(lineSpacing.get.asInstanceOf[js.Any])
    if (spaceAbove != null) __obj.updateDynamic("spaceAbove")(spaceAbove.asInstanceOf[js.Any])
    if (spaceBelow != null) __obj.updateDynamic("spaceBelow")(spaceBelow.asInstanceOf[js.Any])
    if (spacingMode != null) __obj.updateDynamic("spacingMode")(spacingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParagraphStyle]
  }
}

