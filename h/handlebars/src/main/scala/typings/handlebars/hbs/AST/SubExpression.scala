package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubExpression extends Node {
  var hash: Hash
  var params: js.Array[Expression]
  var path: PathExpression
  @JSName("type")
  var type_SubExpression: typings.handlebars.handlebarsStrings.SubExpression
}

object SubExpression {
  @scala.inline
  def apply(
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression,
    `type`: typings.handlebars.handlebarsStrings.SubExpression
  ): SubExpression = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubExpression]
  }
}

