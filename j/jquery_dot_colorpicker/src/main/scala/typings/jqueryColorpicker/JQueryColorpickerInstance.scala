package typings.jqueryColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryColorpickerInstance extends js.Object {
  
  def close(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def open(): Unit = js.native
  
  def setColor(color: js.Any): Unit = js.native
}
object JQueryColorpickerInstance {
  
  @scala.inline
  def apply(close: () => Unit, destroy: () => Unit, open: () => Unit, setColor: js.Any => Unit): JQueryColorpickerInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction0(open), setColor = js.Any.fromFunction1(setColor))
    __obj.asInstanceOf[JQueryColorpickerInstance]
  }
  
  @scala.inline
  implicit class JQueryColorpickerInstanceOps[Self <: JQueryColorpickerInstance] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColor(value: js.Any => Unit): Self = this.set("setColor", js.Any.fromFunction1(value))
  }
}
