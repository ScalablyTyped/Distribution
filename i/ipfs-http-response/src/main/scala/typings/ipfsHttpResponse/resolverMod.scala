package typings.ipfsHttpResponse

import typings.ipfsHttpResponse.anon.Cid
import typings.ipfsHttpResponse.anon.NameAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("ipfs-http-response/dist/src/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cid(ipfs: Any, path: String): js.Promise[Cid] = (^.asInstanceOf[js.Dynamic].applyDynamic("cid")(ipfs.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cid]]
  
  inline def directory(ipfs: Any, path: String, cid: Any): js.Promise[String | js.Array[NameAny]] = (^.asInstanceOf[js.Dynamic].applyDynamic("directory")(ipfs.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.Array[NameAny]]]
}
