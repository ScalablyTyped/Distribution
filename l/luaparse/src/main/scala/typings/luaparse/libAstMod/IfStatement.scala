package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
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
    loc: Anon_End = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[IfStatement]
  }
}

