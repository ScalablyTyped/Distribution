package typings.jqueryGridster

import typings.jqueryGridster.anon.Helper
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridsterDraggable extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var drag: js.UndefOr[js.Function2[/* event */ Event, /* ui */ GridsterUi, Unit]] = js.undefined
  
  var handle: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[Any] = js.undefined
  
  var limit: js.UndefOr[Boolean] = js.undefined
  
  var offset_left: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Helper, Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Helper, Unit]] = js.undefined
}
object GridsterDraggable {
  
  inline def apply(): GridsterDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterDraggable]
  }
  
  extension [Self <: GridsterDraggable](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setDrag(value: (/* event */ Event, /* ui */ GridsterUi) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setLimit(value: Boolean): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset_left(value: Double): Self = StObject.set(x, "offset_left", value.asInstanceOf[js.Any])
    
    inline def setOffset_leftUndefined: Self = StObject.set(x, "offset_left", js.undefined)
    
    inline def setStart(value: (/* event */ Event, /* ui */ Helper) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ Event, /* ui */ Helper) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
