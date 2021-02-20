package typings.ipfsCoreUtils

import typings.multiaddr.mod.^
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toUrlStringMod {
  
  @JSImport("ipfs-core-utils/dist/src/to-url-string", JSImport.Namespace)
  @js.native
  def apply(url: String): String = js.native
  @JSImport("ipfs-core-utils/dist/src/to-url-string", JSImport.Namespace)
  @js.native
  def apply(url: Multiaddr): String = js.native
  @JSImport("ipfs-core-utils/dist/src/to-url-string", JSImport.Namespace)
  @js.native
  def apply(url: URL): String = js.native
  
  type Multiaddr = ^
}
