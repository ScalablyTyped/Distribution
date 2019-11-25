package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveModeChangedEventUIParam extends js.Object {
  /**
  	 * Gets the newly assumed mode.
  	 */
  var mode: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the reference to the igGridResponsive widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the previously assumed mode.
  	 */
  var previousMode: js.UndefOr[String] = js.undefined
}

object ResponsiveModeChangedEventUIParam {
  @scala.inline
  def apply(mode: String = null, owner: js.Any = null, previousMode: String = null): ResponsiveModeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (previousMode != null) __obj.updateDynamic("previousMode")(previousMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveModeChangedEventUIParam]
  }
}

