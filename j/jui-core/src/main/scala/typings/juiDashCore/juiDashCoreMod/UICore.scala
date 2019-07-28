package typings.juiDashCore.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UICore extends js.Object {
  var event: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[js.Any] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * Check the parameter type of a UI method and generates an alarm when a wrong value is entered
    *
    * @param name Method name
    * @param params Parameters
    */
  def addValid(name: String, params: js.Array[_]): Unit
  /**
    * Sets a callback function that is called after a UI method is run
    *
    * @param name Method name
    */
  def callAfter(name: String, callback: js.Function0[Unit]): Unit
  /**
    * Sets a callback function that is called before a UI method is run
    *
    * @param name Method name
    */
  def callBefore(name: String, callback: js.Function0[Unit]): Unit
  /**
    * Sets a callback function and the delay time before/after a UI method is run
    *
    * @param name Method name
    */
  def callDelay(name: String, callObj: js.Function0[Unit]): Unit
  def destroy(): Unit
  /**
    * Generates a custom event. The first parameter is the type of a custom event. A function defined as an option or on method is called
    *
    * @param type Event type
    * @param args Event Arguments
    */
  def emit(`type`: String, args: js.Function0[Unit]): js.Any
  /**
    * Removes a custom event of an applicable type or callback handler
    *
    * @param type Event type
    */
  def off(`type`: String): Unit
  /**
    * A callback function defined as an on method is run when an emit method is called
    *
    * @param type Event type
    */
  def on(`type`: String, callback: js.Function0[Unit]): Unit
  /**
    * Dynamically defines the options of a UI
    */
  def setOption(key: String, value: js.Any): Unit
  /**
    * Dynamically defines the template method of a UI
    *
    * @param name Template name
    * @param html Template markup
    */
  def setTpl(name: String, html: String): Unit
}

object UICore {
  @scala.inline
  def apply(
    addValid: (String, js.Array[_]) => Unit,
    callAfter: (String, js.Function0[Unit]) => Unit,
    callBefore: (String, js.Function0[Unit]) => Unit,
    callDelay: (String, js.Function0[Unit]) => Unit,
    destroy: () => Unit,
    emit: (String, js.Function0[Unit]) => js.Any,
    off: String => Unit,
    on: (String, js.Function0[Unit]) => Unit,
    setOption: (String, js.Any) => Unit,
    setTpl: (String, String) => Unit,
    event: js.Any = null,
    root: js.Any = null,
    tpl: js.Any = null
  ): UICore = {
    val __obj = js.Dynamic.literal(addValid = js.Any.fromFunction2(addValid), callAfter = js.Any.fromFunction2(callAfter), callBefore = js.Any.fromFunction2(callBefore), callDelay = js.Any.fromFunction2(callDelay), destroy = js.Any.fromFunction0(destroy), emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), setOption = js.Any.fromFunction2(setOption), setTpl = js.Any.fromFunction2(setTpl))
    if (event != null) __obj.updateDynamic("event")(event)
    if (root != null) __obj.updateDynamic("root")(root)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[UICore]
  }
}

