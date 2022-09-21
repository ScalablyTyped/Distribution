package typings.hyperformula.anon

import typings.hyperformula.functionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeArgumentTypesGreaterThanUndefined extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Unit
}
object ArgumentTypeArgumentTypesGreaterThanUndefined {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Unit): ArgumentTypeArgumentTypesGreaterThanUndefined = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeArgumentTypesGreaterThanUndefined]
  }
  
  extension [Self <: ArgumentTypeArgumentTypesGreaterThanUndefined](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Unit): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
  }
}
