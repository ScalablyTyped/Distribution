package typings.googleapis.firebasedatabaseV1betaMod

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebasedatabaseV1beta {
  
  @JSImport("googleapis/build/src/apis/firebasedatabase/v1beta", "firebasedatabase_v1beta.Firebasedatabase")
  @js.native
  open class Firebasedatabase protected () extends StObject {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    
    var context: APIRequestContext = js.native
    
    var projects: ResourceProjects = js.native
  }
  
  @JSImport("googleapis/build/src/apis/firebasedatabase/v1beta", "firebasedatabase_v1beta.Resource$Projects")
  @js.native
  open class ResourceProjects protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    var locations: ResourceProjectsLocations = js.native
  }
  
  @JSImport("googleapis/build/src/apis/firebasedatabase/v1beta", "firebasedatabase_v1beta.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    var instances: ResourceProjectsLocationsInstances = js.native
  }
  
  @JSImport("googleapis/build/src/apis/firebasedatabase/v1beta", "firebasedatabase_v1beta.Resource$Projects$Locations$Instances")
  @js.native
  open class ResourceProjectsLocationsInstances protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    def create(): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def create(callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
    def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def create(params: ParamsResourceProjectsLocationsInstancesCreate): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def create(
      params: ParamsResourceProjectsLocationsInstancesCreate,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    def create(
      params: ParamsResourceProjectsLocationsInstancesCreate,
      options: BodyResponseCallback[Readable | SchemaDatabaseInstance],
      callback: BodyResponseCallback[Readable | SchemaDatabaseInstance]
    ): Unit = js.native
    def create(params: ParamsResourceProjectsLocationsInstancesCreate, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def create(
      params: ParamsResourceProjectsLocationsInstancesCreate,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    /**
      * Requests that a new DatabaseInstance be created. The state of a successfully created DatabaseInstance is ACTIVE. Only available for projects on the Blaze plan. Projects can be upgraded using the Cloud Billing API https://cloud.google.com/billing/reference/rest/v1/projects/updateBillingInfo. Note that it might take a few minutes for billing enablement state to propagate to Firebase systems.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/firebasedatabase.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const firebasedatabase = google.firebasedatabase('v1beta');
      *
      * async function main() {
      *   const auth = new google.auth.GoogleAuth({
      *     // Scopes can be specified either as an array or as a single, space-delimited string.
      *     scopes: [
      *       'https://www.googleapis.com/auth/cloud-platform',
      *       'https://www.googleapis.com/auth/firebase',
      *     ],
      *   });
      *
      *   // Acquire an auth client, and bind it to all future calls
      *   const authClient = await auth.getClient();
      *   google.options({auth: authClient});
      *
      *   // Do the magic
      *   const res = await firebasedatabase.projects.locations.instances.create({
      *     // The globally unique identifier of the database instance.
      *     databaseId: 'placeholder-value',
      *     // The parent project for which to create a database instance, in the form: `projects/{project-number\}/locations/{location-id\}`.
      *     parent: 'projects/my-project/locations/my-location',
      *     // When set to true, the request will be validated but not submitted.
      *     validateOnly: 'placeholder-value',
      *
      *     // Request body metadata
      *     requestBody: {
      *       // request body parameters
      *       // {
      *       //   "databaseUrl": "my_databaseUrl",
      *       //   "name": "my_name",
      *       //   "project": "my_project",
      *       //   "state": "my_state",
      *       //   "type": "my_type"
      *       // }
      *     },
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "databaseUrl": "my_databaseUrl",
      *   //   "name": "my_name",
      *   //   "project": "my_project",
      *   //   "state": "my_state",
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
    def create(params: ParamsResourceProjectsLocationsInstancesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def create(
      params: ParamsResourceProjectsLocationsInstancesCreate,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def delete(): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def delete(callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
    def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def delete(params: ParamsResourceProjectsLocationsInstancesDelete): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def delete(
      params: ParamsResourceProjectsLocationsInstancesDelete,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    def delete(
      params: ParamsResourceProjectsLocationsInstancesDelete,
      options: BodyResponseCallback[Readable | SchemaDatabaseInstance],
      callback: BodyResponseCallback[Readable | SchemaDatabaseInstance]
    ): Unit = js.native
    def delete(params: ParamsResourceProjectsLocationsInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def delete(
      params: ParamsResourceProjectsLocationsInstancesDelete,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    /**
      * Marks a DatabaseInstance to be deleted. The DatabaseInstance will be set to the DELETED state for 20 days, and will be purged within 30 days. The default database cannot be deleted. IDs for deleted database instances may never be recovered or re-used. The Database may only be deleted if it is already in a DISABLED state.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/firebasedatabase.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const firebasedatabase = google.firebasedatabase('v1beta');
      *
      * async function main() {
      *   const auth = new google.auth.GoogleAuth({
      *     // Scopes can be specified either as an array or as a single, space-delimited string.
      *     scopes: [
      *       'https://www.googleapis.com/auth/cloud-platform',
      *       'https://www.googleapis.com/auth/firebase',
      *     ],
      *   });
      *
      *   // Acquire an auth client, and bind it to all future calls
      *   const authClient = await auth.getClient();
      *   google.options({auth: authClient});
      *
      *   // Do the magic
      *   const res = await firebasedatabase.projects.locations.instances.delete({
      *     // The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`
      *     name: 'projects/my-project/locations/my-location/instances/my-instance',
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "databaseUrl": "my_databaseUrl",
      *   //   "name": "my_name",
      *   //   "project": "my_project",
      *   //   "state": "my_state",
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
    def delete(params: ParamsResourceProjectsLocationsInstancesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def delete(
      params: ParamsResourceProjectsLocationsInstancesDelete,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def disable(): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def disable(callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
    def disable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def disable(params: ParamsResourceProjectsLocationsInstancesDisable): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def disable(
      params: ParamsResourceProjectsLocationsInstancesDisable,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    def disable(
      params: ParamsResourceProjectsLocationsInstancesDisable,
      options: BodyResponseCallback[Readable | SchemaDatabaseInstance],
      callback: BodyResponseCallback[Readable | SchemaDatabaseInstance]
    ): Unit = js.native
    def disable(params: ParamsResourceProjectsLocationsInstancesDisable, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def disable(
      params: ParamsResourceProjectsLocationsInstancesDisable,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    /**
      * Disables a DatabaseInstance. The database can be re-enabled later using ReenableDatabaseInstance. When a database is disabled, all reads and writes are denied, including view access in the Firebase console.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/firebasedatabase.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const firebasedatabase = google.firebasedatabase('v1beta');
      *
      * async function main() {
      *   const auth = new google.auth.GoogleAuth({
      *     // Scopes can be specified either as an array or as a single, space-delimited string.
      *     scopes: [
      *       'https://www.googleapis.com/auth/cloud-platform',
      *       'https://www.googleapis.com/auth/firebase',
      *     ],
      *   });
      *
      *   // Acquire an auth client, and bind it to all future calls
      *   const authClient = await auth.getClient();
      *   google.options({auth: authClient});
      *
      *   // Do the magic
      *   const res = await firebasedatabase.projects.locations.instances.disable({
      *     // The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`
      *     name: 'projects/my-project/locations/my-location/instances/my-instance',
      *
      *     // Request body metadata
      *     requestBody: {
      *       // request body parameters
      *       // {}
      *     },
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "databaseUrl": "my_databaseUrl",
      *   //   "name": "my_name",
      *   //   "project": "my_project",
      *   //   "state": "my_state",
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
    def disable(params: ParamsResourceProjectsLocationsInstancesDisable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def disable(
      params: ParamsResourceProjectsLocationsInstancesDisable,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def get(): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def get(callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
    def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def get(params: ParamsResourceProjectsLocationsInstancesGet): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def get(
      params: ParamsResourceProjectsLocationsInstancesGet,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    def get(
      params: ParamsResourceProjectsLocationsInstancesGet,
      options: BodyResponseCallback[Readable | SchemaDatabaseInstance],
      callback: BodyResponseCallback[Readable | SchemaDatabaseInstance]
    ): Unit = js.native
    def get(params: ParamsResourceProjectsLocationsInstancesGet, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def get(
      params: ParamsResourceProjectsLocationsInstancesGet,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    /**
      * Gets the DatabaseInstance identified by the specified resource name.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/firebasedatabase.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const firebasedatabase = google.firebasedatabase('v1beta');
      *
      * async function main() {
      *   const auth = new google.auth.GoogleAuth({
      *     // Scopes can be specified either as an array or as a single, space-delimited string.
      *     scopes: [
      *       'https://www.googleapis.com/auth/cloud-platform',
      *       'https://www.googleapis.com/auth/cloud-platform.read-only',
      *       'https://www.googleapis.com/auth/firebase',
      *       'https://www.googleapis.com/auth/firebase.readonly',
      *     ],
      *   });
      *
      *   // Acquire an auth client, and bind it to all future calls
      *   const authClient = await auth.getClient();
      *   google.options({auth: authClient});
      *
      *   // Do the magic
      *   const res = await firebasedatabase.projects.locations.instances.get({
      *     // The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`. `database-id` is a globally unique identifier across all parent collections. For convenience, this method allows you to supply `-` as a wildcard character in place of specific collections under `projects` and `locations`. The resulting wildcarding form of the method is: `projects/-/locations/-/instances/{database-id\}`.
      *     name: 'projects/my-project/locations/my-location/instances/my-instance',
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "databaseUrl": "my_databaseUrl",
      *   //   "name": "my_name",
      *   //   "project": "my_project",
      *   //   "state": "my_state",
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
    def get(params: ParamsResourceProjectsLocationsInstancesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def get(
      params: ParamsResourceProjectsLocationsInstancesGet,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def list(): GaxiosPromise[SchemaListDatabaseInstancesResponse] = js.native
    def list(callback: BodyResponseCallback[SchemaListDatabaseInstancesResponse]): Unit = js.native
    def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDatabaseInstancesResponse] = js.native
    def list(params: ParamsResourceProjectsLocationsInstancesList): GaxiosPromise[SchemaListDatabaseInstancesResponse] = js.native
    def list(
      params: ParamsResourceProjectsLocationsInstancesList,
      callback: BodyResponseCallback[SchemaListDatabaseInstancesResponse]
    ): Unit = js.native
    def list(
      params: ParamsResourceProjectsLocationsInstancesList,
      options: BodyResponseCallback[Readable | SchemaListDatabaseInstancesResponse],
      callback: BodyResponseCallback[Readable | SchemaListDatabaseInstancesResponse]
    ): Unit = js.native
    def list(params: ParamsResourceProjectsLocationsInstancesList, options: MethodOptions): GaxiosPromise[SchemaListDatabaseInstancesResponse] = js.native
    def list(
      params: ParamsResourceProjectsLocationsInstancesList,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaListDatabaseInstancesResponse]
    ): Unit = js.native
    /**
      * Lists each DatabaseInstance associated with the specified parent project. The list items are returned in no particular order, but will be a consistent view of the database instances when additional requests are made with a `pageToken`. The resulting list contains instances in any STATE. The list results may be stale by a few seconds. Use GetDatabaseInstance for consistent reads.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/firebasedatabase.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const firebasedatabase = google.firebasedatabase('v1beta');
      *
      * async function main() {
      *   const auth = new google.auth.GoogleAuth({
      *     // Scopes can be specified either as an array or as a single, space-delimited string.
      *     scopes: [
      *       'https://www.googleapis.com/auth/cloud-platform',
      *       'https://www.googleapis.com/auth/cloud-platform.read-only',
      *       'https://www.googleapis.com/auth/firebase',
      *       'https://www.googleapis.com/auth/firebase.readonly',
      *     ],
      *   });
      *
      *   // Acquire an auth client, and bind it to all future calls
      *   const authClient = await auth.getClient();
      *   google.options({auth: authClient});
      *
      *   // Do the magic
      *   const res = await firebasedatabase.projects.locations.instances.list({
      *     // The maximum number of database instances to return in the response. The server may return fewer than this at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit.
      *     pageSize: 'placeholder-value',
      *     // Token returned from a previous call to `ListDatabaseInstances` indicating where in the set of database instances to resume listing.
      *     pageToken: 'placeholder-value',
      *     // The parent project for which to list database instances, in the form: `projects/{project-number\}/locations/{location-id\}` To list across all locations, use a parent in the form: `projects/{project-number\}/locations/-`
      *     parent: 'projects/my-project/locations/my-location',
      *     // Indicate that DatabaseInstances in the `DELETED` state should also be returned.
      *     showDeleted: 'placeholder-value',
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "instances": [],
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
    def list(params: ParamsResourceProjectsLocationsInstancesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def list(
      params: ParamsResourceProjectsLocationsInstancesList,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def reenable(): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def reenable(callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
    def reenable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def reenable(params: ParamsResourceProjectsLocationsInstancesReenable): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def reenable(
      params: ParamsResourceProjectsLocationsInstancesReenable,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    def reenable(
      params: ParamsResourceProjectsLocationsInstancesReenable,
      options: BodyResponseCallback[Readable | SchemaDatabaseInstance],
      callback: BodyResponseCallback[Readable | SchemaDatabaseInstance]
    ): Unit = js.native
    def reenable(params: ParamsResourceProjectsLocationsInstancesReenable, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def reenable(
      params: ParamsResourceProjectsLocationsInstancesReenable,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    /**
      * Enables a DatabaseInstance. The database must have been disabled previously using DisableDatabaseInstance. The state of a successfully reenabled DatabaseInstance is ACTIVE.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/firebasedatabase.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const firebasedatabase = google.firebasedatabase('v1beta');
      *
      * async function main() {
      *   const auth = new google.auth.GoogleAuth({
      *     // Scopes can be specified either as an array or as a single, space-delimited string.
      *     scopes: [
      *       'https://www.googleapis.com/auth/cloud-platform',
      *       'https://www.googleapis.com/auth/firebase',
      *     ],
      *   });
      *
      *   // Acquire an auth client, and bind it to all future calls
      *   const authClient = await auth.getClient();
      *   google.options({auth: authClient});
      *
      *   // Do the magic
      *   const res = await firebasedatabase.projects.locations.instances.reenable({
      *     // The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`
      *     name: 'projects/my-project/locations/my-location/instances/my-instance',
      *
      *     // Request body metadata
      *     requestBody: {
      *       // request body parameters
      *       // {}
      *     },
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "databaseUrl": "my_databaseUrl",
      *   //   "name": "my_name",
      *   //   "project": "my_project",
      *   //   "state": "my_state",
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
    def reenable(params: ParamsResourceProjectsLocationsInstancesReenable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def reenable(
      params: ParamsResourceProjectsLocationsInstancesReenable,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def undelete(): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def undelete(callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
    def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def undelete(params: ParamsResourceProjectsLocationsInstancesUndelete): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def undelete(
      params: ParamsResourceProjectsLocationsInstancesUndelete,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    def undelete(
      params: ParamsResourceProjectsLocationsInstancesUndelete,
      options: BodyResponseCallback[Readable | SchemaDatabaseInstance],
      callback: BodyResponseCallback[Readable | SchemaDatabaseInstance]
    ): Unit = js.native
    def undelete(params: ParamsResourceProjectsLocationsInstancesUndelete, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
    def undelete(
      params: ParamsResourceProjectsLocationsInstancesUndelete,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaDatabaseInstance]
    ): Unit = js.native
    /**
      * Restores a DatabaseInstance that was previously marked to be deleted. After the delete method is used, DatabaseInstances are set to the DELETED state for 20 days, and will be purged within 30 days. Databases in the DELETED state can be undeleted without losing any data. This method may only be used on a DatabaseInstance in the DELETED state. Purged DatabaseInstances may not be recovered.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/firebasedatabase.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const firebasedatabase = google.firebasedatabase('v1beta');
      *
      * async function main() {
      *   const auth = new google.auth.GoogleAuth({
      *     // Scopes can be specified either as an array or as a single, space-delimited string.
      *     scopes: [
      *       'https://www.googleapis.com/auth/cloud-platform',
      *       'https://www.googleapis.com/auth/firebase',
      *     ],
      *   });
      *
      *   // Acquire an auth client, and bind it to all future calls
      *   const authClient = await auth.getClient();
      *   google.options({auth: authClient});
      *
      *   // Do the magic
      *   const res = await firebasedatabase.projects.locations.instances.undelete({
      *     // The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`
      *     name: 'projects/my-project/locations/my-location/instances/my-instance',
      *
      *     // Request body metadata
      *     requestBody: {
      *       // request body parameters
      *       // {}
      *     },
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "databaseUrl": "my_databaseUrl",
      *   //   "name": "my_name",
      *   //   "project": "my_project",
      *   //   "state": "my_state",
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
    def undelete(params: ParamsResourceProjectsLocationsInstancesUndelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def undelete(
      params: ParamsResourceProjectsLocationsInstancesUndelete,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
  }
  
  trait Options
    extends StObject
       with GlobalOptions {
    
    var version: v1beta
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal(version = "v1beta")
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setVersion(value: v1beta): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParamsResourceProjectsLocationsInstancesCreate
    extends StObject
       with StandardParameters {
    
    /**
      * The globally unique identifier of the database instance.
      */
    var databaseId: js.UndefOr[String] = js.undefined
    
    /**
      * The parent project for which to create a database instance, in the form: `projects/{project-number\}/locations/{location-id\}`.
      */
    var parent: js.UndefOr[String] = js.undefined
    
    /**
      * Request body metadata
      */
    var requestBody: js.UndefOr[SchemaDatabaseInstance] = js.undefined
    
    /**
      * When set to true, the request will be validated but not submitted.
      */
    var validateOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ParamsResourceProjectsLocationsInstancesCreate {
    
    inline def apply(): ParamsResourceProjectsLocationsInstancesCreate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesCreate]
    }
    
    extension [Self <: ParamsResourceProjectsLocationsInstancesCreate](x: Self) {
      
      inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
      
      inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRequestBody(value: SchemaDatabaseInstance): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      
      inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
      
      inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    }
  }
  
  trait ParamsResourceProjectsLocationsInstancesDelete
    extends StObject
       with StandardParameters {
    
    /**
      * The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object ParamsResourceProjectsLocationsInstancesDelete {
    
    inline def apply(): ParamsResourceProjectsLocationsInstancesDelete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesDelete]
    }
    
    extension [Self <: ParamsResourceProjectsLocationsInstancesDelete](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ParamsResourceProjectsLocationsInstancesDisable
    extends StObject
       with StandardParameters {
    
    /**
      * The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Request body metadata
      */
    var requestBody: js.UndefOr[SchemaDisableDatabaseInstanceRequest] = js.undefined
  }
  object ParamsResourceProjectsLocationsInstancesDisable {
    
    inline def apply(): ParamsResourceProjectsLocationsInstancesDisable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesDisable]
    }
    
    extension [Self <: ParamsResourceProjectsLocationsInstancesDisable](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequestBody(value: SchemaDisableDatabaseInstanceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    }
  }
  
  trait ParamsResourceProjectsLocationsInstancesGet
    extends StObject
       with StandardParameters {
    
    /**
      * The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`. `database-id` is a globally unique identifier across all parent collections. For convenience, this method allows you to supply `-` as a wildcard character in place of specific collections under `projects` and `locations`. The resulting wildcarding form of the method is: `projects/-/locations/-/instances/{database-id\}`.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object ParamsResourceProjectsLocationsInstancesGet {
    
    inline def apply(): ParamsResourceProjectsLocationsInstancesGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesGet]
    }
    
    extension [Self <: ParamsResourceProjectsLocationsInstancesGet](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ParamsResourceProjectsLocationsInstancesList
    extends StObject
       with StandardParameters {
    
    /**
      * The maximum number of database instances to return in the response. The server may return fewer than this at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit.
      */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Token returned from a previous call to `ListDatabaseInstances` indicating where in the set of database instances to resume listing.
      */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /**
      * The parent project for which to list database instances, in the form: `projects/{project-number\}/locations/{location-id\}` To list across all locations, use a parent in the form: `projects/{project-number\}/locations/-`
      */
    var parent: js.UndefOr[String] = js.undefined
    
    /**
      * Indicate that DatabaseInstances in the `DELETED` state should also be returned.
      */
    var showDeleted: js.UndefOr[Boolean] = js.undefined
  }
  object ParamsResourceProjectsLocationsInstancesList {
    
    inline def apply(): ParamsResourceProjectsLocationsInstancesList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesList]
    }
    
    extension [Self <: ParamsResourceProjectsLocationsInstancesList](x: Self) {
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
      
      inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    }
  }
  
  trait ParamsResourceProjectsLocationsInstancesReenable
    extends StObject
       with StandardParameters {
    
    /**
      * The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Request body metadata
      */
    var requestBody: js.UndefOr[SchemaReenableDatabaseInstanceRequest] = js.undefined
  }
  object ParamsResourceProjectsLocationsInstancesReenable {
    
    inline def apply(): ParamsResourceProjectsLocationsInstancesReenable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesReenable]
    }
    
    extension [Self <: ParamsResourceProjectsLocationsInstancesReenable](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequestBody(value: SchemaReenableDatabaseInstanceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    }
  }
  
  trait ParamsResourceProjectsLocationsInstancesUndelete
    extends StObject
       with StandardParameters {
    
    /**
      * The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Request body metadata
      */
    var requestBody: js.UndefOr[SchemaUndeleteDatabaseInstanceRequest] = js.undefined
  }
  object ParamsResourceProjectsLocationsInstancesUndelete {
    
    inline def apply(): ParamsResourceProjectsLocationsInstancesUndelete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesUndelete]
    }
    
    extension [Self <: ParamsResourceProjectsLocationsInstancesUndelete](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequestBody(value: SchemaUndeleteDatabaseInstanceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    }
  }
  
  trait SchemaDatabaseInstance extends StObject {
    
    /**
      * Output only. Output Only. The globally unique hostname of the database.
      */
    var databaseUrl: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The fully qualified resource name of the database instance, in the form: `projects/{project-number\}/locations/{location-id\}/instances/{database-id\}`.
      */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Output only. The resource name of the project this instance belongs to. For example: `projects/{project-number\}`.
      */
    var project: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Output only. The database's lifecycle state. Read-only.
      */
    var state: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Immutable. The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
      */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object SchemaDatabaseInstance {
    
    inline def apply(): SchemaDatabaseInstance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaDatabaseInstance]
    }
    
    extension [Self <: SchemaDatabaseInstance](x: Self) {
      
      inline def setDatabaseUrl(value: String): Self = StObject.set(x, "databaseUrl", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUrlNull: Self = StObject.set(x, "databaseUrl", null)
      
      inline def setDatabaseUrlUndefined: Self = StObject.set(x, "databaseUrl", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectNull: Self = StObject.set(x, "project", null)
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SchemaDisableDatabaseInstanceRequest extends StObject
  
  trait SchemaListDatabaseInstancesResponse extends StObject {
    
    /**
      * List of each DatabaseInstance that is in the parent Firebase project.
      */
    var instances: js.UndefOr[js.Array[SchemaDatabaseInstance]] = js.undefined
    
    /**
      * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results. This token can be used in a subsequent call to `ListDatabaseInstances` to find the next group of database instances. Page tokens are short-lived and should not be persisted.
      */
    var nextPageToken: js.UndefOr[String | Null] = js.undefined
  }
  object SchemaListDatabaseInstancesResponse {
    
    inline def apply(): SchemaListDatabaseInstancesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaListDatabaseInstancesResponse]
    }
    
    extension [Self <: SchemaListDatabaseInstancesResponse](x: Self) {
      
      inline def setInstances(value: js.Array[SchemaDatabaseInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
      
      inline def setInstancesVarargs(value: SchemaDatabaseInstance*): Self = StObject.set(x, "instances", js.Array(value*))
      
      inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
      
      inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    }
  }
  
  trait SchemaReenableDatabaseInstanceRequest extends StObject
  
  trait SchemaUndeleteDatabaseInstanceRequest extends StObject
  
  trait StandardParameters extends StObject {
    
    /**
      * V1 error format.
      */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /**
      * OAuth access token.
      */
    var access_token: js.UndefOr[String] = js.undefined
    
    /**
      * Data format for response.
      */
    var alt: js.UndefOr[String] = js.undefined
    
    /**
      * Auth client or API Key for the request
      */
    var auth: js.UndefOr[
        String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
      ] = js.undefined
    
    /**
      * JSONP
      */
    var callback: js.UndefOr[String] = js.undefined
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * OAuth 2.0 token for the current user.
      */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /**
      * Returns response with indentations and line breaks.
      */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
      */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /**
      * Legacy upload protocol for media (e.g. "media", "multipart").
      */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /**
      * Upload protocol for media (e.g. "raw", "multipart").
      */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object StandardParameters {
    
    inline def apply(): StandardParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardParameters]
    }
    
    extension [Self <: StandardParameters](x: Self) {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAuth(
        value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
      ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
}
