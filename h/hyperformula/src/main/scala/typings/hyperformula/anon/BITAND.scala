package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BITAND extends StObject {
  
  var BITAND: MethodString
  
  var BITOR: MethodString
  
  var BITXOR: MethodString
}
object BITAND {
  
  inline def apply(BITAND: MethodString, BITOR: MethodString, BITXOR: MethodString): BITAND = {
    val __obj = js.Dynamic.literal(BITAND = BITAND.asInstanceOf[js.Any], BITOR = BITOR.asInstanceOf[js.Any], BITXOR = BITXOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[BITAND]
  }
  
  extension [Self <: BITAND](x: Self) {
    
    inline def setBITAND(value: MethodString): Self = StObject.set(x, "BITAND", value.asInstanceOf[js.Any])
    
    inline def setBITOR(value: MethodString): Self = StObject.set(x, "BITOR", value.asInstanceOf[js.Any])
    
    inline def setBITXOR(value: MethodString): Self = StObject.set(x, "BITXOR", value.asInstanceOf[js.Any])
  }
}
