package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Resource$Policies")
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
    * dns.policies.create
    * @desc Create a new Policy
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.policies.create({
    *     // For mutating operation requests only. An optional identifier
    *     // specified by the client. Must be unique for operation resources in the
    *     // Operations collection.
    *     clientOperationId: 'placeholder-value',
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
    * @alias dns.policies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {().Policy} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * dns.policies.delete
    * @desc Delete a previously created Policy. Will fail if the policy is still being referenced by a network.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.policies.delete({
    *     // For mutating operation requests only. An optional identifier
    *     // specified by the client. Must be unique for operation resources in the
    *     // Operations collection.
    *     clientOperationId: 'placeholder-value',
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
    * @alias dns.policies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    * @param {string} params.policy User given friendly name of the policy addressed by this request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * dns.policies.get
    * @desc Fetch the representation of an existing Policy.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.policies.get({
    *     // For mutating operation requests only. An optional identifier
    *     // specified by the client. Must be unique for operation resources in the
    *     // Operations collection.
    *     clientOperationId: 'placeholder-value',
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
    * @alias dns.policies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    * @param {string} params.policy User given friendly name of the policy addressed by this request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * dns.policies.list
    * @desc Enumerate all Policies associated with a project.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.policies.list({
    *     // Optional. Maximum number of results to be returned. If unspecified, the
    *     // server will decide how many results to return.
    *     maxResults: 'placeholder-value',
    *     // Optional. A tag returned by a previous list request that was truncated.
    *     // Use this parameter to continue a previous list request.
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
    * @alias dns.policies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Optional. Maximum number of results to be returned. If unspecified, the server will decide how many results to return.
    * @param {string=} params.pageToken Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * dns.policies.patch
    * @desc Apply a partial update to an existing Policy.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.policies.patch({
    *     // For mutating operation requests only. An optional identifier
    *     // specified by the client. Must be unique for operation resources in the
    *     // Operations collection.
    *     clientOperationId: 'placeholder-value',
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
    * @alias dns.policies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    * @param {string} params.policy User given friendly name of the policy addressed by this request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {().Policy} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * dns.policies.update
    * @desc Update an existing Policy.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.policies.update({
    *     // For mutating operation requests only. An optional identifier
    *     // specified by the client. Must be unique for operation resources in the
    *     // Operations collection.
    *     clientOperationId: 'placeholder-value',
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
    * @alias dns.policies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    * @param {string} params.policy User given friendly name of the policy addressed by this request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {().Policy} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(params: ParamsResourcePoliciesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePoliciesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
