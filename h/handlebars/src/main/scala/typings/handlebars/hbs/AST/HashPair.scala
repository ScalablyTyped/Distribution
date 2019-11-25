package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashPair extends Node {
  var key: String
  @JSName("type")
  var type_HashPair: typings.handlebars.handlebarsStrings.HashPair
  var value: Expression
}

object HashPair {
  @scala.inline
  def apply(
    key: String,
    loc: SourceLocation,
    `type`: typings.handlebars.handlebarsStrings.HashPair,
    value: Expression
  ): HashPair = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashPair]
  }
}

