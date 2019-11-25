package typings.log4js.log4jsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Levels extends js.Object {
  var ALL: Level
  var DEBUG: Level
  var ERROR: Level
  var FATAL: Level
  var INFO: Level
  var MARK: Level
  var OFF: Level
  var TRACE: Level
  var WARN: Level
  var levels: js.Array[Level]
  def addLevels(customLevels: js.Object): Unit
  def getLevel(level: String): Level
}

object Levels {
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
  ): Levels = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], MARK = MARK.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], addLevels = js.Any.fromFunction1(addLevels), getLevel = js.Any.fromFunction1(getLevel), levels = levels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Levels]
  }
}

@JSImport("log4js", "levels")
@js.native
object levels extends TopLevel[Levels]

