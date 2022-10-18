package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreaterThanLessThanMinValue extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Double
  
  var lessThan: Unit
  
  var minValue: Unit
}
object GreaterThanLessThanMinValue {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Double, lessThan: Unit, minValue: Unit): GreaterThanLessThanMinValue = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any], lessThan = lessThan.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreaterThanLessThanMinValue]
  }
  
  extension [Self <: GreaterThanLessThanMinValue](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Double): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: Unit): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
