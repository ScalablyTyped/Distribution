package typings.logkitty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DEBUG extends StObject {
    
    var DEBUG: Double
    
    var ERROR: Double
    
    var FATAL: Double
    
    var INFO: Double
    
    var SILENT: Double
    
    var UNKNOWN: Double
    
    var VERBOSE: Double
    
    var WARN: Double
  }
  object DEBUG {
    
    inline def apply(
      DEBUG: Double,
      ERROR: Double,
      FATAL: Double,
      INFO: Double,
      SILENT: Double,
      UNKNOWN: Double,
      VERBOSE: Double,
      WARN: Double
    ): DEBUG = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], VERBOSE = VERBOSE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEBUG]
    }
    
    extension [Self <: DEBUG](x: Self) {
      
      inline def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setFATAL(value: Double): Self = StObject.set(x, "FATAL", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setSILENT(value: Double): Self = StObject.set(x, "SILENT", value.asInstanceOf[js.Any])
      
      inline def setUNKNOWN(value: Double): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
      
      inline def setVERBOSE(value: Double): Self = StObject.set(x, "VERBOSE", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  trait DEFAULT extends StObject {
    
    var DEBUG: Double
    
    var DEFAULT: Double
    
    var ERROR: Double
    
    var INFO: Double
  }
  object DEFAULT {
    
    inline def apply(DEBUG: Double, DEFAULT: Double, ERROR: Double, INFO: Double): DEFAULT = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEFAULT]
    }
    
    extension [Self <: DEFAULT](x: Self) {
      
      inline def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setDEFAULT(value: Double): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromName extends StObject {
    
    def fromName(key: Any): Double
  }
  object FromName {
    
    inline def apply(fromName: Any => Double): FromName = {
      val __obj = js.Dynamic.literal(fromName = js.Any.fromFunction1(fromName))
      __obj.asInstanceOf[FromName]
    }
    
    extension [Self <: FromName](x: Self) {
      
      inline def setFromName(value: Any => Double): Self = StObject.set(x, "fromName", js.Any.fromFunction1(value))
    }
  }
}
