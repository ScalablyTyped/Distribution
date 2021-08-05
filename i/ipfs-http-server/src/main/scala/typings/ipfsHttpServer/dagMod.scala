package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.AssignString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dagMod {
  
  object get {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/dag", "get")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    object options {
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dag", "get.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dag", "get.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dag", "get.options.validate.query")
        @js.native
        val query: js.Any = js.native
      }
    }
  }
  
  object put {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/dag", "put")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    object options2 {
      
      object payload {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dag", "put.options_2.payload.output")
        @js.native
        val output: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dag", "put.options_2.payload.parse")
        @js.native
        val parse: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/dag", "put.options_2.pre")
      @js.native
      val pre: js.Array[AssignString] = js.native
      
      object validate1 {
        
        object options3 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dag", "put.options_2.validate_1.options_3.allowUnknown_1")
          @js.native
          val allowUnknown1: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dag", "put.options_2.validate_1.options_3.stripUnknown_1")
          @js.native
          val stripUnknown1: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dag", "put.options_2.validate_1.query_1")
        @js.native
        val query1: js.Any = js.native
      }
    }
  }
  
  object resolve {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/dag", "resolve")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    object options4 {
      
      object validate2 {
        
        object options5 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dag", "resolve.options_4.validate_2.options_5.allowUnknown_2")
          @js.native
          val allowUnknown2: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/dag", "resolve.options_4.validate_2.options_5.stripUnknown_2")
          @js.native
          val stripUnknown2: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/dag", "resolve.options_4.validate_2.query_2")
        @js.native
        val query2: js.Any = js.native
      }
    }
  }
}
