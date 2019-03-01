package typings
package jqueryDashMousewheelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def mousewheel(
    handler: js.Function2[
      /* eventObject */ jqueryDashMousewheelLib.JQueryMousewheelNs.JQueryMousewheelEventObject, 
      /* repeated */ js.Any, 
      _
    ]
  ): JQuery
  @JSName("on")
  def on_mousewheel(
    event: jqueryDashMousewheelLib.jqueryDashMousewheelLibStrings.mousewheel,
    handler: js.Function2[
      /* eventObject */ jqueryDashMousewheelLib.JQueryMousewheelNs.JQueryMousewheelEventObject, 
      /* repeated */ js.Any, 
      _
    ]
  ): JQuery
  def unmousewheel(): JQuery
}

object JQuery {
  @scala.inline
  def apply(
    mousewheel: js.Function1[
      js.Function2[
        /* eventObject */ jqueryDashMousewheelLib.JQueryMousewheelNs.JQueryMousewheelEventObject, 
        /* repeated */ js.Any, 
        _
      ], 
      JQuery
    ],
    on_mousewheel: js.Function2[
      jqueryDashMousewheelLib.jqueryDashMousewheelLibStrings.mousewheel, 
      js.Function2[
        /* eventObject */ jqueryDashMousewheelLib.JQueryMousewheelNs.JQueryMousewheelEventObject, 
        /* repeated */ js.Any, 
        _
      ], 
      JQuery
    ],
    unmousewheel: js.Function0[JQuery]
  ): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mousewheel")(mousewheel)
    __obj.updateDynamic("on")(on_mousewheel)
    __obj.updateDynamic("unmousewheel")(unmousewheel)
    __obj.asInstanceOf[JQuery]
  }
}

