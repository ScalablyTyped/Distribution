package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElseifClause
  extends Base[luaparseLib.luaparseLibStrings.ElseifClause]
     with _Node {
  var body: js.Array[Statement]
  var condition: Expression
}

object ElseifClause {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: luaparseLib.luaparseLibStrings.ElseifClause
  ): ElseifClause = {
    val __obj = js.Dynamic.literal(body = body, condition = condition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ElseifClause]
  }
}

