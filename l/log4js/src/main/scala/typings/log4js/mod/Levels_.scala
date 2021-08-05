package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Levels_ extends StObject {
  
  var ALL: Level
  
  var DEBUG: Level
  
  var ERROR: Level
  
  var FATAL: Level
  
  var INFO: Level
  
  var MARK: Level
  
  var OFF: Level
  
  var TRACE: Level
  
  var WARN: Level
  
  def addLevels(customLevels: js.Object): Unit
  
  def getLevel(level: String): Level
  
  var levels: js.Array[Level]
}
object Levels_ {
  
  inline def apply(
    ALL: Level,
    DEBUG: Level,
    ERROR: Level,
    FATAL: Level,
    INFO: Level,
    MARK: Level,
    OFF: Level,
    TRACE: Level,
    WARN: Level,
    addLevels: js.Object => Unit,
    getLevel: String => Level,
    levels: js.Array[Level]
  ): Levels_ = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], MARK = MARK.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], addLevels = js.Any.fromFunction1(addLevels), getLevel = js.Any.fromFunction1(getLevel), levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels_]
  }
  
  extension [Self <: Levels_](x: Self) {
    
    inline def setALL(value: Level): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
    
    inline def setAddLevels(value: js.Object => Unit): Self = StObject.set(x, "addLevels", js.Any.fromFunction1(value))
    
    inline def setDEBUG(value: Level): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: Level): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setFATAL(value: Level): Self = StObject.set(x, "FATAL", value.asInstanceOf[js.Any])
    
    inline def setGetLevel(value: String => Level): Self = StObject.set(x, "getLevel", js.Any.fromFunction1(value))
    
    inline def setINFO(value: Level): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    inline def setMARK(value: Level): Self = StObject.set(x, "MARK", value.asInstanceOf[js.Any])
    
    inline def setOFF(value: Level): Self = StObject.set(x, "OFF", value.asInstanceOf[js.Any])
    
    inline def setTRACE(value: Level): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
    
    inline def setWARN(value: Level): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
  }
}
