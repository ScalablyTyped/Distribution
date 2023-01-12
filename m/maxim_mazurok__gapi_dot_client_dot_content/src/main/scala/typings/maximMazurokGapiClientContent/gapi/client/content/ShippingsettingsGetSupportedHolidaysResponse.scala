package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingsettingsGetSupportedHolidaysResponse extends StObject {
  
  /** A list of holidays applicable for delivery guarantees. May be empty. */
  var holidays: js.UndefOr[js.Array[HolidaysHoliday]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#shippingsettingsGetSupportedHolidaysResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object ShippingsettingsGetSupportedHolidaysResponse {
  
  inline def apply(): ShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsGetSupportedHolidaysResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShippingsettingsGetSupportedHolidaysResponse] (val x: Self) extends AnyVal {
    
    inline def setHolidays(value: js.Array[HolidaysHoliday]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
    
    inline def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
    
    inline def setHolidaysVarargs(value: HolidaysHoliday*): Self = StObject.set(x, "holidays", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
