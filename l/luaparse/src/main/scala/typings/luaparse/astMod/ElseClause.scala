package typings.luaparse.astMod

import typings.luaparse.anon.End
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
  def apply(body: js.Array[Statement], `type`: typings.luaparse.luaparseStrings.ElseClause, loc: End = null): ElseClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElseClause]
  }
}

