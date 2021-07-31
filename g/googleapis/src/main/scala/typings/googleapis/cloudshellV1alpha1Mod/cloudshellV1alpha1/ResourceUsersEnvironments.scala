package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudshell/v1alpha1", "cloudshell_v1alpha1.Resource$Users$Environments")
@js.native
class ResourceUsersEnvironments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * cloudshell.users.environments.authorize
    * @desc Sends OAuth credentials to a running environment on behalf of a
    * user. When this completes, the environment will be authorized to run
    * various Google Cloud command line tools without requiring the user to
    * manually authenticate.
    * @alias cloudshell.users.environments.authorize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the resource that should receive the credentials, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    * @param {().AuthorizeEnvironmentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def authorize(): GaxiosPromise[SchemaEmpty] = js.native
  def authorize(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def authorize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize): GaxiosPromise[SchemaEmpty] = js.native
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def authorize(
    params: ParamsResourceUsersEnvironmentsAuthorize,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def authorize(params: ParamsResourceUsersEnvironmentsAuthorize, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def authorize(
    params: ParamsResourceUsersEnvironmentsAuthorize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudshell.users.environments.get
    * @desc Gets an environment. Returns NOT_FOUND if the environment does not
    * exist.
    * @alias cloudshell.users.environments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the requested resource, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaEnvironment] = js.native
  def get(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(params: ParamsResourceUsersEnvironmentsGet): GaxiosPromise[SchemaEnvironment] = js.native
  def get(params: ParamsResourceUsersEnvironmentsGet, callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def get(
    params: ParamsResourceUsersEnvironmentsGet,
    options: BodyResponseCallback[SchemaEnvironment],
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def get(params: ParamsResourceUsersEnvironmentsGet, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(
    params: ParamsResourceUsersEnvironmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  
  /**
    * cloudshell.users.environments.patch
    * @desc Updates an existing environment.
    * @alias cloudshell.users.environments.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the resource to be updated, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    * @param {string=} params.updateMask Mask specifying which fields in the environment should be updated.
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaEnvironment] = js.native
  def patch(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def patch(params: ParamsResourceUsersEnvironmentsPatch): GaxiosPromise[SchemaEnvironment] = js.native
  def patch(params: ParamsResourceUsersEnvironmentsPatch, callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def patch(
    params: ParamsResourceUsersEnvironmentsPatch,
    options: BodyResponseCallback[SchemaEnvironment],
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersEnvironmentsPatch, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def patch(
    params: ParamsResourceUsersEnvironmentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  
  var publicKeys: ResourceUsersEnvironmentsPublickeys = js.native
  
  /**
    * cloudshell.users.environments.start
    * @desc Starts an existing environment, allowing clients to connect to it.
    * The returned operation will contain an instance of
    * StartEnvironmentMetadata in its metadata field. Users can wait for the
    * environment to start by polling this operation via GetOperation. Once the
    * environment has finished starting and is ready to accept connections, the
    * operation will contain a StartEnvironmentResponse in its response field.
    * @alias cloudshell.users.environments.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the resource that should be started, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    * @param {().StartEnvironmentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[SchemaOperation] = js.native
  def start(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceUsersEnvironmentsStart): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceUsersEnvironmentsStart, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(
    params: ParamsResourceUsersEnvironmentsStart,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def start(params: ParamsResourceUsersEnvironmentsStart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceUsersEnvironmentsStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
