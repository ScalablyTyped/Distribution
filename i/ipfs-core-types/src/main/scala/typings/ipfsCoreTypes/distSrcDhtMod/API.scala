package typings.ipfsCoreTypes.distSrcDhtMod

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait API[OptionExtension] extends StObject {
  
  /**
    * Query the DHT for all multiaddresses associated with a `PeerId`.
    *
    * @example
    * ```js
    * const info = await ipfs.dht.findPeer('QmcZf59bWwK5XFi76CZX8cbJ4BhTzzA3gU1ZjYZcYW3dwt')
    *
    * console.log(info.id)
    * // QmcZf59bWwK5XFi76CZX8cbJ4BhTzzA3gU1ZjYZcYW3dwt
    *
    * info.addrs.forEach(addr => console.log(addr.toString()))
    * // '/ip4/147.75.94.115/udp/4001/quic'
    * // '/ip6/2604:1380:3000:1f00::1/udp/4001/quic'
    * // '/dnsaddr/bootstrap.libp2p.io'
    * // '/ip6/2604:1380:3000:1f00::1/tcp/4001'
    * // '/ip4/147.75.94.115/tcp/4001'
    * ```
    */
  def findPeer(peerId: PeerId): AsyncIterable[QueryEvent] = js.native
  def findPeer(peerId: PeerId, options: AbortOptions & OptionExtension): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Find peers in the DHT that can provide a specific value, given a CID.
    *
    * @example
    * ```js
    * const providers = ipfs.dht.findProvs('QmdPAhQRxrDKqkGPvQzBvjYe3kU8kiEEAd2J6ETEamKAD9')
    * for await (const provider of providers) {
    *   console.log(provider.id.toString())
    * }
    * ```
    */
  def findProvs(cid: CID[Any, Double, Double, Version]): AsyncIterable[QueryEvent] = js.native
  def findProvs(cid: CID[Any, Double, Double, Version], options: AbortOptions & OptionExtension): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Given a key, query the DHT for its best value.
    */
  def get(key: String): AsyncIterable[QueryEvent] = js.native
  def get(key: String, options: AbortOptions & OptionExtension): AsyncIterable[QueryEvent] = js.native
  def get(key: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
  def get(key: js.typedarray.Uint8Array, options: AbortOptions & OptionExtension): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Announce to the network that we are providing given values.
    */
  def provide(cid: CID[Any, Double, Double, Version]): AsyncIterable[QueryEvent] = js.native
  def provide(cid: CID[Any, Double, Double, Version], options: DHTProvideOptions & OptionExtension): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Write a key/value pair to the DHT.
    *
    * Given a key of the form /foo/bar and a value of any
    * form, this will write that value to the DHT with
    * that key.
    */
  def put(key: String, value: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
  def put(key: String, value: js.typedarray.Uint8Array, options: AbortOptions & OptionExtension): AsyncIterable[QueryEvent] = js.native
  def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
  def put(
    key: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    options: AbortOptions & OptionExtension
  ): AsyncIterable[QueryEvent] = js.native
  
  /**
    * Find the closest peers to a given `PeerId` or `CID`, by querying the DHT.
    */
  def query(peerId: PeerId): AsyncIterable[QueryEvent] = js.native
  def query(peerId: PeerId, options: AbortOptions & OptionExtension): AsyncIterable[QueryEvent] = js.native
  def query(peerId: CID[Any, Double, Double, Version]): AsyncIterable[QueryEvent] = js.native
  def query(peerId: CID[Any, Double, Double, Version], options: AbortOptions & OptionExtension): AsyncIterable[QueryEvent] = js.native
}
