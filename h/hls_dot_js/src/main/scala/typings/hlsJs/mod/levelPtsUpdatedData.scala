package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait levelPtsUpdatedData extends js.Object {
  var details: LevelDetails = js.native
  var drift: Double = js.native
  var level: Double = js.native
}

object levelPtsUpdatedData {
  @scala.inline
  def apply(details: LevelDetails, drift: Double, level: Double): levelPtsUpdatedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], drift = drift.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelPtsUpdatedData]
  }
  @scala.inline
  implicit class levelPtsUpdatedDataOps[Self <: levelPtsUpdatedData] (val x: Self) extends AnyVal {
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
    def setDrift(value: Double): Self = this.set("drift", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
  }
  
}

