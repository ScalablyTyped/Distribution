package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Environment. Note that a user can create,
  * delete and update environments of type USER, but can only update the
  * enable_debug and url fields of environments of other types.
  */
@js.native
trait SchemaEnvironment extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The environment authorization code.
    */
  var authorizationCode: js.UndefOr[String] = js.native
  /**
    * The last update time-stamp for the authorization code.
    */
  var authorizationTimestamp: js.UndefOr[SchemaTimestamp] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * Represents a link to a container version.
    */
  var containerVersionId: js.UndefOr[String] = js.native
  /**
    * The environment description. Can be set or changed only on USER type
    * environments.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether or not to enable debug by default for the environment.
    */
  var enableDebug: js.UndefOr[Boolean] = js.native
  /**
    * GTM Environment ID uniquely identifies the GTM Environment.
    */
  var environmentId: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM environment as computed at storage time. This
    * value is recomputed whenever the environment is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The environment display name. Can be set or changed only on USER type
    * environments.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * GTM Environment&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  /**
    * The type of this environment.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Default preview page url for the environment.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Represents a link to a quick preview of a workspace.
    */
  var workspaceId: js.UndefOr[String] = js.native
}

object SchemaEnvironment {
  @scala.inline
  def apply(
    accountId: String = null,
    authorizationCode: String = null,
    authorizationTimestamp: SchemaTimestamp = null,
    containerId: String = null,
    containerVersionId: String = null,
    description: String = null,
    enableDebug: js.UndefOr[Boolean] = js.undefined,
    environmentId: String = null,
    fingerprint: String = null,
    name: String = null,
    path: String = null,
    tagManagerUrl: String = null,
    `type`: String = null,
    url: String = null,
    workspaceId: String = null
  ): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (authorizationCode != null) __obj.updateDynamic("authorizationCode")(authorizationCode.asInstanceOf[js.Any])
    if (authorizationTimestamp != null) __obj.updateDynamic("authorizationTimestamp")(authorizationTimestamp.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (containerVersionId != null) __obj.updateDynamic("containerVersionId")(containerVersionId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDebug)) __obj.updateDynamic("enableDebug")(enableDebug.asInstanceOf[js.Any])
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvironment]
  }
}

