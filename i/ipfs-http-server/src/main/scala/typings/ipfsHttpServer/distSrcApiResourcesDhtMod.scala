package typings.ipfsHttpServer

import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import typings.ipfsHttpServer.anon.AssignStringMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiResourcesDhtMod {
  
  object findPeerResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/dht", "findPeerResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {import('../../types').Request} request
      * @param {import('@hapi/hapi').ResponseToolkit} h
      */
    inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options {
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "findPeerResource.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "findPeerResource.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dht", "findPeerResource.options.validate.query")
        @js.native
        val query: Any = js.native
      }
    }
  }
  
  object findProvsResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/dht", "findProvsResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options2 {
      
      object validate1 {
        
        object options3 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "findProvsResource.options_2.validate_1.options_3.allowUnknown_1")
          @js.native
          val allowUnknown1: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "findProvsResource.options_2.validate_1.options_3.stripUnknown_1")
          @js.native
          val stripUnknown1: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dht", "findProvsResource.options_2.validate_1.query_1")
        @js.native
        val query1: Any = js.native
      }
    }
  }
  
  object getResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/dht", "getResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options4 {
      
      object validate2 {
        
        object options5 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "getResource.options_4.validate_2.options_5.allowUnknown_2")
          @js.native
          val allowUnknown2: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "getResource.options_4.validate_2.options_5.stripUnknown_2")
          @js.native
          val stripUnknown2: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dht", "getResource.options_4.validate_2.query_2")
        @js.native
        val query2: Any = js.native
      }
    }
  }
  
  object provideResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/dht", "provideResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options6 {
      
      object validate3 {
        
        object options7 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "provideResource.options_6.validate_3.options_7.allowUnknown_3")
          @js.native
          val allowUnknown3: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "provideResource.options_6.validate_3.options_7.stripUnknown_3")
          @js.native
          val stripUnknown3: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dht", "provideResource.options_6.validate_3.query_3")
        @js.native
        val query3: Any = js.native
      }
    }
  }
  
  object putResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/dht", "putResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options8 {
      
      object payload {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dht", "putResource.options_8.payload.output")
        @js.native
        val output: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dht", "putResource.options_8.payload.parse")
        @js.native
        val parse: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/dht", "putResource.options_8.pre")
      @js.native
      val pre: js.Array[AssignStringMethod] = js.native
      
      object validate4 {
        
        object options9 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "putResource.options_8.validate_4.options_9.allowUnknown_4")
          @js.native
          val allowUnknown4: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "putResource.options_8.validate_4.options_9.stripUnknown_4")
          @js.native
          val stripUnknown4: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dht", "putResource.options_8.validate_4.query_4")
        @js.native
        val query4: Any = js.native
      }
    }
  }
  
  object queryResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/dht", "queryResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options10 {
      
      object validate5 {
        
        object options11 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "queryResource.options_10.validate_5.options_11.allowUnknown_5")
          @js.native
          val allowUnknown5: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dht", "queryResource.options_10.validate_5.options_11.stripUnknown_5")
          @js.native
          val stripUnknown5: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dht", "queryResource.options_10.validate_5.query_5")
        @js.native
        val query5: Any = js.native
      }
    }
  }
  
  type PeerId = typings.libp2pInterfacePeerId.mod.PeerId
  
  type QueryEvent = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.QueryEvent */ Any
}
