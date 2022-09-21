package typings.googleapis.osconfigV1Mod.osconfigV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1", "osconfig_v1.Resource$Projects$Locations$Instances$Inventories")
@js.native
open class ResourceProjectsLocationsInstancesInventories protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaInventory] = js.native
  def get(callback: BodyResponseCallback[SchemaInventory]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventory] = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesInventoriesGet): GaxiosPromise[SchemaInventory] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesInventoriesGet,
    callback: BodyResponseCallback[SchemaInventory]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesInventoriesGet,
    options: BodyResponseCallback[Readable | SchemaInventory],
    callback: BodyResponseCallback[Readable | SchemaInventory]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesInventoriesGet, options: MethodOptions): GaxiosPromise[SchemaInventory] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesInventoriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventory]
  ): Unit = js.native
  /**
    * Get inventory data for the specified VM instance. If the VM has no associated inventory, the message `NOT_FOUND` is returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1');
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
    *   const res = await osconfig.projects.locations.instances.inventories.get({
    *     // Required. API resource name for inventory resource. Format: `projects/{project\}/locations/{location\}/instances/{instance\}/inventory` For `{project\}`, either `project-number` or `project-id` can be provided. For `{instance\}`, either Compute Engine `instance-id` or `instance-name` can be provided.
    *     name: 'projects/my-project/locations/my-location/instances/my-instance/inventory',
    *     // Inventory view indicating what information should be included in the inventory resource. If unspecified, the default view is BASIC.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": {},
    *   //   "name": "my_name",
    *   //   "osInfo": {},
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
  def get(params: ParamsResourceProjectsLocationsInstancesInventoriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesInventoriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInventoriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInventoriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInventoriesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesInventoriesList): GaxiosPromise[SchemaListInventoriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesInventoriesList,
    callback: BodyResponseCallback[SchemaListInventoriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesInventoriesList,
    options: BodyResponseCallback[Readable | SchemaListInventoriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListInventoriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesInventoriesList, options: MethodOptions): GaxiosPromise[SchemaListInventoriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesInventoriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInventoriesResponse]
  ): Unit = js.native
  /**
    * List inventory data for all VM instances in the specified zone.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1');
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
    *   const res = await osconfig.projects.locations.instances.inventories.list({
    *     // If provided, this field specifies the criteria that must be met by a `Inventory` API resource to be included in the response.
    *     filter: 'placeholder-value',
    *     // The maximum number of results to return.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to `ListInventories` that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name. Format: `projects/{project\}/locations/{location\}/instances/-` For `{project\}`, either `project-number` or `project-id` can be provided.
    *     parent: 'projects/my-project/locations/my-location/instances/my-instance',
    *     // Inventory view indicating what information should be included in the inventory resource. If unspecified, the default view is BASIC.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "inventories": [],
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
  def list(params: ParamsResourceProjectsLocationsInstancesInventoriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesInventoriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
