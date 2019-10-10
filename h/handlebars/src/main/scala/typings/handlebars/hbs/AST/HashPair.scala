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
    val __obj = js.Dynamic.literal(key = key, loc = loc, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HashPair]
  }
}

