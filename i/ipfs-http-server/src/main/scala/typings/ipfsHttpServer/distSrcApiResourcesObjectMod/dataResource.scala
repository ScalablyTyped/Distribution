package typings.ipfsHttpServer.distSrcApiResourcesObjectMod

import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataResource {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "dataResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  object options8 {
    
    object validate4 {
      
      object options9 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "dataResource.options_8.validate_4.options_9.allowUnknown_4")
        @js.native
        val allowUnknown4: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "dataResource.options_8.validate_4.options_9.stripUnknown_4")
        @js.native
        val stripUnknown4: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "dataResource.options_8.validate_4.query_4")
      @js.native
      val query4: Any = js.native
    }
  }
}
