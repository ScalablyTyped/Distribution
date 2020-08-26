package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait levelLoadedData extends js.Object {
  var details: LevelDetails = js.native
  var levelId: Double = js.native
  var stats: Stats = js.native
}

object levelLoadedData {
  @scala.inline
  def apply(details: LevelDetails, levelId: Double, stats: Stats): levelLoadedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], levelId = levelId.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelLoadedData]
  }
  @scala.inline
  implicit class levelLoadedDataOps[Self <: levelLoadedData] (val x: Self) extends AnyVal {
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
    def setDetails(value: LevelDetails): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevelId(value: Double): Self = this.set("levelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
  
}

