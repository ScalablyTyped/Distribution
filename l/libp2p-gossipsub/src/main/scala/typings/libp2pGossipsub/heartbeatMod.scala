package typings.libp2pGossipsub

import typings.libp2pGossipsub.anon.Cancel
import typings.libp2pGossipsub.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heartbeatMod {
  
  @JSImport("libp2p-gossipsub/src/heartbeat", "Heartbeat")
  @js.native
  class Heartbeat protected () extends StObject {
    /**
      * @param {Object} gossipsub
      * @constructor
      */
    def this(gossipsub: ^) = this()
    
    /**
      * Maintains the mesh and fanout maps in gossipsub.
      *
      * @returns {void}
      */
    def _heartbeat(): Unit = js.native
    
    var _heartbeatTimer: Cancel | Null = js.native
    
    var gossipsub: ^ = js.native
    
    def start(): Unit = js.native
    
    /**
      * Unmounts the gossipsub protocol and shuts down every connection
      * @override
      * @returns {void}
      */
    def stop(): Unit = js.native
  }
}
