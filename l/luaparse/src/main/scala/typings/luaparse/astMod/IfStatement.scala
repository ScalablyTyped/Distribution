package typings.luaparse.astMod

import typings.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.IfStatement] {
  var clauses: js.Array[IfClause | ElseifClause | ElseClause]
}

object IfStatement {
  @scala.inline
  def apply(
    clauses: js.Array[IfClause | ElseifClause | ElseClause],
    `type`: typings.luaparse.luaparseStrings.IfStatement,
    loc: AnonEnd = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
}

