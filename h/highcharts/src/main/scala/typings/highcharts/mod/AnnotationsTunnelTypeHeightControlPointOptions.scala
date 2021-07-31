package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsTunnelTypeHeightControlPointOptions extends StObject {
  
  var events: js.UndefOr[js.Any] = js.undefined
}
object AnnotationsTunnelTypeHeightControlPointOptions {
  
  @scala.inline
  def apply(): AnnotationsTunnelTypeHeightControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsTunnelTypeHeightControlPointOptions]
  }
  
  @scala.inline
  implicit class AnnotationsTunnelTypeHeightControlPointOptionsMutableBuilder[Self <: AnnotationsTunnelTypeHeightControlPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
