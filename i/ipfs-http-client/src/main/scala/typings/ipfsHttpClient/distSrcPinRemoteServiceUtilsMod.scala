package typings.ipfsHttpClient

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteServiceUtilsMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote/service/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeRemoteService(json: Any): RemotePinServiceWithStat = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRemoteService")(json.asInstanceOf[js.Any]).asInstanceOf[RemotePinServiceWithStat]
  
  inline def decodeStat(json: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeStat")(json.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def encodeEndpoint(url: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeEndpoint")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type RemotePinServiceWithStat = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_service.RemotePinServiceWithStat */ Any
}
