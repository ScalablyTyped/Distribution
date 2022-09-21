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

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Projects$Sites")
@js.native
open class ResourceProjectsSites protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var channels: ResourceProjectsSitesChannels = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSite] = js.native
  def create(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def create(params: ParamsResourceProjectsSitesCreate): GaxiosPromise[SchemaSite] = js.native
  def create(params: ParamsResourceProjectsSitesCreate, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def create(
    params: ParamsResourceProjectsSitesCreate,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsSitesCreate, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def create(
    params: ParamsResourceProjectsSitesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * Creates a new Hosting Site in the specified parent Firebase project. Note that Hosting sites can take several minutes to propagate through Firebase systems.
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
    *   const res = await firebasehosting.projects.sites.create({
    *     // Required. The Firebase project in which to create a Hosting site, in the format: projects/PROJECT_IDENTIFIER Refer to the `Site` [`name`](../projects#Site.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     parent: 'projects/my-project',
    *     // Required. Immutable. A globally unique identifier for the Hosting site. This identifier is used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid domain name label.
    *     siteId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appId": "my_appId",
    *       //   "defaultUrl": "my_defaultUrl",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appId": "my_appId",
    *   //   "defaultUrl": "my_defaultUrl",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "type": "my_type"
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
  def create(params: ParamsResourceProjectsSitesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsSitesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsSitesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsSitesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsSitesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsSitesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsSitesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified Hosting Site from the specified parent Firebase project.
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
    *   const res = await firebasehosting.projects.sites.delete({
    *     // Required. The fully-qualified resource name for the Hosting site, in the format: projects/PROJECT_IDENTIFIER/sites/SITE_ID Refer to the `Site` [`name`](../projects#Site.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     name: 'projects/my-project/sites/my-site',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsSitesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsSitesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var domains: ResourceProjectsSitesDomains = js.native
  
  def get(): GaxiosPromise[SchemaSite] = js.native
  def get(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def get(params: ParamsResourceProjectsSitesGet): GaxiosPromise[SchemaSite] = js.native
  def get(params: ParamsResourceProjectsSitesGet, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def get(
    params: ParamsResourceProjectsSitesGet,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsSitesGet, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def get(
    params: ParamsResourceProjectsSitesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * Gets the specified Hosting Site.
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
    *   const res = await firebasehosting.projects.sites.get({
    *     // Required. The fully-qualified resource name for the Hosting site, in the format: projects/PROJECT_IDENTIFIER/sites/SITE_ID Refer to the `Site` [`name`](../projects#Site.FIELDS.name) field for details about PROJECT_IDENTIFIER values. Since a SITE_ID is a globally unique identifier, you can also use the unique sub-collection resource access pattern, in the format: projects/-/sites/SITE_ID
    *     name: 'projects/my-project/sites/my-site',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appId": "my_appId",
    *   //   "defaultUrl": "my_defaultUrl",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceProjectsSitesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsSitesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getConfig(): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(params: ParamsResourceProjectsSitesGetconfig): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(params: ParamsResourceProjectsSitesGetconfig, callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsSitesGetconfig,
    options: BodyResponseCallback[Readable | SchemaSiteConfig],
    callback: BodyResponseCallback[Readable | SchemaSiteConfig]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsSitesGetconfig, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def getConfig(
    params: ParamsResourceProjectsSitesGetconfig,
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
    *   const res = await firebasehosting.projects.sites.getConfig({
    *     // Required. The site for which to get the SiteConfig, in the format: sites/ site-name/config
    *     name: 'projects/my-project/sites/my-site/config',
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
  def getConfig(params: ParamsResourceProjectsSitesGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceProjectsSitesGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSitesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(params: ParamsResourceProjectsSitesList): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(params: ParamsResourceProjectsSitesList, callback: BodyResponseCallback[SchemaListSitesResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsSitesList,
    options: BodyResponseCallback[Readable | SchemaListSitesResponse],
    callback: BodyResponseCallback[Readable | SchemaListSitesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsSitesList, options: MethodOptions): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(
    params: ParamsResourceProjectsSitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSitesResponse]
  ): Unit = js.native
  /**
    * Lists each Hosting Site associated with the specified parent Firebase project.
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
    *   const res = await firebasehosting.projects.sites.list({
    *     // Optional. The maximum number of sites to return. The service may return a lower number if fewer sites exist than this maximum number. If unspecified, defaults to 40.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token from a previous call to `ListSites` that tells the server where to resume listing.
    *     pageToken: 'placeholder-value',
    *     // Required. The Firebase project for which to list sites, in the format: projects/PROJECT_IDENTIFIER Refer to the `Site` [`name`](../projects#Site.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sites": []
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
  def list(params: ParamsResourceProjectsSitesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsSitesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSite] = js.native
  def patch(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def patch(params: ParamsResourceProjectsSitesPatch): GaxiosPromise[SchemaSite] = js.native
  def patch(params: ParamsResourceProjectsSitesPatch, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsSitesPatch,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsSitesPatch, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def patch(
    params: ParamsResourceProjectsSitesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * Updates attributes of the specified Hosting Site.
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
    *   const res = await firebasehosting.projects.sites.patch({
    *     // Output only. The fully-qualified resource name of the Hosting site, in the format: projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the Firebase project's [`ProjectNumber`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510).
    *     name: 'projects/my-project/sites/my-site',
    *     // A set of field names from your Site that you want to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appId": "my_appId",
    *       //   "defaultUrl": "my_defaultUrl",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appId": "my_appId",
    *   //   "defaultUrl": "my_defaultUrl",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "type": "my_type"
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
  def patch(params: ParamsResourceProjectsSitesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsSitesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var releases: ResourceProjectsSitesReleases = js.native
  
  def updateConfig(): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def updateConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(params: ParamsResourceProjectsSitesUpdateconfig): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(params: ParamsResourceProjectsSitesUpdateconfig, callback: BodyResponseCallback[SchemaSiteConfig]): Unit = js.native
  def updateConfig(
    params: ParamsResourceProjectsSitesUpdateconfig,
    options: BodyResponseCallback[Readable | SchemaSiteConfig],
    callback: BodyResponseCallback[Readable | SchemaSiteConfig]
  ): Unit = js.native
  def updateConfig(params: ParamsResourceProjectsSitesUpdateconfig, options: MethodOptions): GaxiosPromise[SchemaSiteConfig] = js.native
  def updateConfig(
    params: ParamsResourceProjectsSitesUpdateconfig,
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
    *   const res = await firebasehosting.projects.sites.updateConfig({
    *     // Required. The site for which to update the SiteConfig, in the format: sites/ site-name/config
    *     name: 'projects/my-project/sites/my-site/config',
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
  def updateConfig(params: ParamsResourceProjectsSitesUpdateconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateConfig(
    params: ParamsResourceProjectsSitesUpdateconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var versions: ResourceProjectsSitesVersions = js.native
}
