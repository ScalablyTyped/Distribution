package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites")
@js.native
class ResourceSites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var domains: ResourceSitesDomains = js.native
  var releases: ResourceSitesReleases = js.native
  var versions: ResourceSitesVersions = js.native
  /**
    * firebasehosting.sites.getConfig
    * @desc Gets the Hosting metadata for a specific site.
    * @alias firebasehosting.sites.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The site for which to get the SiteConfig, in the format: <code>sites/<var>site-name</var>/config</code>
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def getConfig(params: ParamsResourceSitesGetconfig): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(params: ParamsResourceSitesGetconfig, callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def getConfig(
    params: ParamsResourceSitesGetconfig,
    options: BodyResponseCallback[SchemaSiteConfig],
    callback: BodyResponseCallback[SchemaSiteConfig]
  ): Unit = js.native
  def getConfig(params: ParamsResourceSitesGetconfig, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(
    params: ParamsResourceSitesGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteConfig]
  ): Unit = js.native
  /**
    * firebasehosting.sites.updateConfig
    * @desc Sets the Hosting metadata for a specific site.
    * @alias firebasehosting.sites.updateConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The site for which to update the SiteConfig, in the format: <code>sites/<var>site-name</var>/config</code>
    * @param {string=} params.updateMask A set of field names from your [site configuration](../sites.SiteConfig) that you want to update. <br>A field will be overwritten if, and only if, it's in the mask. <br>If a mask is not provided then a default mask of only [`max_versions`](../sites.SiteConfig.max_versions) will be used.
    * @param {().SiteConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateConfig(): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def updateConfig(params: ParamsResourceSitesUpdateconfig): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(params: ParamsResourceSitesUpdateconfig, callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def updateConfig(
    params: ParamsResourceSitesUpdateconfig,
    options: BodyResponseCallback[SchemaSiteConfig],
    callback: BodyResponseCallback[SchemaSiteConfig]
  ): Unit = js.native
  def updateConfig(params: ParamsResourceSitesUpdateconfig, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(
    params: ParamsResourceSitesUpdateconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteConfig]
  ): Unit = js.native
}

