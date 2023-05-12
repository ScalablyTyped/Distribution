package typings.ipfsHttpServer.distSrcApiResourcesObjectMod

import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.ResponseObject
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statResource {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "statResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  object options6 {
    
    object validate3 {
      
      object options7 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "statResource.options_6.validate_3.options_7.allowUnknown_3")
        @js.native
        val allowUnknown3: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "statResource.options_6.validate_3.options_7.stripUnknown_3")
        @js.native
        val stripUnknown3: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "statResource.options_6.validate_3.query_3")
      @js.native
      val query3: Any = js.native
    }
  }
}
