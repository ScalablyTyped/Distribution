package typings.loglevelnext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DEBUG extends StObject {
    
    var DEBUG: Double
    
    var ERROR: Double
    
    var INFO: Double
    
    var SILENT: Double
    
    var TRACE: Double
    
    var WARN: Double
  }
  object DEBUG {
    
    inline def apply(DEBUG: Double, ERROR: Double, INFO: Double, SILENT: Double, TRACE: Double, WARN: Double): DEBUG = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEBUG]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DEBUG] (val x: Self) extends AnyVal {
      
      inline def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setSILENT(value: Double): Self = StObject.set(x, "SILENT", value.asInstanceOf[js.Any])
      
      inline def setTRACE(value: Double): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
}
