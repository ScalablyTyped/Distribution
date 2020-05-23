package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridScrollSettings
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    inertiaDuration: js.UndefOr[Double] = js.undefined,
    inertiaStep: js.UndefOr[Double] = js.undefined,
    scrollLeft: js.UndefOr[Double] = js.undefined,
    scrollTop: js.UndefOr[Double] = js.undefined,
    smoothing: js.UndefOr[Boolean] = js.undefined,
    smoothingDuration: js.UndefOr[Double] = js.undefined,
    smoothingStep: js.UndefOr[Double] = js.undefined,
    wheelStep: js.UndefOr[Double] = js.undefined
  ): IgHierarchicalGridScrollSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(inertiaDuration)) __obj.updateDynamic("inertiaDuration")(inertiaDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inertiaStep)) __obj.updateDynamic("inertiaStep")(inertiaStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothing)) __obj.updateDynamic("smoothing")(smoothing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothingDuration)) __obj.updateDynamic("smoothingDuration")(smoothingDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothingStep)) __obj.updateDynamic("smoothingStep")(smoothingStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelStep)) __obj.updateDynamic("wheelStep")(wheelStep.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHierarchicalGridScrollSettings]
  }
}

