package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialBlockStatement extends Node {
  var closeStrip: StripFlags
  var hash: Hash
  var name: PathExpression | SubExpression
  var openStrip: StripFlags
  var params: js.Array[Expression]
  var program: Program
}

object PartialBlockStatement {
  @scala.inline
  def apply(
    closeStrip: StripFlags,
    hash: Hash,
    loc: SourceLocation,
    name: PathExpression | SubExpression,
    openStrip: StripFlags,
    params: js.Array[Expression],
    program: Program,
    `type`: java.lang.String
  ): PartialBlockStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("closeStrip")(closeStrip)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("openStrip")(openStrip)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("program")(program)
    __obj.asInstanceOf[PartialBlockStatement]
  }
}

