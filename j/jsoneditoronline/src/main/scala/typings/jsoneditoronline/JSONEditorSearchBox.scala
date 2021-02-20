package typings.jsoneditoronline

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorSearchBox extends StObject {
  
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
  implicit class JSONEditorSearchBoxMutableBuilder[Self <: JSONEditorSearchBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearDelay(value: () => Unit): Self = StObject.set(x, "clearDelay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusActiveResult(value: () => Unit): Self = StObject.set(x, "focusActiveResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDelayedSearch(value: Event => Unit): Self = StObject.set(x, "onDelayedSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDown(value: Event => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUp(value: Event => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearch(value: (Event, Boolean) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetActiveResult(value: Double => Unit): Self = StObject.set(x, "setActiveResult", js.Any.fromFunction1(value))
  }
}
