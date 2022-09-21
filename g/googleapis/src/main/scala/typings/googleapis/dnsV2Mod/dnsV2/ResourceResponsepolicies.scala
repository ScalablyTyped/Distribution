package typings.googleapis.dnsV2Mod.dnsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v2", "dns_v2.Resource$Responsepolicies")
@js.native
open class ResourceResponsepolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaResponsePolicy] = js.native
  def create(callback: BodyResponseCallback[SchemaResponsePolicy]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePolicy] = js.native
  def create(params: ParamsResourceResponsepoliciesCreate): GaxiosPromise[SchemaResponsePolicy] = js.native
  def create(params: ParamsResourceResponsepoliciesCreate, callback: BodyResponseCallback[SchemaResponsePolicy]): Unit = js.native
  def create(
    params: ParamsResourceResponsepoliciesCreate,
    options: BodyResponseCallback[Readable | SchemaResponsePolicy],
    callback: BodyResponseCallback[Readable | SchemaResponsePolicy]
  ): Unit = js.native
  def create(params: ParamsResourceResponsepoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaResponsePolicy] = js.native
  def create(
    params: ParamsResourceResponsepoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePolicy]
  ): Unit = js.native
  /**
    * Creates a new Response Policy
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicies.create({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource, only applicable in the v APIs. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "gkeClusters": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "networks": [],
    *       //   "responsePolicyName": "my_responsePolicyName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "gkeClusters": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "networks": [],
    *   //   "responsePolicyName": "my_responsePolicyName"
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
  def create(params: ParamsResourceResponsepoliciesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceResponsepoliciesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResponsepoliciesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResponsepoliciesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceResponsepoliciesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceResponsepoliciesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceResponsepoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a previously created Response Policy. Fails if the response policy is non-empty or still being referenced by a network.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicies.delete({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Response Policy addressed by this request.
    *     responsePolicy: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceResponsepoliciesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceResponsepoliciesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaResponsePolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaResponsePolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePolicy] = js.native
  def get(params: ParamsResourceResponsepoliciesGet): GaxiosPromise[SchemaResponsePolicy] = js.native
  def get(params: ParamsResourceResponsepoliciesGet, callback: BodyResponseCallback[SchemaResponsePolicy]): Unit = js.native
  def get(
    params: ParamsResourceResponsepoliciesGet,
    options: BodyResponseCallback[Readable | SchemaResponsePolicy],
    callback: BodyResponseCallback[Readable | SchemaResponsePolicy]
  ): Unit = js.native
  def get(params: ParamsResourceResponsepoliciesGet, options: MethodOptions): GaxiosPromise[SchemaResponsePolicy] = js.native
  def get(
    params: ParamsResourceResponsepoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePolicy]
  ): Unit = js.native
  /**
    * Fetches the representation of an existing Response Policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readonly',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicies.get({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Response Policy addressed by this request.
    *     responsePolicy: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "gkeClusters": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "networks": [],
    *   //   "responsePolicyName": "my_responsePolicyName"
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
  def get(params: ParamsResourceResponsepoliciesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceResponsepoliciesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaResponsePoliciesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaResponsePoliciesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePoliciesListResponse] = js.native
  def list(params: ParamsResourceResponsepoliciesList): GaxiosPromise[SchemaResponsePoliciesListResponse] = js.native
  def list(
    params: ParamsResourceResponsepoliciesList,
    callback: BodyResponseCallback[SchemaResponsePoliciesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceResponsepoliciesList,
    options: BodyResponseCallback[Readable | SchemaResponsePoliciesListResponse],
    callback: BodyResponseCallback[Readable | SchemaResponsePoliciesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceResponsepoliciesList, options: MethodOptions): GaxiosPromise[SchemaResponsePoliciesListResponse] = js.native
  def list(
    params: ParamsResourceResponsepoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePoliciesListResponse]
  ): Unit = js.native
  /**
    * Enumerates all Response Policies associated with a project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readonly',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicies.list({
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
    *     maxResults: 'placeholder-value',
    *     // Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "responsePolicies": []
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
  def list(params: ParamsResourceResponsepoliciesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceResponsepoliciesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaResponsePoliciesPatchResponse] = js.native
  def patch(callback: BodyResponseCallback[SchemaResponsePoliciesPatchResponse]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePoliciesPatchResponse] = js.native
  def patch(params: ParamsResourceResponsepoliciesPatch): GaxiosPromise[SchemaResponsePoliciesPatchResponse] = js.native
  def patch(
    params: ParamsResourceResponsepoliciesPatch,
    callback: BodyResponseCallback[SchemaResponsePoliciesPatchResponse]
  ): Unit = js.native
  def patch(
    params: ParamsResourceResponsepoliciesPatch,
    options: BodyResponseCallback[Readable | SchemaResponsePoliciesPatchResponse],
    callback: BodyResponseCallback[Readable | SchemaResponsePoliciesPatchResponse]
  ): Unit = js.native
  def patch(params: ParamsResourceResponsepoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaResponsePoliciesPatchResponse] = js.native
  def patch(
    params: ParamsResourceResponsepoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePoliciesPatchResponse]
  ): Unit = js.native
  /**
    * Applies a partial update to an existing Response Policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicies.patch({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Respones Policy addressed by this request.
    *     responsePolicy: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "gkeClusters": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "networks": [],
    *       //   "responsePolicyName": "my_responsePolicyName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "responsePolicy": {}
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
  def patch(params: ParamsResourceResponsepoliciesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceResponsepoliciesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaResponsePoliciesUpdateResponse] = js.native
  def update(callback: BodyResponseCallback[SchemaResponsePoliciesUpdateResponse]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePoliciesUpdateResponse] = js.native
  def update(params: ParamsResourceResponsepoliciesUpdate): GaxiosPromise[SchemaResponsePoliciesUpdateResponse] = js.native
  def update(
    params: ParamsResourceResponsepoliciesUpdate,
    callback: BodyResponseCallback[SchemaResponsePoliciesUpdateResponse]
  ): Unit = js.native
  def update(
    params: ParamsResourceResponsepoliciesUpdate,
    options: BodyResponseCallback[Readable | SchemaResponsePoliciesUpdateResponse],
    callback: BodyResponseCallback[Readable | SchemaResponsePoliciesUpdateResponse]
  ): Unit = js.native
  def update(params: ParamsResourceResponsepoliciesUpdate, options: MethodOptions): GaxiosPromise[SchemaResponsePoliciesUpdateResponse] = js.native
  def update(
    params: ParamsResourceResponsepoliciesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePoliciesUpdateResponse]
  ): Unit = js.native
  /**
    * Updates an existing Response Policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicies.update({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Response Policy addressed by this request.
    *     responsePolicy: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "gkeClusters": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "networks": [],
    *       //   "responsePolicyName": "my_responsePolicyName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "responsePolicy": {}
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
  def update(params: ParamsResourceResponsepoliciesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceResponsepoliciesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
