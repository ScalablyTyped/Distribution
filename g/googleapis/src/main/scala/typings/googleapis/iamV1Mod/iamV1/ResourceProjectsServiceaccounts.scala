package typings.googleapis.iamV1Mod.iamV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Projects$Serviceaccounts")
@js.native
class ResourceProjectsServiceaccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var keys: ResourceProjectsServiceaccountsKeys = js.native
  /**
    * iam.projects.serviceAccounts.create
    * @desc Creates a ServiceAccount and returns it.
    * @alias iam.projects.serviceAccounts.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the project associated with the service accounts, such as `projects/my-project-123`.
    * @param {().CreateServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaServiceAccount] = js.native
  def create(callback: BodyResponseCallback[SchemaServiceAccount]): Unit = js.native
  def create(params: ParamsResourceProjectsServiceaccountsCreate): GaxiosPromise[SchemaServiceAccount] = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsCreate,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsCreate,
    options: BodyResponseCallback[SchemaServiceAccount],
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsServiceaccountsCreate, options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.delete
    * @desc Deletes a ServiceAccount.
    * @alias iam.projects.serviceAccounts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsServiceaccountsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsServiceaccountsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsServiceaccountsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsServiceaccountsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsServiceaccountsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.disable
    * @desc Disables a ServiceAccount. The API is currently in alpha phase.
    * @alias iam.projects.serviceAccounts.disable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {().DisableServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def disable(): GaxiosPromise[SchemaEmpty] = js.native
  def disable(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def disable(params: ParamsResourceProjectsServiceaccountsDisable): GaxiosPromise[SchemaEmpty] = js.native
  def disable(params: ParamsResourceProjectsServiceaccountsDisable, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def disable(
    params: ParamsResourceProjectsServiceaccountsDisable,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def disable(params: ParamsResourceProjectsServiceaccountsDisable, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def disable(
    params: ParamsResourceProjectsServiceaccountsDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.enable
    * @desc Enables a ServiceAccount.  The API is currently in alpha phase.
    * @alias iam.projects.serviceAccounts.enable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_UNIQUE_ID}'. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account.
    * @param {().EnableServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def enable(): GaxiosPromise[SchemaEmpty] = js.native
  def enable(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def enable(params: ParamsResourceProjectsServiceaccountsEnable): GaxiosPromise[SchemaEmpty] = js.native
  def enable(params: ParamsResourceProjectsServiceaccountsEnable, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def enable(
    params: ParamsResourceProjectsServiceaccountsEnable,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def enable(params: ParamsResourceProjectsServiceaccountsEnable, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def enable(
    params: ParamsResourceProjectsServiceaccountsEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.get
    * @desc Gets a ServiceAccount.
    * @alias iam.projects.serviceAccounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaServiceAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaServiceAccount]): Unit = js.native
  def get(params: ParamsResourceProjectsServiceaccountsGet): GaxiosPromise[SchemaServiceAccount] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsGet,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsGet,
    options: BodyResponseCallback[SchemaServiceAccount],
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsServiceaccountsGet, options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.getIamPolicy
    * @desc Returns the Cloud IAM access control policy for a ServiceAccount.
    * Note: Service accounts are both [resources and
    * identities](/iam/docs/service-accounts#service_account_permissions). This
    * method treats the service account as a resource. It returns the Cloud IAM
    * policy that reflects what members have access to the service account.
    * This method does not return what resources the service account has access
    * to. To see if a service account has access to a resource, call the
    * `getIamPolicy` method on the target resource. For example, to view grants
    * for a project, call the
    * [projects.getIamPolicy](/resource-manager/reference/rest/v1/projects/getIamPolicy)
    * method.
    * @alias iam.projects.serviceAccounts.getIamPolicy
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
  def getIamPolicy(params: ParamsResourceProjectsServiceaccountsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsServiceaccountsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsServiceaccountsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsServiceaccountsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsServiceaccountsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.list
    * @desc Lists ServiceAccounts for a project.
    * @alias iam.projects.serviceAccounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the project associated with the service accounts, such as `projects/my-project-123`.
    * @param {integer=} params.pageSize Optional limit on the number of service accounts to include in the response. Further accounts can subsequently be obtained by including the ListServiceAccountsResponse.next_page_token in a subsequent request.
    * @param {string=} params.pageToken Optional pagination token returned in an earlier ListServiceAccountsResponse.next_page_token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListServiceAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServiceAccountsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsServiceaccountsList): GaxiosPromise[SchemaListServiceAccountsResponse] = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsList,
    callback: BodyResponseCallback[SchemaListServiceAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsList,
    options: BodyResponseCallback[SchemaListServiceAccountsResponse],
    callback: BodyResponseCallback[SchemaListServiceAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsServiceaccountsList, options: MethodOptions): GaxiosPromise[SchemaListServiceAccountsResponse] = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServiceAccountsResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.patch
    * @desc Patches a ServiceAccount.  Currently, only the following fields are
    * updatable: `display_name` and `description`.  Only fields specified in
    * the request are guaranteed to be returned in the response. Other fields
    * in the response may be empty.  Note: The field mask is required.
    * @alias iam.projects.serviceAccounts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Requests using `-` as a wildcard for the `PROJECT_ID` will infer the project from the `account` and the `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.  In responses the resource name will always be in the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    * @param {().PatchServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaServiceAccount] = js.native
  def patch(callback: BodyResponseCallback[SchemaServiceAccount]): Unit = js.native
  def patch(params: ParamsResourceProjectsServiceaccountsPatch): GaxiosPromise[SchemaServiceAccount] = js.native
  def patch(
    params: ParamsResourceProjectsServiceaccountsPatch,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsServiceaccountsPatch,
    options: BodyResponseCallback[SchemaServiceAccount],
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsServiceaccountsPatch, options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def patch(
    params: ParamsResourceProjectsServiceaccountsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.setIamPolicy
    * @desc Sets the Cloud IAM access control policy for a ServiceAccount.
    * Note: Service accounts are both [resources and
    * identities](/iam/docs/service-accounts#service_account_permissions). This
    * method treats the service account as a resource. Use it to grant members
    * access to the service account, such as when they need to impersonate it.
    * This method does not grant the service account access to other resources,
    * such as projects. To grant a service account access to resources, include
    * the service account in the Cloud IAM policy for the desired resource,
    * then call the appropriate `setIamPolicy` method on the target resource.
    * For example, to grant a service account access to a project, call the
    * [projects.setIamPolicy](/resource-manager/reference/rest/v1/projects/setIamPolicy)
    * method.
    * @alias iam.projects.serviceAccounts.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsServiceaccountsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsServiceaccountsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsServiceaccountsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsServiceaccountsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsServiceaccountsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.signBlob
    * @desc **Note**: This method is in the process of being deprecated. Call
    * the
    * [`signBlob()`](/iam/credentials/reference/rest/v1/projects.serviceAccounts/signBlob)
    * method of the Cloud IAM Service Account Credentials API instead.  Signs a
    * blob using a service account's system-managed private key.
    * @alias iam.projects.serviceAccounts.signBlob
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {().SignBlobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signBlob(): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(callback: BodyResponseCallback[SchemaSignBlobResponse]): Unit = js.native
  def signBlob(params: ParamsResourceProjectsServiceaccountsSignblob): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    callback: BodyResponseCallback[SchemaSignBlobResponse]
  ): Unit = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    options: BodyResponseCallback[SchemaSignBlobResponse],
    callback: BodyResponseCallback[SchemaSignBlobResponse]
  ): Unit = js.native
  def signBlob(params: ParamsResourceProjectsServiceaccountsSignblob, options: MethodOptions): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignBlobResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.signJwt
    * @desc **Note**: This method is in the process of being deprecated. Call
    * the
    * [`signJwt()`](/iam/credentials/reference/rest/v1/projects.serviceAccounts/signJwt)
    * method of the Cloud IAM Service Account Credentials API instead.  Signs a
    * JWT using a service account's system-managed private key.  If no expiry
    * time (`exp`) is provided in the `SignJwtRequest`, IAM sets an an expiry
    * time of one hour by default. If you request an expiry time of more than
    * one hour, the request will fail.
    * @alias iam.projects.serviceAccounts.signJwt
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {().SignJwtRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signJwt(): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(callback: BodyResponseCallback[SchemaSignJwtResponse]): Unit = js.native
  def signJwt(params: ParamsResourceProjectsServiceaccountsSignjwt): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    callback: BodyResponseCallback[SchemaSignJwtResponse]
  ): Unit = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    options: BodyResponseCallback[SchemaSignJwtResponse],
    callback: BodyResponseCallback[SchemaSignJwtResponse]
  ): Unit = js.native
  def signJwt(params: ParamsResourceProjectsServiceaccountsSignjwt, options: MethodOptions): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignJwtResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.testIamPermissions
    * @desc Tests the specified permissions against the IAM access control
    * policy for a ServiceAccount.
    * @alias iam.projects.serviceAccounts.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsServiceaccountsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsServiceaccountsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsServiceaccountsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsServiceaccountsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsServiceaccountsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.undelete
    * @desc Restores a deleted ServiceAccount. This is to be used as an action
    * of last resort.  A service account may not always be restorable.
    * @alias iam.projects.serviceAccounts.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_UNIQUE_ID}'. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account.
    * @param {().UndeleteServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[SchemaUndeleteServiceAccountResponse] = js.native
  def undelete(callback: BodyResponseCallback[SchemaUndeleteServiceAccountResponse]): Unit = js.native
  def undelete(params: ParamsResourceProjectsServiceaccountsUndelete): GaxiosPromise[SchemaUndeleteServiceAccountResponse] = js.native
  def undelete(
    params: ParamsResourceProjectsServiceaccountsUndelete,
    callback: BodyResponseCallback[SchemaUndeleteServiceAccountResponse]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceProjectsServiceaccountsUndelete,
    options: BodyResponseCallback[SchemaUndeleteServiceAccountResponse],
    callback: BodyResponseCallback[SchemaUndeleteServiceAccountResponse]
  ): Unit = js.native
  def undelete(params: ParamsResourceProjectsServiceaccountsUndelete, options: MethodOptions): GaxiosPromise[SchemaUndeleteServiceAccountResponse] = js.native
  def undelete(
    params: ParamsResourceProjectsServiceaccountsUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUndeleteServiceAccountResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.update
    * @desc Note: This method is in the process of being deprecated. Use
    * PatchServiceAccount instead.  Updates a ServiceAccount.  Currently, only
    * the following fields are updatable: `display_name` . The `etag` is
    * mandatory.
    * @alias iam.projects.serviceAccounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Requests using `-` as a wildcard for the `PROJECT_ID` will infer the project from the `account` and the `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.  In responses the resource name will always be in the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    * @param {().ServiceAccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaServiceAccount] = js.native
  def update(callback: BodyResponseCallback[SchemaServiceAccount]): Unit = js.native
  def update(params: ParamsResourceProjectsServiceaccountsUpdate): GaxiosPromise[SchemaServiceAccount] = js.native
  def update(
    params: ParamsResourceProjectsServiceaccountsUpdate,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsServiceaccountsUpdate,
    options: BodyResponseCallback[SchemaServiceAccount],
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsServiceaccountsUpdate, options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def update(
    params: ParamsResourceProjectsServiceaccountsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
}

