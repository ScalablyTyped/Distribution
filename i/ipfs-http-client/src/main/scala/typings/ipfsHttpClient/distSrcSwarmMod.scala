package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Connect
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSwarmMod {
  
  @JSImport("ipfs-http-client/dist/src/swarm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSwarm(config: Options): Connect = ^.asInstanceOf[js.Dynamic].applyDynamic("createSwarm")(config.asInstanceOf[js.Any]).asInstanceOf[Connect]
}
