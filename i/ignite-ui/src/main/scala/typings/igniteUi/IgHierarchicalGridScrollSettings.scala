package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridScrollSettings
  extends /**
	 * Option for IgHierarchicalGridScrollSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Sets gets the modifier for how long the inertia last on touch devices.
  	 *
  	 */
  var inertiaDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets the modifier for how much the inertia scrolls on touch devices. Note: Value set to 0 would disable touch movements. Value set to -1 would invert them.
  	 *
  	 */
  var inertiaStep: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets current horizontal position.
  	 *
  	 */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets current vertical position.
  	 *
  	 */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets if smoother scrolling with small intertia should be used when using the mouse wheel.
  	 *
  	 */
  var smoothing: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.ighierarchicalgrid#options:scrollSettings.smoothing).
  	 *
  	 */
  var smoothingDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.ighierarchicalgrid#options:scrollSettings.smoothing).
  	 *
  	 */
  var smoothingStep: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets the step of the default scrolling behavior when using the mouse wheel.
  	 *
  	 */
  var wheelStep: js.UndefOr[Double] = js.undefined
}

object IgHierarchicalGridScrollSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgHierarchicalGridScrollSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    inertiaDuration: Int | Double = null,
    inertiaStep: Int | Double = null,
    scrollLeft: Int | Double = null,
    scrollTop: Int | Double = null,
    smoothing: js.UndefOr[Boolean] = js.undefined,
    smoothingDuration: Int | Double = null,
    smoothingStep: Int | Double = null,
    wheelStep: Int | Double = null
  ): IgHierarchicalGridScrollSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (inertiaDuration != null) __obj.updateDynamic("inertiaDuration")(inertiaDuration.asInstanceOf[js.Any])
    if (inertiaStep != null) __obj.updateDynamic("inertiaStep")(inertiaStep.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothing)) __obj.updateDynamic("smoothing")(smoothing.asInstanceOf[js.Any])
    if (smoothingDuration != null) __obj.updateDynamic("smoothingDuration")(smoothingDuration.asInstanceOf[js.Any])
    if (smoothingStep != null) __obj.updateDynamic("smoothingStep")(smoothingStep.asInstanceOf[js.Any])
    if (wheelStep != null) __obj.updateDynamic("wheelStep")(wheelStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHierarchicalGridScrollSettings]
  }
}

