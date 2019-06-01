package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.RepeatStatement] {
  var body: js.Array[Statement]
  var condition: Expression
}

object RepeatStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: luaparseLib.luaparseLibStrings.RepeatStatement
  ): RepeatStatement = {
    val __obj = js.Dynamic.literal(body = body, condition = condition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RepeatStatement]
  }
}

