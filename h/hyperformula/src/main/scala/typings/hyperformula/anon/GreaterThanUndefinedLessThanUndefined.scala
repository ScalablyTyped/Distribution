package typings.hyperformula.anon

import typings.hyperformula.functionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreaterThanUndefinedLessThanUndefined extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Unit
  
  var lessThan: Unit
}
object GreaterThanUndefinedLessThanUndefined {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Unit, lessThan: Unit): GreaterThanUndefinedLessThanUndefined = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any], lessThan = lessThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreaterThanUndefinedLessThanUndefined]
  }
  
  extension [Self <: GreaterThanUndefinedLessThanUndefined](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Unit): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: Unit): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
  }
}
