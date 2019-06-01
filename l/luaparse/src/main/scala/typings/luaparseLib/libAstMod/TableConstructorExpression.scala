package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableConstructorExpression
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.TableConstructorExpression] {
  var fields: js.Array[TableKey | TableKeyString]
}

object TableConstructorExpression {
  @scala.inline
  def apply(
    fields: js.Array[TableKey | TableKeyString],
    `type`: luaparseLib.luaparseLibStrings.TableConstructorExpression
  ): TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableConstructorExpression]
  }
}

