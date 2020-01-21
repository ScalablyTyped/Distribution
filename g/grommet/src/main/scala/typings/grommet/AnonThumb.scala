package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThumb extends js.Object {
  var thumb: js.UndefOr[AnonColorColorType] = js.undefined
  var track: js.UndefOr[AnonColorHeight] = js.undefined
}

object AnonThumb {
  @scala.inline
  def apply(thumb: AnonColorColorType = null, track: AnonColorHeight = null): AnonThumb = {
    val __obj = js.Dynamic.literal()
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThumb]
  }
}

