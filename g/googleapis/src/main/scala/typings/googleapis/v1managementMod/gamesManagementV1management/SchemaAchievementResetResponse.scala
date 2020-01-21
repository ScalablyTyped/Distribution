package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement reset response.
  */
@js.native
trait SchemaAchievementResetResponse extends js.Object {
  /**
    * The current state of the achievement. This is the same as the initial
    * state of the achievement. Possible values are:   - &quot;HIDDEN&quot;-
    * Achievement is hidden.  - &quot;REVEALED&quot; - Achievement is revealed.
    * - &quot;UNLOCKED&quot; - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  /**
    * The ID of an achievement for which player state has been updated.
    */
  var definitionId: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Flag to indicate if the requested update actually occurred.
    */
  var updateOccurred: js.UndefOr[Boolean] = js.native
}

object SchemaAchievementResetResponse {
  @scala.inline
  def apply(
    currentState: String = null,
    definitionId: String = null,
    kind: String = null,
    updateOccurred: js.UndefOr[Boolean] = js.undefined
  ): SchemaAchievementResetResponse = {
    val __obj = js.Dynamic.literal()
    if (currentState != null) __obj.updateDynamic("currentState")(currentState.asInstanceOf[js.Any])
    if (definitionId != null) __obj.updateDynamic("definitionId")(definitionId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOccurred)) __obj.updateDynamic("updateOccurred")(updateOccurred.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAchievementResetResponse]
  }
}

