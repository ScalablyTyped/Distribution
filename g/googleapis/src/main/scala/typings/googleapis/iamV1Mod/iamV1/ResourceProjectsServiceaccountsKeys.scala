package typings.googleapis.iamV1Mod.iamV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Projects$Serviceaccounts$Keys")
@js.native
class ResourceProjectsServiceaccountsKeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * iam.projects.serviceAccounts.keys.create
    * @desc Creates a ServiceAccountKey and returns it.
    * @alias iam.projects.serviceAccounts.keys.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {().CreateServiceAccountKeyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def create(callback: BodyResponseCallback[SchemaServiceAccountKey]): Unit = js.native
  def create(params: ParamsResourceProjectsServiceaccountsKeysCreate): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsKeysCreate,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsKeysCreate,
    options: BodyResponseCallback[SchemaServiceAccountKey],
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsServiceaccountsKeysCreate, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsKeysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.keys.delete
    * @desc Deletes a ServiceAccountKey.
    * @alias iam.projects.serviceAccounts.keys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account key in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsServiceaccountsKeysDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsServiceaccountsKeysDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsServiceaccountsKeysDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsServiceaccountsKeysDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsServiceaccountsKeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.keys.get
    * @desc Gets the ServiceAccountKey by key id.
    * @alias iam.projects.serviceAccounts.keys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account key in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.  Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {string=} params.publicKeyType The output format of the public key requested. X509_PEM is the default output format.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def get(callback: BodyResponseCallback[SchemaServiceAccountKey]): Unit = js.native
  def get(params: ParamsResourceProjectsServiceaccountsKeysGet): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsKeysGet,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsKeysGet,
    options: BodyResponseCallback[SchemaServiceAccountKey],
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsServiceaccountsKeysGet, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsKeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.keys.list
    * @desc Lists ServiceAccountKeys.
    * @alias iam.projects.serviceAccounts.keys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.keyTypes Filters the types of keys the user wants to include in the list response. Duplicate key types are not allowed. If no key type is provided, all keys are returned.
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Using `-` as a wildcard for the `PROJECT_ID`, will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListServiceAccountKeysResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServiceAccountKeysResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsServiceaccountsKeysList): GaxiosPromise[SchemaListServiceAccountKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsKeysList,
    callback: BodyResponseCallback[SchemaListServiceAccountKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsKeysList,
    options: BodyResponseCallback[SchemaListServiceAccountKeysResponse],
    callback: BodyResponseCallback[SchemaListServiceAccountKeysResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsServiceaccountsKeysList, options: MethodOptions): GaxiosPromise[SchemaListServiceAccountKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsKeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServiceAccountKeysResponse]
  ): Unit = js.native
}

