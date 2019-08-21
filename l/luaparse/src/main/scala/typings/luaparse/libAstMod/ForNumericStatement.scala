package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForNumericStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.ForNumericStatement] {
  var body: js.Array[Statement]
  var end: Expression
  var start: Expression
  var step: Expression | Null
  var variable: Identifier
}

object ForNumericStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    end: Expression,
    start: Expression,
    `type`: typings.luaparse.luaparseStrings.ForNumericStatement,
    variable: Identifier,
    loc: Anon_End = null,
    step: Expression = null
  ): ForNumericStatement = {
    val __obj = js.Dynamic.literal(body = body, end = end, start = start, variable = variable)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (step != null) __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[ForNumericStatement]
  }
}

