package typings.logg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait loggingLevels extends StObject {
  
  var FINE: Double = js.native
  
  var FINER: Double = js.native
  
  var FINEST: Double = js.native
  
  var INFO: Double = js.native
  
  var SEVERE: Double = js.native
  
  var WARN: Double = js.native
  
  def toString(level: Double): String = js.native
}
object loggingLevels {
  
  @scala.inline
  def apply(
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
  implicit class loggingLevelsMutableBuilder[Self <: loggingLevels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFINE(value: Double): Self = StObject.set(x, "FINE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFINER(value: Double): Self = StObject.set(x, "FINER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFINEST(value: Double): Self = StObject.set(x, "FINEST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEVERE(value: Double): Self = StObject.set(x, "SEVERE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToString_(value: Double => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
  }
}
