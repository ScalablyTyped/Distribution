package typings.ipfsHttpResponse

import typings.ipfsHttpResponse.anon.Cid
import typings.ipfsHttpResponse.anon.NameAny
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-http-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResponse(ipfsNode: Any, ipfsPath: Any): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResponse")(ipfsNode.asInstanceOf[js.Any], ipfsPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  object resolver {
    
    @JSImport("ipfs-http-response", "resolver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cid(ipfs: Any, path: String): js.Promise[Cid] = (^.asInstanceOf[js.Dynamic].applyDynamic("cid")(ipfs.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cid]]
    
    inline def directory(ipfs: Any, path: String, cid: Any): js.Promise[String | js.Array[NameAny]] = (^.asInstanceOf[js.Dynamic].applyDynamic("directory")(ipfs.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.Array[NameAny]]]
  }
}
