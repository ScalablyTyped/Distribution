package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A named style. Paragraphs in the document can inherit their TextStyle and
  * ParagraphStyle from this named style when they have the same named style
  * type.
  */
@js.native
trait SchemaNamedStyle extends js.Object {
  /**
    * The type of this named style.
    */
  var namedStyleType: js.UndefOr[String] = js.native
  /**
    * The paragraph style of this named style.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.native
  /**
    * The text style of this named style.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaNamedStyle {
  @scala.inline
  def apply(): SchemaNamedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedStyle]
  }
  @scala.inline
  implicit class SchemaNamedStyleOps[Self <: SchemaNamedStyle] (val x: Self) extends AnyVal {
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
    def setNamedStyleType(value: String): Self = this.set("namedStyleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedStyleType: Self = this.set("namedStyleType", js.undefined)
    @scala.inline
    def setParagraphStyle(value: SchemaParagraphStyle): Self = this.set("paragraphStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphStyle: Self = this.set("paragraphStyle", js.undefined)
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

