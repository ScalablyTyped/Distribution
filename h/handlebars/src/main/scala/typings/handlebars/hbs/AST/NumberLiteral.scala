package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberLiteral extends Node {
  var original: Double = js.native
  @JSName("type")
  var type_NumberLiteral: typings.handlebars.handlebarsStrings.NumberLiteral = js.native
  var value: Double = js.native
}

object NumberLiteral {
  @scala.inline
  def apply(
    loc: SourceLocation,
    original: Double,
    `type`: typings.handlebars.handlebarsStrings.NumberLiteral,
    value: Double
  ): NumberLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteral]
  }
  @scala.inline
  implicit class NumberLiteralOps[Self <: NumberLiteral] (val x: Self) extends AnyVal {
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
    def setOriginal(value: Double): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.NumberLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

