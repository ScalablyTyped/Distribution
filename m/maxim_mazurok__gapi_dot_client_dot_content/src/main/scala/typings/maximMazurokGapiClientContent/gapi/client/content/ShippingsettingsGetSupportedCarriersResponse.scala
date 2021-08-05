package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingsettingsGetSupportedCarriersResponse extends StObject {
  
  /** A list of supported carriers. May be empty. */
  var carriers: js.UndefOr[js.Array[CarriersCarrier]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsGetSupportedCarriersResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object ShippingsettingsGetSupportedCarriersResponse {
  
  inline def apply(): ShippingsettingsGetSupportedCarriersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsGetSupportedCarriersResponse]
  }
  
  extension [Self <: ShippingsettingsGetSupportedCarriersResponse](x: Self) {
    
    inline def setCarriers(value: js.Array[CarriersCarrier]): Self = StObject.set(x, "carriers", value.asInstanceOf[js.Any])
    
    inline def setCarriersUndefined: Self = StObject.set(x, "carriers", js.undefined)
    
    inline def setCarriersVarargs(value: CarriersCarrier*): Self = StObject.set(x, "carriers", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
