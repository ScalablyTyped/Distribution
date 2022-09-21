package typings.jexl.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jexl.astMod.Ast
import typings.jexl.jexlStrings.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValue
  extends StObject
     with Ast {
  
  var `type`: ObjectLiteral
  
  var value: StringDictionary[Ast]
}
object TypeValue {
  
  inline def apply(value: StringDictionary[Ast]): TypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectLiteral")
    __obj.asInstanceOf[TypeValue]
  }
  
  extension [Self <: TypeValue](x: Self) {
    
    inline def setType(value: ObjectLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StringDictionary[Ast]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
