package typings.jexl.anon

import typings.jexl.astMod.Ast
import typings.jexl.jexlStrings.ArrayLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with Ast {
  
  var `type`: ArrayLiteral
  
  var value: js.Array[Ast]
}
object Value {
  
  inline def apply(value: js.Array[Ast]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayLiteral")
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setType(value: ArrayLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Ast]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Ast*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
