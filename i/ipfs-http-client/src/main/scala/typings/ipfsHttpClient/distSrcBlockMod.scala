package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Get
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBlockMod {
  
  @JSImport("ipfs-http-client/dist/src/block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlock(config: Options): Get = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(config.asInstanceOf[js.Any]).asInstanceOf[Get]
}
