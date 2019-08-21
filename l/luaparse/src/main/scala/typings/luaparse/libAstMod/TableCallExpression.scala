package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCallExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.TableCallExpression] {
  var arguments: Expression
  var base: Expression
}

object TableCallExpression {
  @scala.inline
  def apply(
    arguments: Expression,
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.TableCallExpression,
    loc: Anon_End = null
  ): TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, base = base)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[TableCallExpression]
  }
}

