package typings.luaparse.astMod

import typings.luaparse.anon.End
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
    loc: End = null
  ): IndexExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexExpression]
  }
}

