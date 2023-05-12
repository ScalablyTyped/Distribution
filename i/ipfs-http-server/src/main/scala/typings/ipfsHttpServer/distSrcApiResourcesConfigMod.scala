package typings.ipfsHttpServer

import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.ResponseObject
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import typings.ipfsHttpServer.anon.AssignMethod
import typings.ipfsHttpServer.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiResourcesConfigMod {
  
  object getOrSetResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSetResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {import('../../types').Request} request
      * @param {import('@hapi/hapi').ResponseToolkit} h
      */
    inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options {
      
      object payload {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSetResource.options.payload.output")
        @js.native
        val output: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSetResource.options.payload.parse")
        @js.native
        val parse: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSetResource.options.pre")
      @js.native
      val pre: js.Array[Method] = js.native
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSetResource.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSetResource.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSetResource.options.validate.query")
        @js.native
        val query: Any = js.native
      }
    }
  }
  
  object getResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "getResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options2 {
      
      object validate1 {
        
        object options3 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "getResource.options_2.validate_1.options_3.allowUnknown_1")
          @js.native
          val allowUnknown1: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "getResource.options_2.validate_1.options_3.stripUnknown_1")
          @js.native
          val stripUnknown1: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "getResource.options_2.validate_1.query_1")
        @js.native
        val query1: Any = js.native
      }
    }
  }
  
  object profilesApplyResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "profilesApplyResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler2(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler_2")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options8 {
      
      object validate4 {
        
        object options9 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "profilesApplyResource.options_8.validate_4.options_9.allowUnknown_4")
          @js.native
          val allowUnknown4: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "profilesApplyResource.options_8.validate_4.options_9.stripUnknown_4")
          @js.native
          val stripUnknown4: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "profilesApplyResource.options_8.validate_4.query_4")
        @js.native
        val query4: Any = js.native
      }
    }
  }
  
  object profilesListResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "profilesListResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler3(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler_3")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options10 {
      
      object validate5 {
        
        object options11 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "profilesListResource.options_10.validate_5.options_11.allowUnknown_5")
          @js.native
          val allowUnknown5: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "profilesListResource.options_10.validate_5.options_11.stripUnknown_5")
          @js.native
          val stripUnknown5: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "profilesListResource.options_10.validate_5.query_5")
        @js.native
        val query5: Any = js.native
      }
    }
  }
  
  object replaceResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "replaceResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options6 {
      
      object payload1 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "replaceResource.options_6.payload_1.output_1")
        @js.native
        val output1: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "replaceResource.options_6.payload_1.parse_1")
        @js.native
        val parse1: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/config", "replaceResource.options_6.pre_1")
      @js.native
      val pre1: js.Array[AssignMethod] = js.native
      
      object validate3 {
        
        object options7 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "replaceResource.options_6.validate_3.options_7.allowUnknown_3")
          @js.native
          val allowUnknown3: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "replaceResource.options_6.validate_3.options_7.stripUnknown_3")
          @js.native
          val stripUnknown3: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "replaceResource.options_6.validate_3.query_3")
        @js.native
        val query3: Any = js.native
      }
    }
  }
  
  object showResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "showResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler1(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler_1")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options4 {
      
      object validate2 {
        
        object options5 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "showResource.options_4.validate_2.options_5.allowUnknown_2")
          @js.native
          val allowUnknown2: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "showResource.options_4.validate_2.options_5.stripUnknown_2")
          @js.native
          val stripUnknown2: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "showResource.options_4.validate_2.query_2")
        @js.native
        val query2: Any = js.native
      }
    }
  }
}
