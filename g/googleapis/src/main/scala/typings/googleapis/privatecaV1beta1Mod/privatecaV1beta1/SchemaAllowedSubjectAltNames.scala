package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllowedSubjectAltNames extends StObject {
  
  /**
    * Optional. Specifies if to allow custom X509Extension values.
    */
  var allowCustomSans: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Specifies if glob patterns used for allowed_dns_names allow wildcard certificates. If this is set, certificate requests with wildcard domains will be permitted to match a glob pattern specified in allowed_dns_names. Otherwise, certificate requests with wildcard domains will be permitted only if allowed_dns_names contains a literal wildcard.
    */
  var allowGlobbingDnsWildcards: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. `\*`). E.g. for globbed entries: `*bar.com` will allow `foo.bar.com`, but not `*.bar.com`, unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: `\*.bar.com` will allow `*.bar.com`, but not `foo.bar.com`.
    */
  var allowedDnsNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported.
    */
  var allowedEmailAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the '/' notation (e.g. 10.0.0.0/8, 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
    */
  var allowedIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. '/') use the double star glob pattern (i.e. '**').
    */
  var allowedUris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAllowedSubjectAltNames {
  
  inline def apply(): SchemaAllowedSubjectAltNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllowedSubjectAltNames]
  }
  
  extension [Self <: SchemaAllowedSubjectAltNames](x: Self) {
    
    inline def setAllowCustomSans(value: Boolean): Self = StObject.set(x, "allowCustomSans", value.asInstanceOf[js.Any])
    
    inline def setAllowCustomSansNull: Self = StObject.set(x, "allowCustomSans", null)
    
    inline def setAllowCustomSansUndefined: Self = StObject.set(x, "allowCustomSans", js.undefined)
    
    inline def setAllowGlobbingDnsWildcards(value: Boolean): Self = StObject.set(x, "allowGlobbingDnsWildcards", value.asInstanceOf[js.Any])
    
    inline def setAllowGlobbingDnsWildcardsNull: Self = StObject.set(x, "allowGlobbingDnsWildcards", null)
    
    inline def setAllowGlobbingDnsWildcardsUndefined: Self = StObject.set(x, "allowGlobbingDnsWildcards", js.undefined)
    
    inline def setAllowedDnsNames(value: js.Array[String]): Self = StObject.set(x, "allowedDnsNames", value.asInstanceOf[js.Any])
    
    inline def setAllowedDnsNamesNull: Self = StObject.set(x, "allowedDnsNames", null)
    
    inline def setAllowedDnsNamesUndefined: Self = StObject.set(x, "allowedDnsNames", js.undefined)
    
    inline def setAllowedDnsNamesVarargs(value: String*): Self = StObject.set(x, "allowedDnsNames", js.Array(value*))
    
    inline def setAllowedEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "allowedEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setAllowedEmailAddressesNull: Self = StObject.set(x, "allowedEmailAddresses", null)
    
    inline def setAllowedEmailAddressesUndefined: Self = StObject.set(x, "allowedEmailAddresses", js.undefined)
    
    inline def setAllowedEmailAddressesVarargs(value: String*): Self = StObject.set(x, "allowedEmailAddresses", js.Array(value*))
    
    inline def setAllowedIps(value: js.Array[String]): Self = StObject.set(x, "allowedIps", value.asInstanceOf[js.Any])
    
    inline def setAllowedIpsNull: Self = StObject.set(x, "allowedIps", null)
    
    inline def setAllowedIpsUndefined: Self = StObject.set(x, "allowedIps", js.undefined)
    
    inline def setAllowedIpsVarargs(value: String*): Self = StObject.set(x, "allowedIps", js.Array(value*))
    
    inline def setAllowedUris(value: js.Array[String]): Self = StObject.set(x, "allowedUris", value.asInstanceOf[js.Any])
    
    inline def setAllowedUrisNull: Self = StObject.set(x, "allowedUris", null)
    
    inline def setAllowedUrisUndefined: Self = StObject.set(x, "allowedUris", js.undefined)
    
    inline def setAllowedUrisVarargs(value: String*): Self = StObject.set(x, "allowedUris", js.Array(value*))
  }
}
