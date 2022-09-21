package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Resourcerecordsets")
@js.native
open class ResourceResourcerecordsets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def create(callback: BodyResponseCallback[SchemaResourceRecordSet]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def create(params: ParamsResourceResourcerecordsetsCreate): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def create(
    params: ParamsResourceResourcerecordsetsCreate,
    callback: BodyResponseCallback[SchemaResourceRecordSet]
  ): Unit = js.native
  def create(
    params: ParamsResourceResourcerecordsetsCreate,
    options: BodyResponseCallback[Readable | SchemaResourceRecordSet],
    callback: BodyResponseCallback[Readable | SchemaResourceRecordSet]
  ): Unit = js.native
  def create(params: ParamsResourceResourcerecordsetsCreate, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def create(
    params: ParamsResourceResourcerecordsetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResourceRecordSet]
  ): Unit = js.native
  /**
    * Creates a new ResourceRecordSet.
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
    * const dns = google.dns('v1beta2');
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
    *   const res = await dns.resourceRecordSets.create({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "routingPolicy": {},
    *       //   "rrdatas": [],
    *       //   "signatureRrdatas": [],
    *       //   "ttl": 0,
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "routingPolicy": {},
    *   //   "rrdatas": [],
    *   //   "signatureRrdatas": [],
    *   //   "ttl": 0,
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
  def create(params: ParamsResourceResourcerecordsetsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceResourcerecordsetsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcerecordsetsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcerecordsetsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceResourcerecordsetsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceResourcerecordsetsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceResourcerecordsetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a previously created ResourceRecordSet.
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
    * const dns = google.dns('v1beta2');
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
    *   const res = await dns.resourceRecordSets.delete({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Fully qualified domain name.
    *     name: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // RRSet type.
    *     type: 'placeholder-value',
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
  def delete(params: ParamsResourceResourcerecordsetsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceResourcerecordsetsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def get(callback: BodyResponseCallback[SchemaResourceRecordSet]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def get(params: ParamsResourceResourcerecordsetsGet): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def get(
    params: ParamsResourceResourcerecordsetsGet,
    callback: BodyResponseCallback[SchemaResourceRecordSet]
  ): Unit = js.native
  def get(
    params: ParamsResourceResourcerecordsetsGet,
    options: BodyResponseCallback[Readable | SchemaResourceRecordSet],
    callback: BodyResponseCallback[Readable | SchemaResourceRecordSet]
  ): Unit = js.native
  def get(params: ParamsResourceResourcerecordsetsGet, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def get(
    params: ParamsResourceResourcerecordsetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResourceRecordSet]
  ): Unit = js.native
  /**
    * Fetches the representation of an existing ResourceRecordSet.
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
    * const dns = google.dns('v1beta2');
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
    *   const res = await dns.resourceRecordSets.get({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Fully qualified domain name.
    *     name: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // RRSet type.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "routingPolicy": {},
    *   //   "rrdatas": [],
    *   //   "signatureRrdatas": [],
    *   //   "ttl": 0,
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
  def get(params: ParamsResourceResourcerecordsetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceResourcerecordsetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(params: ParamsResourceResourcerecordsetsList): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: BodyResponseCallback[Readable | SchemaResourceRecordSetsListResponse],
    callback: BodyResponseCallback[Readable | SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceResourcerecordsetsList, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  /**
    * Enumerates ResourceRecordSets that you have created but not yet deleted.
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
    * const dns = google.dns('v1beta2');
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
    *   const res = await dns.resourceRecordSets.list({
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
    *     maxResults: 'placeholder-value',
    *     // Restricts the list to return only records with this fully qualified domain name.
    *     name: 'placeholder-value',
    *     // Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // Restricts the list to return only records of this type. If present, the "name" parameter must also be present.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "rrsets": []
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
  def list(params: ParamsResourceResourcerecordsetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def patch(callback: BodyResponseCallback[SchemaResourceRecordSet]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def patch(params: ParamsResourceResourcerecordsetsPatch): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def patch(
    params: ParamsResourceResourcerecordsetsPatch,
    callback: BodyResponseCallback[SchemaResourceRecordSet]
  ): Unit = js.native
  def patch(
    params: ParamsResourceResourcerecordsetsPatch,
    options: BodyResponseCallback[Readable | SchemaResourceRecordSet],
    callback: BodyResponseCallback[Readable | SchemaResourceRecordSet]
  ): Unit = js.native
  def patch(params: ParamsResourceResourcerecordsetsPatch, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSet] = js.native
  def patch(
    params: ParamsResourceResourcerecordsetsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResourceRecordSet]
  ): Unit = js.native
  /**
    * Applies a partial update to an existing ResourceRecordSet.
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
    * const dns = google.dns('v1beta2');
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
    *   const res = await dns.resourceRecordSets.patch({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Fully qualified domain name.
    *     name: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // RRSet type.
    *     type: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "routingPolicy": {},
    *       //   "rrdatas": [],
    *       //   "signatureRrdatas": [],
    *       //   "ttl": 0,
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "routingPolicy": {},
    *   //   "rrdatas": [],
    *   //   "signatureRrdatas": [],
    *   //   "ttl": 0,
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
  def patch(params: ParamsResourceResourcerecordsetsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceResourcerecordsetsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
