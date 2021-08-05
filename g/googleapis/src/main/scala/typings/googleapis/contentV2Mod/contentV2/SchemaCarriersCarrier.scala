package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCarriersCarrier extends StObject {
  
  /**
    * The CLDR country code of the carrier (e.g., &quot;US&quot;). Always
    * present.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the carrier (e.g., &quot;UPS&quot;). Always present.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of supported services (e.g., &quot;ground&quot;) for that carrier.
    * Contains at least one service.
    */
  var services: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCarriersCarrier {
  
  inline def apply(): SchemaCarriersCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCarriersCarrier]
  }
  
  extension [Self <: SchemaCarriersCarrier](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
