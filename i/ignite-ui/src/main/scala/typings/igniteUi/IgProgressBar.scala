package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgProgressBar
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    animateTimeout: js.UndefOr[Double] = js.undefined,
    change: (/* event */ Event, /* ui */ ChangeEventUIParam) => Unit = null,
    endValue: js.UndefOr[Double] = js.undefined,
    height: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    orientation: String = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    range: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    width: String = null
  ): IgProgressBar = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animateTimeout)) __obj.updateDynamic("animateTimeout")(animateTimeout.get.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgProgressBar]
  }
}

