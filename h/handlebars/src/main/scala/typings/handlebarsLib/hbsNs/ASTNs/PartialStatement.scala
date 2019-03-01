package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialStatement extends Node {
  var hash: Hash
  var indent: java.lang.String
  var name: PathExpression | SubExpression
  var params: js.Array[Expression]
  var strip: StripFlags
}

object PartialStatement {
  @scala.inline
  def apply(
    hash: Hash,
    indent: java.lang.String,
    loc: SourceLocation,
    name: PathExpression | SubExpression,
    params: js.Array[Expression],
    strip: StripFlags,
    `type`: java.lang.String
  ): PartialStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("indent")(indent)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("strip")(strip)
    __obj.asInstanceOf[PartialStatement]
  }
}

