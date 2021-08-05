package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.Validate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsMod {
  
  object bitswap {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/stats", "bitswap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @JSImport("ipfs-http-server/dist/src/api/resources/stats", "bitswap.options")
    @js.native
    def options: Validate = js.native
    inline def options_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  object bw {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/stats", "bw")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    object options {
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/stats", "bw.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/stats", "bw.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/stats", "bw.options.validate.query")
        @js.native
        val query: js.Any = js.native
      }
    }
  }
  
  object repo {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/stats", "repo")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @JSImport("ipfs-http-server/dist/src/api/resources/stats", "repo.options")
    @js.native
    def options: Validate = js.native
    inline def options_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
}
