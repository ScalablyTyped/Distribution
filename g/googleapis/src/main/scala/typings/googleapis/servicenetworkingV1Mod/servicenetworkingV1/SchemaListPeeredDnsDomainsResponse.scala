package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPeeredDnsDomainsResponse extends StObject {
  
  /**
    * The list of peered DNS domains.
    */
  var peeredDnsDomains: js.UndefOr[js.Array[SchemaPeeredDnsDomain]] = js.undefined
}
object SchemaListPeeredDnsDomainsResponse {
  
  inline def apply(): SchemaListPeeredDnsDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPeeredDnsDomainsResponse]
  }
  
  extension [Self <: SchemaListPeeredDnsDomainsResponse](x: Self) {
    
    inline def setPeeredDnsDomains(value: js.Array[SchemaPeeredDnsDomain]): Self = StObject.set(x, "peeredDnsDomains", value.asInstanceOf[js.Any])
    
    inline def setPeeredDnsDomainsUndefined: Self = StObject.set(x, "peeredDnsDomains", js.undefined)
    
    inline def setPeeredDnsDomainsVarargs(value: SchemaPeeredDnsDomain*): Self = StObject.set(x, "peeredDnsDomains", js.Array(value*))
  }
}
