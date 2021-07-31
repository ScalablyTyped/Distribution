package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsElliottWaveControlPointOptions extends StObject {
  
  var events: js.UndefOr[js.Any] = js.undefined
}
object AnnotationsElliottWaveControlPointOptions {
  
  @scala.inline
  def apply(): AnnotationsElliottWaveControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveControlPointOptions]
  }
  
  @scala.inline
  implicit class AnnotationsElliottWaveControlPointOptionsMutableBuilder[Self <: AnnotationsElliottWaveControlPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
