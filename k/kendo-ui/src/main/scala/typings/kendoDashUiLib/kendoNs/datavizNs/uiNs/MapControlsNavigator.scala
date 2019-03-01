package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControlsNavigator extends js.Object {
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object MapControlsNavigator {
  @scala.inline
  def apply(position: java.lang.String = null): MapControlsNavigator = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[MapControlsNavigator]
  }
}

