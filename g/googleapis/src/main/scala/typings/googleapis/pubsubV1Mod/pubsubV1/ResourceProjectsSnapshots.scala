package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Resource$Projects$Snapshots")
@js.native
class ResourceProjectsSnapshots protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * pubsub.projects.snapshots.create
    * @desc Creates a snapshot from the requested subscription. Snapshots are
    * used in <a
    * href="https://cloud.google.com/pubsub/docs/replay-overview">Seek</a>
    * operations, which allow you to manage message acknowledgments in bulk.
    * That is, you can set the acknowledgment state of messages in an existing
    * subscription to the state captured by a snapshot. <br><br>If the snapshot
    * already exists, returns `ALREADY_EXISTS`. If the requested subscription
    * doesn't exist, returns `NOT_FOUND`. If the backlog in the subscription is
    * too old -- and the resulting snapshot would expire in less than 1 hour --
    * then `FAILED_PRECONDITION` is returned. See also the
    * `Snapshot.expire_time` field. If the name is not provided in the request,
    * the server will assign a random name for this snapshot on the same
    * project as the subscription, conforming to the [resource name
    * format](https://cloud.google.com/pubsub/docs/admin#resource_names). The
    * generated name is populated in the returned Snapshot object. Note that
    * for REST API requests, you must specify a name in the request.
    * @alias pubsub.projects.snapshots.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Optional user-provided name for this snapshot. If the name is not provided in the request, the server will assign a random name for this snapshot on the same project as the subscription. Note that for REST API requests, you must specify a name.  See the <a href="https://cloud.google.com/pubsub/docs/admin#resource_names"> resource name rules</a>. Format is `projects/{project}/snapshots/{snap}`.
    * @param {().CreateSnapshotRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaSnapshot] = js.native
  def create(callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def create(params: ParamsResourceProjectsSnapshotsCreate): GaxiosPromise[SchemaSnapshot] = js.native
  def create(params: ParamsResourceProjectsSnapshotsCreate, callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def create(
    params: ParamsResourceProjectsSnapshotsCreate,
    options: BodyResponseCallback[SchemaSnapshot],
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsSnapshotsCreate, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def create(
    params: ParamsResourceProjectsSnapshotsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  
  /**
    * pubsub.projects.snapshots.delete
    * @desc Removes an existing snapshot. Snapshots are used in <a
    * href="https://cloud.google.com/pubsub/docs/replay-overview">Seek</a>
    * operations, which allow you to manage message acknowledgments in bulk.
    * That is, you can set the acknowledgment state of messages in an existing
    * subscription to the state captured by a snapshot.<br><br> When the
    * snapshot is deleted, all messages retained in the snapshot are
    * immediately dropped. After a snapshot is deleted, a new one may be
    * created with the same name, but the new one has no association with the
    * old snapshot or its subscription, unless the same subscription is
    * specified.
    * @alias pubsub.projects.snapshots.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.snapshot The name of the snapshot to delete. Format is `projects/{project}/snapshots/{snap}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsSnapshotsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsSnapshotsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsSnapshotsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsSnapshotsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsSnapshotsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * pubsub.projects.snapshots.get
    * @desc Gets the configuration details of a snapshot. Snapshots are used in
    * <a href="https://cloud.google.com/pubsub/docs/replay-overview">Seek</a>
    * operations, which allow you to manage message acknowledgments in bulk.
    * That is, you can set the acknowledgment state of messages in an existing
    * subscription to the state captured by a snapshot.
    * @alias pubsub.projects.snapshots.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.snapshot The name of the snapshot to get. Format is `projects/{project}/snapshots/{snap}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSnapshot] = js.native
  def get(callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def get(params: ParamsResourceProjectsSnapshotsGet): GaxiosPromise[SchemaSnapshot] = js.native
  def get(params: ParamsResourceProjectsSnapshotsGet, callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def get(
    params: ParamsResourceProjectsSnapshotsGet,
    options: BodyResponseCallback[SchemaSnapshot],
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsSnapshotsGet, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def get(
    params: ParamsResourceProjectsSnapshotsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  
  /**
    * pubsub.projects.snapshots.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // REQUIRED: The resource for which the policy is being requested.
    *     // See the operation documentation for the appropriate value for this
    * field. resource_: 'projects/my-project/snapshots/my-snapshot',  // TODO:
    * Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.snapshots.getIamPolicy(request, function(err, response)
    * { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.snapshots.getIamPolicy
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
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsSnapshotsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsSnapshotsGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsSnapshotsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsSnapshotsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsSnapshotsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * pubsub.projects.snapshots.list
    * @desc Lists the existing snapshots. Snapshots are used in <a
    * href="https://cloud.google.com/pubsub/docs/replay-overview">Seek</a>
    * operations, which allow you to manage message acknowledgments in bulk.
    * That is, you can set the acknowledgment state of messages in an existing
    * subscription to the state captured by a snapshot.
    * @alias pubsub.projects.snapshots.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of snapshots to return.
    * @param {string=} params.pageToken The value returned by the last `ListSnapshotsResponse`; indicates that this is a continuation of a prior `ListSnapshots` call, and that the system should return the next page of data.
    * @param {string} params.project The name of the project in which to list snapshots. Format is `projects/{project-id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSnapshotsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(params: ParamsResourceProjectsSnapshotsList): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(
    params: ParamsResourceProjectsSnapshotsList,
    callback: BodyResponseCallback[SchemaListSnapshotsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsSnapshotsList,
    options: BodyResponseCallback[SchemaListSnapshotsResponse],
    callback: BodyResponseCallback[SchemaListSnapshotsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsSnapshotsList, options: MethodOptions): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(
    params: ParamsResourceProjectsSnapshotsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSnapshotsResponse]
  ): Unit = js.native
  
  /**
    * pubsub.projects.snapshots.patch
    * @desc Updates an existing snapshot. Snapshots are used in <a
    * href="https://cloud.google.com/pubsub/docs/replay-overview">Seek</a>
    * operations, which allow you to manage message acknowledgments in bulk.
    * That is, you can set the acknowledgment state of messages in an existing
    * subscription to the state captured by a snapshot.
    * @alias pubsub.projects.snapshots.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the snapshot.
    * @param {().UpdateSnapshotRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaSnapshot] = js.native
  def patch(callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def patch(params: ParamsResourceProjectsSnapshotsPatch): GaxiosPromise[SchemaSnapshot] = js.native
  def patch(params: ParamsResourceProjectsSnapshotsPatch, callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsSnapshotsPatch,
    options: BodyResponseCallback[SchemaSnapshot],
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsSnapshotsPatch, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def patch(
    params: ParamsResourceProjectsSnapshotsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  
  /**
    * pubsub.projects.snapshots.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // REQUIRED: The resource for which the policy is being specified.
    *     // See the operation documentation for the appropriate value for this
    * field. resource_: 'projects/my-project/snapshots/my-snapshot',  // TODO:
    * Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.snapshots.setIamPolicy(request, function(err, response)
    * { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.snapshots.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsSnapshotsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsSnapshotsSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsSnapshotsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsSnapshotsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsSnapshotsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * pubsub.projects.snapshots.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // REQUIRED: The resource for which the policy detail is being
    * requested.
    *     // See the operation documentation for the appropriate value for this
    * field. resource_: 'projects/my-project/snapshots/my-snapshot',  // TODO:
    * Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.snapshots.testIamPermissions(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.snapshots.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsSnapshotsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsSnapshotsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsSnapshotsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsSnapshotsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsSnapshotsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
