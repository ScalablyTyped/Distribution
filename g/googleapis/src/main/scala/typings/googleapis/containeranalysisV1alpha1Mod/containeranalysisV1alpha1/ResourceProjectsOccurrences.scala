package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Occurrences")
@js.native
class ResourceProjectsOccurrences protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * containeranalysis.projects.occurrences.create
    * @desc Creates a new `Occurrence`. Use this method to create `Occurrences`
    * for a resource.
    * @alias containeranalysis.projects.occurrences.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.name The name of the project.  Should be of the form "projects/{project_id}". @Deprecated
    * @param {string} params.parent This field contains the project Id for example: "projects/{project_id}"
    * @param {().Occurrence} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOccurrence] = js.native
  def create(callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def create(params: ParamsResourceProjectsOccurrencesCreate): GaxiosPromise[SchemaOccurrence] = js.native
  def create(params: ParamsResourceProjectsOccurrencesCreate, callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def create(
    params: ParamsResourceProjectsOccurrencesCreate,
    options: BodyResponseCallback[SchemaOccurrence],
    callback: BodyResponseCallback[SchemaOccurrence]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsOccurrencesCreate, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def create(
    params: ParamsResourceProjectsOccurrencesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOccurrence]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.delete
    * @desc Deletes the given `Occurrence` from the system. Use this when an
    * `Occurrence` is no longer applicable for the given resource.
    * @alias containeranalysis.projects.occurrences.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsOccurrencesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsOccurrencesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsOccurrencesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsOccurrencesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsOccurrencesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.get
    * @desc Returns the requested `Occurrence`.
    * @alias containeranalysis.projects.occurrences.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence of the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOccurrence] = js.native
  def get(callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def get(params: ParamsResourceProjectsOccurrencesGet): GaxiosPromise[SchemaOccurrence] = js.native
  def get(params: ParamsResourceProjectsOccurrencesGet, callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def get(
    params: ParamsResourceProjectsOccurrencesGet,
    options: BodyResponseCallback[SchemaOccurrence],
    callback: BodyResponseCallback[SchemaOccurrence]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsOccurrencesGet, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def get(
    params: ParamsResourceProjectsOccurrencesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOccurrence]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.getIamPolicy
    * @desc Gets the access control policy for a note or an `Occurrence`
    * resource. Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or occurrence, respectively. Attempting to call this method on
    * a resource without the required permission will result in a
    * `PERMISSION_DENIED` error. Attempting to call this method on a
    * non-existent resource will result in a `NOT_FOUND` error if the user has
    * list permission on the project, or a `PERMISSION_DENIED` error otherwise.
    * The resource takes the following formats:
    * `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for occurrences and
    * projects/{PROJECT_ID}/notes/{NOTE_ID} for notes
    * @alias containeranalysis.projects.occurrences.getIamPolicy
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
  def getIamPolicy(params: ParamsResourceProjectsOccurrencesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsOccurrencesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsOccurrencesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsOccurrencesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsOccurrencesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.getNotes
    * @desc Gets the `Note` attached to the given `Occurrence`.
    * @alias containeranalysis.projects.occurrences.getNotes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getNotes(): GaxiosPromise[SchemaNote] = js.native
  def getNotes(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def getNotes(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def getNotes(params: ParamsResourceProjectsOccurrencesGetnotes): GaxiosPromise[SchemaNote] = js.native
  def getNotes(params: ParamsResourceProjectsOccurrencesGetnotes, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def getNotes(
    params: ParamsResourceProjectsOccurrencesGetnotes,
    options: BodyResponseCallback[SchemaNote],
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  def getNotes(params: ParamsResourceProjectsOccurrencesGetnotes, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def getNotes(
    params: ParamsResourceProjectsOccurrencesGetnotes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.getVulnerabilitySummary
    * @desc Gets a summary of the number and severity of occurrences.
    * @alias containeranalysis.projects.occurrences.getVulnerabilitySummary
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {string} params.parent This contains the project Id for example: projects/{project_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getVulnerabilitySummary(): GaxiosPromise[SchemaGetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(callback: BodyResponseCallback[SchemaGetVulnzOccurrencesSummaryResponse]): Unit = js.native
  def getVulnerabilitySummary(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary): GaxiosPromise[SchemaGetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    callback: BodyResponseCallback[SchemaGetVulnzOccurrencesSummaryResponse]
  ): Unit = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    options: BodyResponseCallback[SchemaGetVulnzOccurrencesSummaryResponse],
    callback: BodyResponseCallback[SchemaGetVulnzOccurrencesSummaryResponse]
  ): Unit = js.native
  def getVulnerabilitySummary(params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary, options: MethodOptions): GaxiosPromise[SchemaGetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetVulnzOccurrencesSummaryResponse]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.list
    * @desc Lists active `Occurrences` for a given project matching the
    * filters.
    * @alias containeranalysis.projects.occurrences.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {string=} params.kind The kind of occurrences to filter on.
    * @param {string=} params.name The name field contains the project Id. For example: "projects/{project_id} @Deprecated
    * @param {integer=} params.pageSize Number of occurrences to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.parent This contains the project Id for example: projects/{project_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOccurrencesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
  def list(params: ParamsResourceProjectsOccurrencesList): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
  def list(
    params: ParamsResourceProjectsOccurrencesList,
    callback: BodyResponseCallback[SchemaListOccurrencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsOccurrencesList,
    options: BodyResponseCallback[SchemaListOccurrencesResponse],
    callback: BodyResponseCallback[SchemaListOccurrencesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsOccurrencesList, options: MethodOptions): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
  def list(
    params: ParamsResourceProjectsOccurrencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOccurrencesResponse]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.patch
    * @desc Updates an existing occurrence.
    * @alias containeranalysis.projects.occurrences.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence. Should be of the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}".
    * @param {string=} params.updateMask The fields to update.
    * @param {().Occurrence} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOccurrence] = js.native
  def patch(callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def patch(params: ParamsResourceProjectsOccurrencesPatch): GaxiosPromise[SchemaOccurrence] = js.native
  def patch(params: ParamsResourceProjectsOccurrencesPatch, callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsOccurrencesPatch,
    options: BodyResponseCallback[SchemaOccurrence],
    callback: BodyResponseCallback[SchemaOccurrence]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsOccurrencesPatch, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def patch(
    params: ParamsResourceProjectsOccurrencesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOccurrence]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.setIamPolicy
    * @desc Sets the access control policy on the specified `Note` or
    * `Occurrence`. Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a `Note` or an `Occurrence`, respectively. Attempting to call this
    * method without these permissions will result in a ` `PERMISSION_DENIED`
    * error. Attempting to call this method on a non-existent resource will
    * result in a `NOT_FOUND` error if the user has
    * `containeranalysis.notes.list` permission on a `Note` or
    * `containeranalysis.occurrences.list` on an `Occurrence`, or a
    * `PERMISSION_DENIED` error otherwise. The resource takes the following
    * formats: `projects/{projectid}/occurrences/{occurrenceid}` for
    * occurrences and projects/{projectid}/notes/{noteid} for notes
    * @alias containeranalysis.projects.occurrences.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsOccurrencesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsOccurrencesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsOccurrencesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsOccurrencesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsOccurrencesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.testIamPermissions
    * @desc Returns the permissions that a caller has on the specified note or
    * occurrence resource. Requires list permission on the project (for
    * example, "storage.objects.list" on the containing bucket for testing
    * permission of an object). Attempting to call this method on a
    * non-existent resource will result in a `NOT_FOUND` error if the user has
    * list permission on the project, or a `PERMISSION_DENIED` error otherwise.
    * The resource takes the following formats:
    * `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for `Occurrences` and
    * `projects/{PROJECT_ID}/notes/{NOTE_ID}` for `Notes`
    * @alias containeranalysis.projects.occurrences.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsOccurrencesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsOccurrencesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsOccurrencesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsOccurrencesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsOccurrencesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
