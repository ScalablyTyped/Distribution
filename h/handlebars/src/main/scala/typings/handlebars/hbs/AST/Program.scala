package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Program extends Node {
  var blockParams: js.Array[String] = js.native
  var body: js.Array[Statement] = js.native
}

object Program {
  @scala.inline
  def apply(blockParams: js.Array[String], body: js.Array[Statement], loc: SourceLocation, `type`: String): Program = {
    val __obj = js.Dynamic.literal(blockParams = blockParams.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
  @scala.inline
  implicit class ProgramOps[Self <: Program] (val x: Self) extends AnyVal {
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
    def setBlockParamsVarargs(value: String*): Self = this.set("blockParams", js.Array(value :_*))
    @scala.inline
    def setBlockParams(value: js.Array[String]): Self = this.set("blockParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = this.set("body", value.asInstanceOf[js.Any])
  }
  
}

