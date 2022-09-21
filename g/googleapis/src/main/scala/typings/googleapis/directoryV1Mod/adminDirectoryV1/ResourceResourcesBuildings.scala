package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resources$Buildings")
@js.native
open class ResourceResourcesBuildings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesBuildingsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesBuildingsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceResourcesBuildingsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceResourcesBuildingsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceResourcesBuildingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a building.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.buildings.delete({
    *     // The id of the building to delete.
    *     buildingId: 'placeholder-value',
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
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
  def delete(params: ParamsResourceResourcesBuildingsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceResourcesBuildingsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBuilding] = js.native
  def get(callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def get(params: ParamsResourceResourcesBuildingsGet): GaxiosPromise[SchemaBuilding] = js.native
  def get(params: ParamsResourceResourcesBuildingsGet, callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def get(
    params: ParamsResourceResourcesBuildingsGet,
    options: BodyResponseCallback[Readable | SchemaBuilding],
    callback: BodyResponseCallback[Readable | SchemaBuilding]
  ): Unit = js.native
  def get(params: ParamsResourceResourcesBuildingsGet, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def get(
    params: ParamsResourceResourcesBuildingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  /**
    * Retrieves a building.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.buildings.get({
    *     // The unique ID of the building to retrieve.
    *     buildingId: 'placeholder-value',
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": {},
    *   //   "buildingId": "my_buildingId",
    *   //   "buildingName": "my_buildingName",
    *   //   "coordinates": {},
    *   //   "description": "my_description",
    *   //   "etags": "my_etags",
    *   //   "floorNames": [],
    *   //   "kind": "my_kind"
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
  def get(params: ParamsResourceResourcesBuildingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceResourcesBuildingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaBuilding] = js.native
  def insert(callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def insert(params: ParamsResourceResourcesBuildingsInsert): GaxiosPromise[SchemaBuilding] = js.native
  def insert(params: ParamsResourceResourcesBuildingsInsert, callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def insert(
    params: ParamsResourceResourcesBuildingsInsert,
    options: BodyResponseCallback[Readable | SchemaBuilding],
    callback: BodyResponseCallback[Readable | SchemaBuilding]
  ): Unit = js.native
  def insert(params: ParamsResourceResourcesBuildingsInsert, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def insert(
    params: ParamsResourceResourcesBuildingsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  /**
    * Inserts a building.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.buildings.insert({
    *     // Source from which Building.coordinates are derived.
    *     coordinatesSource: 'placeholder-value',
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "address": {},
    *       //   "buildingId": "my_buildingId",
    *       //   "buildingName": "my_buildingName",
    *       //   "coordinates": {},
    *       //   "description": "my_description",
    *       //   "etags": "my_etags",
    *       //   "floorNames": [],
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": {},
    *   //   "buildingId": "my_buildingId",
    *   //   "buildingName": "my_buildingName",
    *   //   "coordinates": {},
    *   //   "description": "my_description",
    *   //   "etags": "my_etags",
    *   //   "floorNames": [],
    *   //   "kind": "my_kind"
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
  def insert(params: ParamsResourceResourcesBuildingsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceResourcesBuildingsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBuildings] = js.native
  def list(callback: BodyResponseCallback[SchemaBuildings]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildings] = js.native
  def list(params: ParamsResourceResourcesBuildingsList): GaxiosPromise[SchemaBuildings] = js.native
  def list(params: ParamsResourceResourcesBuildingsList, callback: BodyResponseCallback[SchemaBuildings]): Unit = js.native
  def list(
    params: ParamsResourceResourcesBuildingsList,
    options: BodyResponseCallback[Readable | SchemaBuildings],
    callback: BodyResponseCallback[Readable | SchemaBuildings]
  ): Unit = js.native
  def list(params: ParamsResourceResourcesBuildingsList, options: MethodOptions): GaxiosPromise[SchemaBuildings] = js.native
  def list(
    params: ParamsResourceResourcesBuildingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildings]
  ): Unit = js.native
  /**
    * Retrieves a list of buildings for an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.buildings.list({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Token to specify the next page in the list.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "buildings": [],
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceResourcesBuildingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceResourcesBuildingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaBuilding] = js.native
  def patch(callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def patch(params: ParamsResourceResourcesBuildingsPatch): GaxiosPromise[SchemaBuilding] = js.native
  def patch(params: ParamsResourceResourcesBuildingsPatch, callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def patch(
    params: ParamsResourceResourcesBuildingsPatch,
    options: BodyResponseCallback[Readable | SchemaBuilding],
    callback: BodyResponseCallback[Readable | SchemaBuilding]
  ): Unit = js.native
  def patch(params: ParamsResourceResourcesBuildingsPatch, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def patch(
    params: ParamsResourceResourcesBuildingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  /**
    * Patches a building.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.buildings.patch({
    *     // The id of the building to update.
    *     buildingId: 'placeholder-value',
    *     // Source from which Building.coordinates are derived.
    *     coordinatesSource: 'placeholder-value',
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "address": {},
    *       //   "buildingId": "my_buildingId",
    *       //   "buildingName": "my_buildingName",
    *       //   "coordinates": {},
    *       //   "description": "my_description",
    *       //   "etags": "my_etags",
    *       //   "floorNames": [],
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": {},
    *   //   "buildingId": "my_buildingId",
    *   //   "buildingName": "my_buildingName",
    *   //   "coordinates": {},
    *   //   "description": "my_description",
    *   //   "etags": "my_etags",
    *   //   "floorNames": [],
    *   //   "kind": "my_kind"
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
  def patch(params: ParamsResourceResourcesBuildingsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceResourcesBuildingsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaBuilding] = js.native
  def update(callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def update(params: ParamsResourceResourcesBuildingsUpdate): GaxiosPromise[SchemaBuilding] = js.native
  def update(params: ParamsResourceResourcesBuildingsUpdate, callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def update(
    params: ParamsResourceResourcesBuildingsUpdate,
    options: BodyResponseCallback[Readable | SchemaBuilding],
    callback: BodyResponseCallback[Readable | SchemaBuilding]
  ): Unit = js.native
  def update(params: ParamsResourceResourcesBuildingsUpdate, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def update(
    params: ParamsResourceResourcesBuildingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  /**
    * Updates a building.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.buildings.update({
    *     // The id of the building to update.
    *     buildingId: 'placeholder-value',
    *     // Source from which Building.coordinates are derived.
    *     coordinatesSource: 'placeholder-value',
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "address": {},
    *       //   "buildingId": "my_buildingId",
    *       //   "buildingName": "my_buildingName",
    *       //   "coordinates": {},
    *       //   "description": "my_description",
    *       //   "etags": "my_etags",
    *       //   "floorNames": [],
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": {},
    *   //   "buildingId": "my_buildingId",
    *   //   "buildingName": "my_buildingName",
    *   //   "coordinates": {},
    *   //   "description": "my_description",
    *   //   "etags": "my_etags",
    *   //   "floorNames": [],
    *   //   "kind": "my_kind"
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
  def update(params: ParamsResourceResourcesBuildingsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceResourcesBuildingsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
