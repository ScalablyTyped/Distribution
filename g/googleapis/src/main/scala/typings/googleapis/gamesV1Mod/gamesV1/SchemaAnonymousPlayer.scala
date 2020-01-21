package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an anonymous player
  */
@js.native
trait SchemaAnonymousPlayer extends js.Object {
  /**
    * The base URL for the image to display for the anonymous player.
    */
  var avatarImageUrl: js.UndefOr[String] = js.native
  /**
    * The name to display for the anonymous player.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#anonymousPlayer.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAnonymousPlayer {
  @scala.inline
  def apply(avatarImageUrl: String = null, displayName: String = null, kind: String = null): SchemaAnonymousPlayer = {
    val __obj = js.Dynamic.literal()
    if (avatarImageUrl != null) __obj.updateDynamic("avatarImageUrl")(avatarImageUrl.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnonymousPlayer]
  }
}

