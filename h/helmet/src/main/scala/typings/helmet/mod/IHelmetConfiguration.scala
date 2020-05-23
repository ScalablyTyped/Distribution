package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetConfiguration extends js.Object {
  var contentSecurityPolicy: js.UndefOr[Boolean | IHelmetContentSecurityPolicyConfiguration] = js.undefined
  var dnsPrefetchControl: js.UndefOr[Boolean | IHelmetDnsPrefetchControlConfiguration] = js.undefined
  var expectCt: js.UndefOr[Boolean | IHelmetExpectCtConfiguration] = js.undefined
  var featurePolicy: js.UndefOr[IFeaturePolicyOptions] = js.undefined
  var frameguard: js.UndefOr[Boolean | IHelmetFrameguardConfiguration] = js.undefined
  var hidePoweredBy: js.UndefOr[Boolean | IHelmetHidePoweredByConfiguration] = js.undefined
  var hpkp: js.UndefOr[Boolean | IHelmetHpkpConfiguration] = js.undefined
  var hsts: js.UndefOr[Boolean | IHelmetHstsConfiguration] = js.undefined
  var ieNoOpen: js.UndefOr[Boolean] = js.undefined
  var noCache: js.UndefOr[Boolean] = js.undefined
  var noSniff: js.UndefOr[Boolean] = js.undefined
  var permittedCrossDomainPolicies: js.UndefOr[Boolean | IHelmetPermittedCrossDomainPoliciesConfiguration] = js.undefined
  var referrerPolicy: js.UndefOr[Boolean | IHelmetReferrerPolicyConfiguration] = js.undefined
  var xssFilter: js.UndefOr[Boolean | IHelmetXssFilterConfiguration] = js.undefined
}

object IHelmetConfiguration {
  @scala.inline
  def apply(
    contentSecurityPolicy: Boolean | IHelmetContentSecurityPolicyConfiguration = null,
    dnsPrefetchControl: Boolean | IHelmetDnsPrefetchControlConfiguration = null,
    expectCt: Boolean | IHelmetExpectCtConfiguration = null,
    featurePolicy: IFeaturePolicyOptions = null,
    frameguard: Boolean | IHelmetFrameguardConfiguration = null,
    hidePoweredBy: Boolean | IHelmetHidePoweredByConfiguration = null,
    hpkp: Boolean | IHelmetHpkpConfiguration = null,
    hsts: Boolean | IHelmetHstsConfiguration = null,
    ieNoOpen: js.UndefOr[Boolean] = js.undefined,
    noCache: js.UndefOr[Boolean] = js.undefined,
    noSniff: js.UndefOr[Boolean] = js.undefined,
    permittedCrossDomainPolicies: Boolean | IHelmetPermittedCrossDomainPoliciesConfiguration = null,
    referrerPolicy: Boolean | IHelmetReferrerPolicyConfiguration = null,
    xssFilter: Boolean | IHelmetXssFilterConfiguration = null
  ): IHelmetConfiguration = {
    val __obj = js.Dynamic.literal()
    if (contentSecurityPolicy != null) __obj.updateDynamic("contentSecurityPolicy")(contentSecurityPolicy.asInstanceOf[js.Any])
    if (dnsPrefetchControl != null) __obj.updateDynamic("dnsPrefetchControl")(dnsPrefetchControl.asInstanceOf[js.Any])
    if (expectCt != null) __obj.updateDynamic("expectCt")(expectCt.asInstanceOf[js.Any])
    if (featurePolicy != null) __obj.updateDynamic("featurePolicy")(featurePolicy.asInstanceOf[js.Any])
    if (frameguard != null) __obj.updateDynamic("frameguard")(frameguard.asInstanceOf[js.Any])
    if (hidePoweredBy != null) __obj.updateDynamic("hidePoweredBy")(hidePoweredBy.asInstanceOf[js.Any])
    if (hpkp != null) __obj.updateDynamic("hpkp")(hpkp.asInstanceOf[js.Any])
    if (hsts != null) __obj.updateDynamic("hsts")(hsts.asInstanceOf[js.Any])
    if (!js.isUndefined(ieNoOpen)) __obj.updateDynamic("ieNoOpen")(ieNoOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSniff)) __obj.updateDynamic("noSniff")(noSniff.get.asInstanceOf[js.Any])
    if (permittedCrossDomainPolicies != null) __obj.updateDynamic("permittedCrossDomainPolicies")(permittedCrossDomainPolicies.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (xssFilter != null) __obj.updateDynamic("xssFilter")(xssFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetConfiguration]
  }
}

