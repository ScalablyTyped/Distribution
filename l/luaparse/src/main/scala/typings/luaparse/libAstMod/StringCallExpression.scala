package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCallExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.StringCallExpression] {
  var argument: Expression
  var base: Expression
}

object StringCallExpression {
  @scala.inline
  def apply(
    argument: Expression,
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.StringCallExpression,
    loc: Anon_End = null
  ): StringCallExpression = {
    val __obj = js.Dynamic.literal(argument = argument, base = base)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[StringCallExpression]
  }
}

