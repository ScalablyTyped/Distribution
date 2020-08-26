package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialBlockStatement extends Node {
  var closeStrip: StripFlags = js.native
  var hash: Hash = js.native
  var name: PathExpression | SubExpression = js.native
  var openStrip: StripFlags = js.native
  var params: js.Array[Expression] = js.native
  var program: Program = js.native
  @JSName("type")
  var type_PartialBlockStatement: typings.handlebars.handlebarsStrings.PartialBlockStatement = js.native
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
  @scala.inline
  implicit class PartialBlockStatementOps[Self <: PartialBlockStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloseStrip(value: StripFlags): Self = this.set("closeStrip", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: Hash): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: PathExpression | SubExpression): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenStrip(value: StripFlags): Self = this.set("openStrip", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: Expression*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[Expression]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgram(value: Program): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.PartialBlockStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

