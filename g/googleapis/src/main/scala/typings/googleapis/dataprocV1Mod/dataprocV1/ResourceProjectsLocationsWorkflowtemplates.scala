package typings.googleapis.dataprocV1Mod.dataprocV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataproc/v1", "dataproc_v1.Resource$Projects$Locations$Workflowtemplates")
@js.native
class ResourceProjectsLocationsWorkflowtemplates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.create
    * @desc Creates new workflow template.
    * @alias dataproc.projects.locations.workflowTemplates.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The "resource name" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}
    * @param {().WorkflowTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def create(callback: BodyResponseCallback[SchemaWorkflowTemplate]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def create(params: ParamsResourceProjectsLocationsWorkflowtemplatesCreate): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesCreate,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesCreate,
    options: BodyResponseCallback[SchemaWorkflowTemplate],
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsWorkflowtemplatesCreate, options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.delete
    * @desc Deletes a workflow template. It does not cancel in-progress
    * workflows.
    * @alias dataproc.projects.locations.workflowTemplates.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the workflow template, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    * @param {integer=} params.version Optional. The version of workflow template to delete. If specified, will only delete the template if the current server version matches specified version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsWorkflowtemplatesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsWorkflowtemplatesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.get
    * @desc Retrieves the latest workflow template.Can retrieve previously
    * instantiated template by specifying optional version parameter.
    * @alias dataproc.projects.locations.workflowTemplates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the workflow template, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    * @param {integer=} params.version Optional. The version of workflow template to retrieve. Only previously instatiated versions can be retrieved.If unspecified, retrieves the current version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaWorkflowTemplate]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def get(params: ParamsResourceProjectsLocationsWorkflowtemplatesGet): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesGet,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesGet,
    options: BodyResponseCallback[SchemaWorkflowTemplate],
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsWorkflowtemplatesGet, options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias dataproc.projects.locations.workflowTemplates.getIamPolicy
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsWorkflowtemplatesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsWorkflowtemplatesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.instantiate
    * @desc Instantiates a template and begins execution.The returned Operation
    * can be used to track execution of workflow by polling operations.get. The
    * Operation will complete when entire workflow is finished.The running
    * workflow can be aborted via operations.cancel. This will cause any
    * inflight jobs to be cancelled and workflow-owned clusters to be
    * deleted.The Operation.metadata will be WorkflowMetadata.On successful
    * completion, Operation.response will be Empty.
    * @alias dataproc.projects.locations.workflowTemplates.instantiate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the workflow template, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    * @param {().InstantiateWorkflowTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def instantiate(): GaxiosPromise[SchemaOperation] = js.native
  def instantiate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def instantiate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def instantiate(params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate): GaxiosPromise[SchemaOperation] = js.native
  def instantiate(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def instantiate(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def instantiate(params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def instantiate(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.instantiateInline
    * @desc Instantiates a template and begins execution.This method is
    * equivalent to executing the sequence CreateWorkflowTemplate,
    * InstantiateWorkflowTemplate, DeleteWorkflowTemplate.The returned
    * Operation can be used to track execution of workflow by polling
    * operations.get. The Operation will complete when entire workflow is
    * finished.The running workflow can be aborted via operations.cancel. This
    * will cause any inflight jobs to be cancelled and workflow-owned clusters
    * to be deleted.The Operation.metadata will be WorkflowMetadata.On
    * successful completion, Operation.response will be Empty.
    * @alias dataproc.projects.locations.workflowTemplates.instantiateInline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The "resource name" of the workflow template region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}
    * @param {string=} params.requestId Optional. A tag that prevents multiple concurrent workflow instances with the same tag from running. This mitigates risk of concurrent instances started due to retries.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The tag must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    * @param {().WorkflowTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def instantiateInline(): GaxiosPromise[SchemaOperation] = js.native
  def instantiateInline(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def instantiateInline(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def instantiateInline(params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline): GaxiosPromise[SchemaOperation] = js.native
  def instantiateInline(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def instantiateInline(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def instantiateInline(params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def instantiateInline(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.list
    * @desc Lists workflows that match the specified filter in the request.
    * @alias dataproc.projects.locations.workflowTemplates.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return in each response.
    * @param {string=} params.pageToken Optional. The page token, returned by a previous call, to request the next page of results.
    * @param {string} params.parent Required. The "resource name" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListWorkflowTemplatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWorkflowTemplatesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListWorkflowTemplatesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsWorkflowtemplatesList): GaxiosPromise[SchemaListWorkflowTemplatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesList,
    callback: BodyResponseCallback[SchemaListWorkflowTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesList,
    options: BodyResponseCallback[SchemaListWorkflowTemplatesResponse],
    callback: BodyResponseCallback[SchemaListWorkflowTemplatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsWorkflowtemplatesList, options: MethodOptions): GaxiosPromise[SchemaListWorkflowTemplatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWorkflowTemplatesResponse]
  ): Unit = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias dataproc.projects.locations.workflowTemplates.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsWorkflowtemplatesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsWorkflowtemplatesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.Note: This operation is designed to be
    * used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias dataproc.projects.locations.workflowTemplates.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsWorkflowtemplatesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsWorkflowtemplatesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  
  /**
    * dataproc.projects.locations.workflowTemplates.update
    * @desc Updates (replaces) workflow template. The updated template must
    * contain version that matches the current server version.
    * @alias dataproc.projects.locations.workflowTemplates.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The "resource name" of the template, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    * @param {().WorkflowTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def update(callback: BodyResponseCallback[SchemaWorkflowTemplate]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def update(params: ParamsResourceProjectsLocationsWorkflowtemplatesUpdate): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def update(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesUpdate,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesUpdate,
    options: BodyResponseCallback[SchemaWorkflowTemplate],
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsWorkflowtemplatesUpdate, options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def update(
    params: ParamsResourceProjectsLocationsWorkflowtemplatesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
}
