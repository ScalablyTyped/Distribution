package typings
package highchartsLib.highchartsMod

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
    click: /* event */ stdLib.Event => scala.Unit = null,
    mousemove: /* event */ stdLib.Event => scala.Unit = null,
    mouseout: /* event */ stdLib.Event => scala.Unit = null,
    mouseover: /* event */ stdLib.Event => scala.Unit = null
  ): MousePlotEvents = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1(mousemove))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1(mouseout))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    __obj.asInstanceOf[MousePlotEvents]
  }
}

