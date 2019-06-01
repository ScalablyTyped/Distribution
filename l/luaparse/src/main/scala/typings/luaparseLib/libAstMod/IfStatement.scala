package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.IfStatement] {
  var clauses: js.Array[IfClause]
}

object IfStatement {
  @scala.inline
  def apply(clauses: js.Array[IfClause], `type`: luaparseLib.luaparseLibStrings.IfStatement): IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IfStatement]
  }
}

