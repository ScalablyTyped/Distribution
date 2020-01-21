package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for metadata about a player playing a game with the
  * currently authenticated user.
  */
@js.native
trait SchemaGamesPlayedResource extends js.Object {
  /**
    * True if the player was auto-matched with the currently authenticated
    * user.
    */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /**
    * The last time the player played the game in milliseconds since the epoch
    * in UTC.
    */
  var timeMillis: js.UndefOr[String] = js.native
}

object SchemaGamesPlayedResource {
  @scala.inline
  def apply(autoMatched: js.UndefOr[Boolean] = js.undefined, timeMillis: String = null): SchemaGamesPlayedResource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoMatched)) __obj.updateDynamic("autoMatched")(autoMatched.asInstanceOf[js.Any])
    if (timeMillis != null) __obj.updateDynamic("timeMillis")(timeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGamesPlayedResource]
  }
}

