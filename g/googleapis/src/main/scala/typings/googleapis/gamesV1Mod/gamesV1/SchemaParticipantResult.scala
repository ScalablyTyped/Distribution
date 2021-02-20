package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a result for a match participant.
  */
@js.native
trait SchemaParticipantResult extends StObject {
  
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
  def apply(): SchemaParticipantResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParticipantResult]
  }
  
  @scala.inline
  implicit class SchemaParticipantResultMutableBuilder[Self <: SchemaParticipantResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    @scala.inline
    def setPlacing(value: Double): Self = StObject.set(x, "placing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacingUndefined: Self = StObject.set(x, "placing", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
