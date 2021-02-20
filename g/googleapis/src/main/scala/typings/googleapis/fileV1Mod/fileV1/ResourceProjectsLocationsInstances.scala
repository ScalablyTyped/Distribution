package typings.googleapis.fileV1Mod.fileV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/file/v1", "file_v1.Resource$Projects$Locations$Instances")
@js.native
class ResourceProjectsLocationsInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * file.projects.locations.instances.create
    * @desc Creates an instance.
    * @alias file.projects.locations.instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.instanceId The name of the instance to create. The name must be unique for the specified project and location.
    * @param {string} params.parent The instance's project and location, in the format projects/{project_id}/locations/{location}. In Cloud Filestore, locations map to GCP zones, for example **us-west1-b**.
    * @param {().Instance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * file.projects.locations.instances.delete
    * @desc Deletes an instance.
    * @alias file.projects.locations.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The instance resource name, in the format projects/{project_id}/locations/{location}/instances/{instance_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * file.projects.locations.instances.get
    * @desc Gets the details of a specific instance.
    * @alias file.projects.locations.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The instance resource name, in the format projects/{project_id}/locations/{location}/instances/{instance_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaInstance]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesGet): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: BodyResponseCallback[SchemaInstance],
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesGet, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  
  /**
    * file.projects.locations.instances.list
    * @desc Lists all instances in a project for either a specified location or
    * for all locations.
    * @alias file.projects.locations.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter List filter.
    * @param {string=} params.orderBy Sort results. Supported values are "name", "name desc" or "" (unsorted).
    * @param {integer=} params.pageSize The maximum number of items to return.
    * @param {string=} params.pageToken The next_page_token value to use if there are additional results to retrieve for this list request.
    * @param {string} params.parent The project and location for which to retrieve instance information, in the format projects/{project_id}/locations/{location}. In Cloud Filestore, locations map to GCP zones, for example **us-west1-b**. To retrieve instance information for all locations, use "-" for the {location} value.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInstancesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesList): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: BodyResponseCallback[SchemaListInstancesResponse],
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesList, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  
  /**
    * file.projects.locations.instances.patch
    * @desc Updates the settings of a specific instance.
    * @alias file.projects.locations.instances.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The resource name of the instance, in the format projects/{project_id}/locations/{location_id}/instances/{instance_id}.
    * @param {string=} params.updateMask Mask of fields to update.  At least one path must be supplied in this field.  The elements of the repeated paths field may only include these fields: "description"
    * @param {().Instance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsInstancesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsInstancesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
