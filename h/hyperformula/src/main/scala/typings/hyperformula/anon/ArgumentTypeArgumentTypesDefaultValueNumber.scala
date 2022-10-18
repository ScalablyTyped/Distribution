package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeArgumentTypesDefaultValueNumber extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Double
  
  var greaterThan: Unit
}
object ArgumentTypeArgumentTypesDefaultValueNumber {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Double, greaterThan: Unit): ArgumentTypeArgumentTypesDefaultValueNumber = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeArgumentTypesDefaultValueNumber]
  }
  
  extension [Self <: ArgumentTypeArgumentTypesDefaultValueNumber](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Unit): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
  }
}
