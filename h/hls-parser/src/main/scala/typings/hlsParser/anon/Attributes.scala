package typings.hlsParser.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends StObject {
  
  var attributes: js.UndefOr[js.Object] = js.native
  
  var classId: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var end: js.UndefOr[Date] = js.native
  
  var endOnNext: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var plannedDuration: js.UndefOr[Double] = js.native
  
  var start: Date = js.native
}
object Attributes {
  
  @scala.inline
  def apply(id: String, start: Date): Attributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setClassId(value: String): Self = StObject.set(x, "classId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassIdUndefined: Self = StObject.set(x, "classId", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOnNext(value: Boolean): Self = StObject.set(x, "endOnNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOnNextUndefined: Self = StObject.set(x, "endOnNext", js.undefined)
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedDuration(value: Double): Self = StObject.set(x, "plannedDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedDurationUndefined: Self = StObject.set(x, "plannedDuration", js.undefined)
    
    @scala.inline
    def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
