package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgHierarchicalGridScrollSettings
  extends /**
	 * Option for IgHierarchicalGridScrollSettings
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Sets gets the modifier for how long the inertia last on touch devices.
  	 *
  	 */
  var inertiaDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets the modifier for how much the inertia scrolls on touch devices. Note: Value set to 0 would disable touch movements. Value set to -1 would invert them.
  	 *
  	 */
  var inertiaStep: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets current horizontal position.
  	 *
  	 */
  var scrollLeft: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets current vertical position.
  	 *
  	 */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets if smoother scrolling with small intertia should be used when using the mouse wheel.
  	 *
  	 */
  var smoothing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.ighierarchicalgrid#options:scrollSettings.smoothing).
  	 *
  	 */
  var smoothingDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.ighierarchicalgrid#options:scrollSettings.smoothing).
  	 *
  	 */
  var smoothingStep: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets the step of the default scrolling behavior when using the mouse wheel.
  	 *
  	 */
  var wheelStep: js.UndefOr[scala.Double] = js.undefined
}

