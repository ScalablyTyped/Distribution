package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
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
  def apply(
    body: js.Array[Statement],
    `type`: typings.luaparse.luaparseStrings.ElseClause,
    loc: Anon_End = null
  ): ElseClause = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ElseClause]
  }
}

