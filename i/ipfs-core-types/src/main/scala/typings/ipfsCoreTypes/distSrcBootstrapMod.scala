package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.anon.Peers
import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBootstrapMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Add a peer address to the bootstrap list
      *
      * @example
      * ```js
      * const validIp4 = '/ip4/104....9z'
      *
      * const res = await ipfs.bootstrap.add(validIp4)
      * console.log(res.Peers)
      * // Logs:
      * // ['/ip4/104....9z']
      * ```
      */
    def add(addr: Multiaddr_): js.Promise[Peers] = js.native
    def add(addr: Multiaddr_, options: AbortOptions & OptionExtension): js.Promise[Peers] = js.native
    
    /**
      * Remove all peer addresses from the bootstrap list
      *
      * @example
      * ```js
      * const res = await ipfs.bootstrap.clear()
      * console.log(res.Peers)
      * // Logs:
      * // [address1, address2, ...]
      * ```
      */
    def clear(): js.Promise[Peers] = js.native
    def clear(options: AbortOptions & OptionExtension): js.Promise[Peers] = js.native
    
    /**
      * List all peer addresses in the bootstrap list
      *
      * @example
      * ```js
      * const res = await ipfs.bootstrap.list()
      * console.log(res.Peers)
      * // Logs:
      * // [address1, address2, ...]
      * ```
      */
    def list(): js.Promise[Peers] = js.native
    def list(options: AbortOptions & OptionExtension): js.Promise[Peers] = js.native
    
    /**
      * Reset the bootstrap list to contain only the default bootstrap nodes
      *
      * @example
      * ```js
      * const res = await ipfs.bootstrap.list()
      * console.log(res.Peers)
      * // Logs:
      * // [address1, address2, ...]
      * ```
      */
    def reset(): js.Promise[Peers] = js.native
    def reset(options: AbortOptions & OptionExtension): js.Promise[Peers] = js.native
    
    /**
      * Remove a peer address from the bootstrap list
      *
      * @example
      * ```js
      * const res = await ipfs.bootstrap.list()
      * console.log(res.Peers)
      * // Logs:
      * // [address1, address2, ...]
      * ```
      */
    def rm(addr: Multiaddr_): js.Promise[Peers] = js.native
    def rm(addr: Multiaddr_, options: AbortOptions & OptionExtension): js.Promise[Peers] = js.native
  }
}
