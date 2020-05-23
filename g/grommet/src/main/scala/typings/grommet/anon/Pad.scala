package typings.grommet.anon

import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pad extends js.Object {
  var pad: js.UndefOr[PadType] = js.undefined
}

object Pad {
  @scala.inline
  def apply(pad: PadType = null): Pad = {
    val __obj = js.Dynamic.literal()
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pad]
  }
}

