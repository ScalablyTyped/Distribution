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
    emit: (java.lang.String, js.Any) => HelloJSStatic,
    emitAfter: () => HelloJSStatic,
    findEvents: (java.lang.String, js.Function2[/* name */ java.lang.String, /* index */ scala.Double, scala.Unit]) => scala.Unit,
    off: (java.lang.String, js.Function1[/* auth */ HelloJSEventArgument, scala.Unit]) => HelloJSStatic,
    on: (java.lang.String, js.Function1[/* auth */ HelloJSEventArgument, scala.Unit]) => HelloJSStatic
  ): HelloJSEvent = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), emitAfter = js.Any.fromFunction0(emitAfter), findEvents = js.Any.fromFunction2(findEvents), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[HelloJSEvent]
  }
}

