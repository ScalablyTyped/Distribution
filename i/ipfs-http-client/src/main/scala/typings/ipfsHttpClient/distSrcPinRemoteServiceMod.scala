package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Ls
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteServiceMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote/service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createService(config: Options): Ls = ^.asInstanceOf[js.Dynamic].applyDynamic("createService")(config.asInstanceOf[js.Any]).asInstanceOf[Ls]
}
