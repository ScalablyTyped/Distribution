package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the behavior of a domain-level redirect. Domain redirects preserve
  * the path of the redirect but replace the requested domain with the one
  * specified in the redirect configuration.
  */
@js.native
trait SchemaDomainRedirect extends js.Object {
  
  /**
    * Required. The domain name to redirect to.
    */
  var domainName: js.UndefOr[String] = js.native
  
  /**
    * Required. The redirect status code.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDomainRedirect {
  
  @scala.inline
  def apply(): SchemaDomainRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainRedirect]
  }
  
  @scala.inline
  implicit class SchemaDomainRedirectOps[Self <: SchemaDomainRedirect] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
