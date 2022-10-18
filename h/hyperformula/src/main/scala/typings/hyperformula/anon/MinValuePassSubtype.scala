package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinValuePassSubtype extends StObject {
  
  var argumentType: ArgumentTypes
  
  var minValue: Double
  
  var passSubtype: Unit
}
object MinValuePassSubtype {
  
  inline def apply(argumentType: ArgumentTypes, minValue: Double, passSubtype: Unit): MinValuePassSubtype = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], passSubtype = passSubtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinValuePassSubtype]
  }
  
  extension [Self <: MinValuePassSubtype](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setPassSubtype(value: Unit): Self = StObject.set(x, "passSubtype", value.asInstanceOf[js.Any])
  }
}
