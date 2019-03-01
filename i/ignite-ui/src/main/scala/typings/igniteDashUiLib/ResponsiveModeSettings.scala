package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveModeSettings
  extends /**
	 * Option for ResponsiveModeSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var maxHeight: js.UndefOr[js.Any] = js.undefined
  var maxWidth: js.UndefOr[js.Any] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
}

object ResponsiveModeSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for ResponsiveModeSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    maxHeight: js.Any = null,
    maxWidth: js.Any = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null
  ): ResponsiveModeSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveModeSettings]
  }
}

