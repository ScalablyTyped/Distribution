package typings.ipfsHttpServer.distSrcApiResourcesObjectMod

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchRmLinkResource {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchRmLinkResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  object options18 {
    
    object validate9 {
      
      object options19 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchRmLinkResource.options_18.validate_9.options_19.allowUnknown_9")
        @js.native
        val allowUnknown9: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchRmLinkResource.options_18.validate_9.options_19.stripUnknown_9")
        @js.native
        val stripUnknown9: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchRmLinkResource.options_18.validate_9.query_9")
      @js.native
      val query9: Any = js.native
    }
  }
}
