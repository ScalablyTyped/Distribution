package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Invert extends js.Object {
  var invert: js.UndefOr[Anon_ColorColorType] = js.undefined
}

object Anon_Invert {
  @scala.inline
  def apply(invert: Anon_ColorColorType = null): Anon_Invert = {
    val __obj = js.Dynamic.literal()
    if (invert != null) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Invert]
  }
}

