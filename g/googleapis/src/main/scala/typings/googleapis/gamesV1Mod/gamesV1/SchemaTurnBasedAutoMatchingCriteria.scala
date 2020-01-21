package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an turn-based auto-match criteria object.
  */
@js.native
trait SchemaTurnBasedAutoMatchingCriteria extends js.Object {
  /**
    * A bitmask indicating when auto-matches are valid. When ANDed with other
    * exclusive bitmasks, the result must be zero. Can be used to support
    * exclusive roles within a game.
    */
  var exclusiveBitmask: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedAutoMatchingCriteria.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The maximum number of players that should be added to the match by
    * auto-matching.
    */
  var maxAutoMatchingPlayers: js.UndefOr[Double] = js.native
  /**
    * The minimum number of players that should be added to the match by
    * auto-matching.
    */
  var minAutoMatchingPlayers: js.UndefOr[Double] = js.native
}

object SchemaTurnBasedAutoMatchingCriteria {
  @scala.inline
  def apply(
    exclusiveBitmask: String = null,
    kind: String = null,
    maxAutoMatchingPlayers: Int | Double = null,
    minAutoMatchingPlayers: Int | Double = null
  ): SchemaTurnBasedAutoMatchingCriteria = {
    val __obj = js.Dynamic.literal()
    if (exclusiveBitmask != null) __obj.updateDynamic("exclusiveBitmask")(exclusiveBitmask.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maxAutoMatchingPlayers != null) __obj.updateDynamic("maxAutoMatchingPlayers")(maxAutoMatchingPlayers.asInstanceOf[js.Any])
    if (minAutoMatchingPlayers != null) __obj.updateDynamic("minAutoMatchingPlayers")(minAutoMatchingPlayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTurnBasedAutoMatchingCriteria]
  }
}

