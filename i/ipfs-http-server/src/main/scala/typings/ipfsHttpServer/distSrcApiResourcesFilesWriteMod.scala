package typings.ipfsHttpServer

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiResourcesFilesWriteMod {
  
  object writeResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "writeResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {import('../../../types').Request} request
      * @param {import('@hapi/hapi').ResponseToolkit} h
      */
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options {
      
      object payload {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "writeResource.options.payload.maxBytes")
        @js.native
        val maxBytes: Double = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "writeResource.options.payload.output")
        @js.native
        val output: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "writeResource.options.payload.parse")
        @js.native
        val parse: Boolean = js.native
      }
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "writeResource.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "writeResource.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files/write", "writeResource.options.validate.query")
        @js.native
        val query: Any = js.native
      }
    }
  }
}
