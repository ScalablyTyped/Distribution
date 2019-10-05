package typings.jqueryDashBackstretch.JQueryBackStretch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackStretchOptions extends js.Object {
  /**
    * The ratio of the width/height of the image doesn't always jive with the
    * width/height of the window. This parameter controls whether or not we
    * center the image on the X axis to account for the discrepancy.
    */
  var centeredX: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter controls whether or not we center the image on the Y axis
    * to account for the aforementioned discrepancy.
    */
  var centeredY: js.UndefOr[Boolean] = js.undefined
  /**
    * This is the speed at which the image will fade in. Integers in
    * milliseconds are accepted, as well as standard jQuery speed strings
    * (slow, normal, fast).
    */
  var duration: js.UndefOr[Double | String] = js.undefined
  /**
    * The amount of time in between slides, when using Backstretch as a
    * slideshow, expressed as the number of milliseconds.
    */
  var fade: js.UndefOr[Double] = js.undefined
}

object BackStretchOptions {
  @scala.inline
  def apply(
    centeredX: js.UndefOr[Boolean] = js.undefined,
    centeredY: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String = null,
    fade: Int | Double = null
  ): BackStretchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centeredX)) __obj.updateDynamic("centeredX")(centeredX)
    if (!js.isUndefined(centeredY)) __obj.updateDynamic("centeredY")(centeredY)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fade != null) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackStretchOptions]
  }
}

