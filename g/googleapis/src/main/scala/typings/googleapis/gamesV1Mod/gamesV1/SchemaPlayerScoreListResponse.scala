package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of score submission statuses.
  */
@js.native
trait SchemaPlayerScoreListResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The score submissions statuses.
    */
  var submittedScores: js.UndefOr[js.Array[SchemaPlayerScoreResponse]] = js.native
}

object SchemaPlayerScoreListResponse {
  @scala.inline
  def apply(kind: String = null, submittedScores: js.Array[SchemaPlayerScoreResponse] = null): SchemaPlayerScoreListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (submittedScores != null) __obj.updateDynamic("submittedScores")(submittedScores.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayerScoreListResponse]
  }
}

