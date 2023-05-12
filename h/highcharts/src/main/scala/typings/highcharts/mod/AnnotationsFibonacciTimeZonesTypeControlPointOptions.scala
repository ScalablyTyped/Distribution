package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsFibonacciTimeZonesTypeControlPointOptions extends StObject {
  
  var events: js.UndefOr[Any] = js.undefined
}
object AnnotationsFibonacciTimeZonesTypeControlPointOptions {
  
  inline def apply(): AnnotationsFibonacciTimeZonesTypeControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciTimeZonesTypeControlPointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationsFibonacciTimeZonesTypeControlPointOptions] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
