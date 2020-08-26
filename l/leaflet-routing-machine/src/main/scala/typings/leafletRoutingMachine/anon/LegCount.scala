package typings.leafletRoutingMachine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegCount extends js.Object {
  var legCount: Double = js.native
  var legIndex: Double = js.native
}

object LegCount {
  @scala.inline
  def apply(legCount: Double, legIndex: Double): LegCount = {
    val __obj = js.Dynamic.literal(legCount = legCount.asInstanceOf[js.Any], legIndex = legIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegCount]
  }
  @scala.inline
  implicit class LegCountOps[Self <: LegCount] (val x: Self) extends AnyVal {
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
    def setLegCount(value: Double): Self = this.set("legCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegIndex(value: Double): Self = this.set("legIndex", value.asInstanceOf[js.Any])
  }
  
}

