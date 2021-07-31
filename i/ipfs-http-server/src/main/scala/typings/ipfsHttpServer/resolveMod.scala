package typings.ipfsHttpServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveMod {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object options {
    
    object validate {
      
      object options1 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/resolve", "options.validate.options_1.allowUnknown")
        @js.native
        val allowUnknown: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/resolve", "options.validate.options_1.stripUnknown")
        @js.native
        val stripUnknown: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/resolve", "options.validate.query")
      @js.native
      val query: js.Any = js.native
    }
  }
}
