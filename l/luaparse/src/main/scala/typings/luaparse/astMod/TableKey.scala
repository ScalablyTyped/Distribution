package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableKey
  extends StObject
     with Base[typings.luaparse.luaparseStrings.TableKey]
     with _Node {
  
  var key: Expression
  
  var value: Expression
}
object TableKey {
  
  inline def apply(key: Expression, value: Expression): TableKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableKey")
    __obj.asInstanceOf[TableKey]
  }
  
  extension [Self <: TableKey](x: Self) {
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
