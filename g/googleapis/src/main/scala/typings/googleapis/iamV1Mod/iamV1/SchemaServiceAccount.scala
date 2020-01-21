package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service account in the Identity and Access Management API.  To create a
  * service account, specify the `project_id` and the `account_id` for the
  * account.  The `account_id` is unique within the project, and is used to
  * generate the service account email address and a stable `unique_id`.  If
  * the account already exists, the account&#39;s resource name is returned in
  * the format of projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}. The caller
  * can use the name in other methods to access the account.  All other methods
  * can identify the service account using the format
  * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard
  * for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT`
  * value can be the `email` address or the `unique_id` of the service account.
  */
@js.native
trait SchemaServiceAccount extends js.Object {
  /**
    * Optional. A user-specified opaque description of the service account.
    * Must be less than or equal to 256 UTF-8 bytes.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * @OutputOnly A bool indicate if the service account is disabled. The field
    * is currently in alpha phase.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional. A user-specified name for the service account. Must be less
    * than or equal to 100 UTF-8 bytes.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The email address of the service account.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Optional. Note: `etag` is an inoperable legacy field that is only
    * returned for backwards compatibility.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The resource name of the service account in the following format:
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Requests using `-` as
    * a wildcard for the `PROJECT_ID` will infer the project from the `account`
    * and the `ACCOUNT` value can be the `email` address or the `unique_id` of
    * the service account.  In responses the resource name will always be in
    * the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The OAuth2 client id for the service account. This is used in
    * conjunction with the OAuth2 clientconfig API to make three legged OAuth2
    * (3LO) flows to access the data of Google users.
    */
  var oauth2ClientId: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The id of the project that owns the service account.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The unique and stable id of the service account.
    */
  var uniqueId: js.UndefOr[String] = js.native
}

object SchemaServiceAccount {
  @scala.inline
  def apply(
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    email: String = null,
    etag: String = null,
    name: String = null,
    oauth2ClientId: String = null,
    projectId: String = null,
    uniqueId: String = null
  ): SchemaServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth2ClientId != null) __obj.updateDynamic("oauth2ClientId")(oauth2ClientId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceAccount]
  }
}

