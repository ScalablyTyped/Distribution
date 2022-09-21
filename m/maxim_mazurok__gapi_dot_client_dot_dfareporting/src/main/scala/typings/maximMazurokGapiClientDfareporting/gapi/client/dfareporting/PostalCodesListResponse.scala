package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostalCodesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCodesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Postal code collection. */
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.undefined
}
object PostalCodesListResponse {
  
  inline def apply(): PostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCodesListResponse]
  }
  
  extension [Self <: PostalCodesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPostalCodes(value: js.Array[PostalCode]): Self = StObject.set(x, "postalCodes", value.asInstanceOf[js.Any])
    
    inline def setPostalCodesUndefined: Self = StObject.set(x, "postalCodes", js.undefined)
    
    inline def setPostalCodesVarargs(value: PostalCode*): Self = StObject.set(x, "postalCodes", js.Array(value*))
  }
}
