package typings.ipfsCoreUtils

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toUrlStringMod {
  
  @scala.inline
  def apply(url: String): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(url: Multiaddr): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(url: URL): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("ipfs-core-utils/dist/src/to-url-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Multiaddr = typings.multiaddr.mod.^
}
