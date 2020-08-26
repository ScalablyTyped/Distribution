package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.IfStatement] {
  var clauses: js.Array[IfClause | ElseifClause | ElseClause] = js.native
}

object IfStatement {
  @scala.inline
  def apply(
    clauses: js.Array[IfClause | ElseifClause | ElseClause],
    `type`: typings.luaparse.luaparseStrings.IfStatement
  ): IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
  @scala.inline
  implicit class IfStatementOps[Self <: IfStatement] (val x: Self) extends AnyVal {
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
    def setClausesVarargs(value: (IfClause | ElseifClause | ElseClause)*): Self = this.set("clauses", js.Array(value :_*))
    @scala.inline
    def setClauses(value: js.Array[IfClause | ElseifClause | ElseClause]): Self = this.set("clauses", value.asInstanceOf[js.Any])
  }
  
}

