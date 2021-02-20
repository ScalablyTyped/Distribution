package typings.jqueryGridster

import typings.jqueryGridster.anon.Helper
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridsterDraggable extends StObject {
  
  var distance: js.UndefOr[Double] = js.native
  
  var drag: js.UndefOr[js.Function2[/* event */ Event, /* ui */ GridsterUi, Unit]] = js.native
  
  var handle: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Any] = js.native
  
  var limit: js.UndefOr[Boolean] = js.native
  
  var offset_left: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Helper, Unit]] = js.native
  
  var stop: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Helper, Unit]] = js.native
}
object GridsterDraggable {
  
  @scala.inline
  def apply(): GridsterDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterDraggable]
  }
  
  @scala.inline
  implicit class GridsterDraggableMutableBuilder[Self <: GridsterDraggable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setDrag(value: (/* event */ Event, /* ui */ GridsterUi) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setLimit(value: Boolean): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset_left(value: Double): Self = StObject.set(x, "offset_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset_leftUndefined: Self = StObject.set(x, "offset_left", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ Event, /* ui */ Helper) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ Event, /* ui */ Helper) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
