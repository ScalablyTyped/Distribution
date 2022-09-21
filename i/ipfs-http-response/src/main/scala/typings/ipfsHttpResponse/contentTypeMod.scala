package typings.ipfsHttpResponse

import typings.ipfsHttpResponse.anon.ContentType
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentTypeMod {
  
  @JSImport("ipfs-http-response/dist/src/utils/content-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectContentType(path: String, source: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[ContentType] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectContentType")(path.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ContentType]]
  
  type Uint8ArrayList = typings.uint8arraylist.mod.Uint8ArrayList
}
