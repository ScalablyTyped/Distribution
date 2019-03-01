package typings
package jqueryDotGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterResizable extends js.Object {
  var axes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var handle_append_to: js.UndefOr[java.lang.String] = js.undefined
  var handle_class: js.UndefOr[java.lang.String] = js.undefined
  var max_size: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var min_size: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var resize: js.UndefOr[
    js.Function3[/* event */ stdLib.Event, /* ui */ GridsterUi, /* $el */ JQuery, scala.Unit]
  ] = js.undefined
  var start: js.UndefOr[
    js.Function3[/* event */ stdLib.Event, /* ui */ Anon_Helper, /* $el */ JQuery, scala.Unit]
  ] = js.undefined
  var stop: js.UndefOr[
    js.Function3[/* event */ stdLib.Event, /* ui */ Anon_Helper, /* $el */ JQuery, scala.Unit]
  ] = js.undefined
}

object GridsterResizable {
  @scala.inline
  def apply(
    axes: js.Array[java.lang.String] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    handle_append_to: java.lang.String = null,
    handle_class: java.lang.String = null,
    max_size: js.Array[scala.Double] = null,
    min_size: js.Array[scala.Double] = null,
    resize: js.Function3[/* event */ stdLib.Event, /* ui */ GridsterUi, /* $el */ JQuery, scala.Unit] = null,
    start: js.Function3[/* event */ stdLib.Event, /* ui */ Anon_Helper, /* $el */ JQuery, scala.Unit] = null,
    stop: js.Function3[/* event */ stdLib.Event, /* ui */ Anon_Helper, /* $el */ JQuery, scala.Unit] = null
  ): GridsterResizable = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (handle_append_to != null) __obj.updateDynamic("handle_append_to")(handle_append_to)
    if (handle_class != null) __obj.updateDynamic("handle_class")(handle_class)
    if (max_size != null) __obj.updateDynamic("max_size")(max_size)
    if (min_size != null) __obj.updateDynamic("min_size")(min_size)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[GridsterResizable]
  }
}

