package typings.jsoneditoronline.anon

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddEventListener extends js.Object {
  
  def addEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
    useCapture: Boolean
  ): js.Function1[/* event */ js.UndefOr[Event], Unit] = js.native
  
  def preventDefault(event: Event): Unit = js.native
  
  def removeEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  def stopPropagation(event: Event): Unit = js.native
}
object AddEventListener {
  
  @scala.inline
  def apply(
    addEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event], Unit],
    preventDefault: Event => Unit,
    removeEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => Unit,
    stopPropagation: Event => Unit
  ): AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction4(addEventListener), preventDefault = js.Any.fromFunction1(preventDefault), removeEventListener = js.Any.fromFunction4(removeEventListener), stopPropagation = js.Any.fromFunction1(stopPropagation))
    __obj.asInstanceOf[AddEventListener]
  }
  
  @scala.inline
  implicit class AddEventListenerOps[Self <: AddEventListener] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(
      value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event], Unit]
    ): Self = this.set("addEventListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPreventDefault(value: Event => Unit): Self = this.set("preventDefault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEventListener(value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStopPropagation(value: Event => Unit): Self = this.set("stopPropagation", js.Any.fromFunction1(value))
  }
}
