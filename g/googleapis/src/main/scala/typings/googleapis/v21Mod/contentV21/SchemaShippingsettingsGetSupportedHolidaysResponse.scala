package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaShippingsettingsGetSupportedHolidaysResponse extends StObject {
  
  /**
    * A list of holidays applicable for delivery guarantees. May be empty.
    */
  var holidays: js.UndefOr[js.Array[SchemaHolidaysHoliday]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsGetSupportedHolidaysResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaShippingsettingsGetSupportedHolidaysResponse {
  
  @scala.inline
  def apply(): SchemaShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedHolidaysResponse]
  }
  
  @scala.inline
  implicit class SchemaShippingsettingsGetSupportedHolidaysResponseMutableBuilder[Self <: SchemaShippingsettingsGetSupportedHolidaysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHolidays(value: js.Array[SchemaHolidaysHoliday]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
    
    @scala.inline
    def setHolidaysVarargs(value: SchemaHolidaysHoliday*): Self = StObject.set(x, "holidays", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
