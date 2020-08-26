package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait subtitleTrackLoadedData extends js.Object {
  var details: LevelDetails = js.native
  var id: String = js.native
  var stats: Stats = js.native
}

object subtitleTrackLoadedData {
  @scala.inline
  def apply(details: LevelDetails, id: String, stats: Stats): subtitleTrackLoadedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitleTrackLoadedData]
  }
  @scala.inline
  implicit class subtitleTrackLoadedDataOps[Self <: subtitleTrackLoadedData] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
  
}

