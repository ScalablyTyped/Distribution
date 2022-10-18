package typings.ipfsHttpServer.distSrcApiResourcesObjectMod

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResource {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "getResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  object options2 {
    
    object validate1 {
      
      object options3 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "getResource.options_2.validate_1.options_3.allowUnknown_1")
        @js.native
        val allowUnknown1: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "getResource.options_2.validate_1.options_3.stripUnknown_1")
        @js.native
        val stripUnknown1: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "getResource.options_2.validate_1.query_1")
      @js.native
      val query1: Any = js.native
    }
  }
}
