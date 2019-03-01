package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgProgressBar
  extends /**
	 * Option for igProgressBar
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var animateTimeout: js.UndefOr[scala.Double] = js.undefined
  var change: js.UndefOr[ChangeEvent] = js.undefined
  var endValue: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately.
  	 */
  var queue: js.UndefOr[scala.Boolean] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object IgProgressBar {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igProgressBar
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animateTimeout: scala.Int | scala.Double = null,
    change: ChangeEvent = null,
    endValue: scala.Int | scala.Double = null,
    height: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    orientation: java.lang.String = null,
    queue: js.UndefOr[scala.Boolean] = js.undefined,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Int | scala.Double = null,
    width: java.lang.String = null
  ): IgProgressBar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animateTimeout != null) __obj.updateDynamic("animateTimeout")(animateTimeout.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(change)
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IgProgressBar]
  }
}

