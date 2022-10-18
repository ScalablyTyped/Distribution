package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Cmds
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDiagMod {
  
  @JSImport("ipfs-http-client/dist/src/diag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDiag(config: Options): Cmds = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiag")(config.asInstanceOf[js.Any]).asInstanceOf[Cmds]
}
