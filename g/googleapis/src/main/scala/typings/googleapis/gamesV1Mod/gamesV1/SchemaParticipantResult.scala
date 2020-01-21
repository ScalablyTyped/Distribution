package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a result for a match participant.
  */
@js.native
trait SchemaParticipantResult extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#participantResult.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the participant.
    */
  var participantId: js.UndefOr[String] = js.native
  /**
    * The placement or ranking of the participant in the match results; a
    * number from one to the number of participants in the match. Multiple
    * participants may have the same placing value in case of a type.
    */
  var placing: js.UndefOr[Double] = js.native
  /**
    * The result of the participant for this match. Possible values are:   -
    * &quot;MATCH_RESULT_WIN&quot; - The participant won the match.  -
    * &quot;MATCH_RESULT_LOSS&quot; - The participant lost the match.  -
    * &quot;MATCH_RESULT_TIE&quot; - The participant tied the match.  -
    * &quot;MATCH_RESULT_NONE&quot; - There was no winner for the match (nobody
    * wins or loses this kind of game.)  - &quot;MATCH_RESULT_DISCONNECT&quot;
    * - The participant disconnected / left during the match.  -
    * &quot;MATCH_RESULT_DISAGREED&quot; - Different clients reported different
    * results for this participant.
    */
  var result: js.UndefOr[String] = js.native
}

object SchemaParticipantResult {
  @scala.inline
  def apply(
    kind: String = null,
    participantId: String = null,
    placing: Int | Double = null,
    result: String = null
  ): SchemaParticipantResult = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (participantId != null) __obj.updateDynamic("participantId")(participantId.asInstanceOf[js.Any])
    if (placing != null) __obj.updateDynamic("placing")(placing.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParticipantResult]
  }
}

