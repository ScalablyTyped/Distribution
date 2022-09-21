package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites")
@js.native
open class ResourceSites protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var channels: ResourceSitesChannels = js.native
  
  var context: APIRequestContext = js.native
  
  var domains: ResourceSitesDomains = js.native
  
  def getConfig(): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(params: ParamsResourceSitesGetconfig): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(params: ParamsResourceSitesGetconfig, callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def getConfig(
    params: ParamsResourceSitesGetconfig,
    options: BodyResponseCallback[Readable | SchemaSiteConfig],
    callback: BodyResponseCallback[Readable | SchemaSiteConfig]
  ): Unit = js.native
  def getConfig(params: ParamsResourceSitesGetconfig, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(
    params: ParamsResourceSitesGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteConfig]
  ): Unit = js.native
  /**
    * Gets the Hosting metadata for a specific site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.getConfig({
    *     // Required. The site for which to get the SiteConfig, in the format: sites/ site-name/config
    *     name: 'sites/my-site/config',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudLoggingEnabled": false,
    *   //   "maxVersions": "my_maxVersions"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getConfig(params: ParamsResourceSitesGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceSitesGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var releases: ResourceSitesReleases = js.native
  
  def updateConfig(): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def updateConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(params: ParamsResourceSitesUpdateconfig): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(params: ParamsResourceSitesUpdateconfig, callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def updateConfig(
    params: ParamsResourceSitesUpdateconfig,
    options: BodyResponseCallback[Readable | SchemaSiteConfig],
    callback: BodyResponseCallback[Readable | SchemaSiteConfig]
  ): Unit = js.native
  def updateConfig(params: ParamsResourceSitesUpdateconfig, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(
    params: ParamsResourceSitesUpdateconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteConfig]
  ): Unit = js.native
  /**
    * Sets the Hosting metadata for a specific site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.updateConfig({
    *     // Required. The site for which to update the SiteConfig, in the format: sites/ site-name/config
    *     name: 'sites/my-site/config',
    *     // A set of field names from your [site configuration](../sites.SiteConfig) that you want to update. A field will be overwritten if, and only if, it's in the mask. If a mask is not provided then a default mask of only [`max_versions`](../sites.SiteConfig.max_versions) will be used.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloudLoggingEnabled": false,
    *       //   "maxVersions": "my_maxVersions"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudLoggingEnabled": false,
    *   //   "maxVersions": "my_maxVersions"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def updateConfig(params: ParamsResourceSitesUpdateconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateConfig(
    params: ParamsResourceSitesUpdateconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var versions: ResourceSitesVersions = js.native
}
