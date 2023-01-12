package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceRecord.mod.Envelope
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressBook extends StObject {
  
  /**
    * Add known addresses of a provided peer.
    * If the peer is not known, it is set with the given addresses.
    */
  def add(peerId: PeerId, multiaddrs: js.Array[Multiaddr_]): js.Promise[Unit]
  
  /**
    * ConsumePeerRecord adds addresses from a signed peer record contained in a record envelope.
    * This will return a boolean that indicates if the record was successfully processed and added
    * into the AddressBook
    */
  def consumePeerRecord(envelope: Envelope): js.Promise[Boolean]
  
  /**
    * Remove stored addresses of a peer
    */
  def delete(peerId: PeerId): js.Promise[Unit]
  
  /**
    * Return the known addresses of a peer
    */
  def get(peerId: PeerId): js.Promise[js.Array[Address]]
  
  /**
    * Get an Envelope containing a PeerRecord for the given peer.
    * Returns undefined if no record exists.
    */
  def getPeerRecord(peerId: PeerId): js.Promise[js.UndefOr[Envelope]]
  
  /**
    * Get the raw Envelope for a peer. Returns
    * undefined if no Envelope is found
    */
  def getRawEnvelope(peerId: PeerId): js.Promise[js.UndefOr[js.typedarray.Uint8Array]]
  
  /**
    * Set the known addresses of a peer
    */
  def set(peerId: PeerId, data: js.Array[Multiaddr_]): js.Promise[Unit]
}
object AddressBook {
  
  inline def apply(
    add: (PeerId, js.Array[Multiaddr_]) => js.Promise[Unit],
    consumePeerRecord: Envelope => js.Promise[Boolean],
    delete: PeerId => js.Promise[Unit],
    get: PeerId => js.Promise[js.Array[Address]],
    getPeerRecord: PeerId => js.Promise[js.UndefOr[Envelope]],
    getRawEnvelope: PeerId => js.Promise[js.UndefOr[js.typedarray.Uint8Array]],
    set: (PeerId, js.Array[Multiaddr_]) => js.Promise[Unit]
  ): AddressBook = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), consumePeerRecord = js.Any.fromFunction1(consumePeerRecord), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getPeerRecord = js.Any.fromFunction1(getPeerRecord), getRawEnvelope = js.Any.fromFunction1(getRawEnvelope), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[AddressBook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressBook] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (PeerId, js.Array[Multiaddr_]) => js.Promise[Unit]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setConsumePeerRecord(value: Envelope => js.Promise[Boolean]): Self = StObject.set(x, "consumePeerRecord", js.Any.fromFunction1(value))
    
    inline def setDelete(value: PeerId => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: PeerId => js.Promise[js.Array[Address]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetPeerRecord(value: PeerId => js.Promise[js.UndefOr[Envelope]]): Self = StObject.set(x, "getPeerRecord", js.Any.fromFunction1(value))
    
    inline def setGetRawEnvelope(value: PeerId => js.Promise[js.UndefOr[js.typedarray.Uint8Array]]): Self = StObject.set(x, "getRawEnvelope", js.Any.fromFunction1(value))
    
    inline def setSet(value: (PeerId, js.Array[Multiaddr_]) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
