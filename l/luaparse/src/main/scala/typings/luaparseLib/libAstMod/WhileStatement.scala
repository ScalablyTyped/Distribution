package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhileStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.WhileStatement] {
  var body: js.Array[Statement]
  var condition: Expression
}

object WhileStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: luaparseLib.luaparseLibStrings.WhileStatement
  ): WhileStatement = {
    val __obj = js.Dynamic.literal(body = body, condition = condition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WhileStatement]
  }
}

