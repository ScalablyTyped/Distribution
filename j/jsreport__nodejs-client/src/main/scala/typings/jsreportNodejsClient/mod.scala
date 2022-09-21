package typings.jsreportNodejsClient

import typings.jsreportNodejsClient.anon.PartialRequest
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): Client = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def apply(url: String, username: String, password: String): Client = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  @JSImport("@jsreport/nodejs-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Client extends StObject {
    
    /** @async */
    def render(req: PartialRequest): js.Promise[ClientRenderResponse] = js.native
    def render(req: PartialRequest, options: js.Object): js.Promise[ClientRenderResponse] = js.native
  }
  
  @js.native
  trait ClientRenderResponse extends ServerResponse[IncomingMessage] {
    
    def body(): js.Promise[Buffer] = js.native
  }
}
