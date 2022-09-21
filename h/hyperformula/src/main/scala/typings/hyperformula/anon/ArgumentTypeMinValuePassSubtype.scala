package typings.hyperformula.anon

import typings.hyperformula.functionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeMinValuePassSubtype extends StObject {
  
  var argumentType: ArgumentTypes
  
  var minValue: Unit
  
  var passSubtype: Boolean
}
object ArgumentTypeMinValuePassSubtype {
  
  inline def apply(argumentType: ArgumentTypes, minValue: Unit, passSubtype: Boolean): ArgumentTypeMinValuePassSubtype = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], passSubtype = passSubtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeMinValuePassSubtype]
  }
  
  extension [Self <: ArgumentTypeMinValuePassSubtype](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setPassSubtype(value: Boolean): Self = StObject.set(x, "passSubtype", value.asInstanceOf[js.Any])
  }
}
