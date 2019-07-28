package typings.isotopeDashLayout.isotopeDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitRows extends js.Object {
  var gutter: js.UndefOr[Double | String] = js.undefined
}

object FitRows {
  @scala.inline
  def apply(gutter: Double | String = null): FitRows = {
    val __obj = js.Dynamic.literal()
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitRows]
  }
}

