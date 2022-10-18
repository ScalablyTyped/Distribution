package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableValue
  extends StObject
     with Base[typings.luaparse.luaparseStrings.TableValue]
     with _Node {
  
  var value: Expression
}
object TableValue {
  
  inline def apply(value: Expression): TableValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableValue")
    __obj.asInstanceOf[TableValue]
  }
  
  extension [Self <: TableValue](x: Self) {
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
