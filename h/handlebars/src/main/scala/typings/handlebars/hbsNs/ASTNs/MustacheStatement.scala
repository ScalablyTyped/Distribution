package typings.handlebars.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MustacheStatement extends Node {
  var escaped: Boolean
  var hash: Hash
  var params: js.Array[Expression]
  var path: PathExpression | Literal
  var strip: StripFlags
}

object MustacheStatement {
  @scala.inline
  def apply(
    escaped: Boolean,
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression | Literal,
    strip: StripFlags,
    `type`: String
  ): MustacheStatement = {
    val __obj = js.Dynamic.literal(escaped = escaped, hash = hash, loc = loc, params = params, path = path.asInstanceOf[js.Any], strip = strip)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MustacheStatement]
  }
}

