package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.AssignMethod
import typings.ipfsHttpServer.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  object get {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "get.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options2 {
      
      object validate1 {
        
        object options3 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "get.options_2.validate_1.options_3.allowUnknown_1")
          @js.native
          val allowUnknown1: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "get.options_2.validate_1.options_3.stripUnknown_1")
          @js.native
          val stripUnknown1: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "get.options_2.validate_1.query_1")
        @js.native
        val query1: js.Any = js.native
      }
    }
  }
  
  object getOrSet {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSet.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options {
      
      object payload {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSet.options.payload.output")
        @js.native
        val output: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSet.options.payload.parse")
        @js.native
        val parse: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSet.options.pre")
      @js.native
      val pre: js.Array[Method] = js.native
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSet.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSet.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "getOrSet.options.validate.query")
        @js.native
        val query: js.Any = js.native
      }
    }
  }
  
  object profiles {
    
    object apply {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/config", "profiles.apply.handler_2")
      @js.native
      def handler2(request: js.Any, h: js.Any): js.Promise[_] = js.native
      
      object options8 {
        
        object validate4 {
          
          object options9 {
            
            @JSImport("ipfs-http-server/dist/src/api/resources/config", "profiles.apply.options_8.validate_4.options_9.allowUnknown_4")
            @js.native
            val allowUnknown4: Boolean = js.native
            
            @JSImport("ipfs-http-server/dist/src/api/resources/config", "profiles.apply.options_8.validate_4.options_9.stripUnknown_4")
            @js.native
            val stripUnknown4: Boolean = js.native
          }
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "profiles.apply.options_8.validate_4.query_4")
          @js.native
          val query4: js.Any = js.native
        }
      }
    }
    
    object list {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/config", "profiles.list.handler_3")
      @js.native
      def handler3(request: js.Any, h: js.Any): js.Promise[_] = js.native
      
      object options10 {
        
        object validate5 {
          
          object options11 {
            
            @JSImport("ipfs-http-server/dist/src/api/resources/config", "profiles.list.options_10.validate_5.options_11.allowUnknown_5")
            @js.native
            val allowUnknown5: Boolean = js.native
            
            @JSImport("ipfs-http-server/dist/src/api/resources/config", "profiles.list.options_10.validate_5.options_11.stripUnknown_5")
            @js.native
            val stripUnknown5: Boolean = js.native
          }
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "profiles.list.options_10.validate_5.query_5")
          @js.native
          val query5: js.Any = js.native
        }
      }
    }
  }
  
  object replace {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "replace.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options6 {
      
      object payload1 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "replace.options_6.payload_1.output_1")
        @js.native
        val output1: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "replace.options_6.payload_1.parse_1")
        @js.native
        val parse1: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/config", "replace.options_6.pre_1")
      @js.native
      val pre1: js.Array[AssignMethod] = js.native
      
      object validate3 {
        
        object options7 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "replace.options_6.validate_3.options_7.allowUnknown_3")
          @js.native
          val allowUnknown3: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "replace.options_6.validate_3.options_7.stripUnknown_3")
          @js.native
          val stripUnknown3: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "replace.options_6.validate_3.query_3")
        @js.native
        val query3: js.Any = js.native
      }
    }
  }
  
  object show {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/config", "show.handler_1")
    @js.native
    def handler1(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options4 {
      
      object validate2 {
        
        object options5 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "show.options_4.validate_2.options_5.allowUnknown_2")
          @js.native
          val allowUnknown2: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/config", "show.options_4.validate_2.options_5.stripUnknown_2")
          @js.native
          val stripUnknown2: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/config", "show.options_4.validate_2.query_2")
        @js.native
        val query2: js.Any = js.native
      }
    }
  }
}
