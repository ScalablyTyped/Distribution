package typings.libp2pGossipsub.interfacesMod

import typings.libp2pGossipsub.anon.Stream
import typings.multiaddr.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Libp2p extends js.Object {
  
  var connectionManager: ConnectionManager = js.native
  
  def dialProtocol(peer: String, protocols: String): js.Promise[Stream] = js.native
  def dialProtocol(peer: String, protocols: String, options: js.Object): js.Promise[Stream] = js.native
  def dialProtocol(peer: String, protocols: js.Array[String]): js.Promise[Stream] = js.native
  def dialProtocol(peer: String, protocols: js.Array[String], options: js.Object): js.Promise[Stream] = js.native
  def dialProtocol(peer: ^, protocols: String): js.Promise[Stream] = js.native
  def dialProtocol(peer: ^, protocols: String, options: js.Object): js.Promise[Stream] = js.native
  def dialProtocol(peer: ^, protocols: js.Array[String]): js.Promise[Stream] = js.native
  def dialProtocol(peer: ^, protocols: js.Array[String], options: js.Object): js.Promise[Stream] = js.native
  def dialProtocol(peer: typings.peerId.mod.^, protocols: String): js.Promise[Stream] = js.native
  def dialProtocol(peer: typings.peerId.mod.^, protocols: String, options: js.Object): js.Promise[Stream] = js.native
  def dialProtocol(peer: typings.peerId.mod.^, protocols: js.Array[String]): js.Promise[Stream] = js.native
  def dialProtocol(peer: typings.peerId.mod.^, protocols: js.Array[String], options: js.Object): js.Promise[Stream] = js.native
  
  var peerId: typings.peerId.mod.^ = js.native
  
  var peerStore: PeerStore = js.native
  
  var registrar: Registrar = js.native
}
