package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubMod {
  
  object ls {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "ls.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options4 {
      
      object validate2 {
        
        object options5 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "ls.options_4.validate_2.options_5.allowUnknown_2")
          @js.native
          val allowUnknown2: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "ls.options_4.validate_2.options_5.stripUnknown_2")
          @js.native
          val stripUnknown2: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "ls.options_4.validate_2.query_2")
        @js.native
        val query2: js.Any = js.native
      }
    }
  }
  
  object peers {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "peers.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options6 {
      
      object validate3 {
        
        object options7 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "peers.options_6.validate_3.options_7.allowUnknown_3")
          @js.native
          val allowUnknown3: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "peers.options_6.validate_3.options_7.stripUnknown_3")
          @js.native
          val stripUnknown3: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "peers.options_6.validate_3.query_3")
        @js.native
        val query3: js.Any = js.native
      }
    }
  }
  
  object publish {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publish.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options2 {
      
      object payload {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publish.options_2.payload.output")
        @js.native
        val output: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publish.options_2.payload.parse")
        @js.native
        val parse: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publish.options_2.pre")
      @js.native
      val pre: js.Array[`0`] = js.native
      
      object validate1 {
        
        object options3 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publish.options_2.validate_1.options_3.allowUnknown_1")
          @js.native
          val allowUnknown1: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publish.options_2.validate_1.options_3.stripUnknown_1")
          @js.native
          val stripUnknown1: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "publish.options_2.validate_1.query_1")
        @js.native
        val query1: js.Any = js.native
      }
    }
  }
  
  object subscribe {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribe.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options {
      
      object timeout {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribe.options.timeout.socket")
        @js.native
        val socket: Boolean = js.native
      }
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribe.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribe.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pubsub", "subscribe.options.validate.query")
        @js.native
        val query: js.Any = js.native
      }
    }
  }
}
