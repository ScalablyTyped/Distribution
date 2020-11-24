package typings.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UICore extends js.Object {
  
  /**
    * Check the parameter type of a UI method and generates an alarm when a wrong value is entered
    *
    * @param name Method name
    * @param params Parameters
    */
  def addValid(name: String, params: js.Array[_]): Unit = js.native
  
  /**
    * Sets a callback function that is called after a UI method is run
    *
    * @param name Method name
    */
  def callAfter(name: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets a callback function that is called before a UI method is run
    *
    * @param name Method name
    */
  def callBefore(name: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets a callback function and the delay time before/after a UI method is run
    *
    * @param name Method name
    */
  def callDelay(name: String, callObj: js.Function0[Unit]): Unit = js.native
  
  def destroy(): Unit = js.native
  
  /**
    * Generates a custom event. The first parameter is the type of a custom event. A function defined as an option or on method is called
    *
    * @param type Event type
    * @param args Event Arguments
    */
  def emit(`type`: String, args: js.Function0[Unit]): js.Any = js.native
  
  var event: js.UndefOr[js.Any] = js.native
  
  /**
    * Removes a custom event of an applicable type or callback handler
    *
    * @param type Event type
    */
  def off(`type`: String): Unit = js.native
  
  /**
    * A callback function defined as an on method is run when an emit method is called
    *
    * @param type Event type
    */
  def on(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  var root: js.UndefOr[js.Any] = js.native
  
  /**
    * Dynamically defines the options of a UI
    */
  def setOption(key: String, value: js.Any): Unit = js.native
  
  /**
    * Dynamically defines the template method of a UI
    *
    * @param name Template name
    * @param html Template markup
    */
  def setTpl(name: String, html: String): Unit = js.native
  
  var tpl: js.UndefOr[js.Any] = js.native
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
    setTpl: (String, String) => Unit
  ): UICore = {
    val __obj = js.Dynamic.literal(addValid = js.Any.fromFunction2(addValid), callAfter = js.Any.fromFunction2(callAfter), callBefore = js.Any.fromFunction2(callBefore), callDelay = js.Any.fromFunction2(callDelay), destroy = js.Any.fromFunction0(destroy), emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), setOption = js.Any.fromFunction2(setOption), setTpl = js.Any.fromFunction2(setTpl))
    __obj.asInstanceOf[UICore]
  }
  
  @scala.inline
  implicit class UICoreOps[Self <: UICore] (val x: Self) extends AnyVal {
    
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
    def setAddValid(value: (String, js.Array[_]) => Unit): Self = this.set("addValid", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallAfter(value: (String, js.Function0[Unit]) => Unit): Self = this.set("callAfter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallBefore(value: (String, js.Function0[Unit]) => Unit): Self = this.set("callBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallDelay(value: (String, js.Function0[Unit]) => Unit): Self = this.set("callDelay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmit(value: (String, js.Function0[Unit]) => js.Any): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOff(value: String => Unit): Self = this.set("off", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (String, js.Function0[Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetOption(value: (String, js.Any) => Unit): Self = this.set("setOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTpl(value: (String, String) => Unit): Self = this.set("setTpl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
  }
}
