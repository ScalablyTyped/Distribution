package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Publish
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNameMod {
  
  @JSImport("ipfs-http-client/dist/src/name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createName(config: Options): Publish = ^.asInstanceOf[js.Dynamic].applyDynamic("createName")(config.asInstanceOf[js.Any]).asInstanceOf[Publish]
}
