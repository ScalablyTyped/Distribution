package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElseClause
  extends Base[typings.luaparse.luaparseStrings.ElseClause]
     with _Node {
  var body: js.Array[Statement]
}

object ElseClause {
  @scala.inline
  def apply(body: js.Array[Statement], `type`: typings.luaparse.luaparseStrings.ElseClause): ElseClause = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ElseClause]
  }
}

