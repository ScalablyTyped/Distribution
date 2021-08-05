package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanLiteral
  extends StObject
     with Base[typings.luaparse.luaparseStrings.BooleanLiteral]
     with Expression {
  
  var raw: String
  
  var value: Boolean
}
object BooleanLiteral {
  
  inline def apply(raw: String, value: Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[BooleanLiteral]
  }
  
  extension [Self <: BooleanLiteral](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
