package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Resource$Projects$Regions$Jobs")
@js.native
class ResourceProjectsRegionsJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataproc.projects.regions.jobs.cancel
    * @desc Starts a job cancellation request. To access the job resource after
    * cancellation, call regions/{region}/jobs.list or
    * regions/{region}/jobs.get.
    * @alias dataproc.projects.regions.jobs.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Required. The job ID.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {().CancelJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[SchemaJob] = js.native
  def cancel(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def cancel(params: ParamsResourceProjectsRegionsJobsCancel): GaxiosPromise[SchemaJob] = js.native
  def cancel(params: ParamsResourceProjectsRegionsJobsCancel, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsRegionsJobsCancel,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsRegionsJobsCancel, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def cancel(
    params: ParamsResourceProjectsRegionsJobsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.delete
    * @desc Deletes the job from the project. If the job is active, the delete
    * fails, and the response returns FAILED_PRECONDITION.
    * @alias dataproc.projects.regions.jobs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Required. The job ID.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsRegionsJobsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsRegionsJobsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsRegionsJobsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsRegionsJobsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsRegionsJobsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.get
    * @desc Gets the resource representation for a job in a project.
    * @alias dataproc.projects.regions.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Required. The job ID.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(params: ParamsResourceProjectsRegionsJobsGet): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceProjectsRegionsJobsGet, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(
    params: ParamsResourceProjectsRegionsJobsGet,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsRegionsJobsGet, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(
    params: ParamsResourceProjectsRegionsJobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias dataproc.projects.regions.jobs.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsRegionsJobsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsJobsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsJobsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsRegionsJobsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsJobsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.list
    * @desc Lists regions/{region}/jobs in a project.
    * @alias dataproc.projects.regions.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterName Optional. If set, the returned jobs list includes only jobs that were submitted to the named cluster.
    * @param {string=} params.filter Optional. A filter constraining the jobs to list. Filters are case-sensitive and have the following syntax:field = value AND field = value ...where field is status.state or labels.[KEY], and [KEY] is a label key. value can be * to match all values. status.state can be either ACTIVE or NON_ACTIVE. Only the logical AND operator is supported; space-separated items are treated as having an implicit AND operator.Example filter:status.state = ACTIVE AND labels.env = staging AND labels.starred = *
    * @param {string=} params.jobStateMatcher Optional. Specifies enumerated categories of jobs to list. (default = match ALL jobs).If filter is provided, jobStateMatcher will be ignored.
    * @param {integer=} params.pageSize Optional. The number of results to return in each response.
    * @param {string=} params.pageToken Optional. The page token, returned by a previous call, to request the next page of results.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsRegionsJobsList): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsRegionsJobsList,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsRegionsJobsList,
    options: BodyResponseCallback[SchemaListJobsResponse],
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsRegionsJobsList, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsRegionsJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.patch
    * @desc Updates a job in a project.
    * @alias dataproc.projects.regions.jobs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Required. The job ID.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {string=} params.updateMask Required. Specifies the path, relative to <code>Job</code>, of the field to update. For example, to update the labels of a Job the <code>update_mask</code> parameter would be specified as <code>labels</code>, and the PATCH request body would specify the new value. <strong>Note:</strong> Currently, <code>labels</code> is the only field that can be updated.
    * @param {().Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaJob] = js.native
  def patch(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(params: ParamsResourceProjectsRegionsJobsPatch): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceProjectsRegionsJobsPatch, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsRegionsJobsPatch,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsRegionsJobsPatch, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(
    params: ParamsResourceProjectsRegionsJobsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias dataproc.projects.regions.jobs.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsRegionsJobsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsJobsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsJobsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsRegionsJobsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsJobsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.submit
    * @desc Submits a job to a cluster.
    * @alias dataproc.projects.regions.jobs.submit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {().SubmitJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submit(): GaxiosPromise[SchemaJob] = js.native
  def submit(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def submit(params: ParamsResourceProjectsRegionsJobsSubmit): GaxiosPromise[SchemaJob] = js.native
  def submit(params: ParamsResourceProjectsRegionsJobsSubmit, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def submit(
    params: ParamsResourceProjectsRegionsJobsSubmit,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def submit(params: ParamsResourceProjectsRegionsJobsSubmit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def submit(
    params: ParamsResourceProjectsRegionsJobsSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.Note: This operation is designed to be
    * used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias dataproc.projects.regions.jobs.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsRegionsJobsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsJobsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsJobsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsRegionsJobsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsJobsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}

