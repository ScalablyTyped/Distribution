package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingsettingsGetSupportedHolidaysResponse extends StObject {
  
  /** A list of holidays applicable for delivery guarantees. May be empty. */
  var holidays: js.UndefOr[js.Array[HolidaysHoliday]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsGetSupportedHolidaysResponse". */
  var kind: js.UndefOr[String] = js.native
}
object ShippingsettingsGetSupportedHolidaysResponse {
  
  @scala.inline
  def apply(): ShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsGetSupportedHolidaysResponse]
  }
  
  @scala.inline
  implicit class ShippingsettingsGetSupportedHolidaysResponseMutableBuilder[Self <: ShippingsettingsGetSupportedHolidaysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHolidays(value: js.Array[HolidaysHoliday]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
    
    @scala.inline
    def setHolidaysVarargs(value: HolidaysHoliday*): Self = StObject.set(x, "holidays", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
