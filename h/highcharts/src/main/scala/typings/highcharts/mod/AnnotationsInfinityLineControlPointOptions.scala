package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsInfinityLineControlPointOptions extends StObject {
  
  var events: js.UndefOr[js.Any] = js.native
}
object AnnotationsInfinityLineControlPointOptions {
  
  @scala.inline
  def apply(): AnnotationsInfinityLineControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsInfinityLineControlPointOptions]
  }
  
  @scala.inline
  implicit class AnnotationsInfinityLineControlPointOptionsMutableBuilder[Self <: AnnotationsInfinityLineControlPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
