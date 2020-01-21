package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an end user.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * A user whose account has since been deleted.
    */
  var deletedUser: js.UndefOr[SchemaDeletedUser] = js.native
  /**
    * A known user.
    */
  var knownUser: js.UndefOr[SchemaKnownUser] = js.native
  /**
    * A user about whom nothing is currently known.
    */
  var unknownUser: js.UndefOr[SchemaUnknownUser] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(
    deletedUser: SchemaDeletedUser = null,
    knownUser: SchemaKnownUser = null,
    unknownUser: SchemaUnknownUser = null
  ): SchemaUser = {
    val __obj = js.Dynamic.literal()
    if (deletedUser != null) __obj.updateDynamic("deletedUser")(deletedUser.asInstanceOf[js.Any])
    if (knownUser != null) __obj.updateDynamic("knownUser")(knownUser.asInstanceOf[js.Any])
    if (unknownUser != null) __obj.updateDynamic("unknownUser")(unknownUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUser]
  }
}

