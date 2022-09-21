package typings.googleapis.firestoreV1Mod.firestoreV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firestore/v1", "firestore_v1.Resource$Projects$Databases")
@js.native
open class ResourceProjectsDatabases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var collectionGroups: ResourceProjectsDatabasesCollectiongroups = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsDatabasesCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsDatabasesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDatabasesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Create a database.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.create({
    *     // Required. The ID to use for the database, which will become the final component of the database's resource name. This value should be 4-63 characters. Valid characters are /a-z-/ with first character a letter and the last a letter or a number. Must not be UUID-like /[0-9a-f]{8\}(-[0-9a-f]{4\}){3\}-[0-9a-f]{12\}/. "(default)" database id is also valid.
    *     databaseId: 'placeholder-value',
    *     // Required. A parent name of the form `projects/{project_id\}`
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appEngineIntegrationMode": "my_appEngineIntegrationMode",
    *       //   "concurrencyMode": "my_concurrencyMode",
    *       //   "etag": "my_etag",
    *       //   "keyPrefix": "my_keyPrefix",
    *       //   "locationId": "my_locationId",
    *       //   "name": "my_name",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
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
  def create(params: ParamsResourceProjectsDatabasesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var documents: ResourceProjectsDatabasesDocuments = js.native
  
  def exportDocuments(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportDocuments(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def exportDocuments(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportDocuments(params: ParamsResourceProjectsDatabasesExportdocuments): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportDocuments(
    params: ParamsResourceProjectsDatabasesExportdocuments,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def exportDocuments(
    params: ParamsResourceProjectsDatabasesExportdocuments,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def exportDocuments(params: ParamsResourceProjectsDatabasesExportdocuments, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportDocuments(
    params: ParamsResourceProjectsDatabasesExportdocuments,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Exports a copy of all or a subset of documents from Google Cloud Firestore to another storage system, such as Google Cloud Storage. Recent updates to documents may not be reflected in the export. The export occurs in the background and its progress can be monitored and managed via the Operation resource that is created. The output of an export may only be used once the associated operation is done. If an export operation is cancelled before completion it may leave partial data behind in Google Cloud Storage. For more details on export behavior and output format, refer to: https://cloud.google.com/firestore/docs/manage-data/export-import
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.exportDocuments({
    *     // Required. Database to export. Should be of the form: `projects/{project_id\}/databases/{database_id\}`.
    *     name: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "collectionIds": [],
    *       //   "outputUriPrefix": "my_outputUriPrefix"
    *       // }
    *     },
    *   });
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
  def exportDocuments(params: ParamsResourceProjectsDatabasesExportdocuments, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exportDocuments(
    params: ParamsResourceProjectsDatabasesExportdocuments,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirestoreAdminV1Database] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Database]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1Database] = js.native
  def get(params: ParamsResourceProjectsDatabasesGet): GaxiosPromise[SchemaGoogleFirestoreAdminV1Database] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesGet,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Database]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatabasesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1Database],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1Database]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatabasesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1Database] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Database]
  ): Unit = js.native
  /**
    * Gets information about a database.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.get({
    *     // Required. A name of the form `projects/{project_id\}/databases/{database_id\}`
    *     name: 'projects/my-project/databases/my-database',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appEngineIntegrationMode": "my_appEngineIntegrationMode",
    *   //   "concurrencyMode": "my_concurrencyMode",
    *   //   "etag": "my_etag",
    *   //   "keyPrefix": "my_keyPrefix",
    *   //   "locationId": "my_locationId",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceProjectsDatabasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def importDocuments(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importDocuments(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def importDocuments(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importDocuments(params: ParamsResourceProjectsDatabasesImportdocuments): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importDocuments(
    params: ParamsResourceProjectsDatabasesImportdocuments,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def importDocuments(
    params: ParamsResourceProjectsDatabasesImportdocuments,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def importDocuments(params: ParamsResourceProjectsDatabasesImportdocuments, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importDocuments(
    params: ParamsResourceProjectsDatabasesImportdocuments,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Imports documents into Google Cloud Firestore. Existing documents with the same name are overwritten. The import occurs in the background and its progress can be monitored and managed via the Operation resource that is created. If an ImportDocuments operation is cancelled, it is possible that a subset of the data has already been imported to Cloud Firestore.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.importDocuments({
    *     // Required. Database to import into. Should be of the form: `projects/{project_id\}/databases/{database_id\}`.
    *     name: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "collectionIds": [],
    *       //   "inputUriPrefix": "my_inputUriPrefix"
    *       // }
    *     },
    *   });
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
  def importDocuments(params: ParamsResourceProjectsDatabasesImportdocuments, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def importDocuments(
    params: ParamsResourceProjectsDatabasesImportdocuments,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListDatabasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListDatabasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListDatabasesResponse] = js.native
  def list(params: ParamsResourceProjectsDatabasesList): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListDatabasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesList,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListDatabasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatabasesList,
    options: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1ListDatabasesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1ListDatabasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatabasesList, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListDatabasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListDatabasesResponse]
  ): Unit = js.native
  /**
    * List all the databases in the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.list({
    *     // Required. A parent name of the form `projects/{project_id\}`
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "databases": []
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
  def list(params: ParamsResourceProjectsDatabasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsDatabasesOperations = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(params: ParamsResourceProjectsDatabasesPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsDatabasesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates a database.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.patch({
    *     // The resource name of the Database. Format: `projects/{project\}/databases/{database\}`
    *     name: 'projects/my-project/databases/my-database',
    *     // The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appEngineIntegrationMode": "my_appEngineIntegrationMode",
    *       //   "concurrencyMode": "my_concurrencyMode",
    *       //   "etag": "my_etag",
    *       //   "keyPrefix": "my_keyPrefix",
    *       //   "locationId": "my_locationId",
    *       //   "name": "my_name",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
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
  def patch(params: ParamsResourceProjectsDatabasesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
