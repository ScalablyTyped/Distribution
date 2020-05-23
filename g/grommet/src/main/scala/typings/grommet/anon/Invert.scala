package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invert extends js.Object {
  var invert: js.UndefOr[`0`] = js.undefined
}

object Invert {
  @scala.inline
  def apply(invert: `0` = null): Invert = {
    val __obj = js.Dynamic.literal()
    if (invert != null) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invert]
  }
}

