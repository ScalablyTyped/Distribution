package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableConstructorExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.TableConstructorExpression] {
  
  var fields: js.Array[TableKey | TableKeyString | TableValue] = js.native
}
object TableConstructorExpression {
  
  @scala.inline
  def apply(
    fields: js.Array[TableKey | TableKeyString | TableValue],
    `type`: typings.luaparse.luaparseStrings.TableConstructorExpression
  ): TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableConstructorExpression]
  }
  
  @scala.inline
  implicit class TableConstructorExpressionMutableBuilder[Self <: TableConstructorExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[TableKey | TableKeyString | TableValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: (TableKey | TableKeyString | TableValue)*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
