package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAnnotationsFibonacciTimeZonesControlPointOptions extends StObject {
  
  var events: js.UndefOr[Any] = js.undefined
}
object NavigationAnnotationsFibonacciTimeZonesControlPointOptions {
  
  inline def apply(): NavigationAnnotationsFibonacciTimeZonesControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsFibonacciTimeZonesControlPointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationAnnotationsFibonacciTimeZonesControlPointOptions] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
