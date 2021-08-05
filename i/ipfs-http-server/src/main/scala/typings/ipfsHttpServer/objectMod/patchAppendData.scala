package typings.ipfsHttpServer.objectMod

import typings.ipfsHttpServer.anon.AssignStringMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchAppendData {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendData")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object options12 {
    
    object payload1 {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendData.options_12.payload_1.output_1")
      @js.native
      val output1: String = js.native
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendData.options_12.payload_1.parse_1")
      @js.native
      val parse1: Boolean = js.native
    }
    
    @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendData.options_12.pre_1")
    @js.native
    val pre1: js.Array[AssignStringMethod] = js.native
    
    object validate6 {
      
      object options13 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendData.options_12.validate_6.options_13.allowUnknown_6")
        @js.native
        val allowUnknown6: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendData.options_12.validate_6.options_13.stripUnknown_6")
        @js.native
        val stripUnknown6: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAppendData.options_12.validate_6.query_6")
      @js.native
      val query6: js.Any = js.native
    }
  }
}
