package typings.handlebars

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var DEBUG: Double
  
  var ERROR: Double
  
  var INFO: Double
  
  var WARN: Double
  
  var level: Double
  
  def log(level: Double, obj: String): Unit
  
  var methodMap: NumberDictionary[String]
}
object Logger {
  
  inline def apply(
    DEBUG: Double,
    ERROR: Double,
    INFO: Double,
    WARN: Double,
    level: Double,
    log: (Double, String) => Unit,
    methodMap: NumberDictionary[String]
  ): Logger = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], log = js.Any.fromFunction2(log), methodMap = methodMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLog(value: (Double, String) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    inline def setMethodMap(value: NumberDictionary[String]): Self = StObject.set(x, "methodMap", value.asInstanceOf[js.Any])
    
    inline def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
  }
}
