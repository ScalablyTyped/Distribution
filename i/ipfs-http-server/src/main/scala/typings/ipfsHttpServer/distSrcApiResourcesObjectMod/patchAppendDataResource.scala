package typings.ipfsHttpServer.distSrcApiResourcesObjectMod

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import typings.ipfsHttpServer.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchAppendDataResource {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendDataResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  object options12 {
    
    object payload1 {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendDataResource.options_12.payload_1.output_1")
      @js.native
      val output1: String = js.native
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendDataResource.options_12.payload_1.parse_1")
      @js.native
      val parse1: Boolean = js.native
    }
    
    @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendDataResource.options_12.pre_1")
    @js.native
    val pre1: js.Array[`0`] = js.native
    
    object validate6 {
      
      object options13 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendDataResource.options_12.validate_6.options_13.allowUnknown_6")
        @js.native
        val allowUnknown6: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendDataResource.options_12.validate_6.options_13.stripUnknown_6")
        @js.native
        val stripUnknown6: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendDataResource.options_12.validate_6.query_6")
      @js.native
      val query6: Any = js.native
    }
  }
}
