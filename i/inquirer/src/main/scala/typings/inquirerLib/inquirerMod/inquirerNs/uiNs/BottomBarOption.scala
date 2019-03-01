package typings
package inquirerLib.inquirerMod.inquirerNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomBarOption extends js.Object {
  var bottomBar: js.UndefOr[java.lang.String] = js.undefined
}

object BottomBarOption {
  @scala.inline
  def apply(bottomBar: java.lang.String = null): BottomBarOption = {
    val __obj = js.Dynamic.literal()
    if (bottomBar != null) __obj.updateDynamic("bottomBar")(bottomBar)
    __obj.asInstanceOf[BottomBarOption]
  }
}

