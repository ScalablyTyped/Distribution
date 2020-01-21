package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firestore/v1beta2", "firestore_v1beta2.Resource$Projects$Databases$Collectiongroups$Fields")
@js.native
class ResourceProjectsDatabasesCollectiongroupsFields protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firestore.projects.databases.collectionGroups.fields.get
    * @desc Gets the metadata and configuration for a Field.
    * @alias firestore.projects.databases.collectionGroups.fields.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta2Field] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2Field]): Unit = js.native
  def get(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta2Field] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2Field]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet,
    options: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2Field],
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2Field]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta2Field] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2Field]
  ): Unit = js.native
  /**
    * firestore.projects.databases.collectionGroups.fields.list
    * @desc Lists the field configuration and metadata for this database.
    * Currently, FirestoreAdmin.ListFields only supports listing fields that
    * have been explicitly overridden. To issue this query, call
    * FirestoreAdmin.ListFields with the filter set to
    * `indexConfig.usesAncestorConfig:false`.
    * @alias firestore.projects.databases.collectionGroups.fields.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter to apply to list results. Currently, FirestoreAdmin.ListFields only supports listing fields that have been explicitly overridden. To issue this query, call FirestoreAdmin.ListFields with the filter set to `indexConfig.usesAncestorConfig:false`.
    * @param {integer=} params.pageSize The number of results to return.
    * @param {string=} params.pageToken A page token, returned from a previous call to FirestoreAdmin.ListFields, that may be used to get the next page of results.
    * @param {string} params.parent A parent name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList,
    options: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse],
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse]
  ): Unit = js.native
  /**
    * firestore.projects.databases.collectionGroups.fields.patch
    * @desc Updates a field configuration. Currently, field updates apply only
    * to single field index configuration. However, calls to
    * FirestoreAdmin.UpdateField should provide a field mask to avoid changing
    * any configuration that the caller isn't aware of. The field mask should
    * be specified as: `{ paths: "index_config" }`.  This call returns a
    * google.longrunning.Operation which may be used to track the status of the
    * field update. The metadata for the operation will be the type
    * FieldOperationMetadata.  To configure the default field settings for the
    * database, use the special `Field` with resource name:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/x`.
    * @alias firestore.projects.databases.collectionGroups.fields.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A field name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`  A field path may be a simple field name, e.g. `address` or a path to fields within map_value , e.g. `address.city`, or a special field path. The only valid special field is `*`, which represents any field.  Field paths may be quoted using ` (backtick). The only character that needs to be escaped within a quoted field path is the backtick character itself, escaped using a backslash. Special characters in field paths that must be quoted include: `*`, `.`, ``` (backtick), `[`, `]`, as well as any ascii symbolic characters.  Examples: (Note: Comments here are written in markdown syntax, so there is an  additional layer of backticks to represent a code block) `\`address.city\`` represents a field named `address.city`, not the map key `city` in the field `address`. `\`*\`` represents a field named `*`, not any field.  A special `Field` contains the default indexing settings for all fields. This field's resource name is: `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/x` Indexes defined on this `Field` will be applied to all fields which do not have their own `Field` index configuration.
    * @param {string=} params.updateMask A mask, relative to the field. If specified, only configuration specified by this field_mask will be updated in the field.
    * @param {().GoogleFirestoreAdminV1beta2Field} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def patch(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}

