package typings.ipfsHttpServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeMod {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/files/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object options {
    
    object payload {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "options.payload.maxBytes")
      @js.native
      val maxBytes: Double = js.native
      
      @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "options.payload.output")
      @js.native
      val output: String = js.native
      
      @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "options.payload.parse")
      @js.native
      val parse: Boolean = js.native
    }
    
    object validate {
      
      object options1 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "options.validate.options_1.allowUnknown")
        @js.native
        val allowUnknown: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "options.validate.options_1.stripUnknown")
        @js.native
        val stripUnknown: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "options.validate.query")
      @js.native
      val query: js.Any = js.native
    }
  }
}
