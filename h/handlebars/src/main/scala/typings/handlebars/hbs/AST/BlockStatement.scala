package typings.handlebars.hbs.AST

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
    `type`: String
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(closeStrip = closeStrip, hash = hash, inverse = inverse, inverseStrip = inverseStrip, loc = loc, openStrip = openStrip, params = params, path = path, program = program)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlockStatement]
  }
}

