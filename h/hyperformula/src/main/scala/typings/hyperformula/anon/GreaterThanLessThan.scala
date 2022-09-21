package typings.hyperformula.anon

import typings.hyperformula.functionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreaterThanLessThan extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Double
  
  var lessThan: Double
}
object GreaterThanLessThan {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Double, lessThan: Double): GreaterThanLessThan = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any], lessThan = lessThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreaterThanLessThan]
  }
  
  extension [Self <: GreaterThanLessThan](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Double): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: Double): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
  }
}
