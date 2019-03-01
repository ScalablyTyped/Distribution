package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveModeChangedEventUIParam extends js.Object {
  /**
  	 * Gets the newly assumed mode.
  	 */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the reference to the igGridResponsive widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the previously assumed mode.
  	 */
  var previousMode: js.UndefOr[java.lang.String] = js.undefined
}

object ResponsiveModeChangedEventUIParam {
  @scala.inline
  def apply(mode: java.lang.String = null, owner: js.Any = null, previousMode: java.lang.String = null): ResponsiveModeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (previousMode != null) __obj.updateDynamic("previousMode")(previousMode)
    __obj.asInstanceOf[ResponsiveModeChangedEventUIParam]
  }
}

