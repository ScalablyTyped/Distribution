package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringLiteral extends Node {
  var original: String = js.native
  @JSName("type")
  var type_StringLiteral: typings.handlebars.handlebarsStrings.StringLiteral = js.native
  var value: String = js.native
}

object StringLiteral {
  @scala.inline
  def apply(
    loc: SourceLocation,
    original: String,
    `type`: typings.handlebars.handlebarsStrings.StringLiteral,
    value: String
  ): StringLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteral]
  }
  @scala.inline
  implicit class StringLiteralOps[Self <: StringLiteral] (val x: Self) extends AnyVal {
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
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.StringLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

