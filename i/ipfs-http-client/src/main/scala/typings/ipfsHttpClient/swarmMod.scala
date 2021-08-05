package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swarmMod {
  
  inline def apply(config: js.Any): Connect = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Connect]
  
  @JSImport("ipfs-http-client/dist/src/swarm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
