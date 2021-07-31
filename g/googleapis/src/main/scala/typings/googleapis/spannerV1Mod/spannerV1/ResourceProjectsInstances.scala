package typings.googleapis.spannerV1Mod.spannerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Resource$Projects$Instances")
@js.native
class ResourceProjectsInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * spanner.projects.instances.create
    * @desc Creates an instance and begins preparing it to begin serving. The
    * returned long-running operation can be used to track the progress of
    * preparing the new instance. The instance name is assigned by the caller.
    * If the named instance already exists, `CreateInstance` returns
    * `ALREADY_EXISTS`.  Immediately upon completion of this request:    * The
    * instance is readable via the API, with all requested attributes     but
    * no allocated resources. Its state is `CREATING`.  Until completion of the
    * returned operation:    * Cancelling the operation renders the instance
    * immediately unreadable     via the API.   * The instance can be deleted.
    * * All other attempts to modify the instance are rejected.  Upon
    * completion of the returned operation:    * Billing for all
    * successfully-allocated resources begins (some types     may have lower
    * than the requested levels).   * Databases can be created in the instance.
    * * The instance's allocated resource levels are readable via the API.   *
    * The instance's state becomes `READY`.  The returned long-running
    * operation will have a name of the format
    * `<instance_name>/operations/<operation_id>` and can be used to track
    * creation of the instance.  The metadata field type is
    * CreateInstanceMetadata. The response field type is Instance, if
    * successful.
    * @alias spanner.projects.instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the project in which to create the instance. Values are of the form `projects/<project>`.
    * @param {().CreateInstanceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsInstancesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsInstancesCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstancesCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsInstancesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var databases: ResourceProjectsInstancesDatabases = js.native
  
  /**
    * spanner.projects.instances.delete
    * @desc Deletes an instance.  Immediately upon completion of the request:
    * * Billing ceases for all of the instance's reserved resources.  Soon
    * afterward:    * The instance and *all of its databases* immediately and
    * irrevocably disappear from the API. All data in the databases     is
    * permanently deleted.
    * @alias spanner.projects.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the instance to be deleted. Values are of the form `projects/<project>/instances/<instance>`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstancesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstancesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.get
    * @desc Gets information about a particular instance.
    * @alias spanner.projects.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the requested instance. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaInstance]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(params: ParamsResourceProjectsInstancesGet): GaxiosPromise[SchemaInstance] = js.native
  def get(params: ParamsResourceProjectsInstancesGet, callback: BodyResponseCallback[SchemaInstance]): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstancesGet,
    options: BodyResponseCallback[SchemaInstance],
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesGet, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceProjectsInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.getIamPolicy
    * @desc Gets the access control policy for an instance resource. Returns an
    * empty policy if an instance exists but does not have a policy set.
    * Authorization requires `spanner.instances.getIamPolicy` on resource.
    * @alias spanner.projects.instances.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which the policy is being retrieved. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for database resources.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsInstancesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsInstancesGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsInstancesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.list
    * @desc Lists all instances in the given project.
    * @alias spanner.projects.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are:    * `name`   * `display_name`   * `labels.key` where key is the name of a label  Some examples of using filters are:    * `name:*` --> The instance has a name.   * `name:Howl` --> The instance's name contains the string "howl".   * `name:HOWL` --> Equivalent to above.   * `NAME:howl` --> Equivalent to above.   * `labels.env:*` --> The instance has the label "env".   * `labels.env:dev` --> The instance has the label "env" and the value of                        the label contains the string "dev".   * `name:howl labels.env:dev` --> The instance's name contains "howl" and                                  it has the label "env" with its value                                  containing "dev".
    * @param {integer=} params.pageSize Number of instances to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    * @param {string=} params.pageToken If non-empty, `page_token` should contain a next_page_token from a previous ListInstancesResponse.
    * @param {string} params.parent Required. The name of the project for which a list of instances is requested. Values are of the form `projects/<project>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInstancesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesList): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesList,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesList,
    options: BodyResponseCallback[SchemaListInstancesResponse],
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesList, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  
  var operations: ResourceProjectsInstancesOperations = js.native
  
  /**
    * spanner.projects.instances.patch
    * @desc Updates an instance, and begins allocating or releasing resources
    * as requested. The returned long-running operation can be used to track
    * the progress of updating the instance. If the named instance does not
    * exist, returns `NOT_FOUND`.  Immediately upon completion of this request:
    * * For resource types for which a decrease in the instance's allocation
    * has been requested, billing is based on the newly-requested level.  Until
    * completion of the returned operation:    * Cancelling the operation sets
    * its metadata's     cancel_time, and begins     restoring resources to
    * their pre-request values. The operation     is guaranteed to succeed at
    * undoing all resource changes,     after which point it terminates with a
    * `CANCELLED` status.   * All other attempts to modify the instance are
    * rejected.   * Reading the instance via the API continues to give the
    * pre-request     resource levels.  Upon completion of the returned
    * operation:    * Billing begins for all successfully-allocated resources
    * (some types     may have lower than the requested levels).   * All
    * newly-reserved resources are available for serving the instance's tables.
    * * The instance's new resource levels are readable via the API.  The
    * returned long-running operation will have a name of the format
    * `<instance_name>/operations/<operation_id>` and can be used to track the
    * instance modification.  The metadata field type is
    * UpdateInstanceMetadata. The response field type is Instance, if
    * successful.  Authorization requires `spanner.instances.update` permission
    * on resource name.
    * @alias spanner.projects.instances.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. A unique identifier for the instance, which cannot be changed after the instance is created. Values are of the form `projects/<project>/instances/a-z*[a-z0-9]`. The final segment of the name must be between 6 and 30 characters in length.
    * @param {().UpdateInstanceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsInstancesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsInstancesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsInstancesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsInstancesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsInstancesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.setIamPolicy
    * @desc Sets the access control policy on an instance resource. Replaces
    * any existing policy.  Authorization requires
    * `spanner.instances.setIamPolicy` on resource.
    * @alias spanner.projects.instances.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which the policy is being set. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for databases resources.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsInstancesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsInstancesSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsInstancesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.testIamPermissions
    * @desc Returns permissions that the caller has on the specified instance
    * resource.  Attempting this RPC on a non-existent Cloud Spanner instance
    * resource will result in a NOT_FOUND error if the user has
    * `spanner.instances.list` permission on the containing Google Cloud
    * Project. Otherwise returns an empty set of permissions.
    * @alias spanner.projects.instances.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which permissions are being tested. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for database resources.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsInstancesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsInstancesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
