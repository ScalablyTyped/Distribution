package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firestore/v1beta2", "firestore_v1beta2.Resource$Projects$Databases")
@js.native
open class ResourceProjectsDatabases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var collectionGroups: ResourceProjectsDatabasesCollectiongroups = js.native
  
  var context: APIRequestContext = js.native
  
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
    * Exports a copy of all or a subset of documents from Google Cloud Firestore to another storage system, such as Google Cloud Storage. Recent updates to documents may not be reflected in the export. The export occurs in the background and its progress can be monitored and managed via the Operation resource that is created. The output of an export may only be used once the associated operation is done. If an export operation is cancelled before completion it may leave partial data behind in Google Cloud Storage.
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
    * const firestore = google.firestore('v1beta2');
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
    *     // Database to export. Should be of the form: `projects/{project_id\}/databases/{database_id\}`.
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
    * const firestore = google.firestore('v1beta2');
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
    *     // Database to import into. Should be of the form: `projects/{project_id\}/databases/{database_id\}`.
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
}
