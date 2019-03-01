package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridScrollSettings
  extends /**
	 * Option for IgHierarchicalGridScrollSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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

object IgHierarchicalGridScrollSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgHierarchicalGridScrollSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    inertiaDuration: scala.Int | scala.Double = null,
    inertiaStep: scala.Int | scala.Double = null,
    scrollLeft: scala.Int | scala.Double = null,
    scrollTop: scala.Int | scala.Double = null,
    smoothing: js.UndefOr[scala.Boolean] = js.undefined,
    smoothingDuration: scala.Int | scala.Double = null,
    smoothingStep: scala.Int | scala.Double = null,
    wheelStep: scala.Int | scala.Double = null
  ): IgHierarchicalGridScrollSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (inertiaDuration != null) __obj.updateDynamic("inertiaDuration")(inertiaDuration.asInstanceOf[js.Any])
    if (inertiaStep != null) __obj.updateDynamic("inertiaStep")(inertiaStep.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothing)) __obj.updateDynamic("smoothing")(smoothing)
    if (smoothingDuration != null) __obj.updateDynamic("smoothingDuration")(smoothingDuration.asInstanceOf[js.Any])
    if (smoothingStep != null) __obj.updateDynamic("smoothingStep")(smoothingStep.asInstanceOf[js.Any])
    if (wheelStep != null) __obj.updateDynamic("wheelStep")(wheelStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHierarchicalGridScrollSettings]
  }
}

