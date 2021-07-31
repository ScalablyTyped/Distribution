package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/containeranalysis/v1beta1", "containeranalysis_v1beta1.Resource$Projects$Occurrences")
@js.native
class ResourceProjectsOccurrences protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * containeranalysis.projects.occurrences.batchCreate
    * @desc Creates new occurrences in batch.
    * @alias containeranalysis.projects.occurrences.batchCreate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the project in the form of `projects/[PROJECT_ID]`, under which the occurrences are to be created.
    * @param {().BatchCreateOccurrencesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchCreate(): GaxiosPromise[SchemaBatchCreateOccurrencesResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaBatchCreateOccurrencesResponse]): Unit = js.native
  def batchCreate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchCreateOccurrencesResponse] = js.native
  def batchCreate(params: ParamsResourceProjectsOccurrencesBatchcreate): GaxiosPromise[SchemaBatchCreateOccurrencesResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsOccurrencesBatchcreate,
    callback: BodyResponseCallback[SchemaBatchCreateOccurrencesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsOccurrencesBatchcreate,
    options: BodyResponseCallback[SchemaBatchCreateOccurrencesResponse],
    callback: BodyResponseCallback[SchemaBatchCreateOccurrencesResponse]
  ): Unit = js.native
  def batchCreate(params: ParamsResourceProjectsOccurrencesBatchcreate, options: MethodOptions): GaxiosPromise[SchemaBatchCreateOccurrencesResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsOccurrencesBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchCreateOccurrencesResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * containeranalysis.projects.occurrences.create
    * @desc Creates a new occurrence.
    * @alias containeranalysis.projects.occurrences.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the project in the form of `projects/[PROJECT_ID]`, under which the occurrence is to be created.
    * @param {().Occurrence} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOccurrence] = js.native
  def create(callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
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
    * @desc Deletes the specified occurrence. For example, use this method to
    * delete an occurrence when the occurrence is no longer applicable for the
    * given resource.
    * @alias containeranalysis.projects.occurrences.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
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
    * @desc Gets the specified occurrence.
    * @alias containeranalysis.projects.occurrences.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOccurrence] = js.native
  def get(callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
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
    * @desc Gets the access control policy for a note or an occurrence
    * resource. Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or occurrence, respectively.  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
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
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
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
    * @desc Gets the note attached to the specified occurrence. Consumer
    * projects can use this method to get a note that belongs to a provider
    * project.
    * @alias containeranalysis.projects.occurrences.getNotes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getNotes(): GaxiosPromise[SchemaNote] = js.native
  def getNotes(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def getNotes(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
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
    * @param {string} params.parent The name of the project to get a vulnerability summary for in the form of `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getVulnerabilitySummary(): GaxiosPromise[SchemaVulnerabilityOccurrencesSummary] = js.native
  def getVulnerabilitySummary(callback: BodyResponseCallback[SchemaVulnerabilityOccurrencesSummary]): Unit = js.native
  def getVulnerabilitySummary(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVulnerabilityOccurrencesSummary] = js.native
  def getVulnerabilitySummary(params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary): GaxiosPromise[SchemaVulnerabilityOccurrencesSummary] = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    callback: BodyResponseCallback[SchemaVulnerabilityOccurrencesSummary]
  ): Unit = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    options: BodyResponseCallback[SchemaVulnerabilityOccurrencesSummary],
    callback: BodyResponseCallback[SchemaVulnerabilityOccurrencesSummary]
  ): Unit = js.native
  def getVulnerabilitySummary(params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary, options: MethodOptions): GaxiosPromise[SchemaVulnerabilityOccurrencesSummary] = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVulnerabilityOccurrencesSummary]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.occurrences.list
    * @desc Lists occurrences for the specified project.
    * @alias containeranalysis.projects.occurrences.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {integer=} params.pageSize Number of occurrences to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.parent The name of the project to list occurrences for in the form of `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOccurrencesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
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
    * @desc Updates the specified occurrence.
    * @alias containeranalysis.projects.occurrences.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    * @param {string=} params.updateMask The fields to update.
    * @param {().Occurrence} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOccurrence] = js.native
  def patch(callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
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
    * @desc Sets the access control policy on the specified note or occurrence.
    * Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or an occurrence, respectively.  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
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
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
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
    * occurrence. Requires list permission on the project (for example,
    * `containeranalysis.notes.list`).  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
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
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
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
