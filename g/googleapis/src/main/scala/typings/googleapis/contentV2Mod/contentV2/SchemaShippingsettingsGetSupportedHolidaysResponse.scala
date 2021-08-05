package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShippingsettingsGetSupportedHolidaysResponse extends StObject {
  
  /**
    * A list of holidays applicable for delivery guarantees. May be empty.
    */
  var holidays: js.UndefOr[js.Array[SchemaHolidaysHoliday]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsGetSupportedHolidaysResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaShippingsettingsGetSupportedHolidaysResponse {
  
  inline def apply(): SchemaShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedHolidaysResponse]
  }
  
  extension [Self <: SchemaShippingsettingsGetSupportedHolidaysResponse](x: Self) {
    
    inline def setHolidays(value: js.Array[SchemaHolidaysHoliday]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
    
    inline def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
    
    inline def setHolidaysVarargs(value: SchemaHolidaysHoliday*): Self = StObject.set(x, "holidays", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
