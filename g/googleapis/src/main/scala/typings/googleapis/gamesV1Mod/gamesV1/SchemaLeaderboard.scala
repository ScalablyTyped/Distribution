package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the Leaderboard resource.
  */
@js.native
trait SchemaLeaderboard extends js.Object {
  /**
    * The icon for the leaderboard.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The leaderboard ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Indicates whether the icon image being returned is a default image, or is
    * game-provided.
    */
  var isIconUrlDefault: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboard.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the leaderboard.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * How scores are ordered. Possible values are:   -
    * &quot;LARGER_IS_BETTER&quot; - Larger values are better; scores are
    * sorted in descending order.  - &quot;SMALLER_IS_BETTER&quot; - Smaller
    * values are better; scores are sorted in ascending order.
    */
  var order: js.UndefOr[String] = js.native
}

object SchemaLeaderboard {
  @scala.inline
  def apply(
    iconUrl: String = null,
    id: String = null,
    isIconUrlDefault: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    name: String = null,
    order: String = null
  ): SchemaLeaderboard = {
    val __obj = js.Dynamic.literal()
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isIconUrlDefault)) __obj.updateDynamic("isIconUrlDefault")(isIconUrlDefault.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLeaderboard]
  }
}

