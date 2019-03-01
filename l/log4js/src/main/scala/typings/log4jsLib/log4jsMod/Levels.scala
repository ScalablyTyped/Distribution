package typings
package log4jsLib.log4jsMod

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
  def getLevel(level: java.lang.String): Level
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
    getLevel: js.Function1[java.lang.String, Level],
    levels: js.Array[Level]
  ): Levels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ALL")(ALL)
    __obj.updateDynamic("DEBUG")(DEBUG)
    __obj.updateDynamic("ERROR")(ERROR)
    __obj.updateDynamic("FATAL")(FATAL)
    __obj.updateDynamic("INFO")(INFO)
    __obj.updateDynamic("MARK")(MARK)
    __obj.updateDynamic("OFF")(OFF)
    __obj.updateDynamic("TRACE")(TRACE)
    __obj.updateDynamic("WARN")(WARN)
    __obj.updateDynamic("getLevel")(getLevel)
    __obj.updateDynamic("levels")(levels)
    __obj.asInstanceOf[Levels]
  }
}

