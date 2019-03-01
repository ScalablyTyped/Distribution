package typings
package isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitRows extends js.Object {
  var gutter: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object FitRows {
  @scala.inline
  def apply(gutter: scala.Double | java.lang.String = null): FitRows = {
    val __obj = js.Dynamic.literal()
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitRows]
  }
}

