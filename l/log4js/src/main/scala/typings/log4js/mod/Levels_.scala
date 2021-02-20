package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Levels_ extends StObject {
  
  var ALL: Level = js.native
  
  var DEBUG: Level = js.native
  
  var ERROR: Level = js.native
  
  var FATAL: Level = js.native
  
  var INFO: Level = js.native
  
  var MARK: Level = js.native
  
  var OFF: Level = js.native
  
  var TRACE: Level = js.native
  
  var WARN: Level = js.native
  
  def addLevels(customLevels: js.Object): Unit = js.native
  
  def getLevel(level: String): Level = js.native
  
  var levels: js.Array[Level] = js.native
}
object Levels_ {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class Levels_MutableBuilder[Self <: Levels_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setALL(value: Level): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddLevels(value: js.Object => Unit): Self = StObject.set(x, "addLevels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDEBUG(value: Level): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: Level): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFATAL(value: Level): Self = StObject.set(x, "FATAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLevel(value: String => Level): Self = StObject.set(x, "getLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setINFO(value: Level): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    @scala.inline
    def setMARK(value: Level): Self = StObject.set(x, "MARK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOFF(value: Level): Self = StObject.set(x, "OFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRACE(value: Level): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWARN(value: Level): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
  }
}
