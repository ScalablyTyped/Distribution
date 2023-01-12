package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISOCEILING extends StObject {
  
  @JSName("ISO.CEILING")
  var ISODotCEILING: String
  
  var TRUNC: String
}
object ISOCEILING {
  
  inline def apply(ISODotCEILING: String, TRUNC: String): ISOCEILING = {
    val __obj = js.Dynamic.literal(TRUNC = TRUNC.asInstanceOf[js.Any])
    __obj.updateDynamic("ISO.CEILING")(ISODotCEILING.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISOCEILING]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISOCEILING] (val x: Self) extends AnyVal {
    
    inline def setISODotCEILING(value: String): Self = StObject.set(x, "ISO.CEILING", value.asInstanceOf[js.Any])
    
    inline def setTRUNC(value: String): Self = StObject.set(x, "TRUNC", value.asInstanceOf[js.Any])
  }
}
