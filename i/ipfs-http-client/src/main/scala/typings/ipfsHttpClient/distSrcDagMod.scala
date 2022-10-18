package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Export
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagMod {
  
  @JSImport("ipfs-http-client/dist/src/dag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDag(
    codecs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_multicodecs.Multicodecs */ Any,
    config: Options
  ): Export = (^.asInstanceOf[js.Dynamic].applyDynamic("createDag")(codecs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Export]
}
