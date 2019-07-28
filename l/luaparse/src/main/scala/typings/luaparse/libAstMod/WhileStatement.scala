package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhileStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.WhileStatement] {
  var body: js.Array[Statement]
  var condition: Expression
}

object WhileStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.WhileStatement
  ): WhileStatement = {
    val __obj = js.Dynamic.literal(body = body, condition = condition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WhileStatement]
  }
}

