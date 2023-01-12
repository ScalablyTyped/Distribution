package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileCarriersListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#mobileCarriersListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Mobile carrier collection. */
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.undefined
}
object MobileCarriersListResponse {
  
  inline def apply(): MobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileCarriersListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileCarriersListResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMobileCarriers(value: js.Array[MobileCarrier]): Self = StObject.set(x, "mobileCarriers", value.asInstanceOf[js.Any])
    
    inline def setMobileCarriersUndefined: Self = StObject.set(x, "mobileCarriers", js.undefined)
    
    inline def setMobileCarriersVarargs(value: MobileCarrier*): Self = StObject.set(x, "mobileCarriers", js.Array(value*))
  }
}
