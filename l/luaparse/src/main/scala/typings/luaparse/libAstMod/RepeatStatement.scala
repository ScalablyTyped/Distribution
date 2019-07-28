package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.RepeatStatement] {
  var body: js.Array[Statement]
  var condition: Expression
}

object RepeatStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.RepeatStatement
  ): RepeatStatement = {
    val __obj = js.Dynamic.literal(body = body, condition = condition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RepeatStatement]
  }
}

