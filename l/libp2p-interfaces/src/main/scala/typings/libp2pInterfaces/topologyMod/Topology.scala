package typings.libp2pInterfaces.topologyMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Topology extends js.Object {
  
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
