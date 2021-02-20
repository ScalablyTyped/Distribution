package typings.guacamoleClient

import typings.guacamoleClient.guacamoleClientNumbers.`0`
import typings.guacamoleClient.guacamoleClientNumbers.`1`
import typings.guacamoleClient.guacamoleClientNumbers.`2`
import typings.guacamoleClient.guacamoleClientNumbers.`3`
import typings.guacamoleClient.guacamoleClientStrings._empty
import typings.guacamoleClient.statusMod.Status
import typings.guacamoleClient.tunnelMod.Tunnel.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tunnelMod {
  
  @JSImport("guacamole-client/lib/Tunnel", "Tunnel")
  @js.native
  abstract class Tunnel () extends StObject {
    
    /**
      * Connect to the tunnel with the given optional data. This data is
      * typically used for authentication. The format of data accepted is
      * up to the tunnel implementation.
      *
      * @param data The data to send to the tunnel when connecting.
      */
    def connect(data: String): Unit = js.native
    
    /**
      * Disconnect from the tunnel.
      */
    def disconnect(): Unit = js.native
    
    /**
      * Returns whether this tunnel is currently connected.
      * @returns true if this tunnel is currently connected, false otherwise.
      */
    def isConnected(): Boolean = js.native
    
    /**
      * Fired whenever an error is encountered by the tunnel.
      * @event
      * @param status A status object which describes the error.
      */
    var onerror: Null | (js.Function1[/* status */ Status, Unit]) = js.native
    
    /**
      * Fired once for every complete Guacamole instruction received, in order.
      * @event
      * @param opcode The Guacamole instruction opcode.
      * @param parameters The parameters provided for the instruction, if any.
      */
    var oninstruction: Null | (js.Function2[/* opcode */ String, /* args */ js.Array[_], Unit]) = js.native
    
    /**
      * Fired whenever the state of the tunnel changes.
      * @event
      * @param state The new state of the client.
      */
    var onstatechange: Null | (js.Function1[/* state */ State, Unit]) = js.native
    
    /**
      * The maximum amount of time to wait for data to be received, in
      * milliseconds. If data is not received within this amount of time,
      * the tunnel is closed with an error. The default value is 15000.
      */
    var receiveTimeout: Double = js.native
    
    /**
      * Send the given message through the tunnel to the service on the other
      * side. All messages are guaranteed to be received in the order sent.
      *
      * @param elements
      *     The elements of the message to send to the service on the other side
      *     of the tunnel.
      */
    def sendMessage(message: js.Any, messages: js.Any*): Unit = js.native
    
    /**
      * The current state of this tunnel.
      */
    var state: State = js.native
    
    /**
      * The amount of time to wait for data to be received before considering
      * the connection to be unstable, in milliseconds. If data is not received
      * within this amount of time, the tunnel status is updated to warn that
      * the connection appears unresponsive and may close. The default value is
      * 1500.
      */
    var unstableThreshold: Double = js.native
    
    /**
      * The UUID uniquely identifying this tunnel. If not yet known, this will
      * be null.
      */
    var uuid: String | Null = js.native
  }
  /* static members */
  object Tunnel {
    
    @JSImport("guacamole-client/lib/Tunnel", "Tunnel.INTERNAL_DATA_OPCODE")
    @js.native
    val INTERNAL_DATA_OPCODE: _empty = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.guacamoleClient.guacamoleClientNumbers.`0`
      - typings.guacamoleClient.guacamoleClientNumbers.`1`
      - typings.guacamoleClient.guacamoleClientNumbers.`2`
      - typings.guacamoleClient.guacamoleClientNumbers.`3`
    */
    trait State extends StObject
    @JSImport("guacamole-client/lib/Tunnel", "Tunnel.State")
    @js.native
    val State: TunnelState = js.native
    
    /* Inlined std.Readonly<{  CONNECTING :0,   OPEN :1,   CLOSED :2,   UNSTABLE :3}> */
    @js.native
    trait TunnelState extends StObject {
      
      val CLOSED: `2` = js.native
      
      val CONNECTING: `0` = js.native
      
      val OPEN: `1` = js.native
      
      val UNSTABLE: `3` = js.native
    }
    object TunnelState {
      
      @scala.inline
      def apply(CLOSED: `2`, CONNECTING: `0`, OPEN: `1`, UNSTABLE: `3`): TunnelState = {
        val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], UNSTABLE = UNSTABLE.asInstanceOf[js.Any])
        __obj.asInstanceOf[TunnelState]
      }
      
      @scala.inline
      implicit class TunnelStateMutableBuilder[Self <: TunnelState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCLOSED(value: `2`): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCONNECTING(value: `0`): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOPEN(value: `1`): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUNSTABLE(value: `3`): Self = StObject.set(x, "UNSTABLE", value.asInstanceOf[js.Any])
      }
    }
  }
}
