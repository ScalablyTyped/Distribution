package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElseifClause
  extends Base[typings.luaparse.luaparseStrings.ElseifClause]
     with _Node {
  var body: js.Array[Statement] = js.native
  var condition: Expression = js.native
}

object ElseifClause {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.ElseifClause
  ): ElseifClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElseifClause]
  }
  @scala.inline
  implicit class ElseifClauseOps[Self <: ElseifClause] (val x: Self) extends AnyVal {
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
    def setBodyVarargs(value: Statement*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: Expression): Self = this.set("condition", value.asInstanceOf[js.Any])
  }
  
}

