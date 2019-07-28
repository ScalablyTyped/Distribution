package typings.jqueryDotGridster

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterDraggable extends js.Object {
  var distance: js.UndefOr[Double] = js.undefined
  var drag: js.UndefOr[js.Function2[/* event */ Event, /* ui */ GridsterUi, Unit]] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
  var limit: js.UndefOr[Boolean] = js.undefined
  var offset_left: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Anon_Helper, Unit]] = js.undefined
  var stop: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Anon_Helper, Unit]] = js.undefined
}

object GridsterDraggable {
  @scala.inline
  def apply(
    distance: Int | Double = null,
    drag: (/* event */ Event, /* ui */ GridsterUi) => Unit = null,
    handle: String = null,
    items: js.Any = null,
    limit: js.UndefOr[Boolean] = js.undefined,
    offset_left: Int | Double = null,
    start: (/* event */ Event, /* ui */ Anon_Helper) => Unit = null,
    stop: (/* event */ Event, /* ui */ Anon_Helper) => Unit = null
  ): GridsterDraggable = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2(drag))
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (offset_left != null) __obj.updateDynamic("offset_left")(offset_left.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    __obj.asInstanceOf[GridsterDraggable]
  }
}

