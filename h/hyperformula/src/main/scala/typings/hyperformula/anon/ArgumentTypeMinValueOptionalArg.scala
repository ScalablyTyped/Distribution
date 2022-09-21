package typings.hyperformula.anon

import typings.hyperformula.functionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeMinValueOptionalArg extends StObject {
  
  var argumentType: ArgumentTypes
  
  var minValue: Unit
  
  var optionalArg: Boolean
}
object ArgumentTypeMinValueOptionalArg {
  
  inline def apply(argumentType: ArgumentTypes, minValue: Unit, optionalArg: Boolean): ArgumentTypeMinValueOptionalArg = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], optionalArg = optionalArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeMinValueOptionalArg]
  }
  
  extension [Self <: ArgumentTypeMinValueOptionalArg](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Boolean): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
