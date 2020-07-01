package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumb extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var thumb: js.UndefOr[`1`] = js.undefined
  var track: js.UndefOr[Upper] = js.undefined
}

object Thumb {
  @scala.inline
  def apply(extend: ExtendType = null, thumb: `1` = null, track: Upper = null): Thumb = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumb]
  }
}

