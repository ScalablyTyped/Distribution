package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveBreakpoint extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
}

object ResponsiveBreakpoint {
  @scala.inline
  def apply(extend: ExtendType = null, responsiveBreakpoint: String = null): ResponsiveBreakpoint = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (responsiveBreakpoint != null) __obj.updateDynamic("responsiveBreakpoint")(responsiveBreakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveBreakpoint]
  }
}

