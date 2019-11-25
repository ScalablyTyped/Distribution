package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral extends Node {
  var original: Boolean
  @JSName("type")
  var type_BooleanLiteral: typings.handlebars.handlebarsStrings.BooleanLiteral
  var value: Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(
    loc: SourceLocation,
    original: Boolean,
    `type`: typings.handlebars.handlebarsStrings.BooleanLiteral,
    value: Boolean
  ): BooleanLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteral]
  }
}

