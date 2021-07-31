package typings.googleapis.osloginV1Mod.osloginV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/oslogin/v1", "oslogin_v1.Resource$Users$Sshpublickeys")
@js.native
class ResourceUsersSshpublickeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * oslogin.users.sshPublicKeys.delete
    * @desc Deletes an SSH public key.
    * @alias oslogin.users.sshPublicKeys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The fingerprint of the public key to update. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user}/sshPublicKeys/{fingerprint}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceUsersSshpublickeysDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceUsersSshpublickeysDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSshpublickeysDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSshpublickeysDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceUsersSshpublickeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * oslogin.users.sshPublicKeys.get
    * @desc Retrieves an SSH public key.
    * @alias oslogin.users.sshPublicKeys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The fingerprint of the public key to retrieve. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user}/sshPublicKeys/{fingerprint}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSshPublicKey] = js.native
  def get(callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def get(params: ParamsResourceUsersSshpublickeysGet): GaxiosPromise[SchemaSshPublicKey] = js.native
  def get(params: ParamsResourceUsersSshpublickeysGet, callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def get(
    params: ParamsResourceUsersSshpublickeysGet,
    options: BodyResponseCallback[SchemaSshPublicKey],
    callback: BodyResponseCallback[SchemaSshPublicKey]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSshpublickeysGet, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def get(
    params: ParamsResourceUsersSshpublickeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSshPublicKey]
  ): Unit = js.native
  
  /**
    * oslogin.users.sshPublicKeys.patch
    * @desc Updates an SSH public key and returns the profile information. This
    * method supports patch semantics.
    * @alias oslogin.users.sshPublicKeys.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The fingerprint of the public key to update. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user}/sshPublicKeys/{fingerprint}`.
    * @param {string=} params.updateMask Mask to control which fields get updated. Updates all if not present.
    * @param {().SshPublicKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaSshPublicKey] = js.native
  def patch(callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def patch(params: ParamsResourceUsersSshpublickeysPatch): GaxiosPromise[SchemaSshPublicKey] = js.native
  def patch(params: ParamsResourceUsersSshpublickeysPatch, callback: BodyResponseCallback[SchemaSshPublicKey]): Unit = js.native
  def patch(
    params: ParamsResourceUsersSshpublickeysPatch,
    options: BodyResponseCallback[SchemaSshPublicKey],
    callback: BodyResponseCallback[SchemaSshPublicKey]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersSshpublickeysPatch, options: MethodOptions): GaxiosPromise[SchemaSshPublicKey] = js.native
  def patch(
    params: ParamsResourceUsersSshpublickeysPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSshPublicKey]
  ): Unit = js.native
}
