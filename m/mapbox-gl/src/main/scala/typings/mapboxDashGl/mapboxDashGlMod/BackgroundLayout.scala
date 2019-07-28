package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.none
import typings.mapboxDashGl.mapboxDashGlStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundLayout extends js.Object {
  var visibility: js.UndefOr[visible | none] = js.undefined
}

object BackgroundLayout {
  @scala.inline
  def apply(visibility: visible | none = null): BackgroundLayout = {
    val __obj = js.Dynamic.literal()
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundLayout]
  }
}

