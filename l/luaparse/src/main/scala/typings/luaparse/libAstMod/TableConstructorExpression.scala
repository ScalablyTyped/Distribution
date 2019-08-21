package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableConstructorExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.TableConstructorExpression] {
  var fields: js.Array[TableKey | TableKeyString | TableValue]
}

object TableConstructorExpression {
  @scala.inline
  def apply(
    fields: js.Array[TableKey | TableKeyString | TableValue],
    `type`: typings.luaparse.luaparseStrings.TableConstructorExpression,
    loc: Anon_End = null
  ): TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[TableConstructorExpression]
  }
}

