package typings.ipfsHttpServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesRegularMod {
  
  object add {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "add")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    object options4 {
      
      object payload {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "add.options_4.payload.maxBytes")
        @js.native
        val maxBytes: Double = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "add.options_4.payload.output")
        @js.native
        val output: String = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "add.options_4.payload.parse")
        @js.native
        val parse: Boolean = js.native
      }
      
      object validate2 {
        
        object options5 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "add.options_4.validate_2.options_5.allowUnknown_2")
          @js.native
          val allowUnknown2: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "add.options_4.validate_2.options_5.stripUnknown_2")
          @js.native
          val stripUnknown2: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "add.options_4.validate_2.query_2")
        @js.native
        val query2: js.Any = js.native
      }
    }
  }
  
  object cat {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "cat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    object options {
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "cat.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "cat.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "cat.options.validate.query")
        @js.native
        val query: js.Any = js.native
      }
    }
  }
  
  object get {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "get")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    object options2 {
      
      object validate1 {
        
        object options3 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "get.options_2.validate_1.options_3.allowUnknown_1")
          @js.native
          val allowUnknown1: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "get.options_2.validate_1.options_3.stripUnknown_1")
          @js.native
          val stripUnknown1: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "get.options_2.validate_1.query_1")
        @js.native
        val query1: js.Any = js.native
      }
    }
  }
  
  object ls {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "ls")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    object options6 {
      
      object validate3 {
        
        object options7 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "ls.options_6.validate_3.options_7.allowUnknown_3")
          @js.native
          val allowUnknown3: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "ls.options_6.validate_3.options_7.stripUnknown_3")
          @js.native
          val stripUnknown3: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "ls.options_6.validate_3.query_3")
        @js.native
        val query3: js.Any = js.native
      }
    }
  }
  
  object refs {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "refs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    object options8 {
      
      object validate4 {
        
        object options9 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "refs.options_8.validate_4.options_9.allowUnknown_4")
          @js.native
          val allowUnknown4: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "refs.options_8.validate_4.options_9.stripUnknown_4")
          @js.native
          val stripUnknown4: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "refs.options_8.validate_4.query_4")
        @js.native
        val query4: js.Any = js.native
      }
    }
  }
  
  object refsLocal {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "refsLocal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    object options10 {
      
      object validate5 {
        
        object options11 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "refsLocal.options_10.validate_5.options_11.allowUnknown_5")
          @js.native
          val allowUnknown5: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "refsLocal.options_10.validate_5.options_11.stripUnknown_5")
          @js.native
          val stripUnknown5: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files-regular", "refsLocal.options_10.validate_5.query_5")
        @js.native
        val query5: js.Any = js.native
      }
    }
  }
}
