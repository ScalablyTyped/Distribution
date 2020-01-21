package typings.hapiLab.mod.script

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  /**
    * An object that is passed to `before` and `after` functions in addition to tests themselves.
    */
  val context: Record[String, _]
  /**
    * A property that can be assigned a cleanup function registered at runtime to be executed after the test completes.
    */
  var onCleanup: js.UndefOr[Action] = js.undefined
  /**
    * A property that can be assigned an override for global exception handling.
    */
  var onUncaughtException: js.UndefOr[ErrorHandler] = js.undefined
  /**
    * A property that can be assigned an override function for global rejection handling.
    */
  var onUnhandledRejection: js.UndefOr[ErrorHandler] = js.undefined
  /**
    * Sets a requirement that a function must be called a certain number of times.
    * 
    * @param func - the function to be called.
    * @param count - the number of required invocations.
    * 
    * @returns a wrapped function.
    */
  def mustCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, count: Double): T
  /**
    * Adds notes to the test log.
    * 
    * @param note - a string to be included in the console reporter at the end of the output.
    */
  def note(note: String): Unit
}

object Flags {
  @scala.inline
  def apply(
    context: Record[String, _],
    mustCall: (js.Any, Double) => js.Any,
    note: String => Unit,
    onCleanup: Action = null,
    onUncaughtException: /* err */ Error => Unit = null,
    onUnhandledRejection: /* err */ Error => Unit = null
  ): Flags = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mustCall = js.Any.fromFunction2(mustCall), note = js.Any.fromFunction1(note))
    if (onCleanup != null) __obj.updateDynamic("onCleanup")(onCleanup.asInstanceOf[js.Any])
    if (onUncaughtException != null) __obj.updateDynamic("onUncaughtException")(js.Any.fromFunction1(onUncaughtException))
    if (onUnhandledRejection != null) __obj.updateDynamic("onUnhandledRejection")(js.Any.fromFunction1(onUnhandledRejection))
    __obj.asInstanceOf[Flags]
  }
}

