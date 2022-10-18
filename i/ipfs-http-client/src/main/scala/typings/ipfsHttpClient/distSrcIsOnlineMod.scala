package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIsOnlineMod {
  
  @JSImport("ipfs-http-client/dist/src/is-online", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIsOnline(options: Options): js.Function1[/* options */ js.UndefOr[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIsOnline")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[Any], Boolean]]
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RootAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.API<HTTPClientExtraOptions> */ Any
}
