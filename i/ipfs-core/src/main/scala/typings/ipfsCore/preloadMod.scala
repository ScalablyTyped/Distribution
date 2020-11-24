package typings.ipfsCore

import typings.ipfsCore.anon.Addresses
import typings.ipfsCore.anon.Call
import typings.ipfsCore.anon.Start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/preload", JSImport.Namespace)
@js.native
object preloadMod extends js.Object {
  
  /**
    * @param {Object} [options]
    * @param {boolean} [options.enabled = false] - Whether to preload anything
    * @param {string[]} [options.addresses = []] - Which preload servers to use
    * @param {number} [options.cache = 1000] - How many CIDs to cache
    */
  def apply(): (js.Function0[Unit] with Start) | Call = js.native
  def apply(options: Addresses): (js.Function0[Unit] with Start) | Call = js.native
}
