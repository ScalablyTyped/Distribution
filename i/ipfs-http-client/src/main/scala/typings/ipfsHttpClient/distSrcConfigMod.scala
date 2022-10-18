package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.GetAll
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigMod {
  
  @JSImport("ipfs-http-client/dist/src/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConfig(config: Options): GetAll = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(config.asInstanceOf[js.Any]).asInstanceOf[GetAll]
}
