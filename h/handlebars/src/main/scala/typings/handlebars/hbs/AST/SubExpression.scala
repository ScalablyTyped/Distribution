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
    val __obj = js.Dynamic.literal(hash = hash, loc = loc, params = params, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SubExpression]
  }
}

