package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait levelSwitchedData extends js.Object {
  var level: Double = js.native
}

object levelSwitchedData {
  @scala.inline
  def apply(level: Double): levelSwitchedData = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelSwitchedData]
  }
  @scala.inline
  implicit class levelSwitchedDataOps[Self <: levelSwitchedData] (val x: Self) extends AnyVal {
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
  }
  
}

