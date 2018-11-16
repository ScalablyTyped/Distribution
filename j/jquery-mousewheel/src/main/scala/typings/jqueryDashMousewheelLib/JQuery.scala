package typings
package jqueryDashMousewheelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JQuery extends js.Object {
  def mousewheel(
    handler: js.Function2[
      /* eventObject */ jqueryDashMousewheelLib.JQueryMousewheelNs.JQueryMousewheelEventObject, 
      /* repeated */js.Any, 
      _
    ]
  ): JQuery
  @JSName("on")
  def on_mousewheel(
    event: jqueryDashMousewheelLib.jqueryDashMousewheelLibStrings.mousewheel,
    handler: js.Function2[
      /* eventObject */ jqueryDashMousewheelLib.JQueryMousewheelNs.JQueryMousewheelEventObject, 
      /* repeated */js.Any, 
      _
    ]
  ): JQuery
  def unmousewheel(): JQuery
}

