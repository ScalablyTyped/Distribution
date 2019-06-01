package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForNumericStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.ForNumericStatement] {
  var body: js.Array[Statement]
  var end: Expression
  var start: Expression
  var step: Expression | scala.Null
  var variable: Identifier
}

object ForNumericStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    end: Expression,
    start: Expression,
    `type`: luaparseLib.luaparseLibStrings.ForNumericStatement,
    variable: Identifier,
    step: Expression = null
  ): ForNumericStatement = {
    val __obj = js.Dynamic.literal(body = body, end = end, start = start, variable = variable)
    __obj.updateDynamic("type")(`type`)
    if (step != null) __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[ForNumericStatement]
  }
}

