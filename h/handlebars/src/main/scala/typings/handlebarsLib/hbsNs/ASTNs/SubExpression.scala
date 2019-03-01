package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubExpression extends Node {
  var hash: Hash
  var params: js.Array[Expression]
  var path: PathExpression
}

object SubExpression {
  @scala.inline
  def apply(
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression,
    `type`: java.lang.String
  ): SubExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[SubExpression]
  }
}

