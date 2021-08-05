package typings.jqueryMousewheel

import typings.jqueryMousewheel.JQueryMousewheel.JQueryMousewheelEventObject
import typings.jqueryMousewheel.jqueryMousewheelStrings.mousewheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def mousewheel(
    handler: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, js.Any]
  ): JQuery
  
  @JSName("on")
  def on_mousewheel(
    event: mousewheel,
    handler: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, js.Any]
  ): JQuery
  
  def unmousewheel(): JQuery
}
object JQuery {
  
  inline def apply(
    mousewheel: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, js.Any] => JQuery,
    on: (mousewheel, js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, js.Any]) => JQuery,
    unmousewheel: () => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(mousewheel = js.Any.fromFunction1(mousewheel), on = js.Any.fromFunction2(on), unmousewheel = js.Any.fromFunction0(unmousewheel))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setMousewheel(
      value: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, js.Any] => JQuery
    ): Self = StObject.set(x, "mousewheel", js.Any.fromFunction1(value))
    
    inline def setOn(
      value: (mousewheel, js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, js.Any]) => JQuery
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setUnmousewheel(value: () => JQuery): Self = StObject.set(x, "unmousewheel", js.Any.fromFunction0(value))
  }
}
