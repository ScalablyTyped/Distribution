package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerInfo extends StObject {
  
  var hciVersion: js.UndefOr[String] = js.undefined
  
  var realtimeDataUpdatedAt: js.UndefOr[Double] = js.undefined
  
  var serverTime: js.UndefOr[String | Double] = js.undefined
  
  var timetableEnd: js.UndefOr[String] = js.undefined
  
  var timetableStart: js.UndefOr[String] = js.undefined
}
object ServerInfo {
  
  inline def apply(): ServerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerInfo] (val x: Self) extends AnyVal {
    
    inline def setHciVersion(value: String): Self = StObject.set(x, "hciVersion", value.asInstanceOf[js.Any])
    
    inline def setHciVersionUndefined: Self = StObject.set(x, "hciVersion", js.undefined)
    
    inline def setRealtimeDataUpdatedAt(value: Double): Self = StObject.set(x, "realtimeDataUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setRealtimeDataUpdatedAtUndefined: Self = StObject.set(x, "realtimeDataUpdatedAt", js.undefined)
    
    inline def setServerTime(value: String | Double): Self = StObject.set(x, "serverTime", value.asInstanceOf[js.Any])
    
    inline def setServerTimeUndefined: Self = StObject.set(x, "serverTime", js.undefined)
    
    inline def setTimetableEnd(value: String): Self = StObject.set(x, "timetableEnd", value.asInstanceOf[js.Any])
    
    inline def setTimetableEndUndefined: Self = StObject.set(x, "timetableEnd", js.undefined)
    
    inline def setTimetableStart(value: String): Self = StObject.set(x, "timetableStart", value.asInstanceOf[js.Any])
    
    inline def setTimetableStartUndefined: Self = StObject.set(x, "timetableStart", js.undefined)
  }
}
