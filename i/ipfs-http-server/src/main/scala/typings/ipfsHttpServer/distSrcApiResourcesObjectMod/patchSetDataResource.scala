package typings.ipfsHttpServer.distSrcApiResourcesObjectMod

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import typings.ipfsHttpServer.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchSetDataResource {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchSetDataResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  
  object options14 {
    
    object payload2 {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchSetDataResource.options_14.payload_2.output_2")
      @js.native
      val output2: String = js.native
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchSetDataResource.options_14.payload_2.parse_2")
      @js.native
      val parse2: Boolean = js.native
    }
    
    @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchSetDataResource.options_14.pre_2")
    @js.native
    val pre2: js.Array[`0`] = js.native
    
    object validate7 {
      
      object options15 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchSetDataResource.options_14.validate_7.options_15.allowUnknown_7")
        @js.native
        val allowUnknown7: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchSetDataResource.options_14.validate_7.options_15.stripUnknown_7")
        @js.native
        val stripUnknown7: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchSetDataResource.options_14.validate_7.query_7")
      @js.native
      val query7: Any = js.native
    }
  }
}
