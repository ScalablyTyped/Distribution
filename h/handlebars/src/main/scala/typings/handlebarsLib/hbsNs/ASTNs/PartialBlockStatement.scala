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
    val __obj = js.Dynamic.literal(closeStrip = closeStrip, hash = hash, loc = loc, name = name.asInstanceOf[js.Any], openStrip = openStrip, params = params, program = program)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PartialBlockStatement]
  }
}

