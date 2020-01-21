package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudshell/v1alpha1", "cloudshell_v1alpha1.Resource$Users$Environments$Publickeys")
@js.native
class ResourceUsersEnvironmentsPublickeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudshell.users.environments.publicKeys.create
    * @desc Adds a public SSH key to an environment, allowing clients with the
    * corresponding private key to connect to that environment via SSH. If a
    * key with the same format and content already exists, this will return the
    * existing key.
    * @alias cloudshell.users.environments.publicKeys.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Parent resource name, e.g. `users/me/environments/default`.
    * @param {().CreatePublicKeyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaPublicKey] = js.native
  def create(callback: BodyResponseCallback[SchemaPublicKey]): Unit = js.native
  def create(params: ParamsResourceUsersEnvironmentsPublickeysCreate): GaxiosPromise[SchemaPublicKey] = js.native
  def create(
    params: ParamsResourceUsersEnvironmentsPublickeysCreate,
    callback: BodyResponseCallback[SchemaPublicKey]
  ): Unit = js.native
  def create(
    params: ParamsResourceUsersEnvironmentsPublickeysCreate,
    options: BodyResponseCallback[SchemaPublicKey],
    callback: BodyResponseCallback[SchemaPublicKey]
  ): Unit = js.native
  def create(params: ParamsResourceUsersEnvironmentsPublickeysCreate, options: MethodOptions): GaxiosPromise[SchemaPublicKey] = js.native
  def create(
    params: ParamsResourceUsersEnvironmentsPublickeysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublicKey]
  ): Unit = js.native
  /**
    * cloudshell.users.environments.publicKeys.delete
    * @desc Removes a public SSH key from an environment. Clients will no
    * longer be able to connect to the environment using the corresponding
    * private key.
    * @alias cloudshell.users.environments.publicKeys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the resource to be deleted, e.g. `users/me/environments/default/publicKeys/my-key`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceUsersEnvironmentsPublickeysDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceUsersEnvironmentsPublickeysDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceUsersEnvironmentsPublickeysDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersEnvironmentsPublickeysDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceUsersEnvironmentsPublickeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}

