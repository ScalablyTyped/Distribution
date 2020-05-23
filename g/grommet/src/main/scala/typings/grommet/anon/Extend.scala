package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object Extend {
  @scala.inline
  def apply(extend: ExtendType = null): Extend = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extend]
  }
}

