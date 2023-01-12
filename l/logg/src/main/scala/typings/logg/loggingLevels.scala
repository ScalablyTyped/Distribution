package typings.logg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait loggingLevels extends StObject {
  
  var FINE: Double
  
  var FINER: Double
  
  var FINEST: Double
  
  var INFO: Double
  
  var SEVERE: Double
  
  var WARN: Double
  
  def toString(level: Double): String
}
object loggingLevels {
  
  inline def apply(
    FINE: Double,
    FINER: Double,
    FINEST: Double,
    INFO: Double,
    SEVERE: Double,
    WARN: Double,
    toString_ : Double => String
  ): loggingLevels = {
    val __obj = js.Dynamic.literal(FINE = FINE.asInstanceOf[js.Any], FINER = FINER.asInstanceOf[js.Any], FINEST = FINEST.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SEVERE = SEVERE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[loggingLevels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: loggingLevels] (val x: Self) extends AnyVal {
    
    inline def setFINE(value: Double): Self = StObject.set(x, "FINE", value.asInstanceOf[js.Any])
    
    inline def setFINER(value: Double): Self = StObject.set(x, "FINER", value.asInstanceOf[js.Any])
    
    inline def setFINEST(value: Double): Self = StObject.set(x, "FINEST", value.asInstanceOf[js.Any])
    
    inline def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    inline def setSEVERE(value: Double): Self = StObject.set(x, "SEVERE", value.asInstanceOf[js.Any])
    
    inline def setToString_(value: Double => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    
    inline def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
  }
}
