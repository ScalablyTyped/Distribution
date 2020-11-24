package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current certificate provisioning status information for a domain.
  */
@js.native
trait SchemaDomainProvisioning extends js.Object {
  
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
  implicit class SchemaDomainProvisioningOps[Self <: SchemaDomainProvisioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertChallengeDiscoveredTxtVarargs(value: String*): Self = this.set("certChallengeDiscoveredTxt", js.Array(value :_*))
    
    @scala.inline
    def setCertChallengeDiscoveredTxt(value: js.Array[String]): Self = this.set("certChallengeDiscoveredTxt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertChallengeDiscoveredTxt: Self = this.set("certChallengeDiscoveredTxt", js.undefined)
    
    @scala.inline
    def setCertChallengeDns(value: SchemaCertDnsChallenge): Self = this.set("certChallengeDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertChallengeDns: Self = this.set("certChallengeDns", js.undefined)
    
    @scala.inline
    def setCertChallengeHttp(value: SchemaCertHttpChallenge): Self = this.set("certChallengeHttp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertChallengeHttp: Self = this.set("certChallengeHttp", js.undefined)
    
    @scala.inline
    def setCertStatus(value: String): Self = this.set("certStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertStatus: Self = this.set("certStatus", js.undefined)
    
    @scala.inline
    def setDiscoveredIpsVarargs(value: String*): Self = this.set("discoveredIps", js.Array(value :_*))
    
    @scala.inline
    def setDiscoveredIps(value: js.Array[String]): Self = this.set("discoveredIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoveredIps: Self = this.set("discoveredIps", js.undefined)
    
    @scala.inline
    def setDnsFetchTime(value: String): Self = this.set("dnsFetchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsFetchTime: Self = this.set("dnsFetchTime", js.undefined)
    
    @scala.inline
    def setDnsStatus(value: String): Self = this.set("dnsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsStatus: Self = this.set("dnsStatus", js.undefined)
    
    @scala.inline
    def setExpectedIpsVarargs(value: String*): Self = this.set("expectedIps", js.Array(value :_*))
    
    @scala.inline
    def setExpectedIps(value: js.Array[String]): Self = this.set("expectedIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedIps: Self = this.set("expectedIps", js.undefined)
  }
}
