package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoombarProviderDefaultSettings
  extends /**
	 * Option for ZoombarProviderDefaultSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Contains the target component's instance
  	 */
  var targetObject: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Expects two parameters
  	 * a jQuery Event to pass as original for Zoombar's own zoomChanged event
  	 * an object with the following structure:
  	 * {
  	 * oldLeft: number,
  	 * oldWidth: number,
  	 * newLeft: number,
  	 * newWdith: number
  	 * }
  	 * The values should represent the fractions of the total width of the zoomed component in a number ranging from 0 to 1
  	 */
  var zoomChangedCallback: js.UndefOr[js.Any] = js.undefined
}

object ZoombarProviderDefaultSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for ZoombarProviderDefaultSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    targetObject: js.Any = null,
    zoomChangedCallback: js.Any = null
  ): ZoombarProviderDefaultSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (targetObject != null) __obj.updateDynamic("targetObject")(targetObject.asInstanceOf[js.Any])
    if (zoomChangedCallback != null) __obj.updateDynamic("zoomChangedCallback")(zoomChangedCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoombarProviderDefaultSettings]
  }
}

