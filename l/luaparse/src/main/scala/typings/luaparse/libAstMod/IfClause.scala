package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfClause
  extends Base[typings.luaparse.luaparseStrings.IfClause]
     with _Node {
  var body: js.Array[Statement]
  var condition: Expression
}

object IfClause {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.IfClause
  ): IfClause = {
    val __obj = js.Dynamic.literal(body = body, condition = condition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IfClause]
  }
}

