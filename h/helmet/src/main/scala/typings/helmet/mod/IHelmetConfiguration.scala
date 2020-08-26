package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetConfiguration extends js.Object {
  var contentSecurityPolicy: js.UndefOr[Boolean | IHelmetContentSecurityPolicyConfiguration] = js.native
  var dnsPrefetchControl: js.UndefOr[Boolean | IHelmetDnsPrefetchControlConfiguration] = js.native
  var expectCt: js.UndefOr[Boolean | IHelmetExpectCtConfiguration] = js.native
  var featurePolicy: js.UndefOr[IFeaturePolicyOptions] = js.native
  var frameguard: js.UndefOr[Boolean | IHelmetFrameguardConfiguration] = js.native
  var hidePoweredBy: js.UndefOr[Boolean | IHelmetHidePoweredByConfiguration] = js.native
  var hpkp: js.UndefOr[Boolean | IHelmetHpkpConfiguration] = js.native
  var hsts: js.UndefOr[Boolean | IHelmetHstsConfiguration] = js.native
  var ieNoOpen: js.UndefOr[Boolean] = js.native
  var noCache: js.UndefOr[Boolean] = js.native
  var noSniff: js.UndefOr[Boolean] = js.native
  var permittedCrossDomainPolicies: js.UndefOr[Boolean | IHelmetPermittedCrossDomainPoliciesConfiguration] = js.native
  var referrerPolicy: js.UndefOr[Boolean | IHelmetReferrerPolicyConfiguration] = js.native
  var xssFilter: js.UndefOr[Boolean | IHelmetXssFilterConfiguration] = js.native
}

object IHelmetConfiguration {
  @scala.inline
  def apply(): IHelmetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetConfiguration]
  }
  @scala.inline
  implicit class IHelmetConfigurationOps[Self <: IHelmetConfiguration] (val x: Self) extends AnyVal {
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
    def setContentSecurityPolicy(value: Boolean | IHelmetContentSecurityPolicyConfiguration): Self = this.set("contentSecurityPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentSecurityPolicy: Self = this.set("contentSecurityPolicy", js.undefined)
    @scala.inline
    def setDnsPrefetchControl(value: Boolean | IHelmetDnsPrefetchControlConfiguration): Self = this.set("dnsPrefetchControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsPrefetchControl: Self = this.set("dnsPrefetchControl", js.undefined)
    @scala.inline
    def setExpectCt(value: Boolean | IHelmetExpectCtConfiguration): Self = this.set("expectCt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectCt: Self = this.set("expectCt", js.undefined)
    @scala.inline
    def setFeaturePolicy(value: IFeaturePolicyOptions): Self = this.set("featurePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturePolicy: Self = this.set("featurePolicy", js.undefined)
    @scala.inline
    def setFrameguard(value: Boolean | IHelmetFrameguardConfiguration): Self = this.set("frameguard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameguard: Self = this.set("frameguard", js.undefined)
    @scala.inline
    def setHidePoweredBy(value: Boolean | IHelmetHidePoweredByConfiguration): Self = this.set("hidePoweredBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePoweredBy: Self = this.set("hidePoweredBy", js.undefined)
    @scala.inline
    def setHpkp(value: Boolean | IHelmetHpkpConfiguration): Self = this.set("hpkp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHpkp: Self = this.set("hpkp", js.undefined)
    @scala.inline
    def setHsts(value: Boolean | IHelmetHstsConfiguration): Self = this.set("hsts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsts: Self = this.set("hsts", js.undefined)
    @scala.inline
    def setIeNoOpen(value: Boolean): Self = this.set("ieNoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeNoOpen: Self = this.set("ieNoOpen", js.undefined)
    @scala.inline
    def setNoCache(value: Boolean): Self = this.set("noCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCache: Self = this.set("noCache", js.undefined)
    @scala.inline
    def setNoSniff(value: Boolean): Self = this.set("noSniff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSniff: Self = this.set("noSniff", js.undefined)
    @scala.inline
    def setPermittedCrossDomainPolicies(value: Boolean | IHelmetPermittedCrossDomainPoliciesConfiguration): Self = this.set("permittedCrossDomainPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermittedCrossDomainPolicies: Self = this.set("permittedCrossDomainPolicies", js.undefined)
    @scala.inline
    def setReferrerPolicy(value: Boolean | IHelmetReferrerPolicyConfiguration): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    @scala.inline
    def setXssFilter(value: Boolean | IHelmetXssFilterConfiguration): Self = this.set("xssFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXssFilter: Self = this.set("xssFilter", js.undefined)
  }
  
}

