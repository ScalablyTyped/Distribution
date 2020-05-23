package typings.helmet.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helmet extends js.Object {
  /**
    * @summary Constructor.
    * @return {RequestHandler} The Request handler.
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: IHelmetConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Set policy around third-party content via headers
    * @param {IHelmetContentSecurityPolicyConfiguration} options The options
    * @return {RequestHandler} The Request handler
    */
  def contentSecurityPolicy(options: IHelmetContentSecurityPolicyConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Stop browsers from doing DNS prefetching.
    * @param {IHelmetDnsPrefetchControlConfiguration} options The options
    * @return {RequestHandler} The Request handler
    */
  def dnsPrefetchControl(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def dnsPrefetchControl(options: IHelmetDnsPrefetchControlConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Adds the "Expect-CT" header.
    * @param {helmet.IHelmetExpectCtConfiguration} options
    * @returns {e.RequestHandler}
    */
  def expectCt(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def expectCt(options: IHelmetExpectCtConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Restrict which browser features can be used
    * @param {IFeaturePolicyOptions} options The options
    * @return {RequestHandler} The Request handler
    */
  def featurePolicy(options: IFeaturePolicyOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Prevent clickjacking.
    * @param {IHelmetFrameguardConfiguration} options The options
    * @return {RequestHandler} The Request handler
    */
  def frameguard(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def frameguard(options: IHelmetFrameguardConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Hide "X-Powered-By" header.
    * @param {IHelmetHidePoweredByConfiguration} options The options
    * @return {RequestHandler} The Request handler.
    */
  def hidePoweredBy(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def hidePoweredBy(options: IHelmetHidePoweredByConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Adds the "Public-Key-Pins" header.
    * @param {IHelmetHpkpConfiguration} options The options
    * @return {RequestHandler} The Request handler.
    */
  def hpkp(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def hpkp(options: IHelmetHpkpConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Adds the "Strict-Transport-Security" header.
    * @param {IHelmetHstsConfiguration} options The options
    * @return {RequestHandler} The Request handler.
    */
  def hsts(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def hsts(options: IHelmetHstsConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Add the "X-Download-Options" header.
    * @return {RequestHandler} The Request handler.
    */
  def ieNoOpen(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Add the "Cache-Control" and "Pragma" headers to stop caching.
    * @return {RequestHandler} The Request handler.
    */
  def noCache(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def noCache(options: js.Object): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Adds the "X-Content-Type-Options" header.
    * @return {RequestHandler} The Request handler.
    */
  def noSniff(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Adds the "X-Permitted-Cross-Domain-Policies" header.
    * @param {helmet.IHelmetPermittedCrossDomainPoliciesConfiguration} options
    * @returns {express.RequestHandler}
    */
  def permittedCrossDomainPolicies(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def permittedCrossDomainPolicies(options: IHelmetPermittedCrossDomainPoliciesConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Adds the "Referrer-Policy" header.
    * @return {RequestHandler} The Request handler.
    */
  def referrerPolicy(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def referrerPolicy(options: IHelmetReferrerPolicyConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * @summary Mitigate cross-site scripting attacks with the "X-XSS-Protection" header.
    * @param {IHelmetXssFilterConfiguration} options The options
    * @return {RequestHandler} The Request handler.
    */
  def xssFilter(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def xssFilter(options: IHelmetXssFilterConfiguration): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

