package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsTunnelControlPointOptions extends StObject {
  
  var events: js.UndefOr[js.Any] = js.undefined
}
object AnnotationsTunnelControlPointOptions {
  
  @scala.inline
  def apply(): AnnotationsTunnelControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsTunnelControlPointOptions]
  }
  
  @scala.inline
  implicit class AnnotationsTunnelControlPointOptionsMutableBuilder[Self <: AnnotationsTunnelControlPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
