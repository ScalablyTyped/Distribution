package typings.googleapis.storageV1Mod.storageV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBucketsInsert extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Apply a predefined set of access controls to this bucket.
    */
  var predefinedAcl: js.UndefOr[String] = js.native
  /**
    * Apply a predefined set of default object access controls to this bucket.
    */
  var predefinedDefaultObjectAcl: js.UndefOr[String] = js.native
  /**
    * A valid API project identifier.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * Set of properties to return. Defaults to noAcl, unless the bucket
    * resource specifies acl or defaultObjectAcl properties, when it defaults
    * to full.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBucket] = js.native
  /**
    * The project to be billed for this request.
    */
  var userProject: js.UndefOr[String] = js.native
}

object ParamsResourceBucketsInsert {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    predefinedAcl: String = null,
    predefinedDefaultObjectAcl: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    project: String = null,
    projection: String = null,
    quotaUser: String = null,
    requestBody: SchemaBucket = null,
    userIp: String = null,
    userProject: String = null
  ): ParamsResourceBucketsInsert = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl.asInstanceOf[js.Any])
    if (predefinedDefaultObjectAcl != null) __obj.updateDynamic("predefinedDefaultObjectAcl")(predefinedDefaultObjectAcl.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceBucketsInsert]
  }
}

