package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a third party application verification response
  * resource.
  */
@js.native
trait SchemaApplicationVerifyResponse extends js.Object {
  /**
    * An alternate ID that was once used for the player that was issued the
    * auth token used in this request. (This field is not normally populated.)
    */
  var alternate_player_id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#applicationVerifyResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the player that was issued the auth token used in this request.
    */
  var player_id: js.UndefOr[String] = js.native
}

object SchemaApplicationVerifyResponse {
  @scala.inline
  def apply(alternate_player_id: String = null, kind: String = null, player_id: String = null): SchemaApplicationVerifyResponse = {
    val __obj = js.Dynamic.literal()
    if (alternate_player_id != null) __obj.updateDynamic("alternate_player_id")(alternate_player_id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (player_id != null) __obj.updateDynamic("player_id")(player_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplicationVerifyResponse]
  }
}

