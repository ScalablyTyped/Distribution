package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.AddAll
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinMod {
  
  @JSImport("ipfs-http-client/dist/src/pin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPin(config: Options): AddAll = ^.asInstanceOf[js.Dynamic].applyDynamic("createPin")(config.asInstanceOf[js.Any]).asInstanceOf[AddAll]
}
