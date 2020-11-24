package typings.ipfsCoreUtils

import typings.multiaddr.mod.^
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core-utils/dist/src/to-url-string", JSImport.Namespace)
@js.native
object toUrlStringMod extends js.Object {
  
  def apply(url: String): String = js.native
  def apply(url: Multiaddr): String = js.native
  def apply(url: URL): String = js.native
  
  type Multiaddr = ^
}
