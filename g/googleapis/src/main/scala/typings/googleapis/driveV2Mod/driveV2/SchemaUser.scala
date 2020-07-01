package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a Drive user.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * A plain text displayable name for this user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email address of the user.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Whether this user is the same as the authenticated user for whom the
    * request was made.
    */
  var isAuthenticatedUser: js.UndefOr[Boolean] = js.native
  /**
    * This is always drive#user.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The user&#39;s ID as visible in the permissions collection.
    */
  var permissionId: js.UndefOr[String] = js.native
  /**
    * The user&#39;s profile picture.
    */
  var picture: js.UndefOr[Url] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(
    displayName: String = null,
    emailAddress: String = null,
    isAuthenticatedUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    permissionId: String = null,
    picture: Url = null
  ): SchemaUser = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isAuthenticatedUser)) __obj.updateDynamic("isAuthenticatedUser")(isAuthenticatedUser.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUser]
  }
}

