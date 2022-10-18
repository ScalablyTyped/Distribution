package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.AddLink
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectPatchMod {
  
  @JSImport("ipfs-http-client/dist/src/object/patch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPatch(config: Options): AddLink = ^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(config.asInstanceOf[js.Any]).asInstanceOf[AddLink]
}
