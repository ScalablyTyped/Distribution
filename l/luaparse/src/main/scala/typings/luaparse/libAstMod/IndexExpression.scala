package typings.luaparse.libAstMod

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
  def apply(base: Expression, index: Expression, `type`: typings.luaparse.luaparseStrings.IndexExpression): IndexExpression = {
    val __obj = js.Dynamic.literal(base = base, index = index)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IndexExpression]
  }
}

