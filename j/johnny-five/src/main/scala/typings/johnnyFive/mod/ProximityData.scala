package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProximityData extends js.Object {
  var cm: Double = js.native
  var in: Double = js.native
}

object ProximityData {
  @scala.inline
  def apply(cm: Double, in: Double): ProximityData = {
    val __obj = js.Dynamic.literal(cm = cm.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityData]
  }
  @scala.inline
  implicit class ProximityDataOps[Self <: ProximityData] (val x: Self) extends AnyVal {
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
    def setCm(value: Double): Self = this.set("cm", value.asInstanceOf[js.Any])
    @scala.inline
    def setIn(value: Double): Self = this.set("in", value.asInstanceOf[js.Any])
  }
  
}

