package typings.hellojs.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSEvent extends js.Object {
  def emit(event: String, data: js.Any): HelloJSStatic
  def emitAfter(): HelloJSStatic
  def findEvents(event: String, callback: js.Function2[/* name */ String, /* index */ Double, Unit]): Unit
  def off(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic
  def on(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic
}

object HelloJSEvent {
  @scala.inline
  def apply(
    emit: (String, js.Any) => HelloJSStatic,
    emitAfter: () => HelloJSStatic,
    findEvents: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Unit,
    off: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic,
    on: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic
  ): HelloJSEvent = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), emitAfter = js.Any.fromFunction0(emitAfter), findEvents = js.Any.fromFunction2(findEvents), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[HelloJSEvent]
  }
}

