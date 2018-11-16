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

