package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the object representing a turn.
  */
@js.native
trait SchemaTurnBasedMatchTurn extends js.Object {
  /**
    * The shared game state data after the turn is over.
    */
  var data: js.UndefOr[SchemaTurnBasedMatchDataRequest] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchTurn.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The version of this match: an increasing counter, used to avoid
    * out-of-date updates to the match.
    */
  var matchVersion: js.UndefOr[Double] = js.native
  /**
    * The ID of the participant who should take their turn next. May be set to
    * the current player&#39;s participant ID to update match state without
    * changing the turn. If not set, the match will wait for other player(s) to
    * join via automatching; this is only valid if automatch criteria is set on
    * the match with remaining slots for automatched players.
    */
  var pendingParticipantId: js.UndefOr[String] = js.native
  /**
    * The match results for the participants in the match.
    */
  var results: js.UndefOr[js.Array[SchemaParticipantResult]] = js.native
}

object SchemaTurnBasedMatchTurn {
  @scala.inline
  def apply(
    data: SchemaTurnBasedMatchDataRequest = null,
    kind: String = null,
    matchVersion: Int | Double = null,
    pendingParticipantId: String = null,
    results: js.Array[SchemaParticipantResult] = null
  ): SchemaTurnBasedMatchTurn = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (matchVersion != null) __obj.updateDynamic("matchVersion")(matchVersion.asInstanceOf[js.Any])
    if (pendingParticipantId != null) __obj.updateDynamic("pendingParticipantId")(pendingParticipantId.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTurnBasedMatchTurn]
  }
}

