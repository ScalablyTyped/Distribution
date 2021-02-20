package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarriersCarrier extends StObject {
  
  /** The CLDR country code of the carrier (e.g., "US"). Always present. */
  var country: js.UndefOr[String] = js.native
  
  /** The name of the carrier (e.g., `"UPS"`). Always present. */
  var name: js.UndefOr[String] = js.native
  
  /** A list of supported services (e.g., `"ground"`) for that carrier. Contains at least one service. */
  var services: js.UndefOr[js.Array[String]] = js.native
}
object CarriersCarrier {
  
  @scala.inline
  def apply(): CarriersCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarriersCarrier]
  }
  
  @scala.inline
  implicit class CarriersCarrierMutableBuilder[Self <: CarriersCarrier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
