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
  @JSName("type")
  var type_BlockStatement: typings.handlebars.handlebarsStrings.BlockStatement
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
    `type`: typings.handlebars.handlebarsStrings.BlockStatement
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(closeStrip = closeStrip.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], inverseStrip = inverseStrip.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openStrip = openStrip.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement]
  }
}

