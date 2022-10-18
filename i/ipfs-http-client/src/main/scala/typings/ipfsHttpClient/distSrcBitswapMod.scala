package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Stat
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBitswapMod {
  
  @JSImport("ipfs-http-client/dist/src/bitswap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBitswap(config: Options): Stat = ^.asInstanceOf[js.Dynamic].applyDynamic("createBitswap")(config.asInstanceOf[js.Any]).asInstanceOf[Stat]
}
