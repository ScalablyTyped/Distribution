package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LessThan extends StObject {
  
  var argumentType: ArgumentTypes
  
  var lessThan: Double
  
  var minValue: Double
}
object LessThan {
  
  inline def apply(argumentType: ArgumentTypes, lessThan: Double, minValue: Double): LessThan = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], lessThan = lessThan.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LessThan]
  }
  
  extension [Self <: LessThan](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: Double): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
