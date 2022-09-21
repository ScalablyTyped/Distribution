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

@JSImport("googleapis/build/src/apis/dns/v2", "dns_v2.Resource$Policies")
@js.native
open class ResourcePolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPolicy] = js.native
  def create(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def create(params: ParamsResourcePoliciesCreate): GaxiosPromise[SchemaPolicy] = js.native
  def create(params: ParamsResourcePoliciesCreate, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def create(
    params: ParamsResourcePoliciesCreate,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def create(params: ParamsResourcePoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def create(
    params: ParamsResourcePoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Creates a new Policy.
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
    *   const res = await dns.policies.create({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternativeNameServerConfig": {},
    *       //   "description": "my_description",
    *       //   "enableInboundForwarding": false,
    *       //   "enableLogging": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "networks": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternativeNameServerConfig": {},
    *   //   "description": "my_description",
    *   //   "enableInboundForwarding": false,
    *   //   "enableLogging": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "networks": []
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
  def create(params: ParamsResourcePoliciesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePoliciesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePoliciesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePoliciesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePoliciesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePoliciesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePoliciesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a previously created Policy. Fails if the policy is still being referenced by a network.
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
    *   const res = await dns.policies.delete({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // User given friendly name of the policy addressed by this request.
    *     policy: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
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
  def delete(params: ParamsResourcePoliciesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePoliciesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def get(params: ParamsResourcePoliciesGet): GaxiosPromise[SchemaPolicy] = js.native
  def get(params: ParamsResourcePoliciesGet, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def get(
    params: ParamsResourcePoliciesGet,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def get(params: ParamsResourcePoliciesGet, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def get(
    params: ParamsResourcePoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Fetches the representation of an existing Policy.
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
    *   const res = await dns.policies.get({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // User given friendly name of the policy addressed by this request.
    *     policy: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternativeNameServerConfig": {},
    *   //   "description": "my_description",
    *   //   "enableInboundForwarding": false,
    *   //   "enableLogging": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "networks": []
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
  def get(params: ParamsResourcePoliciesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePoliciesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPoliciesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPoliciesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPoliciesListResponse] = js.native
  def list(params: ParamsResourcePoliciesList): GaxiosPromise[SchemaPoliciesListResponse] = js.native
  def list(params: ParamsResourcePoliciesList, callback: BodyResponseCallback[SchemaPoliciesListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePoliciesList,
    options: BodyResponseCallback[Readable | SchemaPoliciesListResponse],
    callback: BodyResponseCallback[Readable | SchemaPoliciesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePoliciesList, options: MethodOptions): GaxiosPromise[SchemaPoliciesListResponse] = js.native
  def list(
    params: ParamsResourcePoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPoliciesListResponse]
  ): Unit = js.native
  /**
    * Enumerates all Policies associated with a project.
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
    *   const res = await dns.policies.list({
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
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "policies": []
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
  def list(params: ParamsResourcePoliciesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePoliciesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPoliciesPatchResponse] = js.native
  def patch(callback: BodyResponseCallback[SchemaPoliciesPatchResponse]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPoliciesPatchResponse] = js.native
  def patch(params: ParamsResourcePoliciesPatch): GaxiosPromise[SchemaPoliciesPatchResponse] = js.native
  def patch(params: ParamsResourcePoliciesPatch, callback: BodyResponseCallback[SchemaPoliciesPatchResponse]): Unit = js.native
  def patch(
    params: ParamsResourcePoliciesPatch,
    options: BodyResponseCallback[Readable | SchemaPoliciesPatchResponse],
    callback: BodyResponseCallback[Readable | SchemaPoliciesPatchResponse]
  ): Unit = js.native
  def patch(params: ParamsResourcePoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaPoliciesPatchResponse] = js.native
  def patch(
    params: ParamsResourcePoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPoliciesPatchResponse]
  ): Unit = js.native
  /**
    * Applies a partial update to an existing Policy.
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
    *   const res = await dns.policies.patch({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // User given friendly name of the policy addressed by this request.
    *     policy: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternativeNameServerConfig": {},
    *       //   "description": "my_description",
    *       //   "enableInboundForwarding": false,
    *       //   "enableLogging": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "networks": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "policy": {}
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
  def patch(params: ParamsResourcePoliciesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePoliciesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPoliciesUpdateResponse] = js.native
  def update(callback: BodyResponseCallback[SchemaPoliciesUpdateResponse]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPoliciesUpdateResponse] = js.native
  def update(params: ParamsResourcePoliciesUpdate): GaxiosPromise[SchemaPoliciesUpdateResponse] = js.native
  def update(params: ParamsResourcePoliciesUpdate, callback: BodyResponseCallback[SchemaPoliciesUpdateResponse]): Unit = js.native
  def update(
    params: ParamsResourcePoliciesUpdate,
    options: BodyResponseCallback[Readable | SchemaPoliciesUpdateResponse],
    callback: BodyResponseCallback[Readable | SchemaPoliciesUpdateResponse]
  ): Unit = js.native
  def update(params: ParamsResourcePoliciesUpdate, options: MethodOptions): GaxiosPromise[SchemaPoliciesUpdateResponse] = js.native
  def update(
    params: ParamsResourcePoliciesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPoliciesUpdateResponse]
  ): Unit = js.native
  /**
    * Updates an existing Policy.
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
    *   const res = await dns.policies.update({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // User given friendly name of the policy addressed by this request.
    *     policy: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternativeNameServerConfig": {},
    *       //   "description": "my_description",
    *       //   "enableInboundForwarding": false,
    *       //   "enableLogging": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "networks": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "policy": {}
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
  def update(params: ParamsResourcePoliciesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePoliciesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
