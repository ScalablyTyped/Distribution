package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/containeranalysis/v1beta1", "containeranalysis_v1beta1.Resource$Projects$Notes")
@js.native
class ResourceProjectsNotes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * containeranalysis.projects.notes.batchCreate
    * @desc Creates new notes in batch.
    * @alias containeranalysis.projects.notes.batchCreate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the project in the form of `projects/[PROJECT_ID]`, under which the notes are to be created.
    * @param {().BatchCreateNotesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchCreate(): GaxiosPromise[SchemaBatchCreateNotesResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaBatchCreateNotesResponse]): Unit = js.native
  def batchCreate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBatchCreateNotesResponse] = js.native
  def batchCreate(params: ParamsResourceProjectsNotesBatchcreate): GaxiosPromise[SchemaBatchCreateNotesResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsNotesBatchcreate,
    callback: BodyResponseCallback[SchemaBatchCreateNotesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsNotesBatchcreate,
    options: BodyResponseCallback[SchemaBatchCreateNotesResponse],
    callback: BodyResponseCallback[SchemaBatchCreateNotesResponse]
  ): Unit = js.native
  def batchCreate(params: ParamsResourceProjectsNotesBatchcreate, options: MethodOptions): GaxiosPromise[SchemaBatchCreateNotesResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsNotesBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchCreateNotesResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * containeranalysis.projects.notes.create
    * @desc Creates a new note.
    * @alias containeranalysis.projects.notes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.noteId The ID to use for this note.
    * @param {string} params.parent The name of the project in the form of `projects/[PROJECT_ID]`, under which the note is to be created.
    * @param {().Note} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaNote] = js.native
  def create(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def create(params: ParamsResourceProjectsNotesCreate): GaxiosPromise[SchemaNote] = js.native
  def create(params: ParamsResourceProjectsNotesCreate, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def create(
    params: ParamsResourceProjectsNotesCreate,
    options: BodyResponseCallback[SchemaNote],
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsNotesCreate, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def create(
    params: ParamsResourceProjectsNotesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.notes.delete
    * @desc Deletes the specified note.
    * @alias containeranalysis.projects.notes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsNotesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsNotesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsNotesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsNotesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsNotesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.notes.get
    * @desc Gets the specified note.
    * @alias containeranalysis.projects.notes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNote] = js.native
  def get(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def get(params: ParamsResourceProjectsNotesGet): GaxiosPromise[SchemaNote] = js.native
  def get(params: ParamsResourceProjectsNotesGet, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def get(
    params: ParamsResourceProjectsNotesGet,
    options: BodyResponseCallback[SchemaNote],
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsNotesGet, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def get(
    params: ParamsResourceProjectsNotesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.notes.getIamPolicy
    * @desc Gets the access control policy for a note or an occurrence
    * resource. Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or occurrence, respectively.  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    * @alias containeranalysis.projects.notes.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsNotesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsNotesGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsNotesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsNotesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsNotesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.notes.list
    * @desc Lists notes for the specified project.
    * @alias containeranalysis.projects.notes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {integer=} params.pageSize Number of notes to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.parent The name of the project to list notes for in the form of `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListNotesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNotesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListNotesResponse] = js.native
  def list(params: ParamsResourceProjectsNotesList): GaxiosPromise[SchemaListNotesResponse] = js.native
  def list(params: ParamsResourceProjectsNotesList, callback: BodyResponseCallback[SchemaListNotesResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsNotesList,
    options: BodyResponseCallback[SchemaListNotesResponse],
    callback: BodyResponseCallback[SchemaListNotesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsNotesList, options: MethodOptions): GaxiosPromise[SchemaListNotesResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNotesResponse]
  ): Unit = js.native
  
  var occurrences: ResourceProjectsNotesOccurrences = js.native
  
  /**
    * containeranalysis.projects.notes.patch
    * @desc Updates the specified note.
    * @alias containeranalysis.projects.notes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    * @param {string=} params.updateMask The fields to update.
    * @param {().Note} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaNote] = js.native
  def patch(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def patch(params: ParamsResourceProjectsNotesPatch): GaxiosPromise[SchemaNote] = js.native
  def patch(params: ParamsResourceProjectsNotesPatch, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsNotesPatch,
    options: BodyResponseCallback[SchemaNote],
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsNotesPatch, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def patch(
    params: ParamsResourceProjectsNotesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.notes.setIamPolicy
    * @desc Sets the access control policy on the specified note or occurrence.
    * Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or an occurrence, respectively.  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    * @alias containeranalysis.projects.notes.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsNotesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsNotesSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsNotesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsNotesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsNotesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.notes.testIamPermissions
    * @desc Returns the permissions that a caller has on the specified note or
    * occurrence. Requires list permission on the project (for example,
    * `containeranalysis.notes.list`).  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    * @alias containeranalysis.projects.notes.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsNotesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsNotesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsNotesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsNotesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsNotesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
