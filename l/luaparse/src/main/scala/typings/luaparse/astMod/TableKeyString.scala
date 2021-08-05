package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableKeyString
  extends StObject
     with Base[typings.luaparse.luaparseStrings.TableKeyString]
     with _Node {
  
  var key: Identifier
  
  var value: Expression
}
object TableKeyString {
  
  inline def apply(key: Identifier, value: Expression): TableKeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableKeyString")
    __obj.asInstanceOf[TableKeyString]
  }
  
  extension [Self <: TableKeyString](x: Self) {
    
    inline def setKey(value: Identifier): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
