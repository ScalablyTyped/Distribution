package typings.grommet

import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pad extends js.Object {
  var pad: js.UndefOr[PadType] = js.undefined
}

object Anon_Pad {
  @scala.inline
  def apply(pad: PadType = null): Anon_Pad = {
    val __obj = js.Dynamic.literal()
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Pad]
  }
}

