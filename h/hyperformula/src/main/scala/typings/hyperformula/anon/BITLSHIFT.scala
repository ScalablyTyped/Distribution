package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BITLSHIFT extends StObject {
  
  var BITLSHIFT: MethodParameters
  
  var BITRSHIFT: MethodParameters
}
object BITLSHIFT {
  
  inline def apply(BITLSHIFT: MethodParameters, BITRSHIFT: MethodParameters): BITLSHIFT = {
    val __obj = js.Dynamic.literal(BITLSHIFT = BITLSHIFT.asInstanceOf[js.Any], BITRSHIFT = BITRSHIFT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BITLSHIFT]
  }
  
  extension [Self <: BITLSHIFT](x: Self) {
    
    inline def setBITLSHIFT(value: MethodParameters): Self = StObject.set(x, "BITLSHIFT", value.asInstanceOf[js.Any])
    
    inline def setBITRSHIFT(value: MethodParameters): Self = StObject.set(x, "BITRSHIFT", value.asInstanceOf[js.Any])
  }
}
