package typings.jsoneditoronline

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorSearchBox extends js.Object {
  
  def clearDelay(): Unit = js.native
  
  def focusActiveResult(): Unit = js.native
  
  def next(): Unit = js.native
  
  def onDelayedSearch(event: Event): Unit = js.native
  
  def onKeyDown(event: Event): Unit = js.native
  
  def onKeyUp(event: Event): Unit = js.native
  
  def onSearch(event: Event, forcedSearch: Boolean): Unit = js.native
  
  def previous(): Unit = js.native
  
  def setActiveResult(index: Double): Unit = js.native
}
object JSONEditorSearchBox {
  
  @scala.inline
  def apply(
    clearDelay: () => Unit,
    focusActiveResult: () => Unit,
    next: () => Unit,
    onDelayedSearch: Event => Unit,
    onKeyDown: Event => Unit,
    onKeyUp: Event => Unit,
    onSearch: (Event, Boolean) => Unit,
    previous: () => Unit,
    setActiveResult: Double => Unit
  ): JSONEditorSearchBox = {
    val __obj = js.Dynamic.literal(clearDelay = js.Any.fromFunction0(clearDelay), focusActiveResult = js.Any.fromFunction0(focusActiveResult), next = js.Any.fromFunction0(next), onDelayedSearch = js.Any.fromFunction1(onDelayedSearch), onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), onSearch = js.Any.fromFunction2(onSearch), previous = js.Any.fromFunction0(previous), setActiveResult = js.Any.fromFunction1(setActiveResult))
    __obj.asInstanceOf[JSONEditorSearchBox]
  }
  
  @scala.inline
  implicit class JSONEditorSearchBoxOps[Self <: JSONEditorSearchBox] (val x: Self) extends AnyVal {
    
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
    def setClearDelay(value: () => Unit): Self = this.set("clearDelay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusActiveResult(value: () => Unit): Self = this.set("focusActiveResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDelayedSearch(value: Event => Unit): Self = this.set("onDelayedSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDown(value: Event => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUp(value: Event => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearch(value: (Event, Boolean) => Unit): Self = this.set("onSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetActiveResult(value: Double => Unit): Self = this.set("setActiveResult", js.Any.fromFunction1(value))
  }
}
