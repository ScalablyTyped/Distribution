package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: js.UndefOr[js.Object] = js.undefined
  
  var classId: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var end: js.UndefOr[js.Date] = js.undefined
  
  var endOnNext: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var plannedDuration: js.UndefOr[Double] = js.undefined
  
  var start: js.Date
}
object Attributes {
  
  inline def apply(id: String, start: js.Date): Attributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClassId(value: String): Self = StObject.set(x, "classId", value.asInstanceOf[js.Any])
    
    inline def setClassIdUndefined: Self = StObject.set(x, "classId", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndOnNext(value: Boolean): Self = StObject.set(x, "endOnNext", value.asInstanceOf[js.Any])
    
    inline def setEndOnNextUndefined: Self = StObject.set(x, "endOnNext", js.undefined)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPlannedDuration(value: Double): Self = StObject.set(x, "plannedDuration", value.asInstanceOf[js.Any])
    
    inline def setPlannedDurationUndefined: Self = StObject.set(x, "plannedDuration", js.undefined)
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
