package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mobile Carrier List Response
  */
trait SchemaMobileCarriersListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileCarriersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile carrier collection.
    */
  var mobileCarriers: js.UndefOr[js.Array[SchemaMobileCarrier]] = js.undefined
}
object SchemaMobileCarriersListResponse {
  
  inline def apply(): SchemaMobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileCarriersListResponse]
  }
  
  extension [Self <: SchemaMobileCarriersListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMobileCarriers(value: js.Array[SchemaMobileCarrier]): Self = StObject.set(x, "mobileCarriers", value.asInstanceOf[js.Any])
    
    inline def setMobileCarriersUndefined: Self = StObject.set(x, "mobileCarriers", js.undefined)
    
    inline def setMobileCarriersVarargs(value: SchemaMobileCarrier*): Self = StObject.set(x, "mobileCarriers", js.Array(value :_*))
  }
}
