package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionsLogger extends StObject {
  
  def log(severity: VerboseLevel, msg: String): Unit
  
  var time: Double | Null
  
  var verboseLevel: VerboseLevel
}
object CaptionsLogger {
  
  inline def apply(log: (VerboseLevel, String) => Unit, verboseLevel: VerboseLevel): CaptionsLogger = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log), verboseLevel = verboseLevel.asInstanceOf[js.Any], time = null)
    __obj.asInstanceOf[CaptionsLogger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptionsLogger] (val x: Self) extends AnyVal {
    
    inline def setLog(value: (VerboseLevel, String) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setVerboseLevel(value: VerboseLevel): Self = StObject.set(x, "verboseLevel", value.asInstanceOf[js.Any])
  }
}
