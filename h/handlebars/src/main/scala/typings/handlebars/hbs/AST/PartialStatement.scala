package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialStatement extends Node {
  var hash: Hash
  var indent: String
  var name: PathExpression | SubExpression
  var params: js.Array[Expression]
  var strip: StripFlags
  @JSName("type")
  var type_PartialStatement: typings.handlebars.handlebarsStrings.PartialStatement
}

object PartialStatement {
  @scala.inline
  def apply(
    hash: Hash,
    indent: String,
    loc: SourceLocation,
    name: PathExpression | SubExpression,
    params: js.Array[Expression],
    strip: StripFlags,
    `type`: typings.handlebars.handlebarsStrings.PartialStatement
  ): PartialStatement = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStatement]
  }
}

