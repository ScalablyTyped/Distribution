package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAnnotationsFibonacciTimeZonesTypeControlPointOptions extends StObject {
  
  var events: js.UndefOr[Any] = js.undefined
}
object NavigationAnnotationsFibonacciTimeZonesTypeControlPointOptions {
  
  inline def apply(): NavigationAnnotationsFibonacciTimeZonesTypeControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsFibonacciTimeZonesTypeControlPointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationAnnotationsFibonacciTimeZonesTypeControlPointOptions] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
