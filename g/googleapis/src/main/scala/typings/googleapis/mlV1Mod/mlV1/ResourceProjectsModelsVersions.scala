package typings.googleapis.mlV1Mod.mlV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects$Models$Versions")
@js.native
class ResourceProjectsModelsVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * ml.projects.models.versions.create
    * @desc Creates a new version of a model from a trained TensorFlow model.
    * If the version created in the cloud by this call is the first deployed
    * version of the specified model, it will be made the default version of
    * the model. When you add a version to a model that already has one or more
    * versions, the default version does not automatically change. If you want
    * a new version to be the default, you must call
    * [projects.models.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    * @alias ml.projects.models.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the model.
    * @param {().GoogleCloudMlV1__Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsModelsVersionsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsModelsVersionsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsModelsVersionsCreate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsModelsVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsModelsVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.delete
    * @desc Deletes a model version.  Each model can have multiple versions
    * deployed and in use at any given time. Use this method to remove a single
    * version.  Note: You cannot delete the version that is set as the default
    * version of the model unless it is the only remaining version.
    * @alias ml.projects.models.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the version. You can get the names of all the versions of a model by calling [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsModelsVersionsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsModelsVersionsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsModelsVersionsDelete,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsModelsVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsModelsVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.get
    * @desc Gets information about a model version.  Models can have multiple
    * versions. You can call
    * [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list)
    * to get the same information that this method returns for all of the
    * versions of a model.
    * @alias ml.projects.models.versions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def get(params: ParamsResourceProjectsModelsVersionsGet): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def get(
    params: ParamsResourceProjectsModelsVersionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsModelsVersionsGet,
    options: BodyResponseCallback[SchemaGoogleCloudMlV1Version],
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsModelsVersionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def get(
    params: ParamsResourceProjectsModelsVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.list
    * @desc Gets basic information about all the versions of a model.  If you
    * expect that a model has many versions, or if you need to handle only a
    * limited number of results at a time, you can request that the list be
    * retrieved in batches (called pages).  If there are no versions that match
    * the request parameters, the list request returns an empty response body:
    * {}.
    * @alias ml.projects.models.versions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional. Specifies the subset of versions to retrieve.
    * @param {integer=} params.pageSize Optional. The number of versions to retrieve per "page" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field.  The default value is 20, and the maximum page size is 100.
    * @param {string=} params.pageToken Optional. A page token to request the next page of results.  You get the token from the `next_page_token` field of the response from the previous call.
    * @param {string} params.parent Required. The name of the model for which to list the version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudMlV1ListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListVersionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsModelsVersionsList): GaxiosPromise[SchemaGoogleCloudMlV1ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsModelsVersionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsModelsVersionsList,
    options: BodyResponseCallback[SchemaGoogleCloudMlV1ListVersionsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsModelsVersionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsModelsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListVersionsResponse]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.patch
    * @desc Updates the specified Version resource.  Currently the only
    * update-able fields are `description` and `autoScaling.minNodes`.
    * @alias ml.projects.models.versions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the model.
    * @param {string=} params.updateMask Required. Specifies the path, relative to `Version`, of the field to update. Must be present and non-empty.  For example, to change the description of a version to "foo", the `update_mask` parameter would be specified as `description`, and the `PATCH` request body would specify the new value, as follows:     {       "description": "foo"     }  Currently the only supported update mask fields are `description` and `autoScaling.minNodes`.
    * @param {().GoogleCloudMlV1__Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(params: ParamsResourceProjectsModelsVersionsPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsModelsVersionsPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsModelsVersionsPatch,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsModelsVersionsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsModelsVersionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.setDefault
    * @desc Designates a version to be the default for the model.  The default
    * version is used for prediction requests made against the model that don't
    * specify a version.  The first version to be created for a model is
    * automatically set as the default. You must make any subsequent changes to
    * the default version setting manually using this method.
    * @alias ml.projects.models.versions.setDefault
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the version to make the default for the model. You can get the names of all the versions of a model by calling [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list).
    * @param {().GoogleCloudMlV1__SetDefaultVersionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDefault(): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def setDefault(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]): Unit = js.native
  def setDefault(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def setDefault(params: ParamsResourceProjectsModelsVersionsSetdefault): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def setDefault(
    params: ParamsResourceProjectsModelsVersionsSetdefault,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  def setDefault(
    params: ParamsResourceProjectsModelsVersionsSetdefault,
    options: BodyResponseCallback[SchemaGoogleCloudMlV1Version],
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
  def setDefault(params: ParamsResourceProjectsModelsVersionsSetdefault, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Version] = js.native
  def setDefault(
    params: ParamsResourceProjectsModelsVersionsSetdefault,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Version]
  ): Unit = js.native
}

