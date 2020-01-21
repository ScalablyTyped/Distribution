package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firestore/v1beta2", "firestore_v1beta2.Resource$Projects$Databases")
@js.native
class ResourceProjectsDatabases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var collectionGroups: ResourceProjectsDatabasesCollectiongroups = js.native
  var context: APIRequestContext = js.native
  /**
    * firestore.projects.databases.exportDocuments
    * @desc Exports a copy of all or a subset of documents from Google Cloud
    * Firestore to another storage system, such as Google Cloud Storage. Recent
    * updates to documents may not be reflected in the export. The export
    * occurs in the background and its progress can be monitored and managed
    * via the Operation resource that is created. The output of an export may
    * only be used once the associated operation is done. If an export
    * operation is cancelled before completion it may leave partial data behind
    * in Google Cloud Storage.
    * @alias firestore.projects.databases.exportDocuments
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Database to export. Should be of the form: `projects/{project_id}/databases/{database_id}`.
    * @param {().GoogleFirestoreAdminV1beta2ExportDocumentsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def exportDocuments(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportDocuments(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def exportDocuments(params: ParamsResourceProjectsDatabasesExportdocuments): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportDocuments(
    params: ParamsResourceProjectsDatabasesExportdocuments,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def exportDocuments(
    params: ParamsResourceProjectsDatabasesExportdocuments,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def exportDocuments(params: ParamsResourceProjectsDatabasesExportdocuments, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportDocuments(
    params: ParamsResourceProjectsDatabasesExportdocuments,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * firestore.projects.databases.importDocuments
    * @desc Imports documents into Google Cloud Firestore. Existing documents
    * with the same name are overwritten. The import occurs in the background
    * and its progress can be monitored and managed via the Operation resource
    * that is created. If an ImportDocuments operation is cancelled, it is
    * possible that a subset of the data has already been imported to Cloud
    * Firestore.
    * @alias firestore.projects.databases.importDocuments
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Database to import into. Should be of the form: `projects/{project_id}/databases/{database_id}`.
    * @param {().GoogleFirestoreAdminV1beta2ImportDocumentsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def importDocuments(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importDocuments(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def importDocuments(params: ParamsResourceProjectsDatabasesImportdocuments): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importDocuments(
    params: ParamsResourceProjectsDatabasesImportdocuments,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def importDocuments(
    params: ParamsResourceProjectsDatabasesImportdocuments,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def importDocuments(params: ParamsResourceProjectsDatabasesImportdocuments, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importDocuments(
    params: ParamsResourceProjectsDatabasesImportdocuments,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}

