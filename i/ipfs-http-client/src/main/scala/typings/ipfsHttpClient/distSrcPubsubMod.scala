package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Subscribe
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPubsubMod {
  
  @JSImport("ipfs-http-client/dist/src/pubsub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPubsub(config: Options): Subscribe = ^.asInstanceOf[js.Dynamic].applyDynamic("createPubsub")(config.asInstanceOf[js.Any]).asInstanceOf[Subscribe]
}
