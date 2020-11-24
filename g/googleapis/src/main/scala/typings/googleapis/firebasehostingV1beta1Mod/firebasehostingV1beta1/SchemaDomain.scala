package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The intended behavior and status information of a domain.
  */
@js.native
trait SchemaDomain extends js.Object {
  
  /**
    * Required. The domain name of the association.
    */
  var domainName: js.UndefOr[String] = js.native
  
  /**
    * If set, the domain should redirect with the provided parameters.
    */
  var domainRedirect: js.UndefOr[SchemaDomainRedirect] = js.native
  
  /**
    * Output only. Information about the provisioning of certificates and the
    * health of the DNS resolution for the domain.
    */
  var provisioning: js.UndefOr[SchemaDomainProvisioning] = js.native
  
  /**
    * Required. The site name of the association.
    */
  var site: js.UndefOr[String] = js.native
  
  /**
    * Output only. Additional status of the domain association.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time at which the domain was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaDomain {
  
  @scala.inline
  def apply(): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomain]
  }
  
  @scala.inline
  implicit class SchemaDomainOps[Self <: SchemaDomain] (val x: Self) extends AnyVal {
    
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
    def setDomainRedirect(value: SchemaDomainRedirect): Self = this.set("domainRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainRedirect: Self = this.set("domainRedirect", js.undefined)
    
    @scala.inline
    def setProvisioning(value: SchemaDomainProvisioning): Self = this.set("provisioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioning: Self = this.set("provisioning", js.undefined)
    
    @scala.inline
    def setSite(value: String): Self = this.set("site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
