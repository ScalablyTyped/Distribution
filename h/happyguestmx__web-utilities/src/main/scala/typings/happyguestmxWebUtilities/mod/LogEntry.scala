package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEntry extends StObject {
  
  var category: js.UndefOr[String | Null] = js.undefined
  
  var company_uuid: String
  
  var hotel_uuid: js.UndefOr[String | Null] = js.undefined
  
  var item: js.UndefOr[String | Null] = js.undefined
  
  var sourceIp: String
  
  var `type`: String
  
  var user_uuid: js.UndefOr[String | Null] = js.undefined
}
object LogEntry {
  
  inline def apply(company_uuid: String, sourceIp: String, `type`: String): LogEntry = {
    val __obj = js.Dynamic.literal(company_uuid = company_uuid.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  
  extension [Self <: LogEntry](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCompany_uuid(value: String): Self = StObject.set(x, "company_uuid", value.asInstanceOf[js.Any])
    
    inline def setHotel_uuid(value: String): Self = StObject.set(x, "hotel_uuid", value.asInstanceOf[js.Any])
    
    inline def setHotel_uuidNull: Self = StObject.set(x, "hotel_uuid", null)
    
    inline def setHotel_uuidUndefined: Self = StObject.set(x, "hotel_uuid", js.undefined)
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemNull: Self = StObject.set(x, "item", null)
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser_uuid(value: String): Self = StObject.set(x, "user_uuid", value.asInstanceOf[js.Any])
    
    inline def setUser_uuidNull: Self = StObject.set(x, "user_uuid", null)
    
    inline def setUser_uuidUndefined: Self = StObject.set(x, "user_uuid", js.undefined)
  }
}
