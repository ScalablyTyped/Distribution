package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the object representing a turn.
  */
trait SchemaTurnBasedMatchTurn extends StObject {
  
  /**
    * The shared game state data after the turn is over.
    */
  var data: js.UndefOr[SchemaTurnBasedMatchDataRequest] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchTurn.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The version of this match: an increasing counter, used to avoid
    * out-of-date updates to the match.
    */
  var matchVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the participant who should take their turn next. May be set to
    * the current player&#39;s participant ID to update match state without
    * changing the turn. If not set, the match will wait for other player(s) to
    * join via automatching; this is only valid if automatch criteria is set on
    * the match with remaining slots for automatched players.
    */
  var pendingParticipantId: js.UndefOr[String] = js.undefined
  
  /**
    * The match results for the participants in the match.
    */
  var results: js.UndefOr[js.Array[SchemaParticipantResult]] = js.undefined
}
object SchemaTurnBasedMatchTurn {
  
  @scala.inline
  def apply(): SchemaTurnBasedMatchTurn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchTurn]
  }
  
  @scala.inline
  implicit class SchemaTurnBasedMatchTurnMutableBuilder[Self <: SchemaTurnBasedMatchTurn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: SchemaTurnBasedMatchDataRequest): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMatchVersion(value: Double): Self = StObject.set(x, "matchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchVersionUndefined: Self = StObject.set(x, "matchVersion", js.undefined)
    
    @scala.inline
    def setPendingParticipantId(value: String): Self = StObject.set(x, "pendingParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingParticipantIdUndefined: Self = StObject.set(x, "pendingParticipantId", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaParticipantResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaParticipantResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
