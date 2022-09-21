package typings.googleapis.connectorsV2Mod.connectorsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/connectors/v2", "connectors_v2.Resource$Projects$Locations$Connections$Entitytypes$Entities")
@js.native
open class ResourceProjectsLocationsConnectionsEntitytypesEntities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaEntity] = js.native
  def create(callback: BodyResponseCallback[SchemaEntity]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntity] = js.native
  def create(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesCreate): GaxiosPromise[SchemaEntity] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesCreate,
    callback: BodyResponseCallback[SchemaEntity]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesCreate,
    options: BodyResponseCallback[Readable | SchemaEntity],
    callback: BodyResponseCallback[Readable | SchemaEntity]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaEntity] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntity]
  ): Unit = js.native
  /**
    * Creates a new entity row of the specified entity type in the external system. The field values for creating the row are contained in the body of the request. The response message contains a `Entity` message object returned as a response by the external system.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *     await connectors.projects.locations.connections.entityTypes.entities.create(
    *       {
    *         // Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}
    *         parent:
    *           'projects/my-project/locations/my-location/connections/my-connection/entityTypes/my-entityType',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "fields": {},
    *           //   "name": "my_name"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fields": {},
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
  def create(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an existing entity row matching the entity type and entity id specified in the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *     await connectors.projects.locations.connections.entityTypes.entities.delete(
    *       {
    *         // Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}/entities/{id\}
    *         name: 'projects/my-project/locations/my-location/connections/my-connection/entityTypes/my-entityType/entities/my-entitie',
    *       }
    *     );
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
  def delete(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteEntitiesWithConditions(): GaxiosPromise[SchemaEmpty] = js.native
  def deleteEntitiesWithConditions(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteEntitiesWithConditions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteEntitiesWithConditions(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def deleteEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def deleteEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def deleteEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes entities based on conditions specified in the request and not on entity id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *     await connectors.projects.locations.connections.entityTypes.entities.deleteEntitiesWithConditions(
    *       {
    *         // Required. Conditions to be used when deleting entities. From a proto standpoint, There are no restrictions on what can be passed using this field. The connector documentation should have information about what format of filters/conditions are supported. Note: If this conditions field is left empty, an exception is thrown. We don't want to consider 'empty conditions' to be a match-all case. Connector developers can determine and document what a match-all case constraint would be.
    *         conditions: 'placeholder-value',
    *         // Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}
    *         entityType:
    *           'projects/my-project/locations/my-location/connections/my-connection/entityTypes/my-entityType',
    *       }
    *     );
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
  def deleteEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def deleteEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEntity] = js.native
  def get(callback: BodyResponseCallback[SchemaEntity]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntity] = js.native
  def get(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet): GaxiosPromise[SchemaEntity] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet,
    callback: BodyResponseCallback[SchemaEntity]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet,
    options: BodyResponseCallback[Readable | SchemaEntity],
    callback: BodyResponseCallback[Readable | SchemaEntity]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet, options: MethodOptions): GaxiosPromise[SchemaEntity] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntity]
  ): Unit = js.native
  /**
    * Gets a single entity row matching the entity type and entity id specified in the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *     await connectors.projects.locations.connections.entityTypes.entities.get({
    *       // Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}/entities/{id\}
    *       name: 'projects/my-project/locations/my-location/connections/my-connection/entityTypes/my-entityType/entities/my-entitie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fields": {},
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
  def get(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListEntitiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEntitiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEntitiesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList): GaxiosPromise[SchemaListEntitiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList,
    callback: BodyResponseCallback[SchemaListEntitiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList,
    options: BodyResponseCallback[Readable | SchemaListEntitiesResponse],
    callback: BodyResponseCallback[Readable | SchemaListEntitiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList, options: MethodOptions): GaxiosPromise[SchemaListEntitiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEntitiesResponse]
  ): Unit = js.native
  /**
    * Lists entity rows of a particular entity type contained in the request. Note: 1. Currently, only max of one 'sort_by' column is supported. 2. If no 'sort_by' column is provided, the primary key of the table is used. If zero or more than one primary key is available, we default to the unpaginated list entities logic which only returns the first page. 3. The values of the 'sort_by' columns must uniquely identify an entity row, otherwise undefined behaviors may be observed during pagination. 4. Since transactions are not supported, any updates, inserts or deletes during pagination can lead to stale data being returned or other unexpected behaviors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *     await connectors.projects.locations.connections.entityTypes.entities.list({
    *       // Conditions to be used when listing entities. From a proto standpoint, There are no restrictions on what can be passed using this field. The connector documentation should have information about what format of filters/conditions are supported.
    *       conditions: 'placeholder-value',
    *       // Number of entity rows to return. Defaults page size = 25. Max page size = 200.
    *       pageSize: 'placeholder-value',
    *       // Page token value if available from a previous request.
    *       pageToken: 'placeholder-value',
    *       // Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}
    *       parent:
    *         'projects/my-project/locations/my-location/connections/my-connection/entityTypes/my-entityType',
    *       // List of 'sort_by' columns to use when returning the results.
    *       sortBy: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entities": [],
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
  def list(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaEntity] = js.native
  def patch(callback: BodyResponseCallback[SchemaEntity]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntity] = js.native
  def patch(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch): GaxiosPromise[SchemaEntity] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch,
    callback: BodyResponseCallback[SchemaEntity]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch,
    options: BodyResponseCallback[Readable | SchemaEntity],
    callback: BodyResponseCallback[Readable | SchemaEntity]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch, options: MethodOptions): GaxiosPromise[SchemaEntity] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntity]
  ): Unit = js.native
  /**
    * Updates an existing entity row matching the entity type and entity id specified in the request. The fields in the entity row that need to be modified are contained in the body of the request. All unspecified fields are left unchanged. The response message contains a `Entity` message object returned as a response by the external system.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *     await connectors.projects.locations.connections.entityTypes.entities.patch({
    *       // Output only. Resource name of the Entity. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}/entities/{id\}
    *       name: 'projects/my-project/locations/my-location/connections/my-connection/entityTypes/my-entityType/entities/my-entitie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "fields": {},
    *         //   "name": "my_name"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fields": {},
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
  def patch(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateEntitiesWithConditions(): GaxiosPromise[SchemaUpdateEntitiesWithConditionsResponse] = js.native
  def updateEntitiesWithConditions(callback: BodyResponseCallback[SchemaUpdateEntitiesWithConditionsResponse]): Unit = js.native
  def updateEntitiesWithConditions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUpdateEntitiesWithConditionsResponse] = js.native
  def updateEntitiesWithConditions(params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions): GaxiosPromise[SchemaUpdateEntitiesWithConditionsResponse] = js.native
  def updateEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions,
    callback: BodyResponseCallback[SchemaUpdateEntitiesWithConditionsResponse]
  ): Unit = js.native
  def updateEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions,
    options: BodyResponseCallback[Readable | SchemaUpdateEntitiesWithConditionsResponse],
    callback: BodyResponseCallback[Readable | SchemaUpdateEntitiesWithConditionsResponse]
  ): Unit = js.native
  def updateEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions,
    options: MethodOptions
  ): GaxiosPromise[SchemaUpdateEntitiesWithConditionsResponse] = js.native
  def updateEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpdateEntitiesWithConditionsResponse]
  ): Unit = js.native
  /**
    * Updates entities based on conditions specified in the request and not on entity id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *     await connectors.projects.locations.connections.entityTypes.entities.updateEntitiesWithConditions(
    *       {
    *         // Required. Conditions to be used when updating entities. From a proto standpoint, There are no restrictions on what can be passed using this field. The connector documentation should have information about what format of filters/conditions are supported. Note: If this conditions field is left empty, an exception is thrown. We don't want to consider 'empty conditions' to be a match-all case. Connector developers can determine and document what a match-all case constraint would be.
    *         conditions: 'placeholder-value',
    *         // Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}
    *         entityType:
    *           'projects/my-project/locations/my-location/connections/my-connection/entityTypes/my-entityType',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "fields": {},
    *           //   "name": "my_name"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def updateEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateEntitiesWithConditions(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
