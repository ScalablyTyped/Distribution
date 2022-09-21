package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vmmigration/v1alpha1", "vmmigration_v1alpha1.Resource$Projects$Locations$Sources$Datacenterconnectors")
@js.native
open class ResourceProjectsLocationsSourcesDatacenterconnectors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new DatacenterConnector in a given Source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vmmigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vmmigration = google.vmmigration('v1alpha1');
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
    *     await vmmigration.projects.locations.sources.datacenterConnectors.create({
    *       // Required. The datacenterConnector identifier.
    *       datacenterConnectorId: 'placeholder-value',
    *       // Required. The DatacenterConnector's parent. Required. The Source in where the new DatacenterConnector will be created. For example: `projects/my-project/locations/us-central1/sources/my-source`
    *       parent: 'projects/my-project/locations/my-location/sources/my-source',
    *       // A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *       requestId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "applianceInfrastructureVersion": "my_applianceInfrastructureVersion",
    *         //   "applianceSoftwareVersion": "my_applianceSoftwareVersion",
    *         //   "availableVersions": {},
    *         //   "bucket": "my_bucket",
    *         //   "createTime": "my_createTime",
    *         //   "error": {},
    *         //   "name": "my_name",
    *         //   "registrationId": "my_registrationId",
    *         //   "serviceAccount": "my_serviceAccount",
    *         //   "state": "my_state",
    *         //   "stateTime": "my_stateTime",
    *         //   "updateTime": "my_updateTime",
    *         //   "upgradeStatus": {},
    *         //   "version": "my_version"
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
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a single DatacenterConnector.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vmmigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vmmigration = google.vmmigration('v1alpha1');
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
    *     await vmmigration.projects.locations.sources.datacenterConnectors.delete({
    *       // Required. The DatacenterConnector name.
    *       name: 'projects/my-project/locations/my-location/sources/my-source/datacenterConnectors/my-datacenterConnector',
    *       // A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *       requestId: 'placeholder-value',
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
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDatacenterConnector] = js.native
  def get(callback: BodyResponseCallback[SchemaDatacenterConnector]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatacenterConnector] = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet): GaxiosPromise[SchemaDatacenterConnector] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet,
    callback: BodyResponseCallback[SchemaDatacenterConnector]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet,
    options: BodyResponseCallback[Readable | SchemaDatacenterConnector],
    callback: BodyResponseCallback[Readable | SchemaDatacenterConnector]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet, options: MethodOptions): GaxiosPromise[SchemaDatacenterConnector] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatacenterConnector]
  ): Unit = js.native
  /**
    * Gets details of a single DatacenterConnector.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vmmigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vmmigration = google.vmmigration('v1alpha1');
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
    *     await vmmigration.projects.locations.sources.datacenterConnectors.get({
    *       // Required. The name of the DatacenterConnector.
    *       name: 'projects/my-project/locations/my-location/sources/my-source/datacenterConnectors/my-datacenterConnector',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "applianceInfrastructureVersion": "my_applianceInfrastructureVersion",
    *   //   "applianceSoftwareVersion": "my_applianceSoftwareVersion",
    *   //   "availableVersions": {},
    *   //   "bucket": "my_bucket",
    *   //   "createTime": "my_createTime",
    *   //   "error": {},
    *   //   "name": "my_name",
    *   //   "registrationId": "my_registrationId",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "state": "my_state",
    *   //   "stateTime": "my_stateTime",
    *   //   "updateTime": "my_updateTime",
    *   //   "upgradeStatus": {},
    *   //   "version": "my_version"
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
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDatacenterConnectorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDatacenterConnectorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDatacenterConnectorsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsList): GaxiosPromise[SchemaListDatacenterConnectorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsList,
    callback: BodyResponseCallback[SchemaListDatacenterConnectorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsList,
    options: BodyResponseCallback[Readable | SchemaListDatacenterConnectorsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDatacenterConnectorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsList, options: MethodOptions): GaxiosPromise[SchemaListDatacenterConnectorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDatacenterConnectorsResponse]
  ): Unit = js.native
  /**
    * Lists DatacenterConnectors in a given Source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vmmigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vmmigration = google.vmmigration('v1alpha1');
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
    *     await vmmigration.projects.locations.sources.datacenterConnectors.list({
    *       // Optional. The filter request.
    *       filter: 'placeholder-value',
    *       // Optional. the order by fields for the result.
    *       orderBy: 'placeholder-value',
    *       // Optional. The maximum number of connectors to return. The service may return fewer than this value. If unspecified, at most 500 sources will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // Required. A page token, received from a previous `ListDatacenterConnectors` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListDatacenterConnectors` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent, which owns this collection of connectors.
    *       parent: 'projects/my-project/locations/my-location/sources/my-source',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "datacenterConnectors": [],
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
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upgradeAppliance(): GaxiosPromise[SchemaOperation] = js.native
  def upgradeAppliance(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def upgradeAppliance(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def upgradeAppliance(params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance): GaxiosPromise[SchemaOperation] = js.native
  def upgradeAppliance(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def upgradeAppliance(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def upgradeAppliance(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def upgradeAppliance(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Upgrades the appliance relate to this DatacenterConnector to the in-place updateable version.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vmmigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vmmigration = google.vmmigration('v1alpha1');
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
    *     await vmmigration.projects.locations.sources.datacenterConnectors.upgradeAppliance(
    *       {
    *         // Required. The DatacenterConnector name.
    *         datacenterConnector:
    *           'projects/my-project/locations/my-location/sources/my-source/datacenterConnectors/my-datacenterConnector',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "requestId": "my_requestId"
    *           // }
    *         },
    *       }
    *     );
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
  def upgradeAppliance(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def upgradeAppliance(
    params: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
