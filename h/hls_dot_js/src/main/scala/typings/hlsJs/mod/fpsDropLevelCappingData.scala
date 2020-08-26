package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fpsDropLevelCappingData extends js.Object {
  var droppedLevel: Level = js.native
  var level: Level = js.native
}

object fpsDropLevelCappingData {
  @scala.inline
  def apply(droppedLevel: Level, level: Level): fpsDropLevelCappingData = {
    val __obj = js.Dynamic.literal(droppedLevel = droppedLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[fpsDropLevelCappingData]
  }
  @scala.inline
  implicit class fpsDropLevelCappingDataOps[Self <: fpsDropLevelCappingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDroppedLevel(value: Level): Self = this.set("droppedLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Level): Self = this.set("level", value.asInstanceOf[js.Any])
  }
  
}

