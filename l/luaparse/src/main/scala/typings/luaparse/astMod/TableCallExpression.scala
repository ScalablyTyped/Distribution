package typings.luaparse.astMod

import typings.luaparse.anon.End
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
    loc: End = null
  ): TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCallExpression]
  }
}

