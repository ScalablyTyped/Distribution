package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends Node {
  var pairs: js.Array[HashPair]
  @JSName("type")
  var type_Hash: typings.handlebars.handlebarsStrings.Hash
}

object Hash {
  @scala.inline
  def apply(loc: SourceLocation, pairs: js.Array[HashPair], `type`: typings.handlebars.handlebarsStrings.Hash): Hash = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
}

