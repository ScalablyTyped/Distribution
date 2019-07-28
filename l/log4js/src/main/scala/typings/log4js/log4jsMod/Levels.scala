package typings.log4js.log4jsMod

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
    val __obj = js.Dynamic.literal(ALL = ALL, DEBUG = DEBUG, ERROR = ERROR, FATAL = FATAL, INFO = INFO, MARK = MARK, OFF = OFF, TRACE = TRACE, WARN = WARN, addLevels = js.Any.fromFunction1(addLevels), getLevel = js.Any.fromFunction1(getLevel), levels = levels)
  
    __obj.asInstanceOf[Levels]
  }
}

