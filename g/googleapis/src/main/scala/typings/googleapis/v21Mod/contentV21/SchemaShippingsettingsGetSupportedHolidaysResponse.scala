package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShippingsettingsGetSupportedHolidaysResponse extends StObject {
  
  /**
    * A list of holidays applicable for delivery guarantees. May be empty.
    */
  var holidays: js.UndefOr[js.Array[SchemaHolidaysHoliday]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#shippingsettingsGetSupportedHolidaysResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaShippingsettingsGetSupportedHolidaysResponse {
  
  inline def apply(): SchemaShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedHolidaysResponse]
  }
  
  extension [Self <: SchemaShippingsettingsGetSupportedHolidaysResponse](x: Self) {
    
    inline def setHolidays(value: js.Array[SchemaHolidaysHoliday]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
    
    inline def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
    
    inline def setHolidaysVarargs(value: SchemaHolidaysHoliday*): Self = StObject.set(x, "holidays", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
