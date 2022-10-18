package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreaterThanUndefinedMinValueUndefined extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Unit
  
  var minValue: Unit
}
object GreaterThanUndefinedMinValueUndefined {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Unit, minValue: Unit): GreaterThanUndefinedMinValueUndefined = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreaterThanUndefinedMinValueUndefined]
  }
  
  extension [Self <: GreaterThanUndefinedMinValueUndefined](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Unit): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
