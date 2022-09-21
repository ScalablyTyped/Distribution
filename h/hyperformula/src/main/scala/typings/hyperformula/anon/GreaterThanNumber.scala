package typings.hyperformula.anon

import typings.hyperformula.functionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreaterThanNumber extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Double
}
object GreaterThanNumber {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Double): GreaterThanNumber = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreaterThanNumber]
  }
  
  extension [Self <: GreaterThanNumber](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Double): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
  }
}
