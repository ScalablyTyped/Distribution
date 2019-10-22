package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var pad: js.UndefOr[String] = js.undefined
}

object Anon_Align {
  @scala.inline
  def apply(align: String = null, pad: String = null): Anon_Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (pad != null) __obj.updateDynamic("pad")(pad)
    __obj.asInstanceOf[Anon_Align]
  }
}

