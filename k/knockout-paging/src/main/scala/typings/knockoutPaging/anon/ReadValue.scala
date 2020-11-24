package typings.knockoutPaging.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadValue extends js.Object {
  
  def readValue(element: HTMLElement): js.Any = js.native
  
  def writeValue(element: HTMLElement, value: js.Any): Unit = js.native
}
object ReadValue {
  
  @scala.inline
  def apply(readValue: HTMLElement => js.Any, writeValue: (HTMLElement, js.Any) => Unit): ReadValue = {
    val __obj = js.Dynamic.literal(readValue = js.Any.fromFunction1(readValue), writeValue = js.Any.fromFunction2(writeValue))
    __obj.asInstanceOf[ReadValue]
  }
  
  @scala.inline
  implicit class ReadValueOps[Self <: ReadValue] (val x: Self) extends AnyVal {
    
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
    def setReadValue(value: HTMLElement => js.Any): Self = this.set("readValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteValue(value: (HTMLElement, js.Any) => Unit): Self = this.set("writeValue", js.Any.fromFunction2(value))
  }
}
