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

@JSImport("googleapis/build/src/apis/privateca/v1beta1", "privateca_v1beta1.Resource$Projects$Locations$Certificateauthorities$Certificates")
@js.native
open class ResourceProjectsLocationsCertificateauthoritiesCertificates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCertificate] = js.native
  def create(callback: BodyResponseCallback[SchemaCertificate]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCertificate] = js.native
  def create(params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesCreate): GaxiosPromise[SchemaCertificate] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesCreate,
    callback: BodyResponseCallback[SchemaCertificate]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesCreate,
    options: BodyResponseCallback[Readable | SchemaCertificate],
    callback: BodyResponseCallback[Readable | SchemaCertificate]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaCertificate] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCertificate]
  ): Unit = js.native
  /**
    * Create a new Certificate in a given Project, Location from a particular CertificateAuthority.
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
    *     await privateca.projects.locations.certificateAuthorities.certificates.create(
    *       {
    *         // Optional. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63\}`. This field is required when using a CertificateAuthority in the Enterprise CertificateAuthority.Tier, but is optional and its value is ignored otherwise.
    *         certificateId: 'placeholder-value',
    *         // Required. The resource name of the location and CertificateAuthority associated with the Certificate, in the format `projects/x/locations/x/certificateAuthorities/x`.
    *         parent:
    *           'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *         // Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *         requestId: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "certificateDescription": {},
    *           //   "config": {},
    *           //   "createTime": "my_createTime",
    *           //   "labels": {},
    *           //   "lifetime": "my_lifetime",
    *           //   "name": "my_name",
    *           //   "pemCertificate": "my_pemCertificate",
    *           //   "pemCertificateChain": [],
    *           //   "pemCsr": "my_pemCsr",
    *           //   "revocationDetails": {},
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificateDescription": {},
    *   //   "config": {},
    *   //   "createTime": "my_createTime",
    *   //   "labels": {},
    *   //   "lifetime": "my_lifetime",
    *   //   "name": "my_name",
    *   //   "pemCertificate": "my_pemCertificate",
    *   //   "pemCertificateChain": [],
    *   //   "pemCsr": "my_pemCsr",
    *   //   "revocationDetails": {},
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
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCertificate] = js.native
  def get(callback: BodyResponseCallback[SchemaCertificate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCertificate] = js.native
  def get(params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesGet): GaxiosPromise[SchemaCertificate] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesGet,
    callback: BodyResponseCallback[SchemaCertificate]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesGet,
    options: BodyResponseCallback[Readable | SchemaCertificate],
    callback: BodyResponseCallback[Readable | SchemaCertificate]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaCertificate] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCertificate]
  ): Unit = js.native
  /**
    * Returns a Certificate.
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
    *     await privateca.projects.locations.certificateAuthorities.certificates.get({
    *       // Required. The name of the Certificate to get.
    *       name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie/certificates/my-certificate',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificateDescription": {},
    *   //   "config": {},
    *   //   "createTime": "my_createTime",
    *   //   "labels": {},
    *   //   "lifetime": "my_lifetime",
    *   //   "name": "my_name",
    *   //   "pemCertificate": "my_pemCertificate",
    *   //   "pemCertificateChain": [],
    *   //   "pemCsr": "my_pemCsr",
    *   //   "revocationDetails": {},
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
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCertificatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCertificatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCertificatesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesList): GaxiosPromise[SchemaListCertificatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesList,
    callback: BodyResponseCallback[SchemaListCertificatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesList,
    options: BodyResponseCallback[Readable | SchemaListCertificatesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCertificatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListCertificatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCertificatesResponse]
  ): Unit = js.native
  /**
    * Lists Certificates.
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
    *     await privateca.projects.locations.certificateAuthorities.certificates.list(
    *       {
    *         // Optional. Only include resources that match the filter in the response. For details on supported filters and syntax, see [Certificates Filtering documentation](https://cloud.google.com/certificate-authority-service/docs/sorting-filtering-certificates#filtering_support).
    *         filter: 'placeholder-value',
    *         // Optional. Specify how the results should be sorted. For details on supported fields and syntax, see [Certificates Sorting documentation](https://cloud.google.com/certificate-authority-service/docs/sorting-filtering-certificates#sorting_support).
    *         orderBy: 'placeholder-value',
    *         // Optional. Limit on the number of Certificates to include in the response. Further Certificates can subsequently be obtained by including the ListCertificatesResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
    *         pageSize: 'placeholder-value',
    *         // Optional. Pagination token, returned earlier via ListCertificatesResponse.next_page_token.
    *         pageToken: 'placeholder-value',
    *         // Required. The resource name of the location associated with the Certificates, in the format `projects/x/locations/x/certificateauthorities/x`.
    *         parent:
    *           'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificates": [],
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
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCertificate] = js.native
  def patch(callback: BodyResponseCallback[SchemaCertificate]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCertificate] = js.native
  def patch(params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesPatch): GaxiosPromise[SchemaCertificate] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesPatch,
    callback: BodyResponseCallback[SchemaCertificate]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesPatch,
    options: BodyResponseCallback[Readable | SchemaCertificate],
    callback: BodyResponseCallback[Readable | SchemaCertificate]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaCertificate] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCertificate]
  ): Unit = js.native
  /**
    * Update a Certificate. Currently, the only field you can update is the labels field.
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
    *     await privateca.projects.locations.certificateAuthorities.certificates.patch(
    *       {
    *         // Output only. The resource path for this Certificate in the format `projects/x/locations/x/certificateAuthorities/x/certificates/x`.
    *         name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie/certificates/my-certificate',
    *         // Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *         requestId: 'placeholder-value',
    *         // Required. A list of fields to be updated in this request.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "certificateDescription": {},
    *           //   "config": {},
    *           //   "createTime": "my_createTime",
    *           //   "labels": {},
    *           //   "lifetime": "my_lifetime",
    *           //   "name": "my_name",
    *           //   "pemCertificate": "my_pemCertificate",
    *           //   "pemCertificateChain": [],
    *           //   "pemCsr": "my_pemCsr",
    *           //   "revocationDetails": {},
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificateDescription": {},
    *   //   "config": {},
    *   //   "createTime": "my_createTime",
    *   //   "labels": {},
    *   //   "lifetime": "my_lifetime",
    *   //   "name": "my_name",
    *   //   "pemCertificate": "my_pemCertificate",
    *   //   "pemCertificateChain": [],
    *   //   "pemCsr": "my_pemCsr",
    *   //   "revocationDetails": {},
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
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revoke(): GaxiosPromise[SchemaCertificate] = js.native
  def revoke(callback: BodyResponseCallback[SchemaCertificate]): Unit = js.native
  def revoke(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCertificate] = js.native
  def revoke(params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesRevoke): GaxiosPromise[SchemaCertificate] = js.native
  def revoke(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesRevoke,
    callback: BodyResponseCallback[SchemaCertificate]
  ): Unit = js.native
  def revoke(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesRevoke,
    options: BodyResponseCallback[Readable | SchemaCertificate],
    callback: BodyResponseCallback[Readable | SchemaCertificate]
  ): Unit = js.native
  def revoke(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesRevoke,
    options: MethodOptions
  ): GaxiosPromise[SchemaCertificate] = js.native
  def revoke(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesRevoke,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCertificate]
  ): Unit = js.native
  /**
    * Revoke a Certificate.
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
    *     await privateca.projects.locations.certificateAuthorities.certificates.revoke(
    *       {
    *         // Required. The resource name for this Certificate in the format `projects/x/locations/x/certificateAuthorities/x/certificates/x`.
    *         name: 'projects/my-project/locations/my-location/certificateAuthorities/my-certificateAuthoritie/certificates/my-certificate',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "reason": "my_reason",
    *           //   "requestId": "my_requestId"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificateDescription": {},
    *   //   "config": {},
    *   //   "createTime": "my_createTime",
    *   //   "labels": {},
    *   //   "lifetime": "my_lifetime",
    *   //   "name": "my_name",
    *   //   "pemCertificate": "my_pemCertificate",
    *   //   "pemCertificateChain": [],
    *   //   "pemCsr": "my_pemCsr",
    *   //   "revocationDetails": {},
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
  def revoke(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesRevoke,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def revoke(
    params: ParamsResourceProjectsLocationsCertificateauthoritiesCertificatesRevoke,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
