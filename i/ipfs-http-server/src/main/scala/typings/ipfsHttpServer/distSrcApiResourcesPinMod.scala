package typings.ipfsHttpServer

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiResourcesPinMod {
  
  object addResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pin", "addResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options2 {
      
      object validate1 {
        
        object options3 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "addResource.options_2.validate_1.options_3.allowUnknown_1")
          @js.native
          val allowUnknown1: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "addResource.options_2.validate_1.options_3.stripUnknown_1")
          @js.native
          val stripUnknown1: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pin", "addResource.options_2.validate_1.query_1")
        @js.native
        val query1: Any = js.native
      }
    }
  }
  
  object lsResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pin", "lsResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {import('../../types').Request} request
      * @param {import('@hapi/hapi').ResponseToolkit} h
      */
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options {
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "lsResource.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "lsResource.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pin", "lsResource.options.validate.query")
        @js.native
        val query: Any = js.native
      }
    }
  }
  
  object rmResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pin", "rmResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options4 {
      
      object validate2 {
        
        object options5 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "rmResource.options_4.validate_2.options_5.allowUnknown_2")
          @js.native
          val allowUnknown2: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "rmResource.options_4.validate_2.options_5.stripUnknown_2")
          @js.native
          val stripUnknown2: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pin", "rmResource.options_4.validate_2.query_2")
        @js.native
        val query2: Any = js.native
      }
    }
  }
  
  type CID = typings.multiformats.cidMod.CID[Any, Double, Double, Version]
}
