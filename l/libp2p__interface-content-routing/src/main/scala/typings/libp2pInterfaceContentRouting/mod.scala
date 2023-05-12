package typings.libp2pInterfaceContentRouting

import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-content-routing", "contentRouting")
  @js.native
  val contentRouting: js.Symbol = js.native
  
  @js.native
  trait ContentRouting_ extends StObject {
    
    /**
      * Find the providers of the passed CID.
      *
      * @example
      *
      * ```js
      * // Iterate over the providers found for the given cid
      * for await (const provider of contentRouting.findProviders(cid)) {
      *  console.log(provider.id, provider.multiaddrs)
      * }
      * ```
      */
    def findProviders(cid: CID[Any, Double, Double, Version]): AsyncIterable[PeerInfo] = js.native
    def findProviders(cid: CID[Any, Double, Double, Version], options: AbortOptions): AsyncIterable[PeerInfo] = js.native
    
    /**
      * Retrieves a value from the network corresponding to the passed key.
      *
      * @example
      *
      * ```js
      * // ...
      *
      * const key = '/key'
      * const value = await contentRouting.get(key)
      * ```
      */
    def get(key: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    def get(key: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * The implementation of this method should ensure that network peers know the
      * caller can provide content that corresponds to the passed CID.
      *
      * @example
      *
      * ```js
      * // ...
      * await contentRouting.provide(cid)
      * ```
      */
    def provide(cid: CID[Any, Double, Double, Version]): js.Promise[Unit] = js.native
    def provide(cid: CID[Any, Double, Double, Version], options: AbortOptions): js.Promise[Unit] = js.native
    
    /**
      * Puts a value corresponding to the passed key in a way that can later be
      * retrieved by another network peer using the get method.
      *
      * @example
      *
      * ```js
      * // ...
      * const key = '/key'
      * const value = uint8ArrayFromString('oh hello there')
      *
      * await contentRouting.put(key, value)
      * ```
      */
    def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[Unit] = js.native
  }
}
