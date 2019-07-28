package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableConstructorExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.TableConstructorExpression] {
  var fields: js.Array[TableKey | TableKeyString]
}

object TableConstructorExpression {
  @scala.inline
  def apply(
    fields: js.Array[TableKey | TableKeyString],
    `type`: typings.luaparse.luaparseStrings.TableConstructorExpression
  ): TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableConstructorExpression]
  }
}

