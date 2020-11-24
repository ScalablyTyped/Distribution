package typings.hapiLab.mod.script

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flags extends js.Object {
  
  /**
    * An object that is passed to `before` and `after` functions in addition to tests themselves.
    */
  val context: Record[String, _] = js.native
  
  /**
    * Sets a requirement that a function must be called a certain number of times.
    * 
    * @param func - the function to be called.
    * @param count - the number of required invocations.
    * 
    * @returns a wrapped function.
    */
  def mustCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, count: Double): T = js.native
  
  /**
    * Adds notes to the test log.
    * 
    * @param note - a string to be included in the console reporter at the end of the output.
    */
  def note(note: String): Unit = js.native
  
  /**
    * A property that can be assigned a cleanup function registered at runtime to be executed after the test completes.
    */
  var onCleanup: js.UndefOr[Action] = js.native
  
  /**
    * A property that can be assigned an override for global exception handling.
    */
  var onUncaughtException: js.UndefOr[ErrorHandler] = js.native
  
  /**
    * A property that can be assigned an override function for global rejection handling.
    */
  var onUnhandledRejection: js.UndefOr[ErrorHandler] = js.native
}
object Flags {
  
  @scala.inline
  def apply(context: Record[String, _], mustCall: (js.Any, Double) => js.Any, note: String => Unit): Flags = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mustCall = js.Any.fromFunction2(mustCall), note = js.Any.fromFunction1(note))
    __obj.asInstanceOf[Flags]
  }
  
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: Record[String, _]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustCall(value: (js.Any, Double) => js.Any): Self = this.set("mustCall", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNote(value: String => Unit): Self = this.set("note", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCleanup(value: Action): Self = this.set("onCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCleanup: Self = this.set("onCleanup", js.undefined)
    
    @scala.inline
    def setOnUncaughtException(value: /* err */ Error => Unit): Self = this.set("onUncaughtException", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUncaughtException: Self = this.set("onUncaughtException", js.undefined)
    
    @scala.inline
    def setOnUnhandledRejection(value: /* err */ Error => Unit): Self = this.set("onUnhandledRejection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnhandledRejection: Self = this.set("onUnhandledRejection", js.undefined)
  }
}
