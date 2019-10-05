package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLiteral extends Node {
  var original: String
  var value: String
}

object StringLiteral {
  @scala.inline
  def apply(loc: SourceLocation, original: String, `type`: String, value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(loc = loc, original = original, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StringLiteral]
  }
}

