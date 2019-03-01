package typings
package hellojsLib.hellojsMod.helloNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSEvent extends js.Object {
  def emit(event: java.lang.String, data: js.Any): HelloJSStatic
  def emitAfter(): HelloJSStatic
  def findEvents(
    event: java.lang.String,
    callback: js.Function2[/* name */ java.lang.String, /* index */ scala.Double, scala.Unit]
  ): scala.Unit
  def off(event: java.lang.String, callback: js.Function1[/* auth */ HelloJSEventArgument, scala.Unit]): HelloJSStatic
  def on(event: java.lang.String, callback: js.Function1[/* auth */ HelloJSEventArgument, scala.Unit]): HelloJSStatic
}

object HelloJSEvent {
  @scala.inline
  def apply(
    emit: js.Function2[java.lang.String, js.Any, HelloJSStatic],
    emitAfter: js.Function0[HelloJSStatic],
    findEvents: js.Function2[
      java.lang.String, 
      js.Function2[/* name */ java.lang.String, /* index */ scala.Double, scala.Unit], 
      scala.Unit
    ],
    off: js.Function2[
      java.lang.String, 
      js.Function1[/* auth */ HelloJSEventArgument, scala.Unit], 
      HelloJSStatic
    ],
    on: js.Function2[
      java.lang.String, 
      js.Function1[/* auth */ HelloJSEventArgument, scala.Unit], 
      HelloJSStatic
    ]
  ): HelloJSEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("emitAfter")(emitAfter)
    __obj.updateDynamic("findEvents")(findEvents)
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.asInstanceOf[HelloJSEvent]
  }
}

