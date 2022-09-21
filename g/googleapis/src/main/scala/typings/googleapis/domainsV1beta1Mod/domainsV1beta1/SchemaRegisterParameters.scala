package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegisterParameters extends StObject {
  
  /**
    * Indicates whether the domain is available for registration. This value is accurate when obtained by calling `RetrieveRegisterParameters`, but is approximate when obtained by calling `SearchDomains`.
    */
  var availability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The domain name. Unicode domain names are expressed in Punycode format.
    */
  var domainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notices about special properties of the domain.
    */
  var domainNotices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Contact privacy options that the domain supports.
    */
  var supportedPrivacy: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Price to register or renew the domain for one year.
    */
  var yearlyPrice: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaRegisterParameters {
  
  inline def apply(): SchemaRegisterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegisterParameters]
  }
  
  extension [Self <: SchemaRegisterParameters](x: Self) {
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setDomainNotices(value: js.Array[String]): Self = StObject.set(x, "domainNotices", value.asInstanceOf[js.Any])
    
    inline def setDomainNoticesNull: Self = StObject.set(x, "domainNotices", null)
    
    inline def setDomainNoticesUndefined: Self = StObject.set(x, "domainNotices", js.undefined)
    
    inline def setDomainNoticesVarargs(value: String*): Self = StObject.set(x, "domainNotices", js.Array(value*))
    
    inline def setSupportedPrivacy(value: js.Array[String]): Self = StObject.set(x, "supportedPrivacy", value.asInstanceOf[js.Any])
    
    inline def setSupportedPrivacyNull: Self = StObject.set(x, "supportedPrivacy", null)
    
    inline def setSupportedPrivacyUndefined: Self = StObject.set(x, "supportedPrivacy", js.undefined)
    
    inline def setSupportedPrivacyVarargs(value: String*): Self = StObject.set(x, "supportedPrivacy", js.Array(value*))
    
    inline def setYearlyPrice(value: SchemaMoney): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    inline def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
