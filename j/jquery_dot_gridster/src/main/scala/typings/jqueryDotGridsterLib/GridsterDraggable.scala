package typings
package jqueryDotGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterDraggable extends js.Object {
  var distance: js.UndefOr[scala.Double] = js.undefined
  var drag: js.UndefOr[js.Function2[/* event */ stdLib.Event, /* ui */ GridsterUi, scala.Unit]] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
  var limit: js.UndefOr[scala.Boolean] = js.undefined
  var offset_left: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[js.Function2[/* event */ stdLib.Event, /* ui */ Anon_Helper, scala.Unit]] = js.undefined
  var stop: js.UndefOr[js.Function2[/* event */ stdLib.Event, /* ui */ Anon_Helper, scala.Unit]] = js.undefined
}

object GridsterDraggable {
  @scala.inline
  def apply(
    distance: scala.Int | scala.Double = null,
    drag: (/* event */ stdLib.Event, /* ui */ GridsterUi) => scala.Unit = null,
    handle: java.lang.String = null,
    items: js.Any = null,
    limit: js.UndefOr[scala.Boolean] = js.undefined,
    offset_left: scala.Int | scala.Double = null,
    start: (/* event */ stdLib.Event, /* ui */ Anon_Helper) => scala.Unit = null,
    stop: (/* event */ stdLib.Event, /* ui */ Anon_Helper) => scala.Unit = null
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

