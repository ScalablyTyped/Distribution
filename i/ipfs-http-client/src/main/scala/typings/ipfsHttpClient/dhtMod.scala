package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.FindPeer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dhtMod {
  
  @scala.inline
  def apply(config: js.Any): FindPeer = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[FindPeer]
  
  @JSImport("ipfs-http-client/dist/src/dht", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
