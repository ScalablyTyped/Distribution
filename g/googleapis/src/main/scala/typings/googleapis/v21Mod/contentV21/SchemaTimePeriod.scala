package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimePeriod extends StObject {
  
  /**
    * The ending timestamp.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The starting timestamp.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimePeriod {
  
  inline def apply(): SchemaTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimePeriod]
  }
  
  extension [Self <: SchemaTimePeriod](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
