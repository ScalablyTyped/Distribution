package typings.ipfsHttpServer

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import typings.ipfsHttpServer.anon.`1`
import typings.ipfsHttpServer.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiResourcesPubsubMod {
  
  object lsResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "lsResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options4 {
      
      object validate2 {
        
        object options5 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "lsResource.options_4.validate_2.options_5.allowUnknown_2")
          @js.native
          val allowUnknown2: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "lsResource.options_4.validate_2.options_5.stripUnknown_2")
          @js.native
          val stripUnknown2: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "lsResource.options_4.validate_2.query_2")
        @js.native
        val query2: Any = js.native
      }
    }
  }
  
  object peersResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "peersResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options6 {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "peersResource.options_6.pre_2")
      @js.native
      val pre2: js.Array[`1`] = js.native
      
      object validate3 {
        
        object options7 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "peersResource.options_6.validate_3.options_7.allowUnknown_3")
          @js.native
          val allowUnknown3: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "peersResource.options_6.validate_3.options_7.stripUnknown_3")
          @js.native
          val stripUnknown3: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "peersResource.options_6.validate_3.query_3")
        @js.native
        val query3: Any = js.native
      }
    }
  }
  
  object publishResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publishResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options2 {
      
      object payload {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publishResource.options_2.payload.output")
        @js.native
        val output: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publishResource.options_2.payload.parse")
        @js.native
        val parse: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publishResource.options_2.pre_1")
      @js.native
      val pre1: js.Array[`1` | `2`] = js.native
      
      object validate1 {
        
        object options3 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publishResource.options_2.validate_1.options_3.allowUnknown_1")
          @js.native
          val allowUnknown1: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publishResource.options_2.validate_1.options_3.stripUnknown_1")
          @js.native
          val stripUnknown1: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publishResource.options_2.validate_1.query_1")
        @js.native
        val query1: Any = js.native
      }
    }
  }
  
  object subscribeResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribeResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {import('../../types').Request} request
      * @param {import('@hapi/hapi').ResponseToolkit} h
      */
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribeResource.options.pre")
      @js.native
      val pre: js.Array[`1`] = js.native
      
      object timeout {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribeResource.options.timeout.socket")
        @js.native
        val socket: Boolean = js.native
      }
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribeResource.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribeResource.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribeResource.options.validate.query")
        @js.native
        val query: Any = js.native
      }
    }
  }
  
  type Message = typings.libp2pInterfacePubsub.mod.Message
}
