package typings.ipfsHttpServer.distSrcApiResourcesObjectMod

import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.ResponseObject
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import typings.ipfsHttpServer.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putResource {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "putResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  object options4 {
    
    object payload {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "putResource.options_4.payload.output")
      @js.native
      val output: String = js.native
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "putResource.options_4.payload.parse")
      @js.native
      val parse: Boolean = js.native
    }
    
    @JSImport("ipfs-http-server/dist/src/api/resources/object", "putResource.options_4.pre")
    @js.native
    val pre: js.Array[`0`] = js.native
    
    object validate2 {
      
      object options5 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "putResource.options_4.validate_2.options_5.allowUnknown_2")
        @js.native
        val allowUnknown2: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "putResource.options_4.validate_2.options_5.stripUnknown_2")
        @js.native
        val stripUnknown2: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "putResource.options_4.validate_2.query_2")
      @js.native
      val query2: Any = js.native
    }
  }
}
