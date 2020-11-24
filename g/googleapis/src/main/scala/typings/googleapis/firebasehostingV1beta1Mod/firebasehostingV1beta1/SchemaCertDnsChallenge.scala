package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a DNS certificate challenge.
  */
@js.native
trait SchemaCertDnsChallenge extends js.Object {
  
  /**
    * The domain name upon which the DNS challenge must be satisfied.
    */
  var domainName: js.UndefOr[String] = js.native
  
  /**
    * The value that must be present as a TXT record on the domain name to
    * satisfy the challenge.
    */
  var token: js.UndefOr[String] = js.native
}
object SchemaCertDnsChallenge {
  
  @scala.inline
  def apply(): SchemaCertDnsChallenge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertDnsChallenge]
  }
  
  @scala.inline
  implicit class SchemaCertDnsChallengeOps[Self <: SchemaCertDnsChallenge] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
