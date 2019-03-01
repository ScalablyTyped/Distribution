package typings
package jqueryDashBackstretchLib.JQueryBackStretchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackStretchOptions extends js.Object {
  /**
    * The ratio of the width/height of the image doesn't always jive with the
    * width/height of the window. This parameter controls whether or not we
    * center the image on the X axis to account for the discrepancy.
    */
  var centeredX: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This parameter controls whether or not we center the image on the Y axis
    * to account for the aforementioned discrepancy.
    */
  var centeredY: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This is the speed at which the image will fade in. Integers in
    * milliseconds are accepted, as well as standard jQuery speed strings
    * (slow, normal, fast).
    */
  var duration: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The amount of time in between slides, when using Backstretch as a
    * slideshow, expressed as the number of milliseconds.
    */
  var fade: js.UndefOr[scala.Double] = js.undefined
}

object BackStretchOptions {
  @scala.inline
  def apply(
    centeredX: js.UndefOr[scala.Boolean] = js.undefined,
    centeredY: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Double | java.lang.String = null,
    fade: scala.Int | scala.Double = null
  ): BackStretchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centeredX)) __obj.updateDynamic("centeredX")(centeredX)
    if (!js.isUndefined(centeredY)) __obj.updateDynamic("centeredY")(centeredY)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fade != null) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackStretchOptions]
  }
}

