package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ZoombarProviderDefaultSettings
  extends /**
	 * Option for ZoombarProviderDefaultSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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

