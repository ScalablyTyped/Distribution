package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Movement extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var frames: js.UndefOr[js.Array[Frame]] = js.undefined
  var line: js.UndefOr[Line] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var nextStopovers: js.UndefOr[js.Array[StopOver]] = js.undefined
  var polyline: js.UndefOr[FeatureCollection] = js.undefined
  var tripId: js.UndefOr[String] = js.undefined
}

object Movement {
  @scala.inline
  def apply(
    direction: String = null,
    frames: js.Array[Frame] = null,
    line: Line = null,
    location: Location = null,
    nextStopovers: js.Array[StopOver] = null,
    polyline: FeatureCollection = null,
    tripId: String = null
  ): Movement = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (nextStopovers != null) __obj.updateDynamic("nextStopovers")(nextStopovers.asInstanceOf[js.Any])
    if (polyline != null) __obj.updateDynamic("polyline")(polyline.asInstanceOf[js.Any])
    if (tripId != null) __obj.updateDynamic("tripId")(tripId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Movement]
  }
}

