package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CHAR extends StObject {
  
  var CHAR: Method
  
  var UNICHAR: Method
}
object CHAR {
  
  inline def apply(CHAR: Method, UNICHAR: Method): CHAR = {
    val __obj = js.Dynamic.literal(CHAR = CHAR.asInstanceOf[js.Any], UNICHAR = UNICHAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHAR]
  }
  
  extension [Self <: CHAR](x: Self) {
    
    inline def setCHAR(value: Method): Self = StObject.set(x, "CHAR", value.asInstanceOf[js.Any])
    
    inline def setUNICHAR(value: Method): Self = StObject.set(x, "UNICHAR", value.asInstanceOf[js.Any])
  }
}
