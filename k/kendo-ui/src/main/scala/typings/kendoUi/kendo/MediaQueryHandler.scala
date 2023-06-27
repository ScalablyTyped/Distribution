package typings.kendoUi.kendo

import typings.std.MediaQueryList
import typings.std.MediaQueryListEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQueryHandler extends StObject {
  
  def destroy(): Unit
  
  var mediaQueryList: MediaQueryList
  
  def onChange(callback: js.Function1[/* e */ MediaQueryListEvent, Unit]): MediaQueryHandler
  
  def onEnter(callback: js.Function1[/* e */ MediaQueryListEvent, Unit]): MediaQueryHandler
  
  def onLeave(callback: js.Function1[/* e */ MediaQueryListEvent, Unit]): MediaQueryHandler
}
object MediaQueryHandler {
  
  inline def apply(
    destroy: () => Unit,
    mediaQueryList: MediaQueryList,
    onChange: js.Function1[/* e */ MediaQueryListEvent, Unit] => MediaQueryHandler,
    onEnter: js.Function1[/* e */ MediaQueryListEvent, Unit] => MediaQueryHandler,
    onLeave: js.Function1[/* e */ MediaQueryListEvent, Unit] => MediaQueryHandler
  ): MediaQueryHandler = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), mediaQueryList = mediaQueryList.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onEnter = js.Any.fromFunction1(onEnter), onLeave = js.Any.fromFunction1(onLeave))
    __obj.asInstanceOf[MediaQueryHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaQueryHandler] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setMediaQueryList(value: MediaQueryList): Self = StObject.set(x, "mediaQueryList", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: js.Function1[/* e */ MediaQueryListEvent, Unit] => MediaQueryHandler): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnEnter(value: js.Function1[/* e */ MediaQueryListEvent, Unit] => MediaQueryHandler): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
    
    inline def setOnLeave(value: js.Function1[/* e */ MediaQueryListEvent, Unit] => MediaQueryHandler): Self = StObject.set(x, "onLeave", js.Any.fromFunction1(value))
  }
}
