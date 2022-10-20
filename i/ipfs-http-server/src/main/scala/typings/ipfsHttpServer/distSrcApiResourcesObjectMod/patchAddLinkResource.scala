package typings.ipfsHttpServer.distSrcApiResourcesObjectMod

import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchAddLinkResource {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAddLinkResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  object options16 {
    
    object validate8 {
      
      object options17 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAddLinkResource.options_16.validate_8.options_17.allowUnknown_8")
        @js.native
        val allowUnknown8: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAddLinkResource.options_16.validate_8.options_17.stripUnknown_8")
        @js.native
        val stripUnknown8: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAddLinkResource.options_16.validate_8.query_8")
      @js.native
      val query8: Any = js.native
    }
  }
}
