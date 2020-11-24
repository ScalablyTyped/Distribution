package typings.helmet.mod

import typings.helmet.contentSecurityPolicyMod.ContentSecurityPolicyOptions
import typings.helmet.expectCtMod.ExpectCtOptions
import typings.helmet.referrerPolicyMod.ReferrerPolicyOptions
import typings.helmet.strictTransportSecurityMod.StrictTransportSecurityOptions
import typings.helmet.xDnsPrefetchControlMod.XDnsPrefetchControlOptions
import typings.helmet.xFrameOptionsMod.XFrameOptionsOptions
import typings.helmet.xPermittedCrossDomainPoliciesMod.XPermittedCrossDomainPoliciesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HelmetOptions extends js.Object {
  
  var contentSecurityPolicy: js.UndefOr[MiddlewareOption[ContentSecurityPolicyOptions]] = js.native
  
  var dnsPrefetchControl: js.UndefOr[MiddlewareOption[XDnsPrefetchControlOptions]] = js.native
  
  var expectCt: js.UndefOr[MiddlewareOption[ExpectCtOptions]] = js.native
  
  var frameguard: js.UndefOr[MiddlewareOption[XFrameOptionsOptions]] = js.native
  
  var hidePoweredBy: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
  
  var hsts: js.UndefOr[MiddlewareOption[StrictTransportSecurityOptions]] = js.native
  
  var ieNoOpen: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
  
  var noSniff: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
  
  var permittedCrossDomainPolicies: js.UndefOr[MiddlewareOption[XPermittedCrossDomainPoliciesOptions]] = js.native
  
  var referrerPolicy: js.UndefOr[MiddlewareOption[ReferrerPolicyOptions]] = js.native
  
  var xssFilter: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
}
object HelmetOptions {
  
  @scala.inline
  def apply(): HelmetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelmetOptions]
  }
  
  @scala.inline
  implicit class HelmetOptionsOps[Self <: HelmetOptions] (val x: Self) extends AnyVal {
    
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
    def setContentSecurityPolicy(value: MiddlewareOption[ContentSecurityPolicyOptions]): Self = this.set("contentSecurityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSecurityPolicy: Self = this.set("contentSecurityPolicy", js.undefined)
    
    @scala.inline
    def setDnsPrefetchControl(value: MiddlewareOption[XDnsPrefetchControlOptions]): Self = this.set("dnsPrefetchControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsPrefetchControl: Self = this.set("dnsPrefetchControl", js.undefined)
    
    @scala.inline
    def setExpectCt(value: MiddlewareOption[ExpectCtOptions]): Self = this.set("expectCt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectCt: Self = this.set("expectCt", js.undefined)
    
    @scala.inline
    def setFrameguard(value: MiddlewareOption[XFrameOptionsOptions]): Self = this.set("frameguard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameguard: Self = this.set("frameguard", js.undefined)
    
    @scala.inline
    def setHidePoweredBy(value: MiddlewareOption[scala.Nothing]): Self = this.set("hidePoweredBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePoweredBy: Self = this.set("hidePoweredBy", js.undefined)
    
    @scala.inline
    def setHsts(value: MiddlewareOption[StrictTransportSecurityOptions]): Self = this.set("hsts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsts: Self = this.set("hsts", js.undefined)
    
    @scala.inline
    def setIeNoOpen(value: MiddlewareOption[scala.Nothing]): Self = this.set("ieNoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIeNoOpen: Self = this.set("ieNoOpen", js.undefined)
    
    @scala.inline
    def setNoSniff(value: MiddlewareOption[scala.Nothing]): Self = this.set("noSniff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSniff: Self = this.set("noSniff", js.undefined)
    
    @scala.inline
    def setPermittedCrossDomainPolicies(value: MiddlewareOption[XPermittedCrossDomainPoliciesOptions]): Self = this.set("permittedCrossDomainPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermittedCrossDomainPolicies: Self = this.set("permittedCrossDomainPolicies", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(value: MiddlewareOption[ReferrerPolicyOptions]): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    
    @scala.inline
    def setXssFilter(value: MiddlewareOption[scala.Nothing]): Self = this.set("xssFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXssFilter: Self = this.set("xssFilter", js.undefined)
  }
}
