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

