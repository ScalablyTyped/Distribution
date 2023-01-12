package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableConstructorExpression
  extends StObject
     with Base[typings.luaparse.luaparseStrings.TableConstructorExpression]
     with Expression {
  
  var fields: js.Array[TableKey | TableKeyString | TableValue]
}
object TableConstructorExpression {
  
  inline def apply(fields: js.Array[TableKey | TableKeyString | TableValue]): TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableConstructorExpression")
    __obj.asInstanceOf[TableConstructorExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableConstructorExpression] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[TableKey | TableKeyString | TableValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: (TableKey | TableKeyString | TableValue)*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
