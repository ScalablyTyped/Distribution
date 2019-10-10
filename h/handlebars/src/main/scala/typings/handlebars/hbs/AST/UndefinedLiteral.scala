package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndefinedLiteral extends Node {
  @JSName("type")
  var type_UndefinedLiteral: typings.handlebars.handlebarsStrings.UndefinedLiteral
}

object UndefinedLiteral {
  @scala.inline
  def apply(loc: SourceLocation, `type`: typings.handlebars.handlebarsStrings.UndefinedLiteral): UndefinedLiteral = {
    val __obj = js.Dynamic.literal(loc = loc)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UndefinedLiteral]
  }
}

