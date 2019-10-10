package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullLiteral extends Node {
  @JSName("type")
  var type_NullLiteral: typings.handlebars.handlebarsStrings.NullLiteral
}

object NullLiteral {
  @scala.inline
  def apply(loc: SourceLocation, `type`: typings.handlebars.handlebarsStrings.NullLiteral): NullLiteral = {
    val __obj = js.Dynamic.literal(loc = loc)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NullLiteral]
  }
}

