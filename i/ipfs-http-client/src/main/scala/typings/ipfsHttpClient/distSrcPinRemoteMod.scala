package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Rm
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRemote(config: Options): Rm = ^.asInstanceOf[js.Dynamic].applyDynamic("createRemote")(config.asInstanceOf[js.Any]).asInstanceOf[Rm]
}
