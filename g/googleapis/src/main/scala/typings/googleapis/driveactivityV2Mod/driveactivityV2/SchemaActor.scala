package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The actor of a Drive activity.
  */
@js.native
trait SchemaActor extends js.Object {
  /**
    * An administrator.
    */
  var administrator: js.UndefOr[SchemaAdministrator] = js.native
  /**
    * An anonymous user.
    */
  var anonymous: js.UndefOr[SchemaAnonymousUser] = js.native
  /**
    * An account acting on behalf of another.
    */
  var impersonation: js.UndefOr[SchemaImpersonation] = js.native
  /**
    * A non-user actor (i.e. system triggered).
    */
  var system: js.UndefOr[SchemaSystemEvent] = js.native
  /**
    * An end user.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaActor {
  @scala.inline
  def apply(
    administrator: SchemaAdministrator = null,
    anonymous: SchemaAnonymousUser = null,
    impersonation: SchemaImpersonation = null,
    system: SchemaSystemEvent = null,
    user: SchemaUser = null
  ): SchemaActor = {
    val __obj = js.Dynamic.literal()
    if (administrator != null) __obj.updateDynamic("administrator")(administrator.asInstanceOf[js.Any])
    if (anonymous != null) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (impersonation != null) __obj.updateDynamic("impersonation")(impersonation.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActor]
  }
}

