package typings.jsoneditoronline

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorSearchBox extends StObject {
  
  def clearDelay(): Unit
  
  def focusActiveResult(): Unit
  
  def next(): Unit
  
  def onDelayedSearch(event: Event): Unit
  
  def onKeyDown(event: Event): Unit
  
  def onKeyUp(event: Event): Unit
  
  def onSearch(event: Event, forcedSearch: Boolean): Unit
  
  def previous(): Unit
  
  def setActiveResult(index: Double): Unit
}
object JSONEditorSearchBox {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: JSONEditorSearchBox] (val x: Self) extends AnyVal {
    
    inline def setClearDelay(value: () => Unit): Self = StObject.set(x, "clearDelay", js.Any.fromFunction0(value))
    
    inline def setFocusActiveResult(value: () => Unit): Self = StObject.set(x, "focusActiveResult", js.Any.fromFunction0(value))
    
    inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setOnDelayedSearch(value: Event => Unit): Self = StObject.set(x, "onDelayedSearch", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: Event => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyUp(value: Event => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnSearch(value: (Event, Boolean) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
    
    inline def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
    
    inline def setSetActiveResult(value: Double => Unit): Self = StObject.set(x, "setActiveResult", js.Any.fromFunction1(value))
  }
}
