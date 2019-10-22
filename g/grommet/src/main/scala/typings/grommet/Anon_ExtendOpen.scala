package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendOpen extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
}

object Anon_ExtendOpen {
  @scala.inline
  def apply(extend: ExtendType = null, open: js.UndefOr[Boolean] = js.undefined): Anon_ExtendOpen = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[Anon_ExtendOpen]
  }
}

