package typings.googleapis.mlV1Mod.mlV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects$Models")
@js.native
class ResourceProjectsModels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var versions: ResourceProjectsModelsVersions = js.native
  /**
    * ml.projects.models.create
    * @desc Creates a model which will later contain one or more versions.  You
    * must add at least one version before you can request predictions from the
    * model. Add versions by calling
    * [projects.models.versions.create](/ml-engine/reference/rest/v1/projects.models.versions/create).
    * @alias ml.projects.models.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project name.
    * @param {().GoogleCloudMlV1__Model} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudMlV1Model] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Model]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Model] = js.native
  def create(params: ParamsResourceProjectsModelsCreate): GaxiosPromise[SchemaGoogleCloudMlV1Model] = js.native
  def create(
    params: ParamsResourceProjectsModelsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Model]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsModelsCreate,
    options: BodyResponseCallback[SchemaGoogleCloudMlV1Model],
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Model]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsModelsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Model] = js.native
  def create(
    params: ParamsResourceProjectsModelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Model]
  ): Unit = js.native
  /**
    * ml.projects.models.delete
    * @desc Deletes a model.  You can only delete a model if there are no
    * versions in it. You can delete versions by calling
    * [projects.models.versions.delete](/ml-engine/reference/rest/v1/projects.models.versions/delete).
    * @alias ml.projects.models.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the model.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsModelsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsModelsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsModelsDelete,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsModelsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsModelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * ml.projects.models.get
    * @desc Gets information about a model, including its name, the description
    * (if set), and the default version (if at least one version of the model
    * has been deployed).
    * @alias ml.projects.models.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the model.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudMlV1Model] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Model]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Model] = js.native
  def get(params: ParamsResourceProjectsModelsGet): GaxiosPromise[SchemaGoogleCloudMlV1Model] = js.native
  def get(
    params: ParamsResourceProjectsModelsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Model]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsModelsGet,
    options: BodyResponseCallback[SchemaGoogleCloudMlV1Model],
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Model]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsModelsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Model] = js.native
  def get(
    params: ParamsResourceProjectsModelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Model]
  ): Unit = js.native
  /**
    * ml.projects.models.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias ml.projects.models.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsModelsGetiampolicy): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsModelsGetiampolicy,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsModelsGetiampolicy,
    options: BodyResponseCallback[SchemaGoogleIamV1Policy],
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsModelsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsModelsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  /**
    * ml.projects.models.list
    * @desc Lists the models in a project.  Each project can contain multiple
    * models, and each model can have multiple versions.  If there are no
    * models that match the request parameters, the list request returns an
    * empty response body: {}.
    * @alias ml.projects.models.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional. Specifies the subset of models to retrieve.
    * @param {integer=} params.pageSize Optional. The number of models to retrieve per "page" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field.  The default value is 20, and the maximum page size is 100.
    * @param {string=} params.pageToken Optional. A page token to request the next page of results.  You get the token from the `next_page_token` field of the response from the previous call.
    * @param {string} params.parent Required. The name of the project whose models are to be listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudMlV1ListModelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListModelsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListModelsResponse] = js.native
  def list(params: ParamsResourceProjectsModelsList): GaxiosPromise[SchemaGoogleCloudMlV1ListModelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsModelsList,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListModelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsModelsList,
    options: BodyResponseCallback[SchemaGoogleCloudMlV1ListModelsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListModelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsModelsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListModelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsModelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListModelsResponse]
  ): Unit = js.native
  /**
    * ml.projects.models.patch
    * @desc Updates a specific model resource.  Currently the only supported
    * fields to update are `description` and `default_version.name`.
    * @alias ml.projects.models.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The project name.
    * @param {string=} params.updateMask Required. Specifies the path, relative to `Model`, of the field to update.  For example, to change the description of a model to "foo" and set its default version to "version_1", the `update_mask` parameter would be specified as `description`, `default_version.name`, and the `PATCH` request body would specify the new value, as follows:     {       "description": "foo",       "defaultVersion": {         "name":"version_1"       }     }  Currently the supported update masks are `description` and `default_version.name`.
    * @param {().GoogleCloudMlV1__Model} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(params: ParamsResourceProjectsModelsPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsModelsPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsModelsPatch,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsModelsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsModelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * ml.projects.models.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias ml.projects.models.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1__SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsModelsSetiampolicy): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsModelsSetiampolicy,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsModelsSetiampolicy,
    options: BodyResponseCallback[SchemaGoogleIamV1Policy],
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsModelsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsModelsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  /**
    * ml.projects.models.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias ml.projects.models.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1__TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsModelsTestiampermissions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsModelsTestiampermissions,
    callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsModelsTestiampermissions,
    options: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsModelsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsModelsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
}

