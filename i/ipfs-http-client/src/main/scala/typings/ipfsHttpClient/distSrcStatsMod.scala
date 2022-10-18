package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Bitswap
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStatsMod {
  
  @JSImport("ipfs-http-client/dist/src/stats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStats(config: Options): Bitswap = ^.asInstanceOf[js.Dynamic].applyDynamic("createStats")(config.asInstanceOf[js.Any]).asInstanceOf[Bitswap]
}
