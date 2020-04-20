package typings.hlsJs.mod

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
    val __obj = js.Dynamic.literal(droppedLevel = droppedLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[fpsDropLevelCappingData]
  }
}

