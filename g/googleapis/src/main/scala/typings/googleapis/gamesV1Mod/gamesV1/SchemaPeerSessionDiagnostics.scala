package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for peer session diagnostics.
  */
trait SchemaPeerSessionDiagnostics extends StObject {
  
  /**
    * Connected time in milliseconds.
    */
  var connectedTimestampMillis: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#peerSessionDiagnostics.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The participant ID of the peer.
    */
  var participantId: js.UndefOr[String] = js.undefined
  
  /**
    * Reliable channel diagnostics.
    */
  var reliableChannel: js.UndefOr[SchemaPeerChannelDiagnostics] = js.undefined
  
  /**
    * Unreliable channel diagnostics.
    */
  var unreliableChannel: js.UndefOr[SchemaPeerChannelDiagnostics] = js.undefined
}
object SchemaPeerSessionDiagnostics {
  
  @scala.inline
  def apply(): SchemaPeerSessionDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeerSessionDiagnostics]
  }
  
  @scala.inline
  implicit class SchemaPeerSessionDiagnosticsMutableBuilder[Self <: SchemaPeerSessionDiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectedTimestampMillis(value: String): Self = StObject.set(x, "connectedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedTimestampMillisUndefined: Self = StObject.set(x, "connectedTimestampMillis", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    @scala.inline
    def setReliableChannel(value: SchemaPeerChannelDiagnostics): Self = StObject.set(x, "reliableChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReliableChannelUndefined: Self = StObject.set(x, "reliableChannel", js.undefined)
    
    @scala.inline
    def setUnreliableChannel(value: SchemaPeerChannelDiagnostics): Self = StObject.set(x, "unreliableChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreliableChannelUndefined: Self = StObject.set(x, "unreliableChannel", js.undefined)
  }
}
