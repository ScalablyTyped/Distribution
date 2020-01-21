package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a turn-based match results object.
  */
@js.native
trait SchemaTurnBasedMatchResults extends js.Object {
  /**
    * The final match data.
    */
  var data: js.UndefOr[SchemaTurnBasedMatchDataRequest] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchResults.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The version of the match being updated.
    */
  var matchVersion: js.UndefOr[Double] = js.native
  /**
    * The match results for the participants in the match.
    */
  var results: js.UndefOr[js.Array[SchemaParticipantResult]] = js.native
}

object SchemaTurnBasedMatchResults {
  @scala.inline
  def apply(
    data: SchemaTurnBasedMatchDataRequest = null,
    kind: String = null,
    matchVersion: Int | Double = null,
    results: js.Array[SchemaParticipantResult] = null
  ): SchemaTurnBasedMatchResults = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (matchVersion != null) __obj.updateDynamic("matchVersion")(matchVersion.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTurnBasedMatchResults]
  }
}

