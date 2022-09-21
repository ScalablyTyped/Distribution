package typings.googleapis.versionhistoryV1Mod.versionhistoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterval extends StObject {
  
  /**
    * Optional. Exclusive end of the interval. If specified, a Timestamp matching this interval will have to be before the end.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Inclusive start of the interval. If specified, a Timestamp matching this interval will have to be the same or after the start.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterval {
  
  inline def apply(): SchemaInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterval]
  }
  
  extension [Self <: SchemaInterval](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
