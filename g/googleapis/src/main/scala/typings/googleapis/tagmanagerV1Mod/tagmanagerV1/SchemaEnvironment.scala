package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

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
  var authorizationTimestampMs: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  var containerVersionId: js.UndefOr[String] = js.native
  /**
    * The environment description. Can be set or changed only on USER type
    * environments.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether or not to enable debug by default on for the environment.
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
    * The type of this environment.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Default preview page url for the environment.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaEnvironment {
  @scala.inline
  def apply(
    accountId: String = null,
    authorizationCode: String = null,
    authorizationTimestampMs: String = null,
    containerId: String = null,
    containerVersionId: String = null,
    description: String = null,
    enableDebug: js.UndefOr[Boolean] = js.undefined,
    environmentId: String = null,
    fingerprint: String = null,
    name: String = null,
    `type`: String = null,
    url: String = null
  ): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (authorizationCode != null) __obj.updateDynamic("authorizationCode")(authorizationCode.asInstanceOf[js.Any])
    if (authorizationTimestampMs != null) __obj.updateDynamic("authorizationTimestampMs")(authorizationTimestampMs.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (containerVersionId != null) __obj.updateDynamic("containerVersionId")(containerVersionId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDebug)) __obj.updateDynamic("enableDebug")(enableDebug.asInstanceOf[js.Any])
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvironment]
  }
}

