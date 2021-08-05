package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipartRequestBrowserMod {
  
  inline def apply(source: String, abortController: js.Any): js.Promise[Body] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body]]
  inline def apply(source: String, abortController: js.Any, headers: js.Object): js.Promise[Body] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body]]
  inline def apply(source: Unit, abortController: js.Any): js.Promise[Body] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body]]
  inline def apply(source: Unit, abortController: js.Any, headers: js.Object): js.Promise[Body] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body]]
  
  @JSImport("ipfs-http-client/dist/src/lib/multipart-request.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
