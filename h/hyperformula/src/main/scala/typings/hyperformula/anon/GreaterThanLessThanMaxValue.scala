package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreaterThanLessThanMaxValue extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Unit
  
  var lessThan: Unit
  
  var maxValue: Double
  
  var minValue: Double
}
object GreaterThanLessThanMaxValue {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Unit, lessThan: Unit, maxValue: Double, minValue: Double): GreaterThanLessThanMaxValue = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any], lessThan = lessThan.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreaterThanLessThanMaxValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GreaterThanLessThanMaxValue] (val x: Self) extends AnyVal {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Unit): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: Unit): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
