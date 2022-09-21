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

@JSImport("googleapis/build/src/apis/dns/v2", "dns_v2.Resource$Managedzones")
@js.native
open class ResourceManagedzones protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaManagedZone] = js.native
  def create(callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def create(params: ParamsResourceManagedzonesCreate): GaxiosPromise[SchemaManagedZone] = js.native
  def create(params: ParamsResourceManagedzonesCreate, callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def create(
    params: ParamsResourceManagedzonesCreate,
    options: BodyResponseCallback[Readable | SchemaManagedZone],
    callback: BodyResponseCallback[Readable | SchemaManagedZone]
  ): Unit = js.native
  def create(params: ParamsResourceManagedzonesCreate, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def create(
    params: ParamsResourceManagedzonesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  /**
    * Creates a new ManagedZone.
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
    *   const res = await dns.managedZones.create({
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
    *       //   "cloudLoggingConfig": {},
    *       //   "creationTime": "my_creationTime",
    *       //   "description": "my_description",
    *       //   "dnsName": "my_dnsName",
    *       //   "dnssecConfig": {},
    *       //   "forwardingConfig": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "nameServerSet": "my_nameServerSet",
    *       //   "nameServers": [],
    *       //   "peeringConfig": {},
    *       //   "privateVisibilityConfig": {},
    *       //   "reverseLookupConfig": {},
    *       //   "serviceDirectoryConfig": {},
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudLoggingConfig": {},
    *   //   "creationTime": "my_creationTime",
    *   //   "description": "my_description",
    *   //   "dnsName": "my_dnsName",
    *   //   "dnssecConfig": {},
    *   //   "forwardingConfig": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "nameServerSet": "my_nameServerSet",
    *   //   "nameServers": [],
    *   //   "peeringConfig": {},
    *   //   "privateVisibilityConfig": {},
    *   //   "reverseLookupConfig": {},
    *   //   "serviceDirectoryConfig": {},
    *   //   "visibility": "my_visibility"
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
  def create(params: ParamsResourceManagedzonesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceManagedzonesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedzonesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedzonesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagedzonesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagedzonesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagedzonesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a previously created ManagedZone.
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
    *   const res = await dns.managedZones.delete({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
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
  def delete(params: ParamsResourceManagedzonesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagedzonesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaManagedZone] = js.native
  def get(callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def get(params: ParamsResourceManagedzonesGet): GaxiosPromise[SchemaManagedZone] = js.native
  def get(params: ParamsResourceManagedzonesGet, callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def get(
    params: ParamsResourceManagedzonesGet,
    options: BodyResponseCallback[Readable | SchemaManagedZone],
    callback: BodyResponseCallback[Readable | SchemaManagedZone]
  ): Unit = js.native
  def get(params: ParamsResourceManagedzonesGet, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def get(
    params: ParamsResourceManagedzonesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  /**
    * Fetches the representation of an existing ManagedZone.
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
    *   const res = await dns.managedZones.get({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudLoggingConfig": {},
    *   //   "creationTime": "my_creationTime",
    *   //   "description": "my_description",
    *   //   "dnsName": "my_dnsName",
    *   //   "dnssecConfig": {},
    *   //   "forwardingConfig": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "nameServerSet": "my_nameServerSet",
    *   //   "nameServers": [],
    *   //   "peeringConfig": {},
    *   //   "privateVisibilityConfig": {},
    *   //   "reverseLookupConfig": {},
    *   //   "serviceDirectoryConfig": {},
    *   //   "visibility": "my_visibility"
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
  def get(params: ParamsResourceManagedzonesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagedzonesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedZonesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(params: ParamsResourceManagedzonesList): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    callback: BodyResponseCallback[SchemaManagedZonesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    options: BodyResponseCallback[Readable | SchemaManagedZonesListResponse],
    callback: BodyResponseCallback[Readable | SchemaManagedZonesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedzonesList, options: MethodOptions): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZonesListResponse]
  ): Unit = js.native
  /**
    * Enumerates ManagedZones that have been created but not yet deleted.
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
    *   const res = await dns.managedZones.list({
    *     // Restricts the list to return only zones with this domain name.
    *     dnsName: 'placeholder-value',
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
    *   //   "managedZones": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceManagedzonesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceManagedzonesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceManagedzonesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceManagedzonesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceManagedzonesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceManagedzonesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Applies a partial update to an existing ManagedZone.
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
    *   const res = await dns.managedZones.patch({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloudLoggingConfig": {},
    *       //   "creationTime": "my_creationTime",
    *       //   "description": "my_description",
    *       //   "dnsName": "my_dnsName",
    *       //   "dnssecConfig": {},
    *       //   "forwardingConfig": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "nameServerSet": "my_nameServerSet",
    *       //   "nameServers": [],
    *       //   "peeringConfig": {},
    *       //   "privateVisibilityConfig": {},
    *       //   "reverseLookupConfig": {},
    *       //   "serviceDirectoryConfig": {},
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dnsKeyContext": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "type": "my_type",
    *   //   "user": "my_user",
    *   //   "zoneContext": {}
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
  def patch(params: ParamsResourceManagedzonesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagedzonesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceManagedzonesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceManagedzonesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceManagedzonesUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceManagedzonesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceManagedzonesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates an existing ManagedZone.
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
    *   const res = await dns.managedZones.update({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    *     location: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloudLoggingConfig": {},
    *       //   "creationTime": "my_creationTime",
    *       //   "description": "my_description",
    *       //   "dnsName": "my_dnsName",
    *       //   "dnssecConfig": {},
    *       //   "forwardingConfig": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "nameServerSet": "my_nameServerSet",
    *       //   "nameServers": [],
    *       //   "peeringConfig": {},
    *       //   "privateVisibilityConfig": {},
    *       //   "reverseLookupConfig": {},
    *       //   "serviceDirectoryConfig": {},
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dnsKeyContext": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "type": "my_type",
    *   //   "user": "my_user",
    *   //   "zoneContext": {}
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
  def update(params: ParamsResourceManagedzonesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagedzonesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
