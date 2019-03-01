package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStatement extends Node {
  var closeStrip: StripFlags
  var hash: Hash
  var inverse: Program
  var inverseStrip: StripFlags
  var openStrip: StripFlags
  var params: js.Array[Expression]
  var path: PathExpression
  var program: Program
}

object BlockStatement {
  @scala.inline
  def apply(
    closeStrip: StripFlags,
    hash: Hash,
    inverse: Program,
    inverseStrip: StripFlags,
    loc: SourceLocation,
    openStrip: StripFlags,
    params: js.Array[Expression],
    path: PathExpression,
    program: Program,
    `type`: java.lang.String
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("closeStrip")(closeStrip)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("inverse")(inverse)
    __obj.updateDynamic("inverseStrip")(inverseStrip)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("openStrip")(openStrip)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("program")(program)
    __obj.asInstanceOf[BlockStatement]
  }
}

