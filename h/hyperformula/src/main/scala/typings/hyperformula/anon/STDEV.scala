package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STDEV extends StObject {
  
  var STDEV: String
  
  var STDEVP: String
  
  var STDEVS: String
  
  var VAR: String
  
  var VARP: String
  
  var VARS: String
}
object STDEV {
  
  inline def apply(STDEV: String, STDEVP: String, STDEVS: String, VAR: String, VARP: String, VARS: String): STDEV = {
    val __obj = js.Dynamic.literal(STDEV = STDEV.asInstanceOf[js.Any], STDEVP = STDEVP.asInstanceOf[js.Any], STDEVS = STDEVS.asInstanceOf[js.Any], VAR = VAR.asInstanceOf[js.Any], VARP = VARP.asInstanceOf[js.Any], VARS = VARS.asInstanceOf[js.Any])
    __obj.asInstanceOf[STDEV]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: STDEV] (val x: Self) extends AnyVal {
    
    inline def setSTDEV(value: String): Self = StObject.set(x, "STDEV", value.asInstanceOf[js.Any])
    
    inline def setSTDEVP(value: String): Self = StObject.set(x, "STDEVP", value.asInstanceOf[js.Any])
    
    inline def setSTDEVS(value: String): Self = StObject.set(x, "STDEVS", value.asInstanceOf[js.Any])
    
    inline def setVAR(value: String): Self = StObject.set(x, "VAR", value.asInstanceOf[js.Any])
    
    inline def setVARP(value: String): Self = StObject.set(x, "VARP", value.asInstanceOf[js.Any])
    
    inline def setVARS(value: String): Self = StObject.set(x, "VARS", value.asInstanceOf[js.Any])
  }
}
