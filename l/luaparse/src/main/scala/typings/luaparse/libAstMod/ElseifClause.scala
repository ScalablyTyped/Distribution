package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElseifClause
  extends Base[typings.luaparse.luaparseStrings.ElseifClause]
     with _Node {
  var body: js.Array[Statement]
  var condition: Expression
}

object ElseifClause {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.ElseifClause,
    loc: Anon_End = null
  ): ElseifClause = {
    val __obj = js.Dynamic.literal(body = body, condition = condition)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ElseifClause]
  }
}

