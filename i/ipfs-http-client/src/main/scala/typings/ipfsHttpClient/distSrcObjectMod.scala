package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Data
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectMod {
  
  @JSImport("ipfs-http-client/dist/src/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createObject(
    codecs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_multicodecs.Multicodecs */ Any,
    config: Options
  ): Data = (^.asInstanceOf[js.Dynamic].applyDynamic("createObject")(codecs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Data]
}
