package typings
package helmetLib.helmetMod.helmetNs

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

