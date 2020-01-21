package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgProgressBar
  extends /**
	 * Option for igProgressBar
	 */
/* optionName */ StringDictionary[js.Any] {
  var animate: js.UndefOr[Boolean] = js.undefined
  var animateTimeout: js.UndefOr[Double] = js.undefined
  var change: js.UndefOr[ChangeEvent] = js.undefined
  var endValue: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  /**
  	 * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately.
  	 */
  var queue: js.UndefOr[Boolean] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object IgProgressBar {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igProgressBar
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    animateTimeout: Int | Double = null,
    change: (/* event */ Event_, /* ui */ ChangeEventUIParam) => Unit = null,
    endValue: Int | Double = null,
    height: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    orientation: String = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    range: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    width: String = null
  ): IgProgressBar = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animateTimeout != null) __obj.updateDynamic("animateTimeout")(animateTimeout.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgProgressBar]
  }
}

