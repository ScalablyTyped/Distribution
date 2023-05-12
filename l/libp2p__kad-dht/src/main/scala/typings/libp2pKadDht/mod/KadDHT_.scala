package typings.libp2pKadDht.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pKadDht.libp2pKadDhtStrings.client
import typings.libp2pKadDht.libp2pKadDhtStrings.server
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KadDHT_ extends StObject {
  
  /**
    * Find a peer on the DHT
    */
  def findPeer(id: PeerId): AsyncIterable[QueryEvent] = js.native
  def findPeer(id: PeerId, options: QueryOptions): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Find providers of a given CID
    */
  def findProviders(key: CID[Any, Double, Double, Version]): AsyncIterable[QueryEvent] = js.native
  def findProviders(key: CID[Any, Double, Double, Version], options: QueryOptions): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Get a value from the DHT, the final ValueEvent will be the best value
    */
  def get(key: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
  def get(key: js.typedarray.Uint8Array, options: QueryOptions): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Find the closest peers to the passed key
    */
  def getClosestPeers(key: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
  def getClosestPeers(key: js.typedarray.Uint8Array, options: QueryOptions): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Returns the mode this node is in
    */
  def getMode(): js.Promise[client | server] = js.native
  
  /**
    * Store provider records for the passed CID on the DHT pointing to us
    */
  def provide(key: CID[Any, Double, Double, Version]): AsyncIterable[QueryEvent] = js.native
  def provide(key: CID[Any, Double, Double, Version], options: QueryOptions): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Store the passed value under the passed key on the DHT
    */
  def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
  def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, options: QueryOptions): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Force a routing table refresh
    */
  def refreshRoutingTable(): js.Promise[Unit] = js.native
  
  /**
    * If 'server' this node will respond to DHT queries, if 'client' this node will not
    */
  def setMode(mode: client | server): js.Promise[Unit] = js.native
}
