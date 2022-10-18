package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Level
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLogMod {
  
  @JSImport("ipfs-http-client/dist/src/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLog(config: Options): Level = ^.asInstanceOf[js.Dynamic].applyDynamic("createLog")(config.asInstanceOf[js.Any]).asInstanceOf[Level]
}
