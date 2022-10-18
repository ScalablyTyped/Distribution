package typings.ipfsHttpServer.distSrcApiResourcesObjectMod

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linksResource {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "linksResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  object options10 {
    
    object validate5 {
      
      object options11 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "linksResource.options_10.validate_5.options_11.allowUnknown_5")
        @js.native
        val allowUnknown5: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "linksResource.options_10.validate_5.options_11.stripUnknown_5")
        @js.native
        val stripUnknown5: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "linksResource.options_10.validate_5.query_5")
      @js.native
      val query5: Any = js.native
    }
  }
}
