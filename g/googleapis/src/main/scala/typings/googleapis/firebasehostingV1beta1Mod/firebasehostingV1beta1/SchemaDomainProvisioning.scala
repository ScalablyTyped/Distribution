package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current certificate provisioning status information for a domain.
  */
@js.native
trait SchemaDomainProvisioning extends StObject {
  
  /**
    * The TXT records (for the certificate challenge) that were found at the
    * last DNS fetch.
    */
  var certChallengeDiscoveredTxt: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The DNS challenge for generating a certificate.
    */
  var certChallengeDns: js.UndefOr[SchemaCertDnsChallenge] = js.native
  
  /**
    * The HTTP challenge for generating a certificate.
    */
  var certChallengeHttp: js.UndefOr[SchemaCertHttpChallenge] = js.native
  
  /**
    * The certificate provisioning status; updated when Firebase Hosting
    * provisions an SSL certificate for the domain.
    */
  var certStatus: js.UndefOr[String] = js.native
  
  /**
    * The IPs found at the last DNS fetch.
    */
  var discoveredIps: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The time at which the last DNS fetch occurred.
    */
  var dnsFetchTime: js.UndefOr[String] = js.native
  
  /**
    * The DNS record match status as of the last DNS fetch.
    */
  var dnsStatus: js.UndefOr[String] = js.native
  
  /**
    * The list of IPs to which the domain is expected to resolve.
    */
  var expectedIps: js.UndefOr[js.Array[String]] = js.native
}
object SchemaDomainProvisioning {
  
  @scala.inline
  def apply(): SchemaDomainProvisioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainProvisioning]
  }
  
  @scala.inline
  implicit class SchemaDomainProvisioningMutableBuilder[Self <: SchemaDomainProvisioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertChallengeDiscoveredTxt(value: js.Array[String]): Self = StObject.set(x, "certChallengeDiscoveredTxt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertChallengeDiscoveredTxtUndefined: Self = StObject.set(x, "certChallengeDiscoveredTxt", js.undefined)
    
    @scala.inline
    def setCertChallengeDiscoveredTxtVarargs(value: String*): Self = StObject.set(x, "certChallengeDiscoveredTxt", js.Array(value :_*))
    
    @scala.inline
    def setCertChallengeDns(value: SchemaCertDnsChallenge): Self = StObject.set(x, "certChallengeDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertChallengeDnsUndefined: Self = StObject.set(x, "certChallengeDns", js.undefined)
    
    @scala.inline
    def setCertChallengeHttp(value: SchemaCertHttpChallenge): Self = StObject.set(x, "certChallengeHttp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertChallengeHttpUndefined: Self = StObject.set(x, "certChallengeHttp", js.undefined)
    
    @scala.inline
    def setCertStatus(value: String): Self = StObject.set(x, "certStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertStatusUndefined: Self = StObject.set(x, "certStatus", js.undefined)
    
    @scala.inline
    def setDiscoveredIps(value: js.Array[String]): Self = StObject.set(x, "discoveredIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveredIpsUndefined: Self = StObject.set(x, "discoveredIps", js.undefined)
    
    @scala.inline
    def setDiscoveredIpsVarargs(value: String*): Self = StObject.set(x, "discoveredIps", js.Array(value :_*))
    
    @scala.inline
    def setDnsFetchTime(value: String): Self = StObject.set(x, "dnsFetchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsFetchTimeUndefined: Self = StObject.set(x, "dnsFetchTime", js.undefined)
    
    @scala.inline
    def setDnsStatus(value: String): Self = StObject.set(x, "dnsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsStatusUndefined: Self = StObject.set(x, "dnsStatus", js.undefined)
    
    @scala.inline
    def setExpectedIps(value: js.Array[String]): Self = StObject.set(x, "expectedIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedIpsUndefined: Self = StObject.set(x, "expectedIps", js.undefined)
    
    @scala.inline
    def setExpectedIpsVarargs(value: String*): Self = StObject.set(x, "expectedIps", js.Array(value :_*))
  }
}
