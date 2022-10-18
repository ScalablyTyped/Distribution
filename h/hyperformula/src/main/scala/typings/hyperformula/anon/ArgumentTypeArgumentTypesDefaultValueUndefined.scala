package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeArgumentTypesDefaultValueUndefined extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Unit
  
  var minValue: Unit
  
  var optionalArg: Unit
}
object ArgumentTypeArgumentTypesDefaultValueUndefined {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Unit, minValue: Unit, optionalArg: Unit): ArgumentTypeArgumentTypesDefaultValueUndefined = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], optionalArg = optionalArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeArgumentTypesDefaultValueUndefined]
  }
  
  extension [Self <: ArgumentTypeArgumentTypesDefaultValueUndefined](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Unit): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Unit): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
