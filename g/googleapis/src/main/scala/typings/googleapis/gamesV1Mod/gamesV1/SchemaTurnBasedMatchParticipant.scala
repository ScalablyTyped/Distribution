package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a participant in a turn-based match.
  */
trait SchemaTurnBasedMatchParticipant extends StObject {
  
  /**
    * True if this participant was auto-matched with the requesting player.
    */
  var autoMatched: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about a player that has been anonymously auto-matched against
    * the requesting player. (Either player or autoMatchedPlayer will be set.)
    */
  var autoMatchedPlayer: js.UndefOr[SchemaAnonymousPlayer] = js.undefined
  
  /**
    * An identifier for the participant in the scope of the match. Cannot be
    * used to identify a player across matches or in other contexts.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchParticipant.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the player. Not populated if this player was
    * anonymously auto-matched against the requesting player. (Either player or
    * autoMatchedPlayer will be set.)
    */
  var player: js.UndefOr[SchemaPlayer] = js.undefined
  
  /**
    * The status of the participant with respect to the match. Possible values
    * are:   - &quot;PARTICIPANT_NOT_INVITED_YET&quot; - The participant is
    * slated to be invited to the match, but the invitation has not been sent;
    * the invite will be sent when it becomes their turn.  -
    * &quot;PARTICIPANT_INVITED&quot; - The participant has been invited to
    * join the match, but has not yet responded.  -
    * &quot;PARTICIPANT_JOINED&quot; - The participant has joined the match
    * (either after creating it or accepting an invitation.)  -
    * &quot;PARTICIPANT_DECLINED&quot; - The participant declined an invitation
    * to join the match.  - &quot;PARTICIPANT_LEFT&quot; - The participant
    * joined the match and then left it.  - &quot;PARTICIPANT_FINISHED&quot; -
    * The participant finished playing in the match.  -
    * &quot;PARTICIPANT_UNRESPONSIVE&quot; - The participant did not take their
    * turn in the allotted time.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaTurnBasedMatchParticipant {
  
  @scala.inline
  def apply(): SchemaTurnBasedMatchParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchParticipant]
  }
  
  @scala.inline
  implicit class SchemaTurnBasedMatchParticipantMutableBuilder[Self <: SchemaTurnBasedMatchParticipant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMatched(value: Boolean): Self = StObject.set(x, "autoMatched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMatchedPlayer(value: SchemaAnonymousPlayer): Self = StObject.set(x, "autoMatchedPlayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMatchedPlayerUndefined: Self = StObject.set(x, "autoMatchedPlayer", js.undefined)
    
    @scala.inline
    def setAutoMatchedUndefined: Self = StObject.set(x, "autoMatched", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlayer(value: SchemaPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
