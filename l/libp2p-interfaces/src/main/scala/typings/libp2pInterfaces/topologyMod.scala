package typings.libp2pInterfaces

import org.scalablytyped.runtime.Shortcut
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topologyMod extends Shortcut {
  
  @JSImport("libp2p-interfaces/src/topology", JSImport.Namespace)
  @js.native
  val ^ : Topology = js.native
  
  @js.native
  trait Topology extends StObject {
    
    var _onConnect: js.Function = js.native
    
    var _onDisconnect: js.Function = js.native
    
    var _registrar: js.Any = js.native
    
    /**
      * @typedef PeerId
      * @type {import('peer-id')}
      */
    /**
      * Notify about peer disconnected event.
      * @param {PeerId} peerId
      * @returns {void}
      */
    def disconnect(peerId: typings.peerId.mod.^): Unit = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    /**
      * Set of peers that support the protocol.
      * @type {Set<string>}
      */
    var peers: Set[String] = js.native
    
    def registrar_=(arg: js.Any): Unit = js.native
  }
  
  type _To = Topology
  
  /* This means you don't have to write `^`, but can instead just say `topologyMod.foo` */
  override def _to: Topology = ^
}
