package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendResponsiveBreakpoint extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
}

object Anon_ExtendResponsiveBreakpoint {
  @scala.inline
  def apply(extend: ExtendType = null, responsiveBreakpoint: String = null): Anon_ExtendResponsiveBreakpoint = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (responsiveBreakpoint != null) __obj.updateDynamic("responsiveBreakpoint")(responsiveBreakpoint)
    __obj.asInstanceOf[Anon_ExtendResponsiveBreakpoint]
  }
}

