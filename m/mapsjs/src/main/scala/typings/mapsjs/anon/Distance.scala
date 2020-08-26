package typings.mapsjs.anon

import typings.mapsjs.mod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distance extends js.Object {
  var distance: Double = js.native
  var pt: point = js.native
  var ptIdx: Double = js.native
  var setIdx: Double = js.native
}

object Distance {
  @scala.inline
  def apply(distance: Double, pt: point, ptIdx: Double, setIdx: Double): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any], ptIdx = ptIdx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  @scala.inline
  implicit class DistanceOps[Self <: Distance] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setPt(value: point): Self = this.set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def setPtIdx(value: Double): Self = this.set("ptIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetIdx(value: Double): Self = this.set("setIdx", value.asInstanceOf[js.Any])
  }
  
}

