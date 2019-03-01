package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripScrollable extends js.Object {
  var distance: js.UndefOr[scala.Double] = js.undefined
}

object TabStripScrollable {
  @scala.inline
  def apply(distance: scala.Int | scala.Double = null): TabStripScrollable = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripScrollable]
  }
}

