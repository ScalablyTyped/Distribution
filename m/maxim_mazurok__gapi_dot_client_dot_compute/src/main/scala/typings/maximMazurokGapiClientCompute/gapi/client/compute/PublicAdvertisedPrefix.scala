package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicAdvertisedPrefix extends StObject {
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The IPv4 address to be used for reverse DNS verification. */
  var dnsVerificationIp: js.UndefOr[String] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new
    * PublicAdvertisedPrefix. An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix, otherwise the request will fail with error 412 conditionNotMet. To
    * see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource type. The server generates this identifier. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The IPv4 address range, in CIDR format, represented by this public advertised prefix. */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#publicAdvertisedPrefix for public advertised prefixes. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The list of public delegated prefixes that exist for this public advertised prefix. */
  var publicDelegatedPrefixs: js.UndefOr[js.Array[PublicAdvertisedPrefixPublicDelegatedPrefix]] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The shared secret to be used for reverse DNS verification. */
  var sharedSecret: js.UndefOr[String] = js.undefined
  
  /** The status of the public advertised prefix. */
  var status: js.UndefOr[String] = js.undefined
}
object PublicAdvertisedPrefix {
  
  inline def apply(): PublicAdvertisedPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAdvertisedPrefix]
  }
  
  extension [Self <: PublicAdvertisedPrefix](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDnsVerificationIp(value: String): Self = StObject.set(x, "dnsVerificationIp", value.asInstanceOf[js.Any])
    
    inline def setDnsVerificationIpUndefined: Self = StObject.set(x, "dnsVerificationIp", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublicDelegatedPrefixs(value: js.Array[PublicAdvertisedPrefixPublicDelegatedPrefix]): Self = StObject.set(x, "publicDelegatedPrefixs", value.asInstanceOf[js.Any])
    
    inline def setPublicDelegatedPrefixsUndefined: Self = StObject.set(x, "publicDelegatedPrefixs", js.undefined)
    
    inline def setPublicDelegatedPrefixsVarargs(value: PublicAdvertisedPrefixPublicDelegatedPrefix*): Self = StObject.set(x, "publicDelegatedPrefixs", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSharedSecret(value: String): Self = StObject.set(x, "sharedSecret", value.asInstanceOf[js.Any])
    
    inline def setSharedSecretUndefined: Self = StObject.set(x, "sharedSecret", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
