package typings.handlebars.hbs.AST

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
  @JSName("type")
  var type_PartialBlockStatement: typings.handlebars.handlebarsStrings.PartialBlockStatement
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
    `type`: typings.handlebars.handlebarsStrings.PartialBlockStatement
  ): PartialBlockStatement = {
    val __obj = js.Dynamic.literal(closeStrip = closeStrip.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openStrip = openStrip.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBlockStatement]
  }
}

