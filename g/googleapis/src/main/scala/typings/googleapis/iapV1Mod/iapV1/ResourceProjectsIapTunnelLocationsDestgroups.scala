package typings.googleapis.iapV1Mod.iapV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iap/v1", "iap_v1.Resource$Projects$Iap_tunnel$Locations$Destgroups")
@js.native
open class ResourceProjectsIapTunnelLocationsDestgroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def create(callback: BodyResponseCallback[SchemaTunnelDestGroup]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def create(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def create(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate,
    callback: BodyResponseCallback[SchemaTunnelDestGroup]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate,
    options: BodyResponseCallback[Readable | SchemaTunnelDestGroup],
    callback: BodyResponseCallback[Readable | SchemaTunnelDestGroup]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate, options: MethodOptions): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def create(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTunnelDestGroup]
  ): Unit = js.native
  /**
    * Creates a new TunnelDestGroup.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.iap_tunnel.locations.destGroups.create({
    *     // Required. Google Cloud Project ID and location. In the following format: `projects/{project_number/id\}/iap_tunnel/locations/{location\}`.
    *     parent: 'projects/my-project/iap_tunnel/locations/my-location',
    *     // Required. The ID to use for the TunnelDestGroup, which becomes the final component of the resource name. This value must be 4-63 characters, and valid characters are `[a-z]-`.
    *     tunnelDestGroupId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cidrs": [],
    *       //   "fqdns": [],
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cidrs": [],
    *   //   "fqdns": [],
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a TunnelDestGroup.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.iap_tunnel.locations.destGroups.delete({
    *     // Required. Name of the TunnelDestGroup to delete. In the following format: `projects/{project_number/id\}/iap_tunnel/locations/{location\}/destGroups/{dest_group\}`.
    *     name: 'projects/my-project/iap_tunnel/locations/my-location/destGroups/my-destGroup',
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
  def delete(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaTunnelDestGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def get(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsGet): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def get(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsGet,
    callback: BodyResponseCallback[SchemaTunnelDestGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsGet,
    options: BodyResponseCallback[Readable | SchemaTunnelDestGroup],
    callback: BodyResponseCallback[Readable | SchemaTunnelDestGroup]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsGet, options: MethodOptions): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def get(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTunnelDestGroup]
  ): Unit = js.native
  /**
    * Retrieves an existing TunnelDestGroup.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.iap_tunnel.locations.destGroups.get({
    *     // Required. Name of the TunnelDestGroup to be fetched. In the following format: `projects/{project_number/id\}/iap_tunnel/locations/{location\}/destGroups/{dest_group\}`.
    *     name: 'projects/my-project/iap_tunnel/locations/my-location/destGroups/my-destGroup',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cidrs": [],
    *   //   "fqdns": [],
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTunnelDestGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTunnelDestGroupsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTunnelDestGroupsResponse] = js.native
  def list(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsList): GaxiosPromise[SchemaListTunnelDestGroupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsList,
    callback: BodyResponseCallback[SchemaListTunnelDestGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsList,
    options: BodyResponseCallback[Readable | SchemaListTunnelDestGroupsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTunnelDestGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsList, options: MethodOptions): GaxiosPromise[SchemaListTunnelDestGroupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTunnelDestGroupsResponse]
  ): Unit = js.native
  /**
    * Lists the existing TunnelDestGroups. To group across all locations, use a `-` as the location ID. For example: `/v1/projects/123/iap_tunnel/locations/-/destGroups`
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.iap_tunnel.locations.destGroups.list({
    *     // The maximum number of groups to return. The service might return fewer than this value. If unspecified, at most 100 groups are returned. The maximum value is 1000; values above 1000 are coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListTunnelDestGroups` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListTunnelDestGroups` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Google Cloud Project ID and location. In the following format: `projects/{project_number/id\}/iap_tunnel/locations/{location\}`. A `-` can be used for the location to group across all locations.
    *     parent: 'projects/my-project/iap_tunnel/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "tunnelDestGroups": []
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
  def list(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaTunnelDestGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def patch(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsPatch): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def patch(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsPatch,
    callback: BodyResponseCallback[SchemaTunnelDestGroup]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsPatch,
    options: BodyResponseCallback[Readable | SchemaTunnelDestGroup],
    callback: BodyResponseCallback[Readable | SchemaTunnelDestGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsPatch, options: MethodOptions): GaxiosPromise[SchemaTunnelDestGroup] = js.native
  def patch(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTunnelDestGroup]
  ): Unit = js.native
  /**
    * Updates a TunnelDestGroup.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.iap_tunnel.locations.destGroups.patch({
    *     // Required. Immutable. Identifier for the TunnelDestGroup. Must be unique within the project and contain only lower case letters (a-z) and dashes (-).
    *     name: 'projects/my-project/iap_tunnel/locations/my-location/destGroups/my-destGroup',
    *     // A field mask that specifies which IAP settings to update. If omitted, then all of the settings are updated. See https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cidrs": [],
    *       //   "fqdns": [],
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cidrs": [],
    *   //   "fqdns": [],
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceProjectsIapTunnelLocationsDestgroupsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsIapTunnelLocationsDestgroupsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
