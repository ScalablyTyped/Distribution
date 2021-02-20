package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileCarrier extends StObject {
  
  /** Country code of the country to which this mobile carrier belongs. */
  var countryCode: js.UndefOr[String] = js.native
  
  /** DART ID of the country to which this mobile carrier belongs. */
  var countryDartId: js.UndefOr[String] = js.native
  
  /** ID of this mobile carrier. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#mobileCarrier". */
  var kind: js.UndefOr[String] = js.native
  
  /** Name of this mobile carrier. */
  var name: js.UndefOr[String] = js.native
}
object MobileCarrier {
  
  @scala.inline
  def apply(): MobileCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileCarrier]
  }
  
  @scala.inline
  implicit class MobileCarrierMutableBuilder[Self <: MobileCarrier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCountryDartId(value: String): Self = StObject.set(x, "countryDartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryDartIdUndefined: Self = StObject.set(x, "countryDartId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
