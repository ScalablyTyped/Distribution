package typings.materialUiCore.cssBaselineCssBaselineMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssBaselineProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.native
}

object CssBaselineProps {
  @scala.inline
  def apply(children: ReactElement = null): CssBaselineProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssBaselineProps]
  }
}

