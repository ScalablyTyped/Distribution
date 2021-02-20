package typings.jsreportClient

import typings.jsreportClient.anon.PartialRequest
import typings.jsreportClient.mod.jsreportCoreAugmentingMod.Client
import typings.node.Buffer
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-client", JSImport.Namespace)
  @js.native
  def apply(url: String): Client = js.native
  @JSImport("jsreport-client", JSImport.Namespace)
  @js.native
  def apply(url: String, username: js.UndefOr[scala.Nothing], password: String): Client = js.native
  @JSImport("jsreport-client", JSImport.Namespace)
  @js.native
  def apply(url: String, username: String): Client = js.native
  @JSImport("jsreport-client", JSImport.Namespace)
  @js.native
  def apply(url: String, username: String, password: String): Client = js.native
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    @js.native
    trait Client extends StObject {
      
      def render(req: PartialRequest): js.Promise[ClientRenderResponse] = js.native
      def render(req: PartialRequest, options: js.Object): js.Promise[ClientRenderResponse] = js.native
    }
    
    @js.native
    trait ClientRenderResponse extends ServerResponse {
      
      def body(): js.Promise[Buffer] = js.native
    }
  }
}
