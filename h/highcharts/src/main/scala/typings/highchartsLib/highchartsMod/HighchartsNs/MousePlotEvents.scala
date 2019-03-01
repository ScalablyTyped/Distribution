package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MousePlotEvents extends js.Object {
  var click: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var mousemove: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var mouseout: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var mouseover: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
}

object MousePlotEvents {
  @scala.inline
  def apply(
    click: js.Function1[/* event */ stdLib.Event, scala.Unit] = null,
    mousemove: js.Function1[/* event */ stdLib.Event, scala.Unit] = null,
    mouseout: js.Function1[/* event */ stdLib.Event, scala.Unit] = null,
    mouseover: js.Function1[/* event */ stdLib.Event, scala.Unit] = null
  ): MousePlotEvents = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove)
    if (mouseout != null) __obj.updateDynamic("mouseout")(mouseout)
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover)
    __obj.asInstanceOf[MousePlotEvents]
  }
}

