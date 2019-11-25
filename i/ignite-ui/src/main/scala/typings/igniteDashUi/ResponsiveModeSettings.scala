package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveModeSettings
  extends /**
	 * Option for ResponsiveModeSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var maxHeight: js.UndefOr[js.Any] = js.undefined
  var maxWidth: js.UndefOr[js.Any] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
}

object ResponsiveModeSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for ResponsiveModeSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    maxHeight: js.Any = null,
    maxWidth: js.Any = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null
  ): ResponsiveModeSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveModeSettings]
  }
}

