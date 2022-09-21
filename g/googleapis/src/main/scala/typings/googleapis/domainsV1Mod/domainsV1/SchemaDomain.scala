package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomain extends StObject {
  
  /**
    * The domain name. Unicode domain names are expressed in Punycode format.
    */
  var domainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of this domain as a `Registration` resource.
    */
  var resourceState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Price to renew the domain for one year. Only set when `resource_state` is `IMPORTABLE`.
    */
  var yearlyPrice: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaDomain {
  
  inline def apply(): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomain]
  }
  
  extension [Self <: SchemaDomain](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setResourceState(value: String): Self = StObject.set(x, "resourceState", value.asInstanceOf[js.Any])
    
    inline def setResourceStateNull: Self = StObject.set(x, "resourceState", null)
    
    inline def setResourceStateUndefined: Self = StObject.set(x, "resourceState", js.undefined)
    
    inline def setYearlyPrice(value: SchemaMoney): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    inline def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
