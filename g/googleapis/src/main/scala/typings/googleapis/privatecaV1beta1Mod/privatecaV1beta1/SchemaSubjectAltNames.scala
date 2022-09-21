package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubjectAltNames extends StObject {
  
  /**
    * Contains additional subject alternative name values.
    */
  var customSans: js.UndefOr[js.Array[SchemaX509Extension]] = js.undefined
  
  /**
    * Contains only valid, fully-qualified host names.
    */
  var dnsNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Contains only valid RFC 2822 E-mail addresses.
    */
  var emailAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
    */
  var ipAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Contains only valid RFC 3986 URIs.
    */
  var uris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSubjectAltNames {
  
  inline def apply(): SchemaSubjectAltNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubjectAltNames]
  }
  
  extension [Self <: SchemaSubjectAltNames](x: Self) {
    
    inline def setCustomSans(value: js.Array[SchemaX509Extension]): Self = StObject.set(x, "customSans", value.asInstanceOf[js.Any])
    
    inline def setCustomSansUndefined: Self = StObject.set(x, "customSans", js.undefined)
    
    inline def setCustomSansVarargs(value: SchemaX509Extension*): Self = StObject.set(x, "customSans", js.Array(value*))
    
    inline def setDnsNames(value: js.Array[String]): Self = StObject.set(x, "dnsNames", value.asInstanceOf[js.Any])
    
    inline def setDnsNamesNull: Self = StObject.set(x, "dnsNames", null)
    
    inline def setDnsNamesUndefined: Self = StObject.set(x, "dnsNames", js.undefined)
    
    inline def setDnsNamesVarargs(value: String*): Self = StObject.set(x, "dnsNames", js.Array(value*))
    
    inline def setEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesNull: Self = StObject.set(x, "emailAddresses", null)
    
    inline def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    inline def setEmailAddressesVarargs(value: String*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setIpAddresses(value: js.Array[String]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesNull: Self = StObject.set(x, "ipAddresses", null)
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: String*): Self = StObject.set(x, "ipAddresses", js.Array(value*))
    
    inline def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisNull: Self = StObject.set(x, "uris", null)
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value*))
  }
}
