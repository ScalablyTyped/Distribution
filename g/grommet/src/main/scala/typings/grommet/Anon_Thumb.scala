package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Thumb extends js.Object {
  var thumb: js.UndefOr[Anon_ColorColorType] = js.undefined
  var track: js.UndefOr[Anon_ColorHeight] = js.undefined
}

object Anon_Thumb {
  @scala.inline
  def apply(thumb: Anon_ColorColorType = null, track: Anon_ColorHeight = null): Anon_Thumb = {
    val __obj = js.Dynamic.literal()
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    if (track != null) __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[Anon_Thumb]
  }
}

