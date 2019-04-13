package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fpsDropLevelCappingData extends js.Object {
  var droppedLevel: Level
  var level: Level
}

object fpsDropLevelCappingData {
  @scala.inline
  def apply(droppedLevel: Level, level: Level): fpsDropLevelCappingData = {
    val __obj = js.Dynamic.literal(droppedLevel = droppedLevel, level = level)
  
    __obj.asInstanceOf[fpsDropLevelCappingData]
  }
}

