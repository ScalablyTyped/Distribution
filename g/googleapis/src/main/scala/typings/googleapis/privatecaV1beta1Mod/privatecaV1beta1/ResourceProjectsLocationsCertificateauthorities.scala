package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/privateca/v1beta1", "privateca_v1beta1.Resource$Projects$Locations$Certificateauthorities")
@js.native
open class ResourceProjectsLocationsCertificateauthorities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaOperation] = js.native
  def activate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def activate(params: ParamsResourceProjectsLocationsCertificateauthoritiesActivate): GaxiosPromise[SchemaOperation] = js.native
  def activate(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesActivate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def activate(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesActivate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def activate(params: ParamsResourceProjectsLocationsCertificateauthoritiesActivate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def activate(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Activate a CertificateAuthority that is in state PENDING_ACTIVATION and is of type SUBORDINATE. After the parent Certificate Authority signs a certificate signing request from FetchCertificateAuthorityCsr, this method can complete the activation process.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await privateca.projects.locations.certificateAuthorities.activate({
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "pemCaCertificate": "my_pemCaCertificate",
    *         //   "requestId": "my_requestId",
    *         //   "subordinateConfig": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def activate(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesActivate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var certificateRevocationLists: ResourceProjectsLocationsCertificateauthoritiesCertificaterevocationlists = js.native
  
  var certificates: ResourceProjectsLocationsCertificateauthoritiesCertificates = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsCertificateauthoritiesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsCertificateauthoritiesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Create a new CertificateAuthority in a given Project and Location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await privateca.projects.locations.certificateAuthorities.create({
    *     // Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63\}`
    *     certificateAuthorityId: 'placeholder-value',
    *     // Required. The resource name of the location associated with the CertificateAuthorities, in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
    *     // Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessUrls": {},
    *       //   "caCertificateDescriptions": [],
    *       //   "certificatePolicy": {},
    *       //   "config": {},
    *       //   "createTime": "my_createTime",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "gcsBucket": "my_gcsBucket",
    *       //   "issuingOptions": {},
    *       //   "keySpec": {},
    *       //   "labels": {},
    *       //   "lifetime": "my_lifetime",
    *       //   "name": "my_name",
    *       //   "pemCaCertificates": [],
    *       //   "state": "my_state",
    *       //   "subordinateConfig": {},
    *       //   "tier": "my_tier",
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(params: ParamsResourceProjectsLocationsCertificateauthoritiesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def disable(): GaxiosPromise[SchemaOperation] = js.native
  def disable(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disable(params: ParamsResourceProjectsLocationsCertificateauthoritiesDisable): GaxiosPromise[SchemaOperation] = js.native
  def disable(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesDisable,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def disable(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesDisable,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def disable(params: ParamsResourceProjectsLocationsCertificateauthoritiesDisable, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disable(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Disable a CertificateAuthority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await privateca.projects.locations.certificateAuthorities.disable(
    *     {
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "requestId": "my_requestId"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def disable(params: ParamsResourceProjectsLocationsCertificateauthoritiesDisable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def disable(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesDisable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def enable(): GaxiosPromise[SchemaOperation] = js.native
  def enable(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enable(params: ParamsResourceProjectsLocationsCertificateauthoritiesEnable): GaxiosPromise[SchemaOperation] = js.native
  def enable(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesEnable,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def enable(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesEnable,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def enable(params: ParamsResourceProjectsLocationsCertificateauthoritiesEnable, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enable(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Enable a CertificateAuthority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await privateca.projects.locations.certificateAuthorities.enable({
    *     // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    *     name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requestId": "my_requestId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def enable(params: ParamsResourceProjectsLocationsCertificateauthoritiesEnable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def enable(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesEnable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def fetch(): GaxiosPromise[SchemaFetchCertificateAuthorityCsrResponse] = js.native
  def fetch(callback: BodyResponseCallback[SchemaFetchCertificateAuthorityCsrResponse]): Unit = js.native
  def fetch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFetchCertificateAuthorityCsrResponse] = js.native
  def fetch(params: ParamsResourceProjectsLocationsCertificateauthoritiesFetch): GaxiosPromise[SchemaFetchCertificateAuthorityCsrResponse] = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesFetch,
    callback: BodyResponseCallback[SchemaFetchCertificateAuthorityCsrResponse]
  ): Unit = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesFetch,
    options: BodyResponseCallback[Readable | SchemaFetchCertificateAuthorityCsrResponse],
    callback: BodyResponseCallback[Readable | SchemaFetchCertificateAuthorityCsrResponse]
  ): Unit = js.native
  def fetch(params: ParamsResourceProjectsLocationsCertificateauthoritiesFetch, options: MethodOptions): GaxiosPromise[SchemaFetchCertificateAuthorityCsrResponse] = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesFetch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFetchCertificateAuthorityCsrResponse]
  ): Unit = js.native
  /**
    * Fetch a certificate signing request (CSR) from a CertificateAuthority that is in state PENDING_ACTIVATION and is of type SUBORDINATE. The CSR must then be signed by the desired parent Certificate Authority, which could be another CertificateAuthority resource, or could be an on-prem certificate authority. See also ActivateCertificateAuthority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await privateca.projects.locations.certificateAuthorities.fetch({
    *     // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    *     name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "pemCsr": "my_pemCsr"
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
  def fetch(params: ParamsResourceProjectsLocationsCertificateauthoritiesFetch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesFetch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCertificateAuthority] = js.native
  def get(callback: BodyResponseCallback[SchemaCertificateAuthority]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCertificateAuthority] = js.native
  def get(params: ParamsResourceProjectsLocationsCertificateauthoritiesGet): GaxiosPromise[SchemaCertificateAuthority] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesGet,
    callback: BodyResponseCallback[SchemaCertificateAuthority]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesGet,
    options: BodyResponseCallback[Readable | SchemaCertificateAuthority],
    callback: BodyResponseCallback[Readable | SchemaCertificateAuthority]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsCertificateauthoritiesGet, options: MethodOptions): GaxiosPromise[SchemaCertificateAuthority] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCertificateAuthority]
  ): Unit = js.native
  /**
    * Returns a CertificateAuthority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await privateca.projects.locations.certificateAuthorities.get({
    *     // Required. The name of the CertificateAuthority to get.
    *     name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessUrls": {},
    *   //   "caCertificateDescriptions": [],
    *   //   "certificatePolicy": {},
    *   //   "config": {},
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "gcsBucket": "my_gcsBucket",
    *   //   "issuingOptions": {},
    *   //   "keySpec": {},
    *   //   "labels": {},
    *   //   "lifetime": "my_lifetime",
    *   //   "name": "my_name",
    *   //   "pemCaCertificates": [],
    *   //   "state": "my_state",
    *   //   "subordinateConfig": {},
    *   //   "tier": "my_tier",
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsCertificateauthoritiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsCertificateauthoritiesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsCertificateauthoritiesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await privateca.projects.locations.certificateAuthorities.getIamPolicy({
    *       // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *       'options.requestedPolicyVersion': 'placeholder-value',
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesGetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCertificateAuthoritiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCertificateAuthoritiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCertificateAuthoritiesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCertificateauthoritiesList): GaxiosPromise[SchemaListCertificateAuthoritiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesList,
    callback: BodyResponseCallback[SchemaListCertificateAuthoritiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesList,
    options: BodyResponseCallback[Readable | SchemaListCertificateAuthoritiesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCertificateAuthoritiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCertificateauthoritiesList, options: MethodOptions): GaxiosPromise[SchemaListCertificateAuthoritiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCertificateAuthoritiesResponse]
  ): Unit = js.native
  /**
    * Lists CertificateAuthorities.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await privateca.projects.locations.certificateAuthorities.list({
    *     // Optional. Only include resources that match the filter in the response.
    *     filter: 'placeholder-value',
    *     // Optional. Specify how the results should be sorted.
    *     orderBy: 'placeholder-value',
    *     // Optional. Limit on the number of CertificateAuthorities to include in the response. Further CertificateAuthorities can subsequently be obtained by including the ListCertificateAuthoritiesResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // Optional. Pagination token, returned earlier via ListCertificateAuthoritiesResponse.next_page_token.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the location associated with the CertificateAuthorities, in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificateAuthorities": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsCertificateauthoritiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsCertificateauthoritiesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCertificateauthoritiesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Update a CertificateAuthority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await privateca.projects.locations.certificateAuthorities.patch({
    *     // Output only. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    *     name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *     // Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *     // Required. A list of fields to be updated in this request.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessUrls": {},
    *       //   "caCertificateDescriptions": [],
    *       //   "certificatePolicy": {},
    *       //   "config": {},
    *       //   "createTime": "my_createTime",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "gcsBucket": "my_gcsBucket",
    *       //   "issuingOptions": {},
    *       //   "keySpec": {},
    *       //   "labels": {},
    *       //   "lifetime": "my_lifetime",
    *       //   "name": "my_name",
    *       //   "pemCaCertificates": [],
    *       //   "state": "my_state",
    *       //   "subordinateConfig": {},
    *       //   "tier": "my_tier",
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def patch(params: ParamsResourceProjectsLocationsCertificateauthoritiesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restore(): GaxiosPromise[SchemaOperation] = js.native
  def restore(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restore(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restore(params: ParamsResourceProjectsLocationsCertificateauthoritiesRestore): GaxiosPromise[SchemaOperation] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesRestore,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def restore(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesRestore,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def restore(params: ParamsResourceProjectsLocationsCertificateauthoritiesRestore, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Restore a CertificateAuthority that is scheduled for deletion.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await privateca.projects.locations.certificateAuthorities.restore(
    *     {
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "requestId": "my_requestId"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def restore(params: ParamsResourceProjectsLocationsCertificateauthoritiesRestore, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesRestore,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def scheduleDelete(): GaxiosPromise[SchemaOperation] = js.native
  def scheduleDelete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def scheduleDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def scheduleDelete(params: ParamsResourceProjectsLocationsCertificateauthoritiesScheduledelete): GaxiosPromise[SchemaOperation] = js.native
  def scheduleDelete(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesScheduledelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def scheduleDelete(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesScheduledelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def scheduleDelete(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesScheduledelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def scheduleDelete(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesScheduledelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Schedule a CertificateAuthority for deletion.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await privateca.projects.locations.certificateAuthorities.scheduleDelete({
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "ignoreActiveCertificates": false,
    *         //   "requestId": "my_requestId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def scheduleDelete(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesScheduledelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def scheduleDelete(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesScheduledelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsCertificateauthoritiesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsCertificateauthoritiesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await privateca.projects.locations.certificateAuthorities.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {},
    *         //   "updateMask": "my_updateMask"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesSetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsCertificateauthoritiesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/privateca.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const privateca = google.privateca('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await privateca.projects.locations.certificateAuthorities.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "permissions": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
