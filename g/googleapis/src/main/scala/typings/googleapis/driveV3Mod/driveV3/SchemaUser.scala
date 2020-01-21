package typings.googleapis.driveV3Mod.driveV3

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
    * The email address of the user. This may not be present in certain
    * contexts if the user has not made their email address visible to the
    * requester.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#user&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether this user is the requesting user.
    */
  var me: js.UndefOr[Boolean] = js.native
  /**
    * The user&#39;s ID as visible in Permission resources.
    */
  var permissionId: js.UndefOr[String] = js.native
  /**
    * A link to the user&#39;s profile photo, if available.
    */
  var photoLink: js.UndefOr[String] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(
    displayName: String = null,
    emailAddress: String = null,
    kind: String = null,
    me: js.UndefOr[Boolean] = js.undefined,
    permissionId: String = null,
    photoLink: String = null
  ): SchemaUser = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(me)) __obj.updateDynamic("me")(me.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (photoLink != null) __obj.updateDynamic("photoLink")(photoLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUser]
  }
}

