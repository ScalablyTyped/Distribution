package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.IndexExpression] {
  var base: Expression
  var index: Expression
}

object IndexExpression {
  @scala.inline
  def apply(
    base: Expression,
    index: Expression,
    `type`: typings.luaparse.luaparseStrings.IndexExpression,
    loc: Anon_End = null
  ): IndexExpression = {
    val __obj = js.Dynamic.literal(base = base, index = index)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[IndexExpression]
  }
}

