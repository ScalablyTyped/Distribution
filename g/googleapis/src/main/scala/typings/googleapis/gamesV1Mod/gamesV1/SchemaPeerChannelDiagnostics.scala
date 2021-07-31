package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for peer channel diagnostics.
  */
trait SchemaPeerChannelDiagnostics extends StObject {
  
  /**
    * Number of bytes received.
    */
  var bytesReceived: js.UndefOr[SchemaAggregateStats] = js.undefined
  
  /**
    * Number of bytes sent.
    */
  var bytesSent: js.UndefOr[SchemaAggregateStats] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#peerChannelDiagnostics.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Number of messages lost.
    */
  var numMessagesLost: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of messages received.
    */
  var numMessagesReceived: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of messages sent.
    */
  var numMessagesSent: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of send failures.
    */
  var numSendFailures: js.UndefOr[Double] = js.undefined
  
  /**
    * Roundtrip latency stats in milliseconds.
    */
  var roundtripLatencyMillis: js.UndefOr[SchemaAggregateStats] = js.undefined
}
object SchemaPeerChannelDiagnostics {
  
  @scala.inline
  def apply(): SchemaPeerChannelDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeerChannelDiagnostics]
  }
  
  @scala.inline
  implicit class SchemaPeerChannelDiagnosticsMutableBuilder[Self <: SchemaPeerChannelDiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesReceived(value: SchemaAggregateStats): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    @scala.inline
    def setBytesSent(value: SchemaAggregateStats): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNumMessagesLost(value: Double): Self = StObject.set(x, "numMessagesLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumMessagesLostUndefined: Self = StObject.set(x, "numMessagesLost", js.undefined)
    
    @scala.inline
    def setNumMessagesReceived(value: Double): Self = StObject.set(x, "numMessagesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumMessagesReceivedUndefined: Self = StObject.set(x, "numMessagesReceived", js.undefined)
    
    @scala.inline
    def setNumMessagesSent(value: Double): Self = StObject.set(x, "numMessagesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumMessagesSentUndefined: Self = StObject.set(x, "numMessagesSent", js.undefined)
    
    @scala.inline
    def setNumSendFailures(value: Double): Self = StObject.set(x, "numSendFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumSendFailuresUndefined: Self = StObject.set(x, "numSendFailures", js.undefined)
    
    @scala.inline
    def setRoundtripLatencyMillis(value: SchemaAggregateStats): Self = StObject.set(x, "roundtripLatencyMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundtripLatencyMillisUndefined: Self = StObject.set(x, "roundtripLatencyMillis", js.undefined)
  }
}
