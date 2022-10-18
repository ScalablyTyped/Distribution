package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinValueUndefined extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Unit
  
  var minValue: Unit
  
  var optionalArg: Boolean
}
object MinValueUndefined {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Unit, minValue: Unit, optionalArg: Boolean): MinValueUndefined = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], optionalArg = optionalArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinValueUndefined]
  }
  
  extension [Self <: MinValueUndefined](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Unit): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Boolean): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
