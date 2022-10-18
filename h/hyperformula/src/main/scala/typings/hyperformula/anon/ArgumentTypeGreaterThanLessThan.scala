package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeGreaterThanLessThan extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Unit
  
  var lessThan: Double
  
  var minValue: Double
}
object ArgumentTypeGreaterThanLessThan {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Unit, lessThan: Double, minValue: Double): ArgumentTypeGreaterThanLessThan = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any], lessThan = lessThan.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeGreaterThanLessThan]
  }
  
  extension [Self <: ArgumentTypeGreaterThanLessThan](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Unit): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: Double): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
