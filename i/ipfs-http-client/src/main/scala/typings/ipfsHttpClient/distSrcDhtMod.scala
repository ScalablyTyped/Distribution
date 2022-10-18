package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.FindPeer
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDhtMod {
  
  @JSImport("ipfs-http-client/dist/src/dht", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDht(config: Options): FindPeer = ^.asInstanceOf[js.Dynamic].applyDynamic("createDht")(config.asInstanceOf[js.Any]).asInstanceOf[FindPeer]
}
