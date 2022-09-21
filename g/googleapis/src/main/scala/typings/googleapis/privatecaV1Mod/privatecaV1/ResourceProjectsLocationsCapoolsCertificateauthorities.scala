package typings.googleapis.privatecaV1Mod.privatecaV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/privateca/v1", "privateca_v1.Resource$Projects$Locations$Capools$Certificateauthorities")
@js.native
open class ResourceProjectsLocationsCapoolsCertificateauthorities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaOperation] = js.native
  def activate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def activate(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesActivate): GaxiosPromise[SchemaOperation] = js.native
  def activate(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesActivate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def activate(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesActivate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def activate(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesActivate,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def activate(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Activate a CertificateAuthority that is in state AWAITING_USER_ACTIVATION and is of type SUBORDINATE. After the parent Certificate Authority signs a certificate signing request from FetchCertificateAuthorityCsr, this method can complete the activation process.
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.activate({
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/caPools/my-caPool/certificateAuthorities/my-certificateAuthoritie',
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
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesActivate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var certificateRevocationLists: ResourceProjectsLocationsCapoolsCertificateauthoritiesCertificaterevocationlists = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesCreate,
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.create({
    *       // Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63\}`
    *       certificateAuthorityId: 'placeholder-value',
    *       // Required. The resource name of the CaPool associated with the CertificateAuthorities, in the format `projects/x/locations/x/caPools/x`.
    *       parent: 'projects/my-project/locations/my-location/caPools/my-caPool',
    *       // Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *       requestId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "accessUrls": {},
    *         //   "caCertificateDescriptions": [],
    *         //   "config": {},
    *         //   "createTime": "my_createTime",
    *         //   "deleteTime": "my_deleteTime",
    *         //   "expireTime": "my_expireTime",
    *         //   "gcsBucket": "my_gcsBucket",
    *         //   "keySpec": {},
    *         //   "labels": {},
    *         //   "lifetime": "my_lifetime",
    *         //   "name": "my_name",
    *         //   "pemCaCertificates": [],
    *         //   "state": "my_state",
    *         //   "subordinateConfig": {},
    *         //   "tier": "my_tier",
    *         //   "type": "my_type",
    *         //   "updateTime": "my_updateTime"
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
  def create(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Delete a CertificateAuthority.
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.delete({
    *       // Optional. This field allows the CA to be deleted even if the CA has active certs. Active certs include both unrevoked and unexpired certs.
    *       ignoreActiveCertificates: 'placeholder-value',
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/caPools/my-caPool/certificateAuthorities/my-certificateAuthoritie',
    *       // Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *       requestId: 'placeholder-value',
    *       // Optional. If this flag is set, the Certificate Authority will be deleted as soon as possible without a 30-day grace period where undeletion would have been allowed. If you proceed, there will be no way to recover this CA.
    *       skipGracePeriod: 'placeholder-value',
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
  def delete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def disable(): GaxiosPromise[SchemaOperation] = js.native
  def disable(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disable(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDisable): GaxiosPromise[SchemaOperation] = js.native
  def disable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDisable,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def disable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDisable,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def disable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDisable,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def disable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDisable,
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.disable({
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/caPools/my-caPool/certificateAuthorities/my-certificateAuthoritie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
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
  def disable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDisable,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def disable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDisable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def enable(): GaxiosPromise[SchemaOperation] = js.native
  def enable(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enable(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesEnable): GaxiosPromise[SchemaOperation] = js.native
  def enable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesEnable,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def enable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesEnable,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def enable(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesEnable, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesEnable,
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.enable({
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/caPools/my-caPool/certificateAuthorities/my-certificateAuthoritie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
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
  def enable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesEnable,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def enable(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesEnable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def fetch(): GaxiosPromise[SchemaFetchCertificateAuthorityCsrResponse] = js.native
  def fetch(callback: BodyResponseCallback[SchemaFetchCertificateAuthorityCsrResponse]): Unit = js.native
  def fetch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFetchCertificateAuthorityCsrResponse] = js.native
  def fetch(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesFetch): GaxiosPromise[SchemaFetchCertificateAuthorityCsrResponse] = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesFetch,
    callback: BodyResponseCallback[SchemaFetchCertificateAuthorityCsrResponse]
  ): Unit = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesFetch,
    options: BodyResponseCallback[Readable | SchemaFetchCertificateAuthorityCsrResponse],
    callback: BodyResponseCallback[Readable | SchemaFetchCertificateAuthorityCsrResponse]
  ): Unit = js.native
  def fetch(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesFetch, options: MethodOptions): GaxiosPromise[SchemaFetchCertificateAuthorityCsrResponse] = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesFetch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFetchCertificateAuthorityCsrResponse]
  ): Unit = js.native
  /**
    * Fetch a certificate signing request (CSR) from a CertificateAuthority that is in state AWAITING_USER_ACTIVATION and is of type SUBORDINATE. The CSR must then be signed by the desired parent Certificate Authority, which could be another CertificateAuthority resource, or could be an on-prem certificate authority. See also ActivateCertificateAuthority.
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.fetch({
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/caPools/my-caPool/certificateAuthorities/my-certificateAuthoritie',
    *     });
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
  def fetch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesFetch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesFetch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCertificateAuthority] = js.native
  def get(callback: BodyResponseCallback[SchemaCertificateAuthority]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCertificateAuthority] = js.native
  def get(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesGet): GaxiosPromise[SchemaCertificateAuthority] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesGet,
    callback: BodyResponseCallback[SchemaCertificateAuthority]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesGet,
    options: BodyResponseCallback[Readable | SchemaCertificateAuthority],
    callback: BodyResponseCallback[Readable | SchemaCertificateAuthority]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesGet, options: MethodOptions): GaxiosPromise[SchemaCertificateAuthority] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesGet,
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.get({
    *       // Required. The name of the CertificateAuthority to get.
    *       name: 'projects/my-project/locations/my-location/caPools/my-caPool/certificateAuthorities/my-certificateAuthoritie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessUrls": {},
    *   //   "caCertificateDescriptions": [],
    *   //   "config": {},
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "expireTime": "my_expireTime",
    *   //   "gcsBucket": "my_gcsBucket",
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
  def get(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCertificateAuthoritiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCertificateAuthoritiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCertificateAuthoritiesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesList): GaxiosPromise[SchemaListCertificateAuthoritiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesList,
    callback: BodyResponseCallback[SchemaListCertificateAuthoritiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesList,
    options: BodyResponseCallback[Readable | SchemaListCertificateAuthoritiesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCertificateAuthoritiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesList, options: MethodOptions): GaxiosPromise[SchemaListCertificateAuthoritiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesList,
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.list({
    *       // Optional. Only include resources that match the filter in the response.
    *       filter: 'placeholder-value',
    *       // Optional. Specify how the results should be sorted.
    *       orderBy: 'placeholder-value',
    *       // Optional. Limit on the number of CertificateAuthorities to include in the response. Further CertificateAuthorities can subsequently be obtained by including the ListCertificateAuthoritiesResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
    *       pageSize: 'placeholder-value',
    *       // Optional. Pagination token, returned earlier via ListCertificateAuthoritiesResponse.next_page_token.
    *       pageToken: 'placeholder-value',
    *       // Required. The resource name of the CaPool associated with the CertificateAuthorities, in the format `projects/x/locations/x/caPools/x`.
    *       parent: 'projects/my-project/locations/my-location/caPools/my-caPool',
    *     });
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
  def list(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesPatch,
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.patch({
    *       // Output only. The resource name for this CertificateAuthority in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/caPools/my-caPool/certificateAuthorities/my-certificateAuthoritie',
    *       // Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *       requestId: 'placeholder-value',
    *       // Required. A list of fields to be updated in this request.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "accessUrls": {},
    *         //   "caCertificateDescriptions": [],
    *         //   "config": {},
    *         //   "createTime": "my_createTime",
    *         //   "deleteTime": "my_deleteTime",
    *         //   "expireTime": "my_expireTime",
    *         //   "gcsBucket": "my_gcsBucket",
    *         //   "keySpec": {},
    *         //   "labels": {},
    *         //   "lifetime": "my_lifetime",
    *         //   "name": "my_name",
    *         //   "pemCaCertificates": [],
    *         //   "state": "my_state",
    *         //   "subordinateConfig": {},
    *         //   "tier": "my_tier",
    *         //   "type": "my_type",
    *         //   "updateTime": "my_updateTime"
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
  def patch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undelete(): GaxiosPromise[SchemaOperation] = js.native
  def undelete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undelete(params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete): GaxiosPromise[SchemaOperation] = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Undelete a CertificateAuthority that has been deleted.
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
    * const privateca = google.privateca('v1');
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
    *     await privateca.projects.locations.caPools.certificateAuthorities.undelete({
    *       // Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    *       name: 'projects/my-project/locations/my-location/caPools/my-caPool/certificateAuthorities/my-certificateAuthoritie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
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
  def undelete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
