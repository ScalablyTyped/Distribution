package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaTurnBasedMatchTurn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchTurn]
  }
  
  @scala.inline
  implicit class SchemaTurnBasedMatchTurnOps[Self <: SchemaTurnBasedMatchTurn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: SchemaTurnBasedMatchDataRequest): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMatchVersion(value: Double): Self = this.set("matchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchVersion: Self = this.set("matchVersion", js.undefined)
    
    @scala.inline
    def setPendingParticipantId(value: String): Self = this.set("pendingParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingParticipantId: Self = this.set("pendingParticipantId", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaParticipantResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SchemaParticipantResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
