package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MustacheStatement extends Node {
  var escaped: scala.Boolean
  var hash: Hash
  var params: js.Array[Expression]
  var path: PathExpression | Literal
  var strip: StripFlags
}

object MustacheStatement {
  @scala.inline
  def apply(
    escaped: scala.Boolean,
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression | Literal,
    strip: StripFlags,
    `type`: java.lang.String
  ): MustacheStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("escaped")(escaped)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.updateDynamic("strip")(strip)
    __obj.asInstanceOf[MustacheStatement]
  }
}

