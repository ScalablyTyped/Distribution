package typings.jqueryDotGridster

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterResizable extends js.Object {
  var axes: js.UndefOr[js.Array[String]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var handle_append_to: js.UndefOr[String] = js.undefined
  var handle_class: js.UndefOr[String] = js.undefined
  var max_size: js.UndefOr[js.Array[Double]] = js.undefined
  var min_size: js.UndefOr[js.Array[Double]] = js.undefined
  var resize: js.UndefOr[js.Function3[/* event */ Event, /* ui */ GridsterUi, /* $el */ JQuery, Unit]] = js.undefined
  var start: js.UndefOr[js.Function3[/* event */ Event, /* ui */ Anon_Helper, /* $el */ JQuery, Unit]] = js.undefined
  var stop: js.UndefOr[js.Function3[/* event */ Event, /* ui */ Anon_Helper, /* $el */ JQuery, Unit]] = js.undefined
}

object GridsterResizable {
  @scala.inline
  def apply(
    axes: js.Array[String] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    handle_append_to: String = null,
    handle_class: String = null,
    max_size: js.Array[Double] = null,
    min_size: js.Array[Double] = null,
    resize: (/* event */ Event, /* ui */ GridsterUi, /* $el */ JQuery) => Unit = null,
    start: (/* event */ Event, /* ui */ Anon_Helper, /* $el */ JQuery) => Unit = null,
    stop: (/* event */ Event, /* ui */ Anon_Helper, /* $el */ JQuery) => Unit = null
  ): GridsterResizable = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (handle_append_to != null) __obj.updateDynamic("handle_append_to")(handle_append_to)
    if (handle_class != null) __obj.updateDynamic("handle_class")(handle_class)
    if (max_size != null) __obj.updateDynamic("max_size")(max_size)
    if (min_size != null) __obj.updateDynamic("min_size")(min_size)
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction3(resize))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction3(stop))
    __obj.asInstanceOf[GridsterResizable]
  }
}

