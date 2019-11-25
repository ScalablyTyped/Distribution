package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLiteral extends Node {
  var original: String
  @JSName("type")
  var type_StringLiteral: typings.handlebars.handlebarsStrings.StringLiteral
  var value: String
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
}

