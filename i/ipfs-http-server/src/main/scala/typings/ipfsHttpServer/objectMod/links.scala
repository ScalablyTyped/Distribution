package typings.ipfsHttpServer.objectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object links {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "links")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object options10 {
    
    object validate5 {
      
      object options11 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "links.options_10.validate_5.options_11.allowUnknown_5")
        @js.native
        val allowUnknown5: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "links.options_10.validate_5.options_11.stripUnknown_5")
        @js.native
        val stripUnknown5: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "links.options_10.validate_5.query_5")
      @js.native
      val query5: js.Any = js.native
    }
  }
}
