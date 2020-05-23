package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumb extends js.Object {
  var thumb: js.UndefOr[`0`] = js.undefined
  var track: js.UndefOr[ColorHeight] = js.undefined
}

object Thumb {
  @scala.inline
  def apply(thumb: `0` = null, track: ColorHeight = null): Thumb = {
    val __obj = js.Dynamic.literal()
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumb]
  }
}

