package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendSizeAnonLargeMediumSmallX extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var size: js.UndefOr[Anon_LargeMediumSmallX] = js.undefined
}

object Anon_ExtendSizeAnonLargeMediumSmallX {
  @scala.inline
  def apply(extend: ExtendType = null, size: Anon_LargeMediumSmallX = null): Anon_ExtendSizeAnonLargeMediumSmallX = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtendSizeAnonLargeMediumSmallX]
  }
}

