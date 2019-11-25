package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWrapper
  extends /**
	 * Option for mouseWrapper
	 */
/* optionName */ StringDictionary[js.Any] {
  var cancel: js.UndefOr[String] = js.undefined
  var capture: js.UndefOr[CaptureEvent] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var drag: js.UndefOr[DragEvent] = js.undefined
  var start: js.UndefOr[StartEvent] = js.undefined
  var stop: js.UndefOr[StopEvent] = js.undefined
}

object MouseWrapper {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for mouseWrapper
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    cancel: String = null,
    capture: (/* event */ Event, /* ui */ CaptureEventUIParam) => Unit = null,
    delay: Int | Double = null,
    distance: Int | Double = null,
    drag: (/* event */ Event, /* ui */ DragEventUIParam) => Unit = null,
    start: (/* event */ Event, /* ui */ StartEventUIParam) => Unit = null,
    stop: (/* event */ Event, /* ui */ StopEventUIParam) => Unit = null
  ): MouseWrapper = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(js.Any.fromFunction2(capture))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2(drag))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    __obj.asInstanceOf[MouseWrapper]
  }
}

