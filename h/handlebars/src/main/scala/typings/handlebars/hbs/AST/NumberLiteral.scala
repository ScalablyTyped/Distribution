package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLiteral extends Node {
  var original: Double
  @JSName("type")
  var type_NumberLiteral: typings.handlebars.handlebarsStrings.NumberLiteral
  var value: Double
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
}

