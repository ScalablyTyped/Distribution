package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Movement extends js.Object {
  var direction: js.UndefOr[String] = js.native
  var frames: js.UndefOr[js.Array[Frame]] = js.native
  var line: js.UndefOr[Line] = js.native
  var location: js.UndefOr[Location] = js.native
  var nextStopovers: js.UndefOr[js.Array[StopOver]] = js.native
  var polyline: js.UndefOr[FeatureCollection] = js.native
  var tripId: js.UndefOr[String] = js.native
}

object Movement {
  @scala.inline
  def apply(): Movement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Movement]
  }
  @scala.inline
  implicit class MovementOps[Self <: Movement] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFramesVarargs(value: Frame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[Frame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    @scala.inline
    def setLine(value: Line): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNextStopoversVarargs(value: StopOver*): Self = this.set("nextStopovers", js.Array(value :_*))
    @scala.inline
    def setNextStopovers(value: js.Array[StopOver]): Self = this.set("nextStopovers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextStopovers: Self = this.set("nextStopovers", js.undefined)
    @scala.inline
    def setPolyline(value: FeatureCollection): Self = this.set("polyline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolyline: Self = this.set("polyline", js.undefined)
    @scala.inline
    def setTripId(value: String): Self = this.set("tripId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTripId: Self = this.set("tripId", js.undefined)
  }
  
}

