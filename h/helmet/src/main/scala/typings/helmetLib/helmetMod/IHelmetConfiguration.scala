package typings
package helmetLib.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetConfiguration extends js.Object {
  var contentSecurityPolicy: js.UndefOr[scala.Boolean | IHelmetContentSecurityPolicyConfiguration] = js.undefined
  var dnsPrefetchControl: js.UndefOr[scala.Boolean | IHelmetDnsPrefetchControlConfiguration] = js.undefined
  var expectCt: js.UndefOr[scala.Boolean | IHelmetExpectCtConfiguration] = js.undefined
  var frameguard: js.UndefOr[scala.Boolean | IHelmetFrameguardConfiguration] = js.undefined
  var hidePoweredBy: js.UndefOr[scala.Boolean | IHelmetHidePoweredByConfiguration] = js.undefined
  var hpkp: js.UndefOr[scala.Boolean | IHelmetHpkpConfiguration] = js.undefined
  var hsts: js.UndefOr[scala.Boolean | IHelmetHstsConfiguration] = js.undefined
  var ieNoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  var noSniff: js.UndefOr[scala.Boolean] = js.undefined
  var permittedCrossDomainPolicies: js.UndefOr[scala.Boolean | IHelmetPermittedCrossDomainPoliciesConfiguration] = js.undefined
  var referrerPolicy: js.UndefOr[scala.Boolean | IHelmetReferrerPolicyConfiguration] = js.undefined
  var xssFilter: js.UndefOr[scala.Boolean | IHelmetXssFilterConfiguration] = js.undefined
}

object IHelmetConfiguration {
  @scala.inline
  def apply(
    contentSecurityPolicy: scala.Boolean | IHelmetContentSecurityPolicyConfiguration = null,
    dnsPrefetchControl: scala.Boolean | IHelmetDnsPrefetchControlConfiguration = null,
    expectCt: scala.Boolean | IHelmetExpectCtConfiguration = null,
    frameguard: scala.Boolean | IHelmetFrameguardConfiguration = null,
    hidePoweredBy: scala.Boolean | IHelmetHidePoweredByConfiguration = null,
    hpkp: scala.Boolean | IHelmetHpkpConfiguration = null,
    hsts: scala.Boolean | IHelmetHstsConfiguration = null,
    ieNoOpen: js.UndefOr[scala.Boolean] = js.undefined,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    noSniff: js.UndefOr[scala.Boolean] = js.undefined,
    permittedCrossDomainPolicies: scala.Boolean | IHelmetPermittedCrossDomainPoliciesConfiguration = null,
    referrerPolicy: scala.Boolean | IHelmetReferrerPolicyConfiguration = null,
    xssFilter: scala.Boolean | IHelmetXssFilterConfiguration = null
  ): IHelmetConfiguration = {
    val __obj = js.Dynamic.literal()
    if (contentSecurityPolicy != null) __obj.updateDynamic("contentSecurityPolicy")(contentSecurityPolicy.asInstanceOf[js.Any])
    if (dnsPrefetchControl != null) __obj.updateDynamic("dnsPrefetchControl")(dnsPrefetchControl.asInstanceOf[js.Any])
    if (expectCt != null) __obj.updateDynamic("expectCt")(expectCt.asInstanceOf[js.Any])
    if (frameguard != null) __obj.updateDynamic("frameguard")(frameguard.asInstanceOf[js.Any])
    if (hidePoweredBy != null) __obj.updateDynamic("hidePoweredBy")(hidePoweredBy.asInstanceOf[js.Any])
    if (hpkp != null) __obj.updateDynamic("hpkp")(hpkp.asInstanceOf[js.Any])
    if (hsts != null) __obj.updateDynamic("hsts")(hsts.asInstanceOf[js.Any])
    if (!js.isUndefined(ieNoOpen)) __obj.updateDynamic("ieNoOpen")(ieNoOpen)
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (!js.isUndefined(noSniff)) __obj.updateDynamic("noSniff")(noSniff)
    if (permittedCrossDomainPolicies != null) __obj.updateDynamic("permittedCrossDomainPolicies")(permittedCrossDomainPolicies.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (xssFilter != null) __obj.updateDynamic("xssFilter")(xssFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetConfiguration]
  }
}

