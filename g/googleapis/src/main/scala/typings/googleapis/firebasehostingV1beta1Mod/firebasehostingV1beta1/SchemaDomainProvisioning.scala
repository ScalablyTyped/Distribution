package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current certificate provisioning status information for a domain.
  */
trait SchemaDomainProvisioning extends StObject {
  
  /**
    * The TXT records (for the certificate challenge) that were found at the
    * last DNS fetch.
    */
  var certChallengeDiscoveredTxt: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The DNS challenge for generating a certificate.
    */
  var certChallengeDns: js.UndefOr[SchemaCertDnsChallenge] = js.undefined
  
  /**
    * The HTTP challenge for generating a certificate.
    */
  var certChallengeHttp: js.UndefOr[SchemaCertHttpChallenge] = js.undefined
  
  /**
    * The certificate provisioning status; updated when Firebase Hosting
    * provisions an SSL certificate for the domain.
    */
  var certStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The IPs found at the last DNS fetch.
    */
  var discoveredIps: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The time at which the last DNS fetch occurred.
    */
  var dnsFetchTime: js.UndefOr[String] = js.undefined
  
  /**
    * The DNS record match status as of the last DNS fetch.
    */
  var dnsStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The list of IPs to which the domain is expected to resolve.
    */
  var expectedIps: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaDomainProvisioning {
  
  inline def apply(): SchemaDomainProvisioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainProvisioning]
  }
  
  extension [Self <: SchemaDomainProvisioning](x: Self) {
    
    inline def setCertChallengeDiscoveredTxt(value: js.Array[String]): Self = StObject.set(x, "certChallengeDiscoveredTxt", value.asInstanceOf[js.Any])
    
    inline def setCertChallengeDiscoveredTxtUndefined: Self = StObject.set(x, "certChallengeDiscoveredTxt", js.undefined)
    
    inline def setCertChallengeDiscoveredTxtVarargs(value: String*): Self = StObject.set(x, "certChallengeDiscoveredTxt", js.Array(value :_*))
    
    inline def setCertChallengeDns(value: SchemaCertDnsChallenge): Self = StObject.set(x, "certChallengeDns", value.asInstanceOf[js.Any])
    
    inline def setCertChallengeDnsUndefined: Self = StObject.set(x, "certChallengeDns", js.undefined)
    
    inline def setCertChallengeHttp(value: SchemaCertHttpChallenge): Self = StObject.set(x, "certChallengeHttp", value.asInstanceOf[js.Any])
    
    inline def setCertChallengeHttpUndefined: Self = StObject.set(x, "certChallengeHttp", js.undefined)
    
    inline def setCertStatus(value: String): Self = StObject.set(x, "certStatus", value.asInstanceOf[js.Any])
    
    inline def setCertStatusUndefined: Self = StObject.set(x, "certStatus", js.undefined)
    
    inline def setDiscoveredIps(value: js.Array[String]): Self = StObject.set(x, "discoveredIps", value.asInstanceOf[js.Any])
    
    inline def setDiscoveredIpsUndefined: Self = StObject.set(x, "discoveredIps", js.undefined)
    
    inline def setDiscoveredIpsVarargs(value: String*): Self = StObject.set(x, "discoveredIps", js.Array(value :_*))
    
    inline def setDnsFetchTime(value: String): Self = StObject.set(x, "dnsFetchTime", value.asInstanceOf[js.Any])
    
    inline def setDnsFetchTimeUndefined: Self = StObject.set(x, "dnsFetchTime", js.undefined)
    
    inline def setDnsStatus(value: String): Self = StObject.set(x, "dnsStatus", value.asInstanceOf[js.Any])
    
    inline def setDnsStatusUndefined: Self = StObject.set(x, "dnsStatus", js.undefined)
    
    inline def setExpectedIps(value: js.Array[String]): Self = StObject.set(x, "expectedIps", value.asInstanceOf[js.Any])
    
    inline def setExpectedIpsUndefined: Self = StObject.set(x, "expectedIps", js.undefined)
    
    inline def setExpectedIpsVarargs(value: String*): Self = StObject.set(x, "expectedIps", js.Array(value :_*))
  }
}
