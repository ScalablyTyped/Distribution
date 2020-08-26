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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
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
    def setLineSpacing(value: Double): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineSpacing: Self = this.set("lineSpacing", js.undefined)
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
  }
  
}

