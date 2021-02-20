package typings.googleapis.redisV1Mod.redisV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/redis/v1", "redis_v1.Resource$Projects$Locations$Instances")
@js.native
class ResourceProjectsLocationsInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * redis.projects.locations.instances.create
    * @desc Creates a Redis instance based on the specified tier and memory
    * size.  By default, the instance is accessible from the project's [default
    * network](/compute/docs/networks-and-firewalls#networks).  The creation is
    * executed asynchronously and callers may check the returned operation to
    * track its progress. Once the operation is completed the Redis instance
    * will be fully functional. Completed longrunning.Operation will contain
    * the new instance object in the response field.  The returned operation is
    * automatically deleted after a few hours, so there is no need to call
    * DeleteOperation.
    * @alias redis.projects.locations.instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.instanceId Required. The logical name of the Redis instance in the customer project with the following restrictions:  * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the customer project / location
    * @param {string} params.parent Required. The resource name of the instance location using the form:     `projects/{project_id}/locations/{location_id}` where `location_id` refers to a GCP region
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
    * redis.projects.locations.instances.delete
    * @desc Deletes a specific Redis instance.  Instance stops serving and data
    * is deleted.
    * @alias redis.projects.locations.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Redis instance resource name using the form:     `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id` refers to a GCP region
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
    * redis.projects.locations.instances.failover
    * @desc Failover the master role to current replica node against a specific
    * STANDARD tier redis instance.
    * @alias redis.projects.locations.instances.failover
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Redis instance resource name using the form:     `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id` refers to a GCP region
    * @param {().FailoverInstanceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def failover(): GaxiosPromise[SchemaOperation] = js.native
  def failover(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def failover(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def failover(params: ParamsResourceProjectsLocationsInstancesFailover): GaxiosPromise[SchemaOperation] = js.native
  def failover(
    params: ParamsResourceProjectsLocationsInstancesFailover,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def failover(
    params: ParamsResourceProjectsLocationsInstancesFailover,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def failover(params: ParamsResourceProjectsLocationsInstancesFailover, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def failover(
    params: ParamsResourceProjectsLocationsInstancesFailover,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * redis.projects.locations.instances.get
    * @desc Gets the details of a specific Redis instance.
    * @alias redis.projects.locations.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Redis instance resource name using the form:     `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id` refers to a GCP region
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
    * redis.projects.locations.instances.list
    * @desc Lists all Redis instances owned by a project in either the
    * specified location (region) or all locations.  The location should have
    * the following format: * `projects/{project_id}/locations/{location_id}`
    * If `location_id` is specified as `-` (wildcard), then all regions
    * available to the project are queried, and the results are aggregated.
    * @alias redis.projects.locations.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of items to return.  If not specified, a default value of 1000 will be used by the service. Regardless of the page_size value, the response may include a partial list and a caller should only rely on response's next_page_token to determine if there are more instances left to be queried.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent Required. The resource name of the instance location using the form:     `projects/{project_id}/locations/{location_id}` where `location_id` refers to a GCP region
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
    * redis.projects.locations.instances.patch
    * @desc Updates the metadata and configuration of a specific Redis
    * instance.  Completed longrunning.Operation will contain the new instance
    * object in the response field. The returned operation is automatically
    * deleted after a few hours, so there is no need to call DeleteOperation.
    * @alias redis.projects.locations.instances.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Unique name of the resource in this scope including project and location using the form:     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`  Note: Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for cross-zone instances) an instance should be provisioned in. Refer to [location_id] and [alternative_location_id] fields for more details.
    * @param {string=} params.updateMask Required. Mask of fields to update. At least one path must be supplied in this field. The elements of the repeated paths field may only include these fields from Instance:   *   `displayName`  *   `labels`  *   `memorySizeGb`  *   `redisConfig`
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
