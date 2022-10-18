package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerStore extends EventEmitter[PeerStoreEvents] {
  
  var addressBook: AddressBook = js.native
  
  def all(): js.Promise[js.Array[Peer]] = js.native
  
  def delete(peerId: PeerId): js.Promise[Unit] = js.native
  
  /**
    * Loop over every peer - the looping is async because we read from a
    * datastore but the peer operation is sync, this is to prevent
    * long-lived peer operations causing deadlocks over the datastore
    * which can happen if they try to access the peer store during the
    * loop
    */
  def forEach(fn: js.Function1[/* peer */ Peer, Unit]): js.Promise[Unit] = js.native
  
  def get(peerId: PeerId): js.Promise[Peer] = js.native
  
  def getTags(peerId: PeerId): js.Promise[js.Array[Tag]] = js.native
  
  def has(peerId: PeerId): js.Promise[Boolean] = js.native
  
  var keyBook: KeyBook = js.native
  
  var metadataBook: MetadataBook = js.native
  
  var protoBook: ProtoBook = js.native
  
  def tagPeer(peerId: PeerId, tag: String): js.Promise[Unit] = js.native
  def tagPeer(peerId: PeerId, tag: String, options: TagOptions): js.Promise[Unit] = js.native
  
  def unTagPeer(peerId: PeerId, tag: String): js.Promise[Unit] = js.native
}
