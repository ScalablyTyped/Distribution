package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgumentTypeMinValueOptionalArg] (val x: Self) extends AnyVal {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Boolean): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
