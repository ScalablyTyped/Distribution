package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Resource$Actions")
@js.native
class ResourceActions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * remotebuildexecution.actions.execute
    * @desc Execute an action remotely.  In order to execute an action, the
    * client must first upload all of the inputs, the Command to run, and the
    * Action into the ContentAddressableStorage. It then calls `Execute` with
    * an `action_digest` referring to them. The server will run the action and
    * eventually return the result.  The input `Action`'s fields MUST meet the
    * various canonicalization requirements specified in the documentation for
    * their types so that it has the same digest as other logically equivalent
    * `Action`s. The server MAY enforce the requirements and return errors if a
    * non-canonical input is received. It MAY also proceed without verifying
    * some or all of the requirements, such as for performance reasons. If the
    * server does not verify the requirement, then it will treat the `Action`
    * as distinct from another logically equivalent action if they hash
    * differently.  Returns a stream of google.longrunning.Operation messages
    * describing the resulting execution, with eventual `response`
    * ExecuteResponse. The `metadata` on the operation is of type
    * ExecuteOperationMetadata.  If the client remains connected after the
    * first response is returned after the server, then updates are streamed as
    * if the client had called WaitExecution until the execution completes or
    * the request reaches an error. The operation can also be queried using
    * Operations API.  The server NEED NOT implement other methods or
    * functionality of the Operations API.  Errors discovered during creation
    * of the `Operation` will be reported as gRPC Status errors, while errors
    * that occurred while running the action will be reported in the `status`
    * field of the `ExecuteResponse`. The server MUST NOT set the `error` field
    * of the `Operation` proto. The possible errors include:  *
    * `INVALID_ARGUMENT`: One or more arguments are invalid. *
    * `FAILED_PRECONDITION`: One or more errors occurred in setting up the
    * action requested, such as a missing input or command or no worker being
    * available. The client may be able to fix the errors and retry. *
    * `RESOURCE_EXHAUSTED`: There is insufficient quota of some resource to run
    * the action. * `UNAVAILABLE`: Due to a transient condition, such as all
    * workers being   occupied (and the server does not support a queue), the
    * action could not   be started. The client should retry. * `INTERNAL`: An
    * internal error occurred in the execution engine or the   worker. *
    * `DEADLINE_EXCEEDED`: The execution timed out. * `CANCELLED`: The
    * operation was cancelled by the client. This status is   only possible if
    * the server implements the Operations API CancelOperation   method, and it
    * was called for the current execution.  In the case of a missing input or
    * command, the server SHOULD additionally send a PreconditionFailure error
    * detail where, for each requested blob not present in the CAS, there is a
    * `Violation` with a `type` of `MISSING` and a `subject` of
    * `"blobs/{hash}/{size}"` indicating the digest of the missing blob.
    * @alias remotebuildexecution.actions.execute
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceName The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    * @param {().BuildBazelRemoteExecutionV2ExecuteRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def execute(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def execute(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def execute(params: ParamsResourceActionsExecute): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def execute(
    params: ParamsResourceActionsExecute,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def execute(
    params: ParamsResourceActionsExecute,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def execute(params: ParamsResourceActionsExecute, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def execute(
    params: ParamsResourceActionsExecute,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}

